# unit5

- Introduction to Decision Trees
- Entropy and Information Gain
- ID3 and ID4.5 Algorithms

## Goal

main

- Understand the structure and operation of Decision Trees.
- Define the concepts of Entropy and Information Gain.
- Calculate entropy and information gain given a set of data.
- Complete the steps within the ID3 algorithm manually.
- Generate a decision tree using R.

ja

- 決定木の構造と操作を理解する。
- エントロピーと情報量の概念を定義する。
- データセットを与えられた場合のエントロピーと情報量を計算する。
- ID3アルゴリズムの手順をすべて手動で実行する。
- Rを使用して決定木を生成する。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

James, G., Witten, D., Hastie, T., & Tibshirani, R. (2013).  An introduction to statistical learning with applications in R. New York, NY: Springer.  Read Chapter 8.

Review the presentation which details how to compute entropy, information gain as part of an algorithm to ‘learn’ a decision tree.  Available from <http://www.math.unipd.it/~aiolli/corsi/0708/IR/Lez12.pdf>

## Discussion Forum

Conduct research on the internet and in the University of the People library on the topic of decision trees for classification. Based upon your research, identify at least two use cases (problems or opportunities where you would use a decision tree to solve the problem) for decision trees and describe how decision tree learning could be used as a solution for the use case.  
One example (which you may NOT use) is training a decision tree to make a decision whether to approve a home mortgage based upon a number of data elements including the creditworthiness of the mortgage applicant and the value and characteristics of the property being mortgaged.
Use the Internet and the University of the People library to conduct your research.  Make sure that you are citing your sources.  Since this assignment will require significant research you must include at least two sources in your response.

インターネットとUniversity of the Peopleの図書館を使用して、分類のための決定木（Decision Trees）に関する調査を行いましょう。調査に基づき、決定木を使用して問題を解決する、または機会を見出すことができる少なくとも2つのユースケース（問題や機会）を特定し、それぞれのユースケースにおいて決定木学習がどのように解決策として使用できるかを説明してください。
例として、決定木を使用して住宅ローンを承認するかどうかを決定するトレーニングを行うことが挙げられます（この例は使用しないでください）。この例では、住宅ローン申請者の信用度や抵当物件の価値や特徴などのデータ要素に基づいて判断します。
インターネットとUniversity of the Peopleの図書館を使用して調査を行いましょう。必ず出典を明記してください。この課題では多くの調査が必要なため、少なくとも2つの情報源を回答に含める必要があります。

### Japanese Discussion

分類のための決定木：製造業と金融分野での応用
導入
決定木（Decision Trees）は、さまざまな業界において分類や予測タスクに活用される強力なツールです。特定の入力データに基づいて意思決定を行うための視覚的かつ解釈可能な構造を提供します。本稿では、製造業における不良品の検出と金融分野における詐欺検出という2つの実用例を取り上げます。これらの例を分析することで、決定木学習が現実世界の課題にどのように対応できるかを示します。

決定木の概要
決定木は、分類や回帰タスクで使用される教師あり学習アルゴリズムです。ノードは意思決定や属性を、枝は結果を、葉は最終的な予測や分類を表します（Mitchell, 1997）。そのシンプルさと解釈の容易さは、非専門家が予測の理由を理解する必要がある分野で特に有用です。

ユースケース1：製造業における不良品の検出
製造プロセスは、多数の変数が製品の品質に影響を与える複雑なシステムです。決定木は、製造中に収集されたセンサーデータを基に、製品が不良品かどうかを分類するために使用できます。たとえば、温度、圧力、生産速度といった属性が入力特徴量として利用されます。この木は、トレーニングデータに基づいて「不良品」または「正常品」として出力を分類します。

使用方法: 決定木アルゴリズムは、生産ラインの過去のデータを使用してトレーニングされます。たとえば、温度が特定の閾値を超え、圧力が基準値を下回る場合、製品は不良品である可能性が高いとモデルが学習します。このパターンを新しいデータに適用することで、リアルタイムでの分類が可能になります。

影響: 決定木を不良品検出に採用することで、廃棄物を削減し、稼働停止時間を最小化し、生産効率を向上させることができます（Patil et al., 2020）。また、その解釈可能な構造により、技術者が不良品の根本原因を特定し対処する際にも役立ちます。

ユースケース2：金融分野における詐欺検出
詐欺取引は金融機関にとって重大な課題です。決定木は、取引データ（取引額、場所、ユーザー行動パターンなど）を分析し、不正行為を特定するのに効果的です。

使用方法: 決定木は、合法的な取引と不正取引を含むラベル付きデータを用いてトレーニングされます。たとえば、取引額が異常に大きく、通常の活動範囲外の場所で発生している場合、この木はその取引を潜在的に不正と分類することがあります。

