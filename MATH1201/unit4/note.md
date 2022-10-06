# unit4

- Topics:
  - Composition
  - Inverses

## Goal

- Learning Objectives:
- By the end of this Unit, you will be able to:
  - Perform function composition
  - Discuss inverses of functions in terms of graphing, domain, and range.
  - Determine inverses of functions

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

### Discussion Forum

What happens if we graph both  f  and  f^{-1}  on the same set of axes, using the x-axis for the input to both  f  and  f^{-1}  ?
[Suggestion: go to www.desmos.com/calculator and type  y=x^3  {-2 < x < 2},  y=x^{1/3}  {–2 < x < 2}, and y = x {–2 < x < 2}, and describe the relationship between the three curves.] Then post your own example discussing the difficulty of graph both  f  and  f^{-1}  on the same set of axes.
Suppose  f:R \rightarrow R   is a function from the set of real numbers to the same set with  f(x)=x+1 . We write  f^{2}  to represent  f \circ f  and  f^{n+1}=f^n \circ f . Is it true that  f^2 \circ f = f \circ f^2 ? Why? Is the set { g:R \rightarrow R   l  g \circ f=f \circ g } infinite? Why?
Your Discussion should be a minimum of 250 words in length and not more than 750 words.

クラスメートの皆さんこんにちは、今回の課題に対する私の回答を以下で説明します。
課題を進めるにあたって、まずはf^{-1}について確認する必要があります。f^{-1}はInverse funcutionとよばれ、テキストによると以下の性質を持ちます。
ある関数f(x)について、f^{-1}(f(x))=xが成り立つものをinverse functionとよぶ。
この性質からわかることとして、y=mx+bなどで示されるyとxに対応関係を逆にするということを示しています。
以上の内容を踏まえて、逆関数のグラフについて考えます。今回やy=3x+5という関数について考えます。逆関数は以下のプロセスによって求めることができます。
1)yとxを入れ替えた方程式を作成する
yとxについて入れ変えた方程式を以下に記載します。
x=3y+5
2)yについて整理する
1)で求めた方程式を整理します
x=3y+5
3y=x-5
y=1/3x-5/3
よってf(x)=3y+5に対する逆関数f^{-1})(x)=1/3x-5/3を求めることができました。念の為定義を用いて確認します。
f^{-1}(f(x))=1/3(3x+5)-5/3
=x+5/3-5/3
=x
以上より、定義を満たした方程式を求められていることが確認できました。次に、f(x)とf^{-1}(x)をグラフにします。
グラフを挿入
このグラフを確認すると、y=xについて反射したグラフが表示されています。（わかりやすいようにy=xを追加したものをいかに記載します。）
よって今回の課題によって得られた非常に重要な知見は、元の関数をy=xに対して反射したものが出力されることがわかりました。

課題の提案にあった
y=x^3  {-2 < x < 2},  y=x^{1/3}  {–2 < x < 2}, and y = x {–2 < x < 2}
についても同様の確認結果を得ることができました。

### Learning Journal

Reflect on the concept of composite and inverse functions. What concepts (only the names) did you need to accommodate these concepts in your mind?
今回のユニットで学んだ合成関数と逆関数について私の理解を説明します。

1. 合成関数
まず、合成関数についてです。テキストによると合成関数は以下のように説明されます。
"The process of combining functions so that the output of one function becomes the input of another is known as a composition of functions. The resulting function is known as a composite function."(Abramson, 2017)
また、f(x)とg(x)の合成関数は表記としては以下のようになります。
(f・g)(x)=f(g(x))
テキストの説明は私の理解を非常に助けてくれました。このような合成関数は、一見関係性のないものが二つの関係によって結びつけられるということを説明しているのだということが理解できました。

2. 逆関数
次に逆関数についてです。逆関数はテキストに以下一文があり、私の理解を助けてくれました。
"Informally, this means that inverse functions “undo” each other."(Abramson, 2017)
合成関数の考え方を利用して、逆関数f^{-1}を表現すると以下のようになります。
(f・f^{-1})(x)=f(f^{-1}(x))=f(y)=x
これば、逆関数と元の関数がy=xという軸に対して、対称な点を持つということがわかります。

What are the simplest composite and inverse functions you can imagine?

1. 合成関数
最もシンプルな合成関数として、一次関数同士の合成を考えます。
g(x)=x+5
h(x)=3x-3
という関数が存在し、それ合成関数である。f(x)=(g・h)(x)は以下のように計算されます。
f(x)=(g・h)(x)
=g(h(x))
=(3x-3)+5
=3x+2
よって、合成関数f(x)=3x+2を計算することができました。

