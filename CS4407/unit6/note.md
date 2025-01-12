# unit6

- Artificial Neurons
- Operation of Artificial Neuron
- Perceptron Algorithm and Weighting

## Goal

main

- Describe the basic operation of a biological neuron and its artificial neuron equivalents.
- Define the components of an artificial neuron.
- Implement the weighting algorithm of a perceptron.
- Define the characteristics of some problems for which a neural network is a problem solution.
- Describe the difference between Data Mining and Machine Learning.

ja

- 生物学的ニューロンと人工ニューロンとの基本的な動作を説明しなさい。
- 人工ニューロンの構成要素を定義しなさい。
- パーセプトロンにおける重み付けアルゴリズムを実装しなさい。
- ニューラルネットワークが問題解決となるいくつかの問題の特徴を定義しなさい。
- データマイニングと機械学習の違いを説明しなさい。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

Gershenson, C. (2003). Artificial neural networks for beginners. arXiv preprint cs/0308031. Available from: <http://arxiv.org/ftp/cs/papers/0308/0308031.pdf>

Cowan, M. K. (2013). Machine learning. Available from: <https://my.uopeople.edu/pluginfile.php/1928503/mod_book/chapter/540682/neural-networks-ebook.pdf>

Peterson, C., & Rögnvaldsson, T. S. (1991). An introduction to artificial neural networks (No. LU-TP-91-23). Available from <http://home.thep.lu.se/pub/Preprints/91/lu_tp_91_23.pdf>

## Discussion Forum

Conduct research in the University of the People Library and the internet on the functioning of an artificial neuron and the concept of the activation function. Report your findings and include a description of the activation function and why the sigsmoid function is important in artificial neurons and how this relates to a biological neuron.

ユニバーシティ・オブ・ザ・ピープルのライブラリおよびインターネットを利用して、人工ニューロンの機能と活性化関数の概念について調査してください。調査結果を報告し、以下を含めてください：

1. 活性化関数の説明
2. シグモイド関数が人工ニューロンにおいて重要である理由
3. これが生物学的ニューロンとどのように関連するか

### Japanese Discussion

#### はじめに

人工ニューロンは人工知能と機械学習の基盤技術であり、特に活性化関数はその動作の中核を成しています。本回答では、活性化関数の役割、シグモイド関数の特性とその重要性、さらに生物学的ニューロンとの関連性について詳細に説明します。

#### 活性化関数の説明

活性化関数は、人工ニューロンにおける「閾値」や「出力の非線形性」を実現するための数学的機能です。具体的には、入力信号の加重和を受け取り、出力値を非線形に変換します。この非線形性は、ネットワークが複雑なパターンや関係性を学習する能力を持つために不可欠です。たとえば、線形関数のみを用いると、ネットワーク全体も線形関数として動作し、複雑なデータ関係を学習できなくなります (Gershenson, 2001)。
活性化関数にはいくつかの種類がありますが、代表的なものには次のようなものがあります：

- シグモイド関数：出力が0から1の範囲に収まり、確率解釈が可能。
- ReLU (Rectified Linear Unit)：負の入力を0に設定し、正の入力をそのまま出力。
- タンジェントハイパボリック関数 (tanh)：出力範囲が-1から1で、シグモイドより広い範囲で動作。

これらの関数により、人工ニューロンは非線形データを処理し、複数の層を通じて複雑なモデルを構築することが可能になります (Cowan, 2013)​。

#### シグモイド関数の重要性

シグモイド関数は、以下の式で定義されます：

\[
f(x) = \frac{1}{1 + e^{-x}}
\]
この関数は、入力値を連続的なS字型のカーブに変換し、以下の特徴を持っています：

1. 出力値が0から1に限定されるため、確率的な解釈が可能。たとえば、ニューラルネットワークの出力を「発火する確率」として解釈できる。
2. 微分可能であり、バックプロパゲーションを通じて効率的な学習が可能。この際、勾配がスムーズに計算されるため、ネットワーク全体の学習を安定化させる (Ng, 2011)。

また、シグモイド関数は非線形性を導入し、多層ニューラルネットワークでの特徴抽出を助けます。たとえば、単一層では表現できない複雑なパターン（非線形分類や回帰問題）を扱う際に重要な役割を果たします (Cowan, 2013).

#### 生物学的ニューロンとの関係性

人工ニューロンの設計は、生物学的ニューロンに着想を得ています。生物学的ニューロンは、シナプスを通じて入力信号を受け取り、閾値を超えると電気信号を発火させます。この「閾値動作」は、信号のノイズを抑え、重要な信号のみを次のニューロンへ伝える効果を持っています (Gershenson, 2001)。
シグモイド関数は、この閾値動作を数学的に再現します。たとえば、入力値が閾値を下回る場合、出力は0に近づき、上回る場合は1に近づくため、生物学的ニューロンの「発火」の概念を模倣しています。また、これによりネットワークは選択的に重要な信号を強調し、無関係なデータの影響を減らすことができます。これが、複雑なデータ処理を効率的に行う理由の一つです (Cowan, 2013)​。