影響: 詐欺検出を自動化することで、金融機関は脅威に迅速かつ正確に対応できます。また、その解釈可能性により、規制当局や顧客に対してフラグを立てた取引を正当化しやすくなるため、コンプライアンスの厳しい環境でも重要な役割を果たします（Baesens et al., 2015）。

結論
決定木は、多様な業界で分類問題を解決する重要な役割を果たします。製造業では不良品検出を効率化し、金融分野では詐欺検出を強化します。その解釈可能な結果を提供する能力により、幅広い分野で採用されています。今後の研究では、ランダムフォレストなどのアンサンブル手法と統合することで、さらなる性能向上を探ることができます。

参考文献
Baesens, B., Van Vlasselaer, V., & Verbeke, W. (2015). Fraud analytics using descriptive, predictive, and social network techniques: A guide to data science for fraud detection. Wiley.
Mitchell, T. M. (1997). Machine Learning. McGraw-Hill Education.
Patil, R., Kumar, A., & Singh, M. (2020). Defect detection in manufacturing using machine learning: A review. International Journal of Advanced Research in Science, Engineering and Technology, 7(4), 12568–12575. Retrieved from <https://www.ijarset.com>

## Programming Assignment

For the Unit 5 Programming Assignment, follow the instructions for the lab in our textbook in section 8.3.  When you are comfortable with this assignment you will build a decision tree using the following data.

**Data Set Information:**

This radar data was collected by a system in Goose Bay, Labrador. This system consists of a phased array of 16 high-frequency antennas with a total transmitted power on the order of 6.4 kilowatts. See the paper for more details. The targets were free electrons in the ionosphere.

![Unit5WA](../images/Unit%205%20WA.png)

"Good" radar returns are those showing evidence of some type of structure in the ionosphere.
"Bad" returns are those that do not; their signals pass through the ionosphere.
Received signals were processed using an autocorrelation function whose arguments are the time of a pulse and the pulse number. There were 17 pulse numbers for the Goose Bay system. Instances in this database are described by 2 attributes per pulse number, corresponding to the complex values returned by the function resulting from the complex electromagnetic signal.

**Attribute Information:**

-- All 34 are continuous
-- The 35th attribute is either "good" or "bad" according to the definition summarized above.

This is a binary classification exercise.

Download the data set: <https://my.uopeople.edu/pluginfile.php/295432/mod_workshop/instructauthors/Ionosphere.txt>

This assignment follows the programming lab in section 8.3 of the textbook closely. If you are unsure how to carry out part of the assignment, it could be helpful to use the lab as a reference. It might also be helpful to refer to the manual for the rpart package:

<https://cran.r-project.org/web/packages/rpart/rpart.pdf>

**Part 1: Print decision tree**

a. We begin by setting the working directory, loading the required packages (rpart and mlbench) and then loading the Ionosphere dataset.

```R
# set working directory if needed (modify path as needed)
setwd(“working directory”)
# load required libraries – rpart for classification and regression trees
library(rpart)
# mlbench for Ionosphere dataset
library(mlbench)
# load Ionosphere
data(Ionosphere)
```

b. Use the rpart() method to create a regression tree for the data.

```R
rpart(Class~.,Ionosphere)
```

c. Use the `plot()` and `text()` methods to plot the decision tree.

**Part 2: Estimate accuracy**

a. Split the data a test and train subsets using the sample() method.
b. Use the rpart method to create a decision tree using the training data.

`rpart(Class~.,Ionosphere,subset=train)`

c. Use the predict method to find the predicted class labels for the testing data.
d. Use the table method to create a table of the predictions versus true labels and then compute the accuracy. The accuracy is the number of correctly assigned good cases (true positives) plus the number of correctly assigned bad cases (true negatives) divided by the total number of testing cases.

### Japanese Programming Assignment Question

Part 1: 決定木の出力

a. 作業ディレクトリを設定し、必要なパッケージ (rpart および mlbench) をロードして、Ionosphere データセットを読み込みます。

r
コードをコピーする

setwd("作業ディレクトリ")  # 作業ディレクトリの設定（必要に応じてパスを修正）

library(rpart)  # rpart: 分類および回帰木用パッケージ
library(mlbench)  # Ionosphereデータセット用パッケージ
data(Ionosphere)  # Ionosphereデータセットの読み込み
b. rpart() メソッドを使用して、データの決定木を作成します。

r
コードをコピーする
rpart(Class~., Ionosphere)
c. plot() および text() メソッドを使って、決定木を描画します。

Part 2: 精度の評価

a. sample() メソッドを使って、データを訓練データとテストデータに分割します。

b. rpart() メソッドを使用して訓練データから決定木を作成します。

r
コードをコピーする
rpart(Class~., Ionosphere, subset=train)
c. predict() メソッドを使用してテストデータの予測クラスラベルを取得します。

