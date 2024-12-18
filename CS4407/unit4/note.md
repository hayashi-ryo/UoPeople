# unit4

- Examples of classifiers
- The concept of ‘nearness’
- Many approaches to classification
  - Bayes Theorem
  - Nearest Neighbors Methods
  - Decision Trees
  - Neural Networks
  - Logistic Regression

## Goal

main

- Describe the function of a classifier.
- Define why classification is considered to be supervised learning.
- Implement a simple classifier program (K Nearest Neighbors algorithm) using R.
- Describe the basic characteristics of classification approaches (Bayes, Nearest Neighbors, Decision Trees, Neural networks, logistic regression) and where each might be applicable.

ja

- 分類器の機能を説明しなさい。
- 分類が教師あり学習と見なされる理由を定義しなさい。
- Rを使用して、単純な分類器プログラム（K最近傍アルゴリズム）を実装しなさい。
- 分類アプローチ（ベイズ、最近傍、決定木、ニューラルネットワーク、ロジスティック回帰）の基本的な特性と、それぞれが適用可能な分野について説明しなさい。

## Task

- [x] Reading assignment
- [x] Peer assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

James, G., Witten, D., Hastie, T., & Tibshirani, R. (2013).  An Introduction to Statistical Learning with Applications in R. New York, NY: Springer.  Read Chapter 4 available at <https://www.stat.berkeley.edu/users/rabbee/s154/ISLR_First_Printing.pdf>

Skand, K. (2017, October 8). kNN(k-Nearest Neighbor) algorithm in R. Retrieved from <https://rstudio-pubs-static.s3.amazonaws.com/316172_a857ca788d1441f8be1bcd1e31f0e875.html>

King, W. B.  Logistic Regression Tutorial.  This tutorial demonstrates the use of Logistic Regression as a classifier algorithm. <http://ww2.coastal.edu/kingw/statistics/R-tutorials/logistic.html>

## Discussion Forum

As part of your response explain and provide a detail example of how the min-max normalization and Z-score standardization values are computed and also explain why a data scientist might want to use either of these techniques.

あなたの回答の一部として、最小最大正規化（min-max normalization）およびZスコア標準化（Z-score standardization）の値がどのように計算されるかを説明し、具体例を詳しく提供してください。また、データサイエンティストがこれらの手法のいずれかを使用したい理由についても説明してください。

### Japanese Discussion

### **1. 導入 (Introduction)**  

データの前処理は、データ分析や機械学習において非常に重要なステップです。特に、特徴量のスケールが異なる場合、スケーリングや標準化がモデルの性能や収束速度に大きな影響を与えることがあります。最小最大正規化（min-max normalization）とZスコア標準化（Z-score standardization）は、この目的で広く使用される2つの手法です。本稿では、それぞれの手法の計算方法を具体例を用いて説明し、データサイエンティストがこれらを使用する理由を考察します。

---

### **2. 最小最大正規化の説明と具体例 (Min-Max Normalization and Example)**  

