# unit3

- Graphs
- The Factor Theorem and the Remainder Theorem
- Complex Zeroes and the Fundamental Theorem of Algebra

## Goal

- By the end of this Unit, you will be able to:
  - Develop a polynomial or rational function to model a real-world situation.
  - Discuss roots of polynomials given information about them.
  - Reflect on the concept of polynomial and rational functions.

## Task

- [x] Reading assignment
- [x] Peer assess Unit 2 Written Assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

### Discussion Forum

Polynomial and rational functions can be used to model a wide variety of phenomena of science, technology, and everyday life.
Choose one of these sectors and give an example of a polynomial or rational function modeling a situation in that sector. [Hint: see the examples and exercises in the book.]
Go to www.desmos.com/calculator, write your equation, or function, and develop your explanation using the properties of graphs.

私は今回の課題で、多項式関数とそれを利用した例について説明します。まず、多項式関数はテキストによると以下のように定義されます。
Let n be a non-negative integer. A polynomial function is a function that can be written in the form
f(x)=anx^n+...+a2x^2+a1x+a0
(Abramson, 2017)
この形は身の回りの事象を説明するために利用することができ、さまざま形でモデル化されています。今回は円とその内部の正方形の面積の関係を多項式関数で表現します。

今回求めたい面積は円の面積-正方形の面積で与えられるので、それぞれについて確認します。
円の面積
まず、半径がxの円h(x)を考えます。この面積はh(x)=πx^2で表現されます。
正方形の面積
次に、対角線の交点からの長さがtで与えられる、円h(x)の中に存在する正方形を考えます。この正方形の面積S(t)は
S(t)=t*t/2*4=2t^2
となります。
ここで、tの条件として「円h(x)の半径xの半分に1を加えたもの」という条件を与えると
t=x/2+1
となるのでS(t)はxの関数として
S(x)=2(x/2+1)^2
=x^2/2+2x+2
となります。
求めたい面積F(x)
最後に求めたい面積F(x)を計算します。ここまで計算した円の面積から正方形の面積を引けば良いので
F(x)=h(x)-S(x)
=πx^2-x^2/2+2x+2
=(π-1/2)x^2+2x+2
これは最高次数が2である多項式関数です。
また、この関数のグラフを作成する前に、領域について確認します。正方形のは円の内側に存在する必要があるので
t<=x
である必要があります。これをt=x/2+1を利用して整理すると
x/2+1<=x
-x/2<=-1
x>=2
となるので、関数F(x)は[2.無限)の領域で定義されます。

### Programming Assignment

### Learning Journal

Reflect on the concept of polynomial and rational functions. What concepts (only the names) did you need to accommodate these concepts in your mind?
polynomial and rational functionsについて理解するためには、最も基本的な概念であるpower functionについて知る必要があります。テキストによるとpower functionとは、𝑓(𝑥)=𝑘𝑥𝑝(where 𝑘 and 𝑝 are real numbers, and 𝑘 is known as the coefficient.)の形で定義されます。この形が全ての関数の最も基本的な概念であり、polynomial functionやrational functionsは、このpower functionの組み合わせで表現されます。
polynomial functionは複数のpower funcitionの足し合わせによって定義され、一般的に以下のような表現をされます。
𝑓(𝑥)=𝑎𝑛𝑥𝑛+...+𝑎2𝑥2+𝑎1𝑥+𝑎0
This is called the general form of a polynomial function. Each 𝑎𝑖 is a coefficient and can be any real number, but 𝑎𝑛≠. Each expression 𝑎𝑖𝑥𝑖 is a term of a polynomial function.(Abramson, 2017)
次に、rational functionは、一般的に以下のような表現をされます。
𝑓(𝑥)=𝑃(𝑥)𝑄(𝑥)=𝑎𝑝𝑥𝑝+𝑎𝑝−1𝑥𝑝−1+...+𝑎1𝑥+𝑎0𝑏𝑞𝑥𝑞+𝑏𝑞−1𝑥𝑞−1+...+𝑏1𝑥+𝑏0,𝑄(𝑥)≠0
このことによって私は、今回のユニットで学習するものは全て基本形の組み合わせであり、基本形に関する理解を深めることが重要なスタートとなることを実感することができました。

What are the simplest polynomial and rational function you can imagine?
単純な多項式関数の例を二つあげます。まずはf(x)=mx+bの形で表現されるものです。これは前回のユニットで学んだように、傾きmで切片がbの直線となります。
つぎに、f(x)=ax^2+bx+cの形で表現されるものです。これは、グラフにすると放物線を描きます。一般系としてf(x)=a(x+a/b)^2+Cとして考えることができれば、頂点が(-a/b,C)となることも理解できます。
これらの概念は既に前回のユニットにて学習することができており、今回の学習の目的は一般系としての理解を深めることだと再認識することができました。

In your day to day, is there any occurring fact that can be interpreted as polynomial and rational functions?
多項式関数としては、複利計算が頭に浮かびました。複利の計算は一般的に元金*(1+利息)^年数の形であたえられます。これを展開すると、利息に関する多項式函数として見ることが可能です。
次に、有理関数ですが一番に思いついたのはf(x)=tanxの形でしめされるものです。
tanxは
tanx=sinx/cosxで定義される有理関数であり、私の専攻していた物理学の学習では非常によく利用する概念でした。

What strategy are you using to get the graph of polynomial and rational functions?
A)polynomial function
基本的な進め方を以下で説明します

1. わかりやすい点を求める
f(x)=0やf(0)の場合の状況についてまず計算します。これらの点は因数分解や代入によって求めることが可能です。
2. 点と点の間の傾きを求める
わかりやすい点を求めたら、次は傾きについて考えます。たとえば-∞や+∞、点と点の間など、方程式が上向きなのか下向きなのかを知ることが重要です。この方法について、私は微分という概念が非常に有意義に活用できることを知っています。

B)rational function
きほんてきな進め方を以下で説明します。

1. わかりやすい点をもとめる
polynominal functionと同様f(x)=0やf(0)など、軸状の点について整理します。
2. 分母が0となりうる点について確認する
有理関数はその特性から、分母が0になる点は定義することができず＋か−の無限の値をとることになります。このような点がどこになるのか、また＋とーどちらにむけて発散するのかグラフを書く上で確認するべき事項です。