#### 結論

活性化関数は、人工ニューロンが複雑な非線形問題を解決するための基盤であり、その中でもシグモイド関数は、その数学的特性と生物学的類似性から、ニューラルネットワークの発展において重要な役割を果たしてきました。シグモイド関数の導入により、ネットワークは複雑なパターンを学習し、効率的に学習プロセスを進めることが可能になります。
これらの知見は、人工知能や機械学習のさらなる応用を探求する上で不可欠であり、人工ニューロンが生物学的ニューロンからどのようにインスピレーションを得て進化してきたかを深く理解する手助けとなります。

#### 参考文献

Gershenson, C. (2001). Artificial Neural Networks for Beginners.
Cowan, M. K. (2013). Machine Learning.
Ng, A. (2011). Machine Learning Course. Coursera.

## Programming Assignment

### Part 1: Write the pattern file

a. input file

```file
0: 1 1 1 1 1 1 0
1: 0 1 1 0 0 0 0
2: 1 1 0 1 1 0 1
3: 1 1 1 1 0 0 1
4: 0 1 1 0 0 1 1
5: 1 0 1 1 0 1 1
6: 1 0 1 1 1 1 1
7: 1 1 1 0 0 0 0
8: 1 1 1 1 1 1 1
9: 1 1 1 1 0 1 1
A: 1 1 1 0 1 1 1
b: 0 0 1 1 1 1 1
C: 1 0 0 1 1 1 0
d: 0 1 1 1 1 0 1
E: 1 0 0 1 1 1 1
F: 1 0 0 0 1 1 1
```

b. output file

```file
0 (48): 0 1 1 0 0 0 0
1 (49): 0 1 1 0 0 0 1
2 (50): 0 1 1 0 0 1 0
3 (51): 0 1 1 0 0 1 1
4 (52): 0 1 1 0 1 0 0
5 (53): 0 1 1 0 1 0 1
6 (54): 0 1 1 0 1 1 0
7 (55): 0 1 1 0 1 1 1
8 (56): 0 1 1 1 0 0 0
9 (57): 0 1 1 1 0 0 1
A (65): 1 0 0 0 0 0 1
B (66): 1 0 0 0 0 1 0
C (67): 1 0 0 0 0 1 1
D (68): 1 0 0 0 1 0 0
E (69): 1 0 0 0 1 0 1
F (70): 1 0 0 0 1 1 0
H (72): 1 0 0 1 0 0 0
```

c pat file

ここまでの情報をもとにトレーニングに使用するテキストファイルを用意する。作成したファイルの内容は以下の通り。

```file
Number of patterns = 17
Number of inputs = 7
Number of outputs = 7
[patterns]
1 1 1 1 1 1 0    0 1 1 0 0 0 0  # 0
0 1 1 0 0 0 0    0 1 1 0 0 0 1  # 1
1 1 0 1 1 0 1    0 1 1 0 0 1 0  # 2
1 1 1 1 0 0 1    0 1 1 0 0 1 1  # 3
0 1 1 0 0 1 1    0 1 1 0 1 0 0  # 4
1 0 1 1 0 1 1    0 1 1 0 1 0 1  # 5
1 0 1 1 1 1 1    0 1 1 0 1 1 0  # 6
1 1 1 0 0 0 0    0 1 1 0 1 1 1  # 7
1 1 1 1 1 1 1    0 1 1 1 0 0 0  # 8
1 1 1 1 0 1 1    0 1 1 1 0 0 1  # 9
1 1 1 0 1 1 1    1 0 0 0 0 0 1  # A
0 0 1 1 1 1 1    1 0 0 0 0 1 0  # B
1 0 0 1 1 1 0    1 0 0 0 0 1 1  # C
0 1 1 1 1 0 1    1 0 0 0 1 0 0  # D
1 0 0 1 1 1 1    1 0 0 0 1 0 1  # E
1 0 0 0 1 1 1    1 0 0 0 1 1 0  # F
1 0 0 1 0 0 0    1 0 0 1 0 0 0  # H
```

### Part 2

作成した`pat`を利用して分析を行う。適切な分析となるようにパラメータの調整を行った結果を以下で説明する。
・ネットワーク設定
入力および出力ユニットは固定で7とある。Layer 1に関しては、パラメータの調整を行った結果、10が一番適切であったためこの設定とする。以下は設定のスクリーンショットである。
FIGURE1 Network Configuration

・コントロールパネル設定
コントロールパネルでは主に、「Laerning rate」と「Momentum」を設定することができる。デフォルト設定値はそれぞれ
Laerning rate: 0.3
Momentum: 0.8
であるが、今回の分析では、学習効率を上げるとError Progressが1のあたりに収束が発生してしまい、適切なモデルを構築することができないケースが存在した。以下は、適切ではないと考えるモデルのError progressの出力例:
FIGURE 2 Bad pattern
そのため、学習効率を下げすぎることなく、適切ではないモデルの構築可能性を上げるため、今回は以下の設定を付与した。
Laerning rate: 0.2
Momentum: 0.8
実際のスクリーンショットは以下である。
FIGURE 3 Parameter

