# unit2

- Topics:
  - Graphs
  - Linear Functions
  - Quadratic Functions

## Goal

- By the end of this Unit, you will be able to:
  - Construct a graph from equations to communicate information.
  - Utilize linear and quadratic functions to solve problems.
  - Develop rigorous algebraic solutions to solve problems.
  - Reflect on the concept of lines and quadratic functions.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

### Discussion Forum

Lines can be used to approximate a wide variety of functions; often a function can be described using many lines.
If a stock price goes from $10 to $12 from January 1st to January 31, from $12 to $9 from February 1st to February 28th, and from $9 to $15 from March 1st to March 31th is the price change from $10 to $15 a straight line?
It is clear that in each of the three time intervals mentioned there was a complex daily variation of prices as in an electrocardiogram. But what would be a simplified solution for a first naive view of the situation? Would a simple function hold up? What is the simplest function to represent this situation? Does your naïve initial and simplified model allow you to predict the behavior of the stock in the next month?
How can I use three “pieces” of lines to describe the price movements from the beginning of January to the end of March? Show the graph for the price movement.

線分は一次関数としてy=ax+bの形に整理することができます。一次関数の形に整理するためには、2点の情報を用いて連立方程式を解くことが必要です。
1月1日からの経過日数をx、stock　priceをyとして与えられた情報を整理します。すると以下の情報を得ることができます。
If a stock price goes from $10 to $12 from January 1st to January 31,
(0,10)→(30,12):lineA
from $12 to $9 from February 1st to February 28th
(31,12)(58,9):lineB
from $9 to $15 from March 1st to March 31th
(59,9)(89,15):lineC
この情報を整理すると3つの一次関数を得ることができます
lineA:y=1/15x+10 [0,30]
lineB:y=-1/9x+139/9 [31,58]
lineC:y=1/5x-14/5 [59,89]
それぞれ関数をグラフに表すと以下のようになります
これらの整理した結果を用いて質問に解答します。
But what would be a simplified solution for a first naive view of the situation? What is the simplest function to represent this situation?
ここまで整理したように3つの一次関数の形に整理することができます。
Does your naïve initial and simplified model allow you to predict the behavior of the stock in the next month?
1月1日から3月31日の上昇傾向を確認すると、4月以降の同様の上昇傾向となるのではないかという感覚があります。しかし、1ヶ月単位の金額の上限からわかるように、株価を一次関数として予測することは非常に困難だと思われます。

### Learning Journal

Reflect on the concept of lines and quadratic functions. What concepts (only the names) did you need to accommodate the concept of lines and quadratic functions in your mind?

linesとquadratic functionsの最も簡単な定義を以下に記載します。
liner function:𝑓(𝑥)=m𝑥+b
方程式の最高次数は1であり、傾きmと切片bによってグラフの形式が変化する
quadratic function:𝑓(𝑥)=𝑎𝑥2+𝑏𝑥+𝑐
方程式の最高次数は2である。上記の式を整理するとf(x)=a(x-h)^2+kとなり、aがグラフの向きや勾配、hとkが頂点を消える要素となる。
この概念について、私はグラフによる理解よりも方程式によって表現される形での理解を深めました。式変形によって与えられる形は、グラフによって表現される形よりも厳密であり、私にとって理解しやすい形式です。

The simplest definitions of linear and quadratic functions are given below.
liner function:𝑓(𝑥)=m𝑥+b
The highest order of the equation is 1, and the slope m and the intercept b change the form of the graph.
quadratic function:𝑓(𝑥)=𝑎𝑥2+𝑏𝑥+𝑐
The highest order of the equation is 2. The above equation can be rearranged as f(x)=a(x-h)^2+k, where a is the orientation or gradient of the graph and h and k are the elements that make the vertices disappear.
I have a better understanding of this concept in the form expressed by equations than by graphs. The form given by equational transformation is more rigorous and easier for me to understand than the form represented by the graph.

What are the simplest line and quadratic function you can imagine?
まず最も単純な直線は、m=1,b=0の場合に与えられるy=xの形式です。この方程式は常に入力と出力が一致する形であり、イメージとして捉える際に最も基本的な形だと考えています。私の理解では直接はこの基本形式を考えた上でmやbを増減させる形が理解しやすいものと考えています。
次に、最も単純なquadratic functionはy=x^2の形式です。これは、f(x)=a(x-h)^2+kにおいて、a=1,h=k=0の場合に与えられます。このquadratic functionは、原点を通り、入力の2乗の値が出力となる最も基本的な形式です。方程式の形で考えた際に、原点を通らない形式は私にとっての単純さに欠けるため、y=x^2が最もシンプルなものと考えます。

