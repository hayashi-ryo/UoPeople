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
- [ ] Learning Journal
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
