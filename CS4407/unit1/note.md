# unit1

- Data Mining
- Machine Learning
- Supervised versus Unsupervised learning
- Examples of data mining and machine learning
- Introduction to R

## Goal

main

- Describe the difference between Data Mining and Machine Learning.
- Describe the difference between Supervised and Unsupervised learning.
- List at least 5 different types of machine learning algorithms.
- Recognize examples of data mining and machine learning.
- Complete a simple program using R.

ja

- データマイニングと機械学習の違いを説明できる。
- 教師あり学習と教師なし学習の違いを説明できる。
- 少なくとも5種類の機械学習アルゴリズムを列挙できる。
- データマイニングと機械学習の例を認識できる。
- Rを使用して簡単なプログラムを完成させる。

## Task

- [ ] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Install R application
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Jackson, J. (2002). Data mining: A conceptual overview. Communications of the Association for Information Systems, 8(2002), 267-296. Available from: <https://aisel.aisnet.org/cais/vol8/iss1/19/>
- Edelstein, H. A. (1998). Introduction to data mining and knowledge discovery.  Available from: <http://www.twocrows.com/intro-dm.pdf>
- James, G., Witten, D., Hastie, T., & Tibshirani, R. (2013).  An Introduction to Statistical Learning with Applications in R. New York, NY: Springer.  Read Chapter 2 available from the course textbook.
- Review material in chapters 1-7 in Venable, W. N., & Smith, D. M. (2012).  An Introduction to R. Html Version Available here or download the pdf at <http://cran.r-project.org/doc/manuals/R-intro.pdf>

## Install R application

To complete the Programming Assignments in this course, you will need to install R on your machine.  R is primarily a statistics package. However, R is not just a statistics package, but more accurately a programming language that is effective in processing data using statistical processes.  Using R routines we will conduct regression, clustering, and classification.
To begin, install R on your local computer.  To install R on your local computer you will need to get the appropriate copy for your computer and operating system from the R project web site using the following web sites.
<http://www.r-project.org/>
<http://cran.r-project.org/bin/windows/base/>
If you have any problems installing R on your machine, please contact your instructor.

## Discussion Forum

Using your own words, describe the difference between supervised learning and unsupervised learning.

### Japanese Discussion

以下に構成に基づいた回答文を示します。外部の研究結果を二つ引用し、説得力を持たせた文章に仕上げました。

### 教師あり学習と教師なし学習の違い

導入
教師あり学習と教師なし学習は、データマイニングおよび機械学習の中核を成す手法であり、データ分析における多様な課題に対応します。教師あり学習はラベル付きデータを用いた予測に特化し、教師なし学習はラベルなしデータから構造やパターンを発見することに焦点を当てます。それぞれの違いを理解することで、適切なアルゴリズム選択が可能になります。

教師あり学習の説明
教師あり学習は、入力データとその対応する出力（ラベル）が与えられた状態で、データとラベルの関係性を学習します。この手法は、将来のデータに対する正確な予測を可能にします。たとえば、スパムメール分類では、過去のメールデータとそのスパムラベルを使用してモデルを訓練し、新しいメールがスパムか否かを予測します。
この手法の有用性は、多くの研究で実証されています。Jackson（2002）は、教師あり学習が分類や回帰タスクにおいて、データの複雑さを軽減し、モデルの精度を向上させることを指摘しています。これは特にスパムフィルタリングや病気の診断モデルの開発で顕著です【Jackson, 2002】。

教師なし学習の説明
一方、教師なし学習は、ラベルがないデータを用いてデータの構造やパターンを発見します。この手法は、クラスタリングや次元削減に利用されます。たとえば、顧客データを購買パターンに基づいてセグメント化するクラスタリングが典型例です。
Edelstein（1998）は、教師なし学習の利点として、事前の知識が不要であることを挙げています。これにより、未知のデータセットに対して新しい洞察を得る可能性が高まるとされています。また、次元削減によるデータの可視化は、複雑なデータの理解を深めるのに役立ちます【Edelstein, 1998】。

主な違いの比較
教師あり学習と教師なし学習の違いを以下にまとめます。

| 特徴               | 教師あり学習                       | 教師なし学習                     |
|--------------------|------------------------------------|-----------------------------------|
| データの種類    | ラベル付きデータ                  | ラベルなしデータ                |
| 目的           | 出力予測                          | パターン・構造の発見            |
| 代表的な手法    | 回帰、分類                        | クラスタリング、主成分分析       |
| 適用例         | スパムメール分類、病気診断         | 顧客セグメンテーション、次元削減 |

教師あり学習は特定の出力を予測するために使用される一方で、教師なし学習はデータ全体の特性を明らかにするために利用されます。