The first and simplest straight line is the form y=x given for m=1,b=0. This equation is the form in which the input and output always coincide, and I consider it to be the most basic form in terms of image. My understanding is that it is easier to understand directly by considering this basic form and then increasing or decreasing m and b.
Next, the simplest quadratic function is of the form y=x^2. This is given by f(x)=a(x-h)^2+k where a=1 and h=k=0. This quadratic function is the most basic form, passing through the origin, where the value of the square of the input is the output. When considered in equation form, the form that does not pass through the origin is not simple enough for me, so I consider y=x^2 to be the simplest.

In your day to day, is there any occurring fact that can be interpreted as lines and quadratic functions?
まず、line functionの形式で与えられている事象について考えます。
私の身の回りでは、引っ越しの際の料金がイメージできました。引っ越しを業者に依頼する場合は、
固定代金＋荷物の数量×荷物一つ当たりの代金で計算できます。この計算はまさしくy=mx+bの形式と同様のものです。
次に、quadratic functionについてです。私にとって一番身近なuadratic functionは、ボールを投げた際の軌道です。私はバスケットボールを趣味としてやるのですが、シュートを放つ際のボールの起動は放物線を描いており、y=a(x-h)^2+kで表現されるquadratic functionの軌道を描いています。

First, consider an event given in the form of a line function.
In my immediate surroundings, I could imagine the price of moving. If you hire a contractor to do your move, you get
It can be calculated as follows: fixed price + quantity of luggage x price per luggage. This calculation is the same as the form y=mx+b.
Next, let's talk about the quadratic function. The most familiar quadratic function to me is the trajectory of a thrown ball. I play basketball as a hobby, and when I shoot the ball, it starts up in a parabolic trajectory, which is expressed as y=a(x-h)^2+k, which is the trajectory of the quadratic function.

What strategy are you using to get the graph of lines and quadratic functions?
私はline functionと quadratic functionのグラフを同じ戦略によって計算します。
1)与えられた形式をそれぞれ整理します。
liner function:𝑓(𝑥)=m𝑥+b
quadratic function:𝑓(𝑥)=a(x-h)^2+k
これは、グラフを描く際に必要になる切片・傾き・頂点などの要素を得るために必ずやった方が良い作業です。
2)整理した形式から、基準点を描く
liner functionであれば(0,b)をquadratic functionであれば(h,k)が基準となる値になります。これらの点についてまずグラフ状に描きます。
3)いくつかの点を描く
基準点を描いたらあとはもう簡単です、xを1増やした場合のyの値など簡単に求めることができる値を利用して、いくつかの点をグラフに表現します。あとは、それらを線で結べば完成です。

I compute the graphs of the line function and quadratic function by the same strategy.

1) Organize each of the given forms.
liner function:𝑓(𝑥)=m𝑥+b
quadratic function:𝑓(𝑥)=a(x-h)^2+k
This is work that should always be done to obtain the intercept, slope, vertices, and other elements needed to draw the graph.
2) From the organized form, draw a reference point.
For the liner function, (0,b) and for the quadratic function, (h,k) are the reference values. First, draw these points graphically.
3) Draw several points
Once the reference points are drawn, the rest is easy. Then, connect them with a line to complete the process.

### Programming Assignment

1. 直線が並行であるかどうかは、y=ax+bの形に直した際の傾きaが一致するかどうかで判定できるそれぞれについて式変形を行うと
3y+4x=12
  3y=-4x+12
  y=-4/3x+4
-6y=8x+1
  y=-4/3x-1/6
並行となる
3y+x=12
  y=-1/3x+4
-y=8x+1
  y=-8x-1
並行ではない
4x-7y=10
  y=4/7x-5/2
7x+4y=1
  y=-7/4x+1/4

2. ビルの高さはt=0の場合のh(t)の値がビルの高さとなるため
h(0)=8
よってビルの高さは8メートルである。次に、ボールの最大到達地点を調べるためには二次関数の頂点を調べれば良いので
h(t)=-4.9t^2+24t+8
    =-4.9(t^2-24/4.9t)+8
    =-4.9(t-12/4.9)^2+8+144/4.9
この結果より頂点の座標は(12/4.9,8+144/4.9)となりこの地点がボールの最大到達地点となる。厳密な数値で表すと
ボールの最大高さ：2.4490...
最大高さに到達するまでの時間：37.38776...
となる。

3. 市場の総所得は店の軒数*平均収入によって求めることができる。
店の軒数をxとすると、平均収入は-5x+700で表現できる。
この時、市場の総所得yと店の軒数xの関係は
y=(-5x+700)x
となる。市場の所得が最大となる店の件数を調べるためにはこの関数の最大値を調べれば良いので
y=(-5x+700)x
  =-5x^2+700x
  =-5(x-70)^2+24500
この二次関数はx=70の時に最大値24500をとるので、
最適な店の数：70
市場の総所得:24500
となる
