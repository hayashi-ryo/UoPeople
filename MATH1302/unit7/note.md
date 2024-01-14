# unit7

- Representation, and different concepts of Graphs
- Properties of Complete, Bipartite, and Planar Graphs
- Euler’s and Hamiltonian graphs
- Trees
- Chromatic numbers
- グラフの表現とさまざまな概念
- 完全グラフ、二部グラフ、平面グラフの性質
- オイラーグラフとハミルトングラフ
- 木
- 色数

## Goal

- By the end of this Unit, you will be able to:
  - Describe different concepts and applications of graphs theory.
  - Apply handshaking lemma to solve the problems on the graphs.
  - Interpret and visualize planar graphs, Euler, and Hamilton graphs.
  - Demonstrate chromatic number with assignment models.
- ja
  - グラフ理論の様々な概念と応用について説明する。
  - グラフ上の問題を解くためにハンドシェーキングのレンマを適用する。
  - 平面グラフ、オイラーグラフ、ハミルトングラフの解釈と可視化
  - 代入モデルを用いてクロマティック数を示すことができる

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Math Assignment
- [x] Take Self-Quiz

## Reading Assignment

- Jamaloodeen, M., Pinzon, K., Pragel, D., Roberts, J., & Siva, S. (2021). Discrete Math (3rd ed.). licensed under CC BY-NC <https://ggc-discrete-math.github.io/graph_theory.html#_representing_graphs>
  - Chapter 12
    - 12.2.1
    - 12.6
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0 <https://discrete.openmathbooks.org/dmoi3/ch_graphtheory.html>
  - Chapter 4
    - 4.1
    - 4.2
      - tree: サイクルのない接続されたグラフのこと
    - 4.3
      - 平面グラフのオイラーの公式
        - v-e+f = 2
    - 4.4
    - 4.5
    - 4.7

## Discussion Forum

Task

1. Explain the concept of isomorphism in discrete mathematics.
2. Answer the following for the above two graphs.
  a. Explain in detail how you check isomorphism for the two graphs.
  b. Discuss the conditions of isomorphism for the two graphs in detail.
  c. Are these two graphs G1 and G2 isomorphic?
    i. If yes, explain.
    ii. If you have to try to make them isomorphic then what change do you try first?
isomorphism

ja

1. 離散数学における同型の概念について説明しなさい。
2. 上の2つのグラフについて、次の問いに答えよ。
  a. つのグラフの同型性の確認方法を詳しく説明しなさい．
  b. つのグラフの同型の条件を詳しく述べよ．
  c. この2つのグラフG1とG2は同型か？
    i. もしそうなら、説明しなさい。
    ii. もし両者を同型にしようとするならば、まずどのような変化を試しますか？

ans

クラスメートの皆さん、こんにちは。
今回のテーマに対する私の回答を説明します。

1. Explain the concept of isomorphism in discrete mathematics.
離散数学において、二つのグラフが同型であるとは、それらの頂点と辺の間に存在する隣接関係と非rん節関係を保持する対応が存在することを指します。簡単に言えば、頂点の名前を変えるだけで一方が他方に変換できる場合を指します。同型グラフにはいくつかの性質が存在します。それらを説明します。
頂点と辺の数: 同型グラフは頂点と辺の数が同数である必要があります。
頂点の対応関係: 二つのグラフの頂点間には1対1のマッピングが必要です。一方のグラフの各頂点は、他方のグラフの一つの頂点に対応する必要があります。
辺の保持: 一方のグラフで二つの頂点が辺で結ばれている場合、それに対応する頂点も他方のグラフで結ばれている必要があります。
度数列: 各グラフの頂点の度数(各頂点に接続された辺の数)のシーケンスは同じである必要があります。

2. a.
二つのグラフが同型であるかどうかは以下のステップを行うことで確認を行うことが可能です。
   1. 頂点と辺の数を確認する: それぞれのグラフにおける頂点の数と辺の数が等しいかどうかを確認します。もし異なれば、二つのグラフは同型ではありません。
   2. 次数シーケンスの比較: それぞれのグラフの全ての頂点の次数(各頂点に接続している辺の数)をリストアップし、等しいかどうかを確認します。もしシーケンスが一致しない場合、グラフは同型ではありません。
   3. 構造のマッピング: 次数シーケンスまで一致していることが確認できたら、一方のグラフの頂点を他方のグラフの頂点に1対1でマッピングを試みます。マッピングした結果、辺の接続パターン・サブグラフの構造・自己ループなどグラフの構造的特性が一致したら同型のグラフです。

b. 2.a. の議論より、同型である条件をリストアップすることができます。リストアップした条件は以下の通りです:

1. 頂点数の一致: それぞれのグラフにおける頂点の数が一致する
2. 辺の数の一致: それぞれのグラフにおける辺の数が一致する
3. 次数シーケンスの一致: それぞれのグラフの全ての頂点の次数が一致する
4. 構造的一致: 一方のグラフの任意の頂点から別の頂点への経路が存在する場合、他方のグラフでも対応する頂点間に同様の経路が存在する
5. サブグラフの対応: 一方のグラフの任意のサブグラフが他方のグラフにも存在する
6. 自己ループと多重辺の対応: 一方のグラフが自己ループや多重辺を含む場合、他方のグラフにおいても存在する。

c. i/ii 以上の議論を用いて今回の二つのグラフG1,G2が同型であるかどうかを判定します。グラフを式で表現するとそれぞれ以下のようになりなります。

V1={1,2,3,4,5}, E1={{1,2},{1,3},{1,4}.{2,3},{2,5},{3,4},{3,5},{4,5}}
V2={A,B,C,D,E}, E2={{A,B},{A,C},{A,E},{B,D},{B,E},{C,D},{C,E},{D,E}}

1. 頂点と辺の数を確認する。
それぞれのグラフは頂点が5,辺が8で一致している。
2. 次数シーケンスを確認する。
それぞれのグラフの次数シーケンスを作成すると一致することがわかります。
G1:(4,3,3,3,3)
G2:(4,3,3,3,3)
3. 構造のマッピング
次数4の辺はそれぞれ③とEであるため、必ず対応する必要がある。その上で、以下のマッピングを行うと同型のグラフを得ることができる。
1->A
2->C
3->E
4->B
5->D

## Math Assignment

1. In a hostel, there are around ‘n’ number of students (assume a number above 100 for n) with rooms categorized as triple, double, and single occupancy. Explain how you will represent the above data as a graph.
You need not create or share the graph but make sure to include justification for the below questions:
(i) Will the graph be a simple graph or a multigraph?
(ii) Will it have loops?
(iii) What is the possible maximum and minimum degree for each student?
(iv) If all problems are represented in the form of graphs, won’t the problems be easily visualized and solved? (v)Can we represent every problem with a graph? Explain the reason by considering an example of a situation that has 11 vertices such that the degree of each vertex is 11.

ホステルに宿泊した「n」人の学生と、三人部屋・二人部屋・一人部屋に分類されたデータをグラフとして表現する方法を考えました。このデータをグラフとして表現するために、以下のようなアプローチを行います。
(i)頂点の表現
グラフの各頂点は、それぞれの学生を表します。つまり、n個の頂点が存在します。
(ii)辺の表現
辺は、学生間の部屋共有関係を表します。例えば、三人部屋に宿泊する学生であれば、3人の間にそれぞれ辺が存在します。一人部屋に宿泊している学生であれば、辺は持ちません。
(iii)部屋タイプの表現
部屋のタイプは辺の性質や頂点の次数によって表現されます。例えば、一人部屋に宿泊している学生の頂点は他の学生と関連を持たないため、次数は0です。同様に、二人部屋に宿泊している学生の次数は1、三人部屋に宿泊している学生の次数は2です。
(iv)グラフの特徴
単純グラフか多重グラフか: このグラフは単純グラフで表現されます。なぜなら、各学生は特定の部屋タイプに割り当てられ、関係が複数存在することはありません。多重グラフは二つの頂点間に複数の辺が存在する場合に使用されますが、このシナリオではそのような状況はありません。
ループは存在するか: このグラフにはループは存在しません。ループは頂点が自分自身と関連する場合に発生しますが、このシナリオでは学生が自分自身と関連することはないためです。
各学生が可能な最大次数と最小次数: 最大次数は3人部屋の学生の2です。同様に最小次数は一人部屋の0です。

この設問では、ホテルに宿泊する学生と部屋のタイプを分類することをグラフで目標としました。グラフは、関係や接続を視覚化することに適していますが、今回の問題のようなパターンでは表現することや解決することが難しい場合が存在するため、全ての問題をグラフを用いて解決することは困難です。問題ごとに適した手法を利用して解決を図ることが望ましいと考えます。
例えば、設問の要件(v)のような場合を考えます。頂点の個数nとそのグラフの最大次数は以下の関係が成り立ちます。
最大次数=n-1
11の頂点を持つグラフでは、最大次数が10であるため、要件(v)のようなグラフを作成することは実現不可能です。

2. A University is conducting a conference for two days on different subjects for students pursuing their higher education. Your task is to create a scheduling slot scheduling model for the conference sessions (based on the subjects attended by students) using graph coloring. Draw the graph for the same and answer the chromatic number of this problem of scheduling time slots with the number of subjects your choice.