d. table() メソッドを使用して予測ラベルと正解ラベルの比較テーブルを作成し、次の式で精度を計算します：

精度 = 正しく分類された良好ケース（真陽性） + 正しく分類された不良ケース（真陰性） ÷ テストケースの合計

### Japanese Programming Assignment

#### Part 1: 決定木の出力

与えられたIonosphereデータセットに対してRを使用して決定木を構築し可視化します。作業の手順は以下の通りです。

a. 作業ディレクトリとパッケージの設定
作業ディレクトリを設定し、必要なパッケージrpartとmlbenchを読み込みます。Ionosphereデータセットもこのステップで読み込みます。

```R
# 作業ディレクトリの設定（必要に応じて変更）
setwd("/Users/hayashir/work/Github/UoPeople/CS4407-branch/CS4407/unit5/PA")

# パッケージの読み込み
library(rpart)
library(mlbench)

# データセットの読み込み
ionosphere_data <- read.table("Ionosphere.txt", 
                            header = FALSE,
                            sep = ",",
                            stringsAsFactors = TRUE)

# 列名を追加
colnames(ionosphere_data) <- c(paste0("V", 1:34), "Class")

# データの確認
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

c. 決定木の可視化
`plot()`と`text()`関数を用いて、作成した決定木を可視化します。

```R
# 決定木の描画
plot(ionosphere_tree, uniform = TRUE, main = "Ionosphere Decision Tree")

# ノードにラベルを追加
text(ionosphere_tree, use.n = TRUE, all = TRUE, cex = 0.8)
```

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
今週は、意思決定木（Decision Trees）の基本的な構造と動作の理解から始まり、エントロピー（Entropy）や情報利得（Information Gain）の計算方法、そしてID3およびID4.5アルゴリズムの詳細な仕組みについて学びました。これに加え、R言語を用いて実際に意思決定木を生成し、データセットに基づいた分類モデルを構築・評価するプログラミング課題を通じて実践的なスキルを習得しました。また、ディスカッション課題では、意思決定木の分類用途について研究し、2つの具体的なユースケースを考察しました。

自分の感想
意思決定木の学習は、初めて目にする用語や概念も多く、少し圧倒される部分もありましたが、全体として非常に興味深い内容でした。特に、エントロピーや情報利得の計算を手動で行う作業では、データの構造と意思決定木の分岐の仕組みを直感的に理解する助けとなりました。計算そのものは複雑でしたが、「なぜそのノードが選ばれたのか」「情報利得が何を最適化しているのか」を具体的に理解することで、アルゴリズムのロジックを深く掘り下げられたと感じています。

また、Rのrpartパッケージを使用して意思決定木を作成するプログラミング課題では、コードを実行することで得られる即時的なフィードバックが学習意欲を高めました。一方で、複雑なデータセットを扱う際に、計算速度や精度のトレードオフについて考えさせられる場面もありました。これらは、現実世界の問題をアルゴリズムに適用する際の課題として今後の学習に活かしたいと感じました。

特に深く学習したこと
最も印象的だったのは、エントロピーと情報利得を計算しながら、データ分割の最適化プロセスを理解したことです。たとえば、エントロピーが「データの不確実性」を数値化する指標であり、情報利得が「不確実性をどれだけ削減できるか」を示す指標であることを学びました。この理解をもとに、データセットの各属性についてエントロピーを計算し、情報利得が最大になる属性を選択するプロセスを実践しました。

プログラミング課題では、Goose Bayで収集されたイオノスフィアデータセットを使用して意思決定木を生成しました。このデータセットは、34個の連続属性と1つのカテゴリ属性から成るもので、特に「良い」信号と「悪い」信号を分類する二値分類の問題でした。まず、データセットをトレーニングデータとテストデータに分割し、rpartメソッドを用いてモデルを作成しました。その後、predictメソッドを使用して予測値を計算し、正確度を評価しました。このプロセスを通じて、実際のデータを用いた意思決定木モデルの構築から評価までの一連の流れを実践的に学ぶことができました。

また、ディスカッション課題を通じて、意思決定木の実用例を調査しました。例えば、意思決定木が医療診断や製品推薦システムでどのように活用されるかを具体的に考察することで、アルゴリズムの実用性をより深く理解する機会となりました。

今後の課題と来週に向けて
来週は、人工ニューロンとパーセプトロンアルゴリズムを学ぶ予定です。これにより、人工知能の基礎となる数学的・論理的スキルをさらに高めたいと考えています。また、データマイニングと機械学習の違いを深く理解することで、学習内容を実務やさらなる研究に応用する基盤を構築したいと考えています。

さらに、今週取り組んだ意思決定木の課題では、アルゴリズムの計算効率や実用的な限界について考察が不十分だったと感じており、来週以降の学習においてこれらの側面を掘り下げていきたいです。
