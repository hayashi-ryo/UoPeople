# unit1

## Goal

- By the end of this Unit, you will be able to:
  - Recognize a function.
  - Identify the domain and range of a function.
  - Compute operations on functions.
  - Construct the graph of a function.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Writing assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

### Reading Assignment

- 二つの値がある時、入力に対して一つの出力が認められる場合、その関係を関数と呼ぶ

### Discussion Forum

Consider the equation   x^2+(y-2)^2=1  and the relation “(x, y) R (0, 2)”, where R is read as “has distance 1 of”.
For example, “(0, 3) R (0, 2)”, that is, “(0, 3) has distance 1 of (0, 2)”. This relation can also be read as “the point (x, y) is on the circle of radius 1 with center (0, 2)”. In other words: “(x, y) satisfies this equation  x^2+(y-2)^2=1 , if and only if, (x, y) R (0, 2)”.
Does this equation determine a relation between x and y? Can the variable x can be seen as a function of y, like x=g(y)? Can the variable y be expressed as a function of x, like y= h(x)? If these are possible, then what will be the domains for these two functions?  What are the graphs of these two functions?
Are there points of the coordinate axes that relate to (0, 2) by means of R?
Your Discussion should be a minimum of 250 words in length and not more than 750 words.

書くこと
関係と関数についてテキストを引用して説明
今回の式がどのようになるかを説明

クラスメイトの皆さんこんにちは、今回のテーマに対する私の回答を説明します。
まず、今回の課題を扱う上では関数とは何かについて議論する必要があります。教科書では関数について"A function is a relation in which each possible input value leads to exactly one output value."(Abramson、2017)と説明されています。そのため、今回与えられた式が関数であるかどうかは一つの入力に対して複数のアウトプットを持つかどうかで判断することができます。ある式が関数であるかどうかを判断する場合は、グラフに対して垂直線を与えて確認する方法があります。
このグラフは$x^2+(y-2)^2=1$と$x=0.5andy=1.5$を表したものです。グラフからわかるように、垂直線に対して二つの交点があるため、一つの入力に対して複数のアウトプットを持つ可能性があることがわかります。そのため、今回の式ではxとyは相互に関数ではないことが判断できました。

次に、今回与えられた式は関数ではありませんが、領域には制限があるためその内容について説明します。

(x, y) R (0, 2)で与えられるように、今回の式は特定の座標から1離れた点を座標として取り得ます。xの領域は円の中心を通り,y軸に垂直な線と式の交点を考えれば良いので計算します。
x^2+(2-2)=1
x^2-1=0
(x-1)(x+1)=0
よってxの領域は[-1,1]となることがわかります。同じようにyの領域について考える場合、x=0の場合は考慮すれば良いので
(y-2)^2=1
y^2-4y+3=0
(y-1)(y-3)
よって、yの領域は[1,3]となります。
最後に、今回のRは半径1の円上の点であることを占め示すものなので、Rと円の中心(0,2)に関連する座標軸乗の点として(0,3)と(0,0)が存在します

### Written Assignment

1. Find the domain of the function using interval notation.
$f(x)= \frac{ \sqrt{x-6} }{ \sqrt{x-4}}$
今回の関数では、rootと分母それぞれについて領域を考慮する必要がある。
   1. root
rootの中が正の実数となるような領域とする必要があります。今回の関数では、
$\sqrt{x-6}:[6,∞]$
$\sqrt{x-4}:[4,∞]$
となるので、領域は[6,∞]となります。
   2. 分母
分母が0となる領域は定義してはいけないため、その領域を対象外とする必要があります。
$\sqrt{x-4}=0$
$x=4$
この結果から[-∞,4)(4,∞]の領域が与えられます。
1と2の結果から、今回の関数の領域は[6,∞]となります。

2. Sketch a graph of a piecewise function. Write the domain in interval notation.
$y=x^2  for {-1 \leq x \leq 1}$
and
$y = 3x - 2 for  {1 \leq x \leq 3}$
Then choose your own functions and have fun.

以下のグラフを作成した
$y=\ 2x+1\ \left\{-1<x<1\right\}$
$y=x^{2}-2\left\{-2\le x\le-1\right\}$
$y=-2x^{2}+5\left\{1\le x\le2\right\}$

3. The cost in dollars of making x items is given by the function $C(x) = 10x + 500.$
a. The fixed cost is determined when zero items are produced. Find the fixed cost for this item.
関数C(x)について、x=0を考える
C(0)= 10*x+500
=500
よって固定費は500となる。これはグラフを考慮した場合の切片と同じ意味である。

b. What is the cost of making 25 items?
C(25)=10*25+500
=750
よって、750原価となる。
c. Suppose the maximum cost allowed is $1500. What are the domain and range of the cost function, C(x)?
C(x)=10x+500<=1500
10x<=1000
x<=100
また、商品を負の数生産することはできない。よって、C(x)のdomeinは[0,100]となる。この時、C(x)のrangeは[500,1500]となる。

### Learning Journal

### Programming Assignment
