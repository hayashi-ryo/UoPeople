# unit8

- Unsupervised Learning
- Clustering
- K-means clustering algorithm
- Hierarchical clustering
- Dendrograms

## Goal

- Describe how unsupervised learning differs from supervised learning.
- Understand and be able to implement a basic K-means cluster algorithm.
- Describe a Dendrogram and its role in Hierarchal clustering.
- Understand and be able to describe the process of Hierarchal clustering.

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Sherrie W. (2019).­­ Introduction to Machine Learning. [cme250_lecture7](https://web.stanford.edu/class/cme250/files/cme250_lecture7.pdf)
Jonathan R.S. Unsupervised Learning and Principal Components Analysis [20.pdf](https://people.eecs.berkeley.edu/~jrs/189s19/lec/20.pdf)
Pham, D. T., Dimov, S. S., & Nguyen, C. D. (2005). Selection of K in K-means clustering. Proceedings of the Institution of Mechanical Engineers, Part C: Journal of Mechanical Engineering Science, 219(1), 103-119. Available from <http://www.ee.columbia.edu/~dpwe/papers/PhamDN05-kmeans.pdf>

## Discussion Forum

Conduct research within the University of the People Library and the internet on Hierarchal clustering and in your posting describe how you could implement an algorithm to cluster a data set using Hierarchal clustering.   Your description should address the role of dendrograms in Hierarchal clustering.

Singh, Y., Bhatia, P. K., & Sangwan, O. (2007). A review of studies on machine learning techniques. International Journal of Computer Science and Security, 1(1), 70-84.

<http://www.cscjournals.org/manuscript/Journals/IJCSS/Volume1/Issue1/IJCSS-7.pdf>

### Japanese Discussion

1. はじめに
階層型クラスタリング（Hierarchical Clustering）は、データ解析における教師なし学習アルゴリズムの一つであり、特にデータの構造を明確に把握する際に用いられます。この手法は、各データポイントの類似性に基づいてデータを階層的にクラスタリングするもので、視覚化の手段としてデンドログラム（樹形図）が活用される点が特徴的です（Rokach & Maimon, 2005）。本稿では、階層型クラスタリングのアルゴリズムをどのように実装するか、またデンドログラムが果たす役割について詳述します。

階層型クラスタリングには、主に「凝集型」（Agglomerative）と「分割型」（Divisive）の2種類があり、それぞれに応じたアルゴリズムが存在します（Jain et al., 1999）。さらに、距離計算手法やクラスタ間の結合規則が結果に与える影響を適切に理解することが重要です。本稿では、特に凝集型クラスタリングを中心に解説を行い、デンドログラムの具体的な役割と利点を明らかにします。

2. 階層型クラスタリングのアルゴリズムの説明
階層型クラスタリングの実装では、データ間の類似性を評価し、クラスタを形成するためのアルゴリズムが適用されます。ここでは、凝集型クラスタリングの主要なステップを説明します。

初期クラスタの設定
各データポイントを個別のクラスタと見なし、すべてのクラスタ間の距離を計算します。

距離計算と類似度測定
クラスタ間の距離を計算するために、ユークリッド距離やマンハッタン距離などの手法を使用します。さらに、単連結法（最短距離法）、完全連結法（最長距離法）、ウォード法といったクラスタ間の距離評価手法が適用されます（Ward, 1963）。

クラスタの結合
最も近いクラスタ同士を結合し、新たなクラスタを形成します。この過程を繰り返し、すべてのデータが1つのクラスタに統合されるまで進めます。

このアルゴリズムは、PythonのScikit-learnライブラリを用いて実装することができます。以下は基本的な実装例です：

python
コードをコピーする
from sklearn.cluster import AgglomerativeClustering

# データの準備

data = [[1, 2], [2, 3], [3, 4], [5, 6], [7, 8]]

# 階層型クラスタリングの適用

model = AgglomerativeClustering(n_clusters=2, linkage='ward')
model.fit(data)
このコードにより、与えられたデータセットを2つのクラスタに分割できます。

3. デンドログラムの役割
デンドログラムは、階層型クラスタリングにおけるクラスタ結合プロセスを視覚的に表現したものです（Murtagh & Contreras, 2012）。以下にその主な役割を示します：

クラスタの結合順序の可視化
デンドログラムは、クラスタがどの順序で結合されたかを示します。これにより、データ間の類似性を容易に理解できます。

最適なクラスタ数の選択
デンドログラムの高さを基準に適切なカットオフポイントを設定することで、最適なクラスタ数を特定することが可能です。

データ構造の把握
デンドログラムにより、データ間の階層的な構造を直感的に把握できます。

以下はScipyライブラリを使用したデンドログラムの作成例です：

python
コードをコピーする
from scipy.cluster.hierarchy import dendrogram, linkage
import matplotlib.pyplot as plt

# データの準備

data = [[1, 2], [2, 3], [3, 4], [5, 6], [7, 8]]

# デンドログラムの作成

linked = linkage(data, method='ward')
dendrogram(linked)
plt.show()
このコードにより、クラスタ結合プロセスを視覚化できます。

4. 階層型クラスタリングの応用例
階層型クラスタリングは、多様な分野で活用されています。その具体例を以下に挙げます：

マーケティングの顧客セグメンテーション
顧客の購買行動データを分析し、類似した特性を持つ顧客をグループ化することで、効果的なマーケティング戦略を立案できます（Kotler & Keller, 2016）。

生物情報学における遺伝子クラスタリング
遺伝子やタンパク質の機能の類似性に基づいてグループ化し、新たな遺伝子の特性を予測するのに役立てられます（Eisen et al., 1998）。

文書クラスタリング
文書の内容に基づき、関連するテーマやトピックを自動的に分類するのに使用されます。

5. 結論
階層型クラスタリングは、データの階層的な構造を視覚化し、分析するための強力な手法です。特に、デンドログラムはクラスタ間の関係性を明確にする重要なツールであり、最適なクラスタ数を決定する助けとなります。しかし、この手法は計算コストが高く、大規模データには適用が困難な場合があるため、用途に応じたアルゴリズムの選択が重要です。

参考文献
Eisen, M. B., Spellman, P. T., Brown, P. O., & Botstein, D. (1998). Cluster analysis and display of genome-wide expression patterns. Proceedings of the National Academy of Sciences, 95(25), 14863-14868. <https://doi.org/10.1073/pnas.95.25.14863>
Jain, A. K., Murty, M. N., & Flynn, P. J. (1999). Data clustering: A review. ACM Computing Surveys (CSUR), 31(3), 264-323. <https://doi.org/10.1145/331499.331504>
Kotler, P., & Keller, K. L. (2016). Marketing Management (15th ed.). Pearson Education.
Murtagh, F., & Contreras, P. (2012). Algorithms for hierarchical clustering: an overview. Wiley Interdisciplinary Reviews: Data Mining and Knowledge Discovery, 2(1), 86-97. <https://doi.org/10.1002/widm.53>
Rokach, L., & Maimon, O. (2005). Clustering Methods. In Data Mining and Knowledge Discovery Handbook (pp. 321-352). Springer, Boston, MA. <https://doi.org/10.1007/978-0-387-09823-4_15>

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

1. 今週の概要
今週は、教師なし学習（Unsupervised Learning）について学びました。この学習方法は、データにラベルが付けられていない場合に使用されるものであり、教師あり学習（Supervised Learning）とは異なる特徴を持ちます。特に、データをクラスタに分類する手法であるクラスタリングに焦点を当て、K-meansクラスタリングアルゴリズムや階層型クラスタリング（Hierarchical Clustering）のプロセスについて学習しました。また、階層型クラスタリングの結果を可視化するためのツールであるデンドログラム（Dendrogram）の役割についても深く理解することを目指しました。
さらに、K-meansクラスタリングにおけるクラスタ数（K）の選択が結果に与える影響を探り、Phamら（2005）の論文を参照しながら、この選択を効果的に行う方法について考察しました。これらの学習内容を通じて、データ特性に基づいた分析手法の選択や実装についての理解が深まりました。

2. 自分の感想
今週の学習を通じて、教師なし学習が持つ潜在的な価値を改めて認識しました。特に、ラベルなしデータを分析して隠れたパターンを発見するというプロセスは非常に興味深く感じられました。K-meansクラスタリングでは、初期クラスタ中心の選択やクラスタ数（K）の決定が結果に大きな影響を及ぼすため、アルゴリズムがシンプルでありながらも多くの工夫が必要であることを実感しました。Phamら（2005）の論文で述べられているように、最適なKを選択するためにはデータの特性をよく理解する必要があり、この点で実務上の課題を想像することができました。
一方、階層型クラスタリングでは、クラスタの結合・分割を直感的に視覚化できるデンドログラムの役割が非常に有益であると感じました。デンドログラムを用いることで、特定のデータセットに適したクラスタの分割レベルを視覚的に理解できる点は、複雑なデータを扱う際の有効な手法だと思いました。特に、医療データやマーケティング分野での顧客セグメンテーションのように、階層的な構造が重要な場合に応用可能性が高いと感じました。
また、学習を進める中で、教師なし学習の成果をどのように評価するのかという点に課題意識を持つようになりました。ラベルが存在しない場合、正解が不明確なため、結果の良し悪しをどう判断すべきかについては、実際のデータセットに触れることでさらなる洞察を得たいと感じました。

3. 特に深く学習したこと
教師なし学習とクラスタリング
教師なし学習は、ラベルのないデータセットからパターンや構造を見出すことを目的としており、クラスタリングはその代表的なアプローチです。K-meansクラスタリングアルゴリズムは、初期クラスタ中心を設定し、データを繰り返しクラスタに割り当てて最適化する手法です。この反復的なプロセスによって、各クラスタが最大限の均質性を持つよう調整されます。
学習を通じて、K-meansクラスタリングの利点と限界について深く理解することができました。利点としては、アルゴリズムがシンプルで効率的であることが挙げられますが、初期クラスタ中心の選択に依存するため、結果が必ずしも安定しない可能性があります。また、Kの選択に関してはエルボー法やギャップ統計法などの補助的手法を活用することで精度を向上させる方法についても学びました。
階層型クラスタリングとデンドログラム
階層型クラスタリングでは、データを階層的にグループ化していき、結果をデンドログラムで可視化します。デンドログラムは、データポイントの結合過程を示す木構造であり、どのレベルでクラスタを分割すべきかを直感的に理解するのに役立ちます。たとえば、マーケティング分野での顧客セグメンテーションでは、顧客層の階層的な構造を分析する際に非常に有効です。
デンドログラムの解析では、特定の「カットオフポイント」を選択することで、クラスタ数を適切に決定できます。この可視化手法により、データ構造の複雑さを簡単に把握できる点は大きな強みだと感じました。また、階層型クラスタリングが持つ柔軟性についても学びました。具体的には、逐次的に小さなクラスタを結合する「凝集型法」と、大きなクラスタから分割する「分割型法」の使い分けがデータ特性に応じて可能である点に注目しました。
さらに、階層型クラスタリングの計算コストが高い点についても議論しました。特に、大規模データセットに適用する際には効率化が課題となることを理解しました。この点で、クラスタ間の類似度計算における工夫や高速化アルゴリズムの導入が必要だと感じました。