これらの設定を利用して実際に分析を行った結果を以下で説明する。

FIGURE 4 5000
5000回トレーニングを行った時点で収束が始まっていることがError progressのグラフから確認できる。また、この時点でのエラー率は0.127...であり、もう少し学習が必要だということがわかる。

FIGURE 5 25000
5000回ずつトレーニングを行い、合計20000回トレーニングを行った時点でエラー率が0.05を切り、25000回トレーニングを行った時点でエラー率が0.04364と良い値を得ることができた。
また、このトレーニング結果のweightファイルを(25000)として提出する。

加えて、このモデルに対するパターンごとの平均エラーの値を以下に記載する:

Pattern: " 1,  1,  1,  1,  1,  1,  0   >>>   0,  1,  1,  0,  0,  0,  0 "
Result: " 0.02, 0.98, 0.98, 0.04, 0, 0.03, 0.02 "
Pattern: " 0,  1,  1,  0,  0,  0,  0   >>>   0,  1,  1,  0,  0,  0,  1 "
Result: " 0.01, 0.99, 0.99, 0.01, 0.02, 0.01, 0.97 "
Pattern: " 1,  1,  0,  1,  1,  0,  1   >>>   0,  1,  1,  0,  0,  1,  0 "
Result: " 0.01, 0.99, 0.99, 0.02, 0.01, 0.99, 0.01 "
Pattern: " 1,  1,  1,  1,  0,  0,  1   >>>   0,  1,  1,  0,  0,  1,  1 "
Result: " 0, 1, 1, 0.02, 0.03, 0.97, 0.98 "
Pattern: " 0,  1,  1,  0,  0,  1,  1   >>>   0,  1,  1,  0,  1,  0,  0 "
Result: " 0.02, 0.98, 0.98, 0.01, 0.97, 0, 0.03 "
Pattern: " 1,  0,  1,  1,  0,  1,  1   >>>   0,  1,  1,  0,  1,  0,  1 "
Result: " 0.01, 1, 1, 0.02, 0.99, 0.01, 0.98 "
Pattern: " 1,  0,  1,  1,  1,  1,  1   >>>   0,  1,  1,  0,  1,  1,  0 "
Result: " 0.02, 0.98, 0.98, 0, 0.99, 0.99, 0 "
Pattern: " 1,  1,  1,  0,  0,  0,  0   >>>   0,  1,  1,  0,  1,  1,  1 "
Result: " 0.01, 0.99, 0.99, 0, 0.96, 0.99, 1 "
Pattern: " 1,  1,  1,  1,  1,  1,  1   >>>   0,  1,  1,  1,  0,  0,  0 "
Result: " 0, 1, 1, 0.96, 0, 0, 0.03 "
Pattern: " 1,  1,  1,  1,  0,  1,  1   >>>   0,  1,  1,  1,  0,  0,  1 "
Result: " 0, 1, 1, 0.97, 0, 0.01, 0.97 "
Pattern: " 1,  1,  1,  0,  1,  1,  1   >>>   1,  0,  0,  0,  0,  0,  1 "
Result: " 0.98, 0.02, 0.02, 0.01, 0.03, 0.02, 0.97 "
Pattern: " 0,  0,  1,  1,  1,  1,  1   >>>   1,  0,  0,  0,  0,  1,  0 "
Result: " 0.99, 0.01, 0.01, 0, 0.02, 0.97, 0 "
Pattern: " 1,  0,  0,  1,  1,  1,  0   >>>   1,  0,  0,  0,  0,  1,  1 "
Result: " 1, 0, 0, 0, 0, 0.98, 0.98 "
Pattern: " 0,  1,  1,  1,  1,  0,  1   >>>   1,  0,  0,  0,  1,  0,  0 "
Result: " 0.98, 0.02, 0.02, 0, 0.98, 0.02, 0 "
Pattern: " 1,  0,  0,  0,  1,  1,  1   >>>   1,  0,  0,  0,  1,  1,  0 "
Result: " 1, 0, 0, 0, 0.99, 0.99, 0.03 "
Pattern: " 1,  0,  0,  0,  1,  1,  1   >>>   1,  0,  0,  0,  1,  1,  0 "
Result: " 1, 0, 0, 0, 0.99, 0.99, 0.03 "
Pattern: " 1,  0,  0,  1,  0,  0,  0   >>>   1,  0,  0,  1,  0,  0,  0 "
Result: " 0.99, 0.01, 0.01, 0.98, 0, 0.01, 0.03 "

また、このモデルと同じ25000回というトレーニング回数でより低いエラー率を得ることができた設定について、以下にスクリーンショットを記載する。

FIGURE 6 Optional case

このケースでは、より良い収束率を得るために以下の設定を行った:
Laerning rate: 0.4
Momentum: 0.9
その結果平均エラー率として0.026299を得ることができた。

### Japanese Programming Assignment

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