グラフの色付けを利用して会議セッションのタイムスケジュールを作成するためには、グラフ内の過膜を頂点として表し、科目間の競合を辺として表すことで実施できます。
今回は、数学・物理学・コンピュータサイエンス・化学・生物学の5つの科目に対して以下の競合が発生していると仮定して対宇助樹＝るの作成を進めて行きます。
数学 - 物理学
数学 - コンピュータサイエンス
数学 - 化学
物理学 - 化学
化学 - 生物学
会議セッションをスケジュールするためには、同じタイムスロットに科目の競合が発生しないようにタイムスロットを割り当てる必要があります。これは、隣接する頂点が同じ色を持たないようにグラフの頂点色をつけることと結果的に同じ作業を行っています。グラフの彩色数を決定するためには様々なアルゴリズムが存在するが、今回は次数が多い頂点から色を決定していき、隣接する頂点に同じ色を割り当てないようにする方法で進めた。結果として以下のように3色でグラフを彩色することが可能になる。
数学:色A
物理学:色B
コンピュータサイエンス:色B(物理学と競合しないため、物理学と同じ色にすることができる)
化学:色C(数学・物理学と競合するため色A・色B以外出なければならない)
生物学:色A(化学のみと競合するため、色C以外であれば良い)
よって、私が作成した例であれば、2日間で3つのタイムスロットが存在すればカンファレンスを開催することができる。しかし、これは最小のタイムスロット数であるため、競合を避けた上でタイムスロット数を増加することは可能である。

3. Explain Euler and Hamiltonian cycles, and provide one simple counter example for each. Find the Euler circuit/path and Hamiltonian cycle/path for the given graph G.

まずはそれぞれの回路について説明します。
オイラー回路: オイラー回路は全ての辺を一度だけ通過し、元の頂点へもどる閉じた経路のことを表します。オイラー回路が存在するためには、グラフが連結されており、かつ全ての頂点の次数が偶数である必要があります。
反例
以下のような4頂点を持つグラフを考えます。
[図]
このグラフは頂点2と3が次数2、頂点1と4が次数3です。全ての頂点の次数が偶数である条件に反しているため、このグラフはオイラー回路ではありません。
ハミルトン回路: ハミルトン回路はグラフの全ての頂点を一度だけ通過し、元の頂点へ戻る閉じた経路のことを表します。オイラー回路との違いは辺に着目するか、頂点に着目するか、という部分です。
反例
以下のような5頂点を持つグラフを考えます。
[図]
このグラフがハミルトン回路であるためには頂点1-4を全て通過する必要がありますが、頂点5を一度だけ経由するという条件を考えると経由することができません。したがって、このグラフはハミルトン回路ではありません。
次に与えられたグラフGについて考える。
オイラー回路が存在するかどうか:
オイラー回路であるかどうかを調べるためにまず、全ての頂点の次数を確認する。
次数シーケンス = (2,4,3,4,4,3,2)
全ての頂点の次数が偶数である、という条件に反しているため、グラフGはオイラー回路が存在しないことがわかった。
ハミルトン回路が存在するかどうか:
ハミルトン回路が存在することを確かめるには、経路を確認していくしかない。グラフGについて確認したところハミルトン回路が存在することがわかった。経路は以下の通り。
頂点1 -> 頂点2 -> 頂点3 -> 頂点5 -> 頂点4 -> 頂点6 -> 頂点7

4. Explain the spanning tree. Find at least two possible spanning trees for the following graph H and explain how you determined that they are spanning trees. Draw a bipartite graph from any one of the two spanning trees that you found.
スパニングツリーは、あるグラフの全ての頂点を含み、かつサイクルを持たない部分グラフを表します。スパニングツリーの特徴を説明します。
全ての頂点を含む: スパニングツリーは、元のグラフの全ての頂点を含みます。
最小限のエッジ: スパニングツリーは、グラフを連結するために必要な最小限のエッジを含みます。つまり、頂点の数がnであれば、辺の数はn-1です。
サイクルがない: スパニングツリーは、サイクルが存在しません。もしサイクルが存在するとツリーではなくなってしまいます。
連結されている: スパニングツリーは連結されているため、任意の2頂点感には必ずパスが存在します。
次に、与えられたグラフHのスパニングツリーについて考えます。二つのスパニングツリーを考えました。
一つ目(赤色)
[図]
このスパニングツリーは頂点1を根とした木構造とすることを目標に作成しました。全ての頂点を含む・頂点の数と辺の数の関係・サイクルが存在しない、以上の3点からスパニングツリーであると判断しました。
二つ目(緑色)
[図]
このスパニングツリーは、頂点6を根とした木構造とすることを目標に作成しました。一つ目の例と同様に、3つの条件を満たしていることから、スパニングツリーであると言えます。
次に、一つ目の例に対する二部グラフを考えます。二部グラフとは頂点を二つの独立した集合に分割できる特殊なグラフを表します。スパニングツリーに対して二部グラフを作成するためには、根に任意の集合を付与したらその葉に対して異なる集合を付与していきます。これは最後の葉まで実施していけば作成できます。今回は集合Aと集合Bに分割する方針で作成しました。
[図]
