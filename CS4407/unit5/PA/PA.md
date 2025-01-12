# PA

## Part 1: 決定木の出力

与えられたIonosphereデータセットに対してRを使用して決定木を構築し可視化します。作業の手順は以下の通りです。

a. 作業ディレクトリとパッケージの設定
作業ディレクトリを設定し、必要なパッケージrpartとmlbenchを読み込みます。Ionosphereデータセットもこのステップで読み込みます。

```R
# Setting the working directory (modify as needed)
setwd("/Users/hayashir/work/Github/UoPeople/CS4407-branch/CS4407/unit5/PA")

# Loading packages
library(rpart)
library(mlbench)

# Loading the dataset
ionosphere_data <- read.table("Ionosphere.txt", 
                            header = FALSE,
                            sep = ",",
                            stringsAsFactors = TRUE)

# Adding column names
colnames(ionosphere_data) <- c(paste0("V", 1:34), "Class")

# Verifying the dataset
head(ionosphere_data)
summary(ionosphere_data)
```

これにより、Ionosphere.txt データセットが正しく読み込まれ、34列の連続値と1列のクラスラベル（Class： "g" または "b"）を持つデータフレームとして準備されます。

b. 決定木の作成
`rpart()`関数を使用して、クラス分類のための決定木を作成します。このモデルは、Class（良好な信号か不良な信号か）を予測します。

```R
# 決定木の作成
ionosphere_tree <- rpart(Class ~ ., data = ionosphere_data)

# 決定木の概要を表示
print(summary(ionosphere_tree))
```

![Figure 1 決定木の概要](./Overview%20of%20Decision%20Trees%201.png)
![Figure 2 決定木の概要](./Overview%20of%20Decision%20Trees%202.png)
Figure 1 決定木の概要

ここで
c. 決定木の可視化
`plot()`と`text()`関数を用いて、作成した決定木を可視化します。実行するコマンドは以下の通りです:

```R
# マージンを調整
par(mar = c(4, 4, 4, 4))
# 決定木の描画
plot(ionosphere_tree, uniform = TRUE, main = "Ionosphere Decision Tree")
# ノードにラベルを追加
text(ionosphere_tree, use.n = TRUE, all = TRUE, cex = 0.8)
```

コマンドを実行した結果を以下に記載します:
![Figure 2 Ionosphere Decision Tree](./Ionosphere%20Decision%20Tree.png)

## Part 2: 精度の評価

このセクションでは、Ionosphereデータセット を訓練データとテストデータに分割し、作成した決定木モデルの予測精度を評価します。具体的には、テストデータを使用してモデルがどれだけ正確にクラス（"g" または "b"）を分類できるかを確認します。

a. データの分割
データセットを訓練データとテストデータに分割します。`sample()`関数を使用して、全データの70%を訓練データに、30%をテストデータに設定します。

```R
set.seed(123)

# データを7:3に分割
train_indices <- sample(1:nrow(ionosphere_data), 0.7 * nrow(ionosphere_data))
train_data <- ionosphere_data[train_indices, ]
test_data <- ionosphere_data[-train_indices, ]
```

b. 訓練データで決定木を作成
訓練データを用いて、新しく決定木を構築します。

```R
# 訓練データを使った決定木の作成
ionosphere_tree_train <- rpart(Class ~ ., data = train_data)

# モデル概要の表示
print(summary(ionosphere_tree_train))
```

![Figure テストデータの決定木の概要1](./Overview%20of%20Decision%20Trees%20Train%201.png)
![Figure テストデータの決定木の概要2](./Overview%20of%20Decision%20Trees%20Train%202.png)
Figure 3 テストデータによる決定木の概要

c. テストデータで予測
`predict()`関数を使用して、テストデータに基づく予測を行います

```R
# テストデータでの予測
test_predictions <- predict(ionosphere_tree_train, newdata = test_data, type = "class")
```

d. 精度の計算
テストデータの実際のクラスラベルと予測結果を比較し、モデルの精度を計算します。

```R
# 予測と実際の値を比較するクロス集計表を作成
confusion_matrix <- table(test_predictions, test_data$Class)

# モデルの精度を計算
accuracy <- sum(diag(confusion_matrix)) / sum(confusion_matrix)

# 結果の表示
print(confusion_matrix)
print(paste("Accuracy: ", round(accuracy * 100, 2), "%"))
```

実際に計測した精度は以下の通りです:
![Figure モデル精度の計算](./Calculation%20of%20model%20accuracy.png)
Figure 4 モデル精度の計算
