# unit7

- Angles and the Unit Circle
- Trigonometric Functions and their Graphs
- Inverse Trigonometric Functions

## Goal

- By the end of this Unit, you will be able to:
  - Recognize the relationship between angles, the unit circle, and rigonometric functions.
  - Construct the graph the trigonometric functions.
  - Use trigonometric identities to verify other trigonometric identities.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

### Reading Assignment

- Section 7.1 Angles
- Section 7.2 Right Triangle Trigonometry
- Section 7.3 Unit Circle
- Section 8.1 Graphs of the Sine and Cosine Functions
- Section 8.2 Graphs of the Other Trigonometric Functions
- Section 8.3 Inverse Trigonometric Functions

### Discussion Forum

similar trianglesは以下の特徴を持ちます。
  対応する辺の長さの比は等しい
  対応する角の大きさが等しい
今回の課題における二つの三角形はこの関係を満たすため、この特徴を利用して計算を行います。
例えば、以下のような三角形ABCと三角形DEFではDE/AB=EF/BC=DF/ACの関係が成り立ちます。
図
この場合、小さい三角形をABC、観測できない大きな三角形をDEFと考えることで、大きな三角形DEFのすべての辺の長さを求めることができます。以下でそれぞれの辺について計算した結果を説明します。
例）AB=3,BC=4,AC=5,DE=100の場合、EFとDFはそれぞれ以下のように計算することができます。
EF=DE/AB*BC
=100/3*4
=133.33
DF=DE/AB*AC
=100/3*5
=166.67

次に、単位円の関係について確認していきます。テキストによれば、単位円は以下のように説明されます。
Such a circle, with a center at the origin and a radius of 1, is known as a unit circle.(Abramson, 2017)
このような単位円において、直角三角形を考えると、三角形の内角の和が180であることから、中心の角度tが0<t<90の範囲であることがわかります。
ここで、一般的な直角三角形を考えると、直角以外の角度xの条件として0<x<90となることが明確です。
二つの角度が等しいという相似の条件を満たすため、一般的な直角三角形と単位円によって作成された直角三角形は相似の関係となることがわかります。よって、単位円における直角三角形は、全ての可能な三角形を相似の形で表現することができるのです。

References:
Abramson, J. (2017). Algebra and trigonometry. OpenStax, TX: Rice University. Retrieved from <https://openstax.org/details/books/algebra-and-trigonometry>

### Learning Journal

Reflect on the concepts of trigonometry. What concepts (only the names) did you need to accommodate the concepts of trigonometry in your mind?
今週のユニットで学んだ三角測量に関する概念について、私の理解を説明します。
テキストでは、三角測量は、角度がわかっているが辺の長さを全て得ることができていない状況で力を発揮するとあり、この概念が三角測量において非常に重要なものとなります。なぜなら、直角三角形を考えた時に、斜辺の長さと角度から、隣接する辺の長さや反対側の辺の長さを求めることができるからです。この関係をsin,cos,tanといった関数の形で表現することができると理解することができました。

What are the simplest trigonometry concepts you can imagine?
シンプルな三角測量の例としては、花火までの距離を考えました。例えば、花火の発射地点から10kmの距離で花火を見ているときに、大体45°の高さまで花火が打ち上がっていることがわかれば、三角法によって花火は大体10kmほどの高さまで打ち上がっていることがわかります。このように、非常に大きなものの大きさや長さを測る際に非常に有用に活用できると思います。

In your day to day, is there any occurring fact that can be interpreted as periodic patterns?
身の回りのものについて、目に見えるものと見えないものの二つを考えました。
まず、目に見えるものとして振り子時計を考えました。振り子時計は、振り子の重さと振り子自体の長さを調整することによって、特定の周期を得ることが可能です。この動きは、傾き0の地点を原点とすればf(x)=Asin(x)の形で表現することが可能です。
次に目に見えない事象として、音や光、地震などを考えました。これらの現象は空気や地面を波として伝わる現象であり、その本質は周期的な関数として表現することが可能です。

What strategy are you using to get the graphs of trigonometric functions?
三角関数で表現されるものとして、sin/cos/tanがあります。それぞれについてグラフを得るための戦略を説明します。

1. sin/cos
sinやcosといった関数は、振幅と周期を得ることが非常に重要です。振幅は波の大きさであり、周期とはf(x)が開始時点と同じ値を取るxを指す。一般的に、f(x)=Asin(Bx)やf(x)=Acos(Bx)として表現されることが多いので、Aを振幅、Bを周期の係数をとして考えるとグラフの波形を得ることができます。
2. tan
tanはtanx=sinx/cosxで定義されます。cosxは0を取る可能性がある関数なので、tanxのグラフを得る上で非常に重要な戦略は、定義できない点がどこであるかをし流ことです。例えばf(x)=tanxでは、x=pi/2やx=3pi/2の地点で定義することができず、x=pi/2やx=3pi/2の直線に対して漸近線をとる必要があります。このように、tanxを考える上では、定義領域を明確にすることが重要です。

### Programming Assignment

1. Find the length of an arc in a circle of radius 10 centimeters subtended by the central angle of 50°. Show your work.
弧の長さsは以下の式で求めることができる
s=rθ
r:半径
θ:radians
計算を行うため、50°はラジアン直す
θ=50*π/180
=5π/18
よって弧の長さは
s=rθ
=10*5π/18
=25π/9
~8.72(centimeters)

2. Graph  f(x)=x\ sin\ x  on [-4π, 4π] and verbalize how the graph varies from the graphs of  f(x)= \pm x  
f(x)=xsinxとf(x)=+-xをグラフで表現すると以下のようになる
図
このグラフからは以下のことがわかる
・f(x)はsinxを関数の内部で保持するため、2piを周期とする周期関数となっている
・グラフの頂点となるx=pi/2や5pi/2において、y=+xと交点を持つことからf(x)の振幅を決定する要素としてxが与えられていることがわかる。y=-xについては、x=3pi/2や7pi/2で交点を持つ

次にf(x)=sinx/xを考える。この関数の振幅は1/xが決定するため、グラフとしてf(x)=+-1/xを合わせて表現する。
図
このグラフから、以下のことがわかる
・f(x)はsinxを関数の内部で保持するため、2piを周期とする周期関数となっている
・グラフの頂点となるx=pi/2や5pi/2において、y=+1/xと交点を持つことからf(x)の振幅を決定する要素としてxが与えられていることがわかる。y=-1/xについては、x=3pi/2や7pi/2で交点を持つ

3. A 23-ft ladder leans against a building so that the angle between the ground and the ladder is 80°. How high does the ladder reach up the side of the building? Show the steps of your reasoning.
状況を図で表現すると以下のようになる。
図
よって、梯子が届いている高さはを求めるには、三角関数の関係を利用すると計算できる
高さ(h)=梯子の長さ×sin(80°)
=23*sin(80*pi/180)
〜22.65(ft)
よって梯子は22.65-ftの高さまで届いている。