2. 逆関数
シンプルな逆関数の例としては、f(x)=3x^3に対する逆関数を考えます。計算過程を以下に示します。
y=3x^3
x=1/3y^{1/3}
よってf^{-1}(x)=1/3y^{1/3}が計算できました。

In your day to day, is there any occurring fact that can be interpreted as composite and inverse functions?

1. 合成関数
合成関数の例として、地図と温度の関係を考えました。等高線が引かれた地図を考えた場合、ある座標の高さを地図から求めることができます。この関係をgとします。さらに、高さと気温の関係をhとします。このとき、gとhを合成することで、座標から気温を特定する関係fを生成することができます。これは、二つの関係を利用した非常にシンプルな合成関数の例だと思います。

2. 逆関数
逆関数の例として買い物を考えました。例えば、1杯のコーヒーが200円で売っていたとします。このコーヒーをx杯買った時の合計金額はf(x)=200xという関係で表現することができます。ここで、x円でこのコーヒーが何杯買えるか？という関係を考えます。この関係はg(x)=x/200で表現することができます。この二つの関数f(x)とg(x)は逆関数の関係を満たします。
f(g(x))=200(x/200)
=x

What strategy are you using to get the graph of composite and inverse functions?

1. 合成関数
合成関数だからといって、グラフを作成するために特別な操作を行う必要はあります。まずは、合成関数を計算し、その計算結果に応じた方法でグラフにすれば良いのです。結果は多項式関数や有理関数など様々な形式をとる可能性がありますが、私はこれまでのユニットでそれらのグラフを作成する方法を習得しています。
2. 逆関数
逆関数には、y=xと対称な点をもつという関係が成り立ちます。もちろん合成関数と同様に、逆関数を計算してそのグラフを形式に応じた形に作成することもできますが、y=xに対象な点を集めた方が簡単な場合もあるので、元のグラフの形式によって戦略を選んでグラフを作成したいと思います。

### Programming Assignment

What can be said about the domain of the function  f \circ g  where  f(y)= \frac{4}{y-2}  and  g(x)= \frac{5}{3x-1} ? Express it in terms of a union of intervals of real numbers. Go to www.desmos.com/calculator and obtain the graph of  f ,  g , and  f \circ g .

関数f・gを計算する。
f・g = f(g(x))
=4/(g(x)-2)
=4/((5/(3x-1))-2)
=4(3x-2)/(5-2(3x-1))
=(12x-4)/(-6x+7)
f・gは分母が0の場合を除いたRで定義されるので、分母が0の場合を確認する。
-6x+7=0
x=7/6
よって、f・gの領域はR-{7/6}=(-inf,7/6)U(7/6,inf)
また、それぞれの関数をグラフで表現したものをいかに記載する。

Find the inverse of the function  f(x)=4+ \sqrt{x-2}  .
State the domains and ranges of both the function and the inverse function in terms of intervals of real numbers.
逆関数を計算するために、y=4+(x-2)^{1/2}について、xとyを入れ替えて計算を行う。
x=4+(y-2)^{1/2}
(y-2)^{1/2}=x-4
y-2=(x-4)^2
y=(x-4)^2+2
よってf(x)の逆関数f^{-1}は以下になる。
f^{-1}(x)=(x-4)^2+2
次に、domainとrangeを求める。テキストによると、f(x)とf^{-1}(x)の関係を以下となる。
The range of a function  𝑓(𝑥)  is the domain of the inverse function  𝑓−1(𝑥).
The domain of  𝑓(𝑥)  is the range of  𝑓−1(𝑥).
(Abramson, 2017)
それぞれの関数も領域と範囲を求めていく。
f(x)のdomain
根号の中は0の以上の実数である必要があるので、関数f(x)=4+(x-2)^{1/2}の場合は[2,inf)となる。
この場合のf(x)のrangeは
[f(2),inf)=[4,inf)
となる。よって、f^{-1}(x)のdomainとrangeは
domain:[4,inf)
range:[2,inf)
ここまでの結果をまとめて以下に記載する。
f(x)
domain:[2,inf)
range:[4,inf)
f^{-1}(x)
domain:[2,inf)
range:[4,inf)

Go to www.desmos.com/calculator and obtain the graph of  f , its inverse, and  g(x)=x  in the same system of axes. About what pair (a, a) are (11, 7) and (7, 11) reflected about?
No2のf(x)、f^-1{x}、g(x)=x,(11,7),(7,11)をグラフに表示した。
グラフの結果から、(11,7),(7,11)がg(x)=xに対して対象な点となっていることがわかる。

References:
Abramson, J. (2017). Algebra and trigonometry. OpenStax, TX: Rice University. Retrieved from <https://openstax.org/details/books/algebra-and-trigonometry>