最小最大正規化は、データを指定された範囲（通常0から1）にスケーリングする方法です。この手法は、以下の式を使用します：  
\[ x' = \frac{x - x_{\text{min}}}{x_{\text{max}} - x_{\text{min}}} \]  
ここで、\(x_{\text{min}}\) はデータセット内の最小値、\(x_{\text{max}}\) は最大値を表します（James et al., 2013）。

具体例として、データ [10, 20, 30, 40] を考えます。この場合、最小値 \(x_{\text{min}} = 10\)、最大値 \(x_{\text{max}} = 40\) です。データ値20を正規化すると：  
\[ x' = \frac{20 - 10}{40 - 10} = \frac{10}{30} = 0.33 \]

この手法は、特徴量のスケールを統一し、異なるスケールを持つ特徴量がモデルに不均一な影響を与えるのを防ぐために有効です。また、最小最大正規化は、ニューラルネットワークなどのスケールに敏感なモデルにおいて特に効果を発揮します（Brownlee, 2020）。

---

### **3. Zスコア標準化の説明と具体例 (Z-Score Standardization and Example)**  

Zスコア標準化は、各データポイントが平均値からどれだけ離れているかを標準偏差で割った値としてスケールします。計算式は以下の通りです：  
\[ z = \frac{x - \mu}{\sigma} \]  
ここで、\(\mu\) は平均、\(\sigma\) は標準偏差を表します（James et al., 2013）。

例として、同じデータ [10, 20, 30, 40] を使用します。この場合、平均 \(\mu = 25\)、標準偏差 \(\sigma = 12.91\) です。データ値20を標準化すると：  
\[ z = \frac{20 - 25}{12.91} = -0.39 \]

Zスコア標準化は、データを平均0、標準偏差1に調整するため、外れ値の影響を軽減しやすいという特徴があります。この手法は、正規分布を仮定するモデルやクラスタリング、主成分分析（PCA）において特に有効です（Han et al., 2011）。

---

### **4. データサイエンティストがこれらの手法を使用する理由 (Why Data Scientists Use These Techniques)**  

データサイエンティストがこれらの手法を使用する理由として、主に以下の点が挙げられます：

1. **最小最大正規化**: 機械学習アルゴリズム（特に勾配ベースの手法）が各特徴量のスケールに敏感であるため、特徴量間の一貫性を保つために使用されます。また、0から1の範囲でスケールすることで、結果の解釈が直感的になります（Brownlee, 2020）。
2. **Zスコア標準化**: 外れ値の影響を軽減し、正規分布を仮定するモデルに適合しやすくするために適しています。この手法は、例えばクラスタリングや主成分分析（PCA）においても有効です（Han et al., 2011）。

どちらの手法を選択するかは、データの性質と使用するアルゴリズムに依存します。

---

### **5. 結論 (Conclusion)**  

最小最大正規化とZスコア標準化は、データ分析における前処理ステップとして重要な役割を果たします。それぞれ異なる目的と特性を持つため、データの状況に応じて適切な手法を選択することが成功の鍵です。これらの手法を正しく適用することで、モデルのパフォーマンスを最大化し、信頼性の高い結果を得ることができます。

---

#### **参考文献 (References)**  

- Brownlee, J. (2020). *How to normalize and standardize data in Python*. Machine Learning Mastery. Retrieved from <https://machinelearningmastery.com/how-to-normalize-and-standardize-data-in-python/>  
- Han, J., Kamber, M., & Pei, J. (2011). *Data Mining: Concepts and Techniques* (3rd ed.). Morgan Kaufmann.  
- James, G., Witten, D., Hastie, T., & Tibshirani, R. (2013). *An Introduction to Statistical Learning: with Applications in R*. Springer Texts in Statistics.

---

## Programming Assignment

Programming Assignment
K-NEAREST NEIGHBORS EXERCISE – ASSIGNMENT  UNIT 4

Imaging objects in classes A and B having two numeric attributes/properties that we map to X and Y Cartesian coordinates so that we can plot class instances (cases) as points on a 2-D chart. In other words, our cases are represented as points with X and Y coordinates (p(X,Y)).

Our simple classes A and B will have 3 object instances (cases) each.

Class A will include points with coordinates (0,0), (1,1), and (2,2).
Class B will include points with coordinates (6,6), (5.5,7), and (6.5,5).

In R, we can write down the above arrangement as follows:

Class A training object instances (cases)

A1=c(0,0)
A2=c(1,1)
A3=c(2,2)

Class B training objects instances (cases)

B1=c(6,6)
B2=c(5.5,7)
B3=c(6.5,5)

How are the classification training objects for class A and class B arranged on a chart?

•    Print  the chart

The knn() function is housed in the class package and is invoked as follows:

knn(train, test, cl, k)

where

train is a matrix or a data frame of training (classification) cases
test is a matrix or a data frame of test case(s) (one or more rows)
cl is a vector of classification labels (with the number of elements matching the number of classes in the training data set)
k is an integer value of closest cases (the k in the k-Nearest Neighbor Algorithm); normally, it is a small odd integer number

Now, when we try out classification of a test object (with properties expressed as X and Y coordinates), the kNN algorithm will use the Euclidean distance metric calculated for every row (case) in the training matrix to find the closest one for k=1 and the majority of closest ones for k > 1 (where k should be an odd number).

•    Construct the cl parameter (the vector of classification labels).

To run the knn() function, we need to supply the test case(s), which corresponds to a point sitting approximately in the middle of the distance between A and B. suppose
test=c(4,4)

At this point, we have everything in place to run knn(). Let’s do it for k = 1 (classification by its proximity to a single neighbor).
For more informative reports of test object classification results, we are going to use the summary() function that can polymorphically act on its input parameter depending on its type. In our case, the input parameter to the summary() function is the output of the knn() function.

•    Calculate summary() function of knn() and show the results

•    Which class does the test case belong to?

Now define

test=c(3.5, 3.5)
Visually, this test case point looks to be closer to the cluster of the A class cases (points)

•    Calculate summary() function of knn() and show the results

•    Which class does the test case now belong to?

Let’s increase the number of closest neighbors that are involved in voting during the classification step.

•    Calculate the summary using K=3 and tell which class does the test case belong to?

Now, let’s build a matrix of test cases containing four points:

T1=(4,4)
T2=(3,3)
T3=(5,6)
T4=(7,7)

How many of the points in our test batch are classified as belonging to each class?

Create test as a two-column matrix containing the X and Y coordinates of our test points.

Now run again the previous knn summary command:

•    show the results

### Japanese Programming Assignment Question

**K-最近傍法 (k-Nearest Neighbors, kNN) 演習 – ユニット4 課題**

オブジェクトがクラスAとクラスBに属しており、それぞれが2つの数値属性またはプロパティを持っていると仮定します。それらをXおよびYの直交座標にマッピングし、クラスインスタンス（ケース）を2次元チャート上の点としてプロットします。つまり、各ケースはXとYの座標 (p(X,Y)) を持つ点として表されます。

クラスAとクラスBの単純なクラスには、それぞれ3つのオブジェクトインスタンス（ケース）が含まれます。

- クラスAには次の座標を持つ点が含まれます：(0,0), (1,1), (2,2)
- クラスBには次の座標を持つ点が含まれます：(6,6), (5.5,7), (6.5,5)

Rでは、上記の配置を次のように記述できます：

```R
# クラスAのトレーニングオブジェクトインスタンス（ケース）
A1=c(0,0)
A2=c(1,1)
A3=c(2,2)

# クラスBのトレーニングオブジェクトインスタンス（ケース）
B1=c(6,6)
B2=c(5.5,7)
B3=c(6.5,5)
```

1. **クラスAとクラスBのトレーニングオブジェクトをチャートにどのように配置しますか？**
    - チャートを出力してください。

---

**knn() 関数の使用方法**

`knn()` 関数は `class` パッケージ内にあり、以下のように呼び出します：

```R
knn(train, test, cl, k)
```

- `train`: トレーニング（分類）ケースの行列またはデータフレーム
- `test`: テストケース（一つ以上の行）
- `cl`: トレーニングデータセット内のクラスラベル（トレーニングデータのケース数と一致する要素数を持つベクトル）
- `k`: 最近傍アルゴリズムで使用する最も近いケースの数（通常、小さな奇数）

**例:**
次に、分類ラベル（cl パラメータ）を構築します。

---

**課題詳細**

1. **k=1 の場合：**
    - テストケースとして `test=c(4,4)` を用いる。
    - `knn()` を実行し、`summary()` 関数を使用して結果を出力してください。
    - テストケースはどのクラスに属しますか？

2. **新しいテストケースの場合：**
    - `test=c(3.5,3.5)` を用いる。
    - 結果を出力し、テストケースがどのクラスに属するか説明してください。

3. **k=3 に増やす：**
    - 近隣の数を 3 に増やし、分類結果を出力してください。

4. **複数のテストケースを扱う：**
    - 次の4つのテストケースを含む行列を作成します。
      - T1=(4,4), T2=(3,3), T3=(5,6), T4=(7,7)
    - 各クラスに属する点の数を示し、結果を出力してください。

### Japanese Programming Assignment

#### 問題概要

この課題では、K-最近傍法 (k-Nearest Neighbors, kNN) アルゴリズムを用いて、2つの異なるクラス (A と B) に属するオブジェクトの分類を行います。それぞれのクラスには、2次元空間の座標 (X, Y) によって表される3つのトレーニングケースが含まれています。

クラスAのトレーニングケースは以下の座標で表されます：
A1=(0, 0)
A2=(1, 1)
A3=(2, 2)

クラスBのトレーニングケースは以下の座標で表されます：
B1=(6, 6)
B2=(5.5, 7)
B3=(6.5, 5)

これらのデータをR言語を使用してプロットし、可視化します。その後、分類ラベル（cl）を構築し、テストケースとして与えられた点 (4, 4) や (3.5, 3.5) を用いて、どちらのクラスに属するかを判定します。また、近傍数 k を変更することで、分類結果がどのように変化するかを確認します。
さらに、複数のテストケース（T1=(4,4), T2=(3,3), T3=(5,6), T4=(7,7)）をまとめて処理し、それぞれのケースがどのクラスに属するかを判定します。
この課題を通じて、以下の目的を達成します：

1. kNNアルゴリズムの基本的な仕組みを理解する。
2. kNNを用いた分類結果を視覚的に表現し、その動作を解釈する。
3. k値（近隣数）の選択が分類精度に与える影響を考察する。

#### データの準備

本課題では、K-最近傍法 (kNN) アルゴリズムを用いるために、まずトレーニングデータを準備します。クラスAとクラスBには、それぞれ3つのオブジェクトインスタンス（ケース）が含まれており、これを2次元座標として定義します。
与えられたデータは以下のコードで準備します。

```R
A1 <- c(0, 0)
A2 <- c(1, 1)
A3 <- c(2, 2)

B1 <- c(6, 6)
B2 <- c(5.5, 7)
B3 <- c(6.5, 5)

test1 <- c(4, 4)
test2 <- c(3.5, 3.5)

train <- matrix(c(0, 0, 1, 1, 2, 2, 6, 6, 5.5, 7, 6.5, 5), ncol = 2, byrow = TRUE)
colnames(train) <- c("X", "Y")
cl <- factor(c("A", "A", "A", "B", "B", "B"))
```

#### 各課題に対する回答

1. トレーニングデータの可視化
K-最近傍法 (kNN) アルゴリズムを実行する前に、トレーニングデータの分布を可視化することで、データセットの特徴を把握します。本課題では、クラスAとクラスBのトレーニングデータを2次元チャート上にプロットし、それぞれのクラスのポイントを視覚的に確認します。
データをプロットするために、R言語の plot() 関数を使用します。また、cl（分類ラベル）に基づいて異なる色で各クラスを区別します。
**可視化のコード**
以下はRスクリプトでのプロットの実装例です：

```R
plot(train, col = cl, pch = 16, xlab = "X", ylab = "Y", main = "Plot the Chart")
legend("topleft", legend = levels(cl), col = 1:2, pch = 16)
```

train: トレーニングデータの座標
col = cl: クラスラベルに基づいてポイントの色を変更
pch = 16: ポイントの形状を設定
legend: クラスAとクラスBの凡例を表示

**可視化結果**

Figure 1 トレーニングデータの可視化

コードを実行した結果得られたプロット結果を解釈すると、クラスAとクラスBは2次元空間上で明確に異なる領域に位置しており、それぞれのクラスに属するデータポイントが離れた位置に集まっていることがわかります。

2. k=1の分類
K-最近傍法 (kNN) アルゴリズムの基本的な動作を理解するために、まず k=1 を設定してテストケース(4, 4)を分類します。この場合、分類はテストケースから最も近い1つのトレーニングポイント（最近傍）のクラスに基づいて行われます。

**分類の実装**
以下のコードを使用して、R言語でkNNアルゴリズムを実行します:

```R
library(class)
test1 <- matrix(c(4, 4), ncol = 2)
result_k1 <- knn(train, test1, cl, k = 1)
print(result_k1)
summary(result_k1)
```

**分類結果**

Figure 2 テストケース1に対するkNNアルゴリズムの実行結果
この結果から、テストケース(4,4)はクラスBに分類されたことが確認できました。

**ユークリッド距離による確認**
分類の根拠を確認するため、テストケース(4, 4)から各トレーニングデータポイントへのユークリッド距離を計算します：
ラスA:
距離(A1) = √((4-0)² + (4-0)²) = √32 ≈ 5.66
距離(A2) = √((4-1)² + (4-1)²) = √18 ≈ 4.24
距離(A3) = √((4-2)² + (4-2)²) = √8 ≈ 2.83
クラスB:
距離(B1) = √((4-6)² + (4-6)²) = √8 ≈ 2.83
距離(B2) = √((4-5.5)² + (4-7)²) = √6.25 ≈ 2.50
距離(B3) = √((4-6.5)² + (4-5)²) = √6.25 ≈ 2.50
最も近いポイントはクラスBのポイント (B2, B3) であり、それぞれの距離は2.50です。したがって、kNNアルゴリズムはクラスBに分類しました。

3. 新しいテストケースの分類

次に、テストケース(3.5, 3.5)について分類を行います。この分類では、k=1 の設定を引き続き使用し、ユークリッド距離を基に分類結果を確認します。

**分類の実装**

以下のコードを使用して、R言語でkNNアルゴリズムを実行します:

```R
test2 <- matrix(c(3.5, 3.5), ncol = 2)
result_k1_test2 <- knn(train, test2, cl, k = 1)
print(result_k1_test2)
summary(result_k1_test2)
```

**分類結果**

Figure 3 テストケース2に対するkNNアルゴリズムの実行結果
この結果から、テストケース(3.5, 3.5)はクラスBに分類されたことが確認できました。

**ユークリッド距離による確認**

分類の根拠を確認するため、テストケース(3.5, 3.5)から各トレーニングデータポイントへのユークリッド距離を計算します：
クラスA:
距離(A1) = √((3.5-0)² + (3.5-0)²) = √24.5 ≈ 4.95
距離(A2) = √((3.5-1)² + (3.5-1)²) = √12.5 ≈ 3.54
距離(A3) = √((3.5-2)² + (3.5-2)²) = √4.5 ≈ 2.12
クラスB:
距離(B1) = √((3.5-6)² + (3.5-6)²) = √12.5 ≈ 3.54
距離(B2) = √((3.5-5.5)² + (3.5-7)²) = √13.25 ≈ 3.64
距離(B3) = √((3.5-6.5)² + (3.5-5)²) = √14.25 ≈ 3.77

最も近いポイントはクラスAのポイント (A3) であり、距離は2.12です。このため、テストケース (3.5, 3.5) はクラスAに分類されました。

4. k=3の分類複数のテストケースの分類

複数のテストケースをまとめて分類します。テストケースは以下の4点を含む行列として設定します:

T1 = (4, 4)
T2 = (3, 3)
T3 = (5, 6)
T4 = (7, 7)

**分類の実装**

```R
test_batch <- matrix(c(4, 4, 3, 3, 5, 6, 7, 7), ncol = 2, byrow = TRUE)
result_batch <- knn(train, test_batch, cl, k = 3)
print(result_batch)
summary(result_batch)
```

**分類結果**

Figure 4 テストケースに対するkNNアルゴリズムの実行結果

この結果から、4つのテストケースのうち1つがクラスAに、3つがクラスBに分類されました。

## Learning Journal

The Learning Journal is a tool for self-reflection on the learning process. In addition to completing directed tasks, you should use the Learning Journal to document your activities, record problems you may have encountered and to draft answers for Discussion Forums and Assignments. The Learning Journal should be updated regularly (on a weekly basis), as the learning journals will be assessed by yourinstructor as part of your Final Grade.

Your learning journal entry must be a reflective statement that considers the following questions:

1. Describe what you did. This does not mean that you copy and paste from what you have posted or the assignments you have prepared. You need to describe what you did and how you did it.
2. Describe your reactions to what you did.
3. Describe any feedback you received or any specific interactions you had. Discuss how they were helpful.
4. Describe your feelings and attitudes.
5. Describe what you learned.

Another set of questions to consider in your learning journal statement include:

1. What surprised me or caused me to wonder?
2. What happened that felt particularly challenging? Why was it challenging to me?
3. What skills and knowledge do I recognize that I am gaining?
4. What am I realizing about myself as a learner?
5. In what ways am I able to apply the ideas and concepts gained to my own experience?

Finally, describe one important thing that you are thinking about in relation to the activity.

Your Learning Journal should be a minimum of 500 words.

### Japanese Learning Journal

今週の概要
今週は、分類器の概念、その機能、そして教師あり学習における役割について学びました。分類器は、与えられた入力特徴に基づいてデータポイントを分類するための重要なコンポーネントであり、機械学習において不可欠です。分類が教師あり学習とみなされる理由は、モデルが未知のデータのカテゴリーを予測できるようにするためにラベル付きデータが必要だからです。
また、ベイズ定理、最近傍法、決定木、ニューラルネットワーク、ロジスティック回帰といった分類の多様なアプローチについて、それぞれの特徴や適用例を学びました。たとえば、ベイズ定理は確率的推論に基づいており、最近傍法は距離計算を使用して予測を行います。また、Rを使用してシンプルなK近傍法（KNN）分類器を実装する機会もありました。ここでは、ラベル付きの訓練データを使用してテストポイントを分類しました。
さらに、ディスカッション課題では、min-max正規化とZスコア標準化の違いを理解し、説明しました。これらの技術はデータの前処理において重要であり、特徴量を比較可能なスケールに揃える役割を果たします。プログラミング課題では、KNNアルゴリズムを使用してテストケースを分類し、近傍数（k）といったパラメータが分類結果に与える影響を分析しました。

自分の感想
分類の理論と実践の両方に取り組むことは、とてもやりがいのある経験でした。Rで分類器がどのように機能するかを直接実装することで、この分野への理解が深まりました。たとえば、knn()関数を使用して分類プロセスを視覚化することで、距離計算がどのようにテストポイントのクラスを決定するかを明確に理解することができました。アルゴリズムの理論的原則がプログラミングを通じて具現化される様子を確認することは特に満足感がありました。
一方で、min-max正規化とZスコア標準化の計算方法や適用例を説明するディスカッション課題では、数式をしっかり理解した上で、複雑なアイデアをシンプルでわかりやすい形に分解して伝える難しさを感じました。
また、フィードバックを反映することの重要性も再確認しました。ディスカッションフォーラムでクラスメートと意見を交わす中で、正規化技術を説明するアプローチを改善することができました。他者からの質問や視点は、基本原則を再確認するきっかけとなり、学習を一層豊かなものにしました。

特に深く学習したこと
特に集中して学んだのは、多様な分類アプローチの特徴とその適用範囲です。たとえば、ベイズ定理はデータの確率分布が既知の場合に優れた力を発揮する確率モデルであり、医療診断やスパム検出などに役立ちます。一方、最近傍法はシンプルながら、近接性に基づいてデータポイントを分類するイメージ認識のような場面で効果的です。
さらに興味深かったのは、決定木の学習です。これは特徴量の値に基づいて意思決定を行うフローチャートのようなモデルを作成するもので、シンプルさと解釈のしやすさから顧客セグメンテーションなどの用途に適しています。ニューラルネットワークやロジスティック回帰も取り上げ、それぞれの複雑なデータセット処理能力や2クラス分類問題への有効性について学びました。
プログラミング課題では、KNNアルゴリズムの実装を通じてさらに深く学びました。Rを用いて訓練データとテストデータを構築し、ユークリッド距離を計算し、kの値が分類精度に与える影響を評価しました。たとえば、kを1から3に増やすと、分類結果がどのように変化するかを確認できました。この演習は、パラメータ調整がモデルのパフォーマンスに与える影響を実感させ、機械学習における実験の重要性を強調するものでした。

今後の課題と来週に向けて
来週は、決定木アルゴリズム（ID3およびID4.5）や、それに関連するエントロピーや情報利得といった概念を学ぶ予定です。これらのトピックは、決定木が分類モデルとしてどのように機能するかを理解する上での基盤となります。私の目標は、これらの概念を単に理論的に理解するだけでなく、サンプルデータを用いて手動で計算する練習を行うことです。
また、Rプログラミングスキルを向上させることも重要な課題です。決定木を構築するためには、アルゴリズムのワークフローを理解し、それをコードに変換できる能力が必要です。さらに、情報利得の計算プロセスのような複雑な概念を、明確かつ簡潔に説明する能力を強化することを目指します。

最後に、ディスカッションフォーラムに積極的に参加し、クラスメートと意見を交換していく予定です。協働学習を通じて、決定木やそのアルゴリズムに関する理解を深めることができると考えています。理論と実践の両方に焦点を当てることで、このコースで扱う次のトピックに向けた強固な基盤を築きたいと思います。
