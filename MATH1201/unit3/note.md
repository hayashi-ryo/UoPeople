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
- [ ] Learning Journal
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

### Learning Journal

### Programming Assignment
