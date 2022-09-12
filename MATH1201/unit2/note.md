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
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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