結論
教師あり学習と教師なし学習は、それぞれ異なるニーズに応じた強力なツールです。課題に応じた適切な手法の選択により、データから有意義な洞察を得ることが可能です。これらの手法を理解し活用することで、データマイニングの可能性を最大化できます。

参考文献

- Jackson, J. (2002). Data mining: A conceptual overview. Communications of the Association for Information Systems, 8(2002), 267–296. Retrieved from <https://aisel.aisnet.org/cais/vol8/iss1/19/>
- Edelstein, H. A. (1998). Introduction to data mining and knowledge discovery. Retrieved from <http://www.twocrows.com/intro-dm.pdf>

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
今週は、データマイニングと機械学習について学びました。具体的には、データマイニングと機械学習の違い、教師あり学習と教師なし学習の違い、代表的な機械学習アルゴリズムの種類や活用例について学びました。また、データマイニングと機械学習の応用事例を確認し、Rプログラミングの基礎を学び、簡単なプログラムを実装しました。

2. 自分の感想
データマイニングと機械学習についての学びを通じて、これらが持つ実用性の高さを再認識しました。特に、教師あり学習と教師なし学習の違いを学ぶ中で、日常のデータ分析や業務での応用可能性を強く感じました。教師あり学習ではラベル付きデータを基にモデルを訓練するため、分類や予測といった明確な目標に非常に有効です。一方、教師なし学習はデータのパターンや隠れた構造を明らかにする手法であり、より探索的な分析に適していると理解しました。この知識が将来のデータ分析タスクで、どの手法を適用するべきかの判断材料になると感じました。
また、Rを用いたプログラミング演習は初めての経験だったため、最初は基本的な操作にも苦労しました。特に、関数の正確な構文やデータフレーム操作の方法に戸惑いましたが、課題を繰り返し行う中で少しずつ慣れてきました。視覚的にデータを扱える点は非常に魅力的で、単純な数値だけでなく、その背後にあるデータの傾向を掴む楽しさを感じました。学習を通じて、自分自身が少しずつ「データを使いこなす」視点を持てるようになってきたと感じています。
この中で参考になったのは、James et al. (2013) による教師あり学習と教師なし学習の基本的な違いに関する解説です。このテキストでは、教師あり学習が明確なラベルに基づいて訓練される一方、教師なし学習がデータ内のパターンを探す手法であると記述されています。この理解は、Rの演習を通じてさらに深まりました。

3. 特に深く学習したこと
今週最も印象に残ったのは、教師あり学習と教師なし学習の比較とその適用例です。教師あり学習では、回帰分析やサポートベクターマシン（SVM）、ランダムフォレストなどのアルゴリズムが広く使用されています。例えば、顧客データに基づいて購入傾向を予測するシナリオを通じて、この手法の有効性を実感しました。一方、教師なし学習では、k-meansクラスタリングや主成分分析（PCA）といったアルゴリズムを用いて、データのグループ化や次元削減を行う重要性を学びました。これにより、未知のデータから新たなインサイトを得ることの意義を理解しました。これらの違いを具体例とともに学べたことで、理論的な知識が実務に結びついた感覚が得られました。
Rプログラミングについては、データセットの読み込みから可視化までを一通り体験しました。特に、summary() 関数を用いた基本統計量の確認や、plot() 関数を使用したデータの可視化は、単純ながらもデータ分析の第一歩として非常に有用でした。また、Jackson (2002) によるデータマイニングの基礎知識を参照することで、Rのようなツールがデータの理解や分析にどのように役立つのかを理論的に補強できました。
さらに、Edelstein (1998) によるデータマイニングの定義や応用例についての説明も非常に参考になりました。このリソースを通じて、データ解析プロセスがどのように設計され、活用されるのかを具体的に理解することができました。

4. 今後の課題と来週に向けて
今後の課題としては、学んだ理論を実際のデータに応用するスキルを高めることが挙げられます。来週は、データの保存と管理、データ解析のツールに関する知識を深める予定です。具体的には、リレーショナルデータベースやNoSQLデータベースの特徴、ビッグデータと機械学習の関係、また、SPSSやRといった統計パッケージの使い方を学びます。これらの学習を通じて、データマイニングや機械学習における基盤技術の理解をさらに深めていきたいと思います。

参考文献
Edelstein, H. A. (1998). Introduction to data mining and knowledge discovery. Available from: <http://www.twocrows.com/intro-dm.pdf>
Jackson, J. (2002). Data mining: A conceptual overview. Communications of the Association for Information Systems, 8(2002), 267-296. Available from: <https://aisel.aisnet.org/cais/vol8/iss1/19/>
James, G., Witten, D., Hastie, T., & Tibshirani, R. (2013). An introduction to statistical learning with applications in R. New York, NY: Springer.
