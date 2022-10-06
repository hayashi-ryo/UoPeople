# unit5

- Exponential functions
- Logarithmic functions

## Goal

- By the end of this Unit, you will be able to:
  - Examine the benefits of using a logistics model.
  - Apply a logistics model to the calculations of a given problem.
  - Utilize logarithmic functions to solve mathematical problems.
  - Apply inverse functions to solve mathematical problems.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

### Reading Assignment

- 6.3 Logarithmic Functions
  - 対数形式と指数形式の変換はよく行われる
- 6.4 Graphs of Logarithmic Functions
  - 指数関数と対数関数は本質的に逆関数であり、範囲が値域が逆関数の定義に則ったものになる。
- 6.5 Logarithmic Properties
  - 高校でやった対数関数の性質
    - log(a+b)=log+logbやlog(x)^2=2logxなどの性質について議論している。
- 6.6 Exponential and Logarithmic Equations
- 6.7 Exponential and Logarithmic Models
  - exponential growth function
    - y=Ae^{kt}
    - ものの増え方や減り方の状況を確認するために利用する。kの正負によってグラフの振る舞いが異なる。
  - Logistic Growth Models
    - 最初のうちは指数関数的な成長をするが、出力がモデルの上限値まで近づくと成長率が減少するもののこと
  - Choosing an Appropriate Model for Data

### Discussion Forum

The population of a culture of bacteria is modeled by the logistic equation

P(t)= \frac{14,250}{1+29e^{-0.62t}  .
To the nearest tenth, how many days will it take the culture to reach 75% of its carrying capacity? What is the carrying capacity? What is the initial population for the model? Why a model like  P(t)=P_0 \ e^{Kt}  , where  P_0  is the initial population, would not be plausible? What are the virtues of the logistic model?

Go to www.desmos.com/calculator and type
クラスメイトの皆さんこんにちは、今回の課題に関する私の見解を説明します。
今回の課題を進めるために、まず今回のlogistic equationについて確認する必要があります。この形式について確認すると
f(t)=c/(1+ae^{-bt})
の形で示されていることがわかります。テキストによると、今回のようなlogistic equationは限界値に近づくにつれて成長が鈍化するようなモデルの場合に与えられます。このモデルの特徴を以下の記載します。

1. c/(1+a) is the initial value
2. c is the carrying capacity, or limiting value
3. b is constant determined by the rate of growth
(Abramson, 2017)

上記の特徴を念頭に置いた上で、今回の質問について回答します。

- To the nearest tenth, how many days will it take the culture to reach 75% of its carrying capacity?
  - 今回のモデルの収容能力が14,250となることが方程式よりわかる。日数tについて計算を行う過程を以下に記載する。
  14,250*(3/4)=
  よって、今回のモデルの収容能力の75%には、7.2日で到達することがわかりました。
- What is the carrying capacity?
  - 指数関数的な成長モデルにおいて、上限値を考える必要がある場合がある。carrying capacityは、このような上限値を指すものであり、部屋の大きさや作業効率など様々な尺度の上限値が与えられる場合がある。
- What is the initial population for the model?
  - initial populationはt=0の場合を計算すれば求めることができる。以下に計算の過程を記載する。
  - よって、今回のモデルのinitial populationは475.0である。
- Why a model like  P(t)=P_0 \ e^{Kt}  , where  P_0  is the initial population, would not be plausible?
  - このようなモデルが妥当でないかをこの質問状況だけで判断することは困難ですが、私は以下の理由からP(t)=P_0 \ e^{Kt}ではなく、今回のようなLogistic Growth Modelsが妥当であると考えました。
    - バクテリアの増殖速度は、開始からごく短期間では指数関数的な成長をする
    - しかし、餌やスペースなどの環境的な要因によって、バクテリアの成長速度が鈍化するポイントがある
  - 以上より、環境的な要因を考慮することが不要な状況であれば、P(t)=P_0 \ e^{Kt}が妥当な可能性がありますが、実際の環境を考慮した場合は、Logistic Growth Modelsを採用することが多いと考えます。
- What are the virtues of the logistic model?
  - logistic modelの良さは、成長の上限を考慮することができるため、単純な指数関数的成長モデルと比較してより長期間のモデルを形成することができる点です。

References:
Abramson, J. (2017). Algebra and trigonometry. OpenStax, TX: Rice University. Retrieved from <https://openstax.org/details/books/algebra-and-trigonometry>

### Programming Assignment

テキストより、複利計算の式は以下の式で与えられる。
A(t)=P(1+r/n)^{nt}
A(t) is the account value,
t is measured in years,
P is the starting amount of the account, often called the principal, or more generally present value,
r is the annual percentage rate (APR) expressed as a decimal, and
n is the number of compounding periods in one year.
(Abramson, 2017)
今回の問題ではそれぞれの設定は以下となる。
t is 20 years
P is an initial deposit of $8500
r is 8.12%(0.0812)
n is 12 months
よって、それぞれの値を代入すると以下の式を得ることができる。
A(20)=8500(1+0.0812/12)^{12*20}
=42888.18
よって複利の場合の20年後の口座残高は$42888.18となる。
単利の場合は、以下の形で計算できる
A(t)=P(1+nt)
=8500*(1+0.0812*20)
=22303
よって、単利の場合の20年後の口座残高は$22303となる。
以上より、20年後の口座残高は複利で運用した場合の方が多いものとなる。また、それぞれに運用についてグラフで表現したものを以下に記載する。
グラフから、複利計算は指数関数的な成長をしていることがわかる。また、1年後の時点で複利計算の方が口座残高が多くなる。

N02
y=5(0.5)^{-x}の逆関数を求める。逆関数を求めるためには、xとyを入れ替えた方程式をyについて解けば良いため、その計算を行う。
y=5(0.5)^{-x}
x=5(1/2)^{-y} xとyを入れ替える
x/5=(1/2)^{-y} 両辺を5で割る
ln(x/5)=ln((1/2)^{-y}) 常用対数をとる
lnx-ln5=-y(ln1-ln2) 常用対数を分解する
lnx-ln5=yln2
y=(lnx-ln5)/ln2
よってy=5(0.5)^{-x}の逆関数を求めることができた。グラフを以下に記載する。

グラフからx切片は5であることがわかる。また、a^x=e^{x lna}は両辺の常用対数をとることで証明できる。
a^x=e^{x lna}
ln(a^x)=ln(e^{x lna})
xlna=xlna(lne)
x=x

N03
まず、K= \frac{ln0.5}{T}の証明を行う。半減期では物質の半数が崩壊するため、崩壊方程式において、A(T)/A_0=0.5が成立する。このことを利用して崩壊方程式の整理を行う
A(T)=A_0e^{KT}
A(T)/A_0=e^{KT} 両辺をA_0で割る
0.5=e^{KT} A(T)/A_0=0.5を代入する
ln(0.5)=ln(e^{KT}) 両辺の常用対数をとる
ln(0.5)=KTlne
K=ln(0.5)/T
よってK= \frac{ln0.5}{T}を証明することができた。
次に、ウラン235の20%が崩壊するまでの時間を求めていく。テキストからウラン235の半減期は703,800,000 yearsであることがわかる。また、20％が崩壊するため、最初の試料が1000グラムある場合は、800グラム残っている場合の時間を求めれば良いので計算を行っていく。
800=1000e^{Kt}
0.8=e^{Kt}
ln(0.8)=ln(e^{Kt})
ln(0.8)=Ktlne
t=ln(0.8)/K
t=ln(0.8)*(703,800,000/ln(0.5)
t=226572993
よって、20%の試料が崩壊するまでにかかる時間は226,572,993年である。

### Learning Journal

Reflect on the concept of exponential and logarithm functions. What concepts (only the names) did you need to accommodate these new concepts in your mind?
今回のユニットで学んだ指数関数と対数関すについて、私の理解を説明します。

1. 指数関数
テキストによると、指数関数は以下のように定義されます。
f(x)=ab^x
where
a is a non-zero real number called the initial value and
b is any positive real number such that 𝑏≠1.
The domain of f is all real numbers.
The range of f is all positive real numbers if a>0.
The range of f is all negative real numbers if a<0.
The y-intercept is (0,a), and the horizontal asymptote is y=0.
(Abramson, 2017)
この指数関数を理解するにあたって私は"同じ割合で増加していく関数"という説明によって非常に理解を深めることができた。ここまで学んだような関数は"同じ量"が増えていくイメージとなる。

2. 対数関数
テキストによると、対数関数は以下のように定義されます。
y=logb(x)is equivalent to b^y=x
where,
we read logb(x)  as, “the logarithm with base b of x ” or the “log base b of x."
the logarithm y is the exponent to which b must be raised to get x.
(Abramson, 2017)
対数関数を理解する上で非常に重要な要素は、指数関数の関数である、ということです。すなわちグラフの傾向もy=xに対照なものとなるので、"同じ割合で減少していく関数"と理解することができました。前回のユニットにて学習した逆関数の概念を生かすことができています。

What are the simplest exponential and logarithmic functions with base b ≠ 1 you can imagine?

1. 指数関数
シンプルな指数関数として、底が2の場合を考えます。
f(x)=2^x
この関数は、xが増加するごとに出力が2倍になるものとなります。

2. 対数関数
底が2である指数関数の逆関数を考えます。
f(x)=log2(x)
この関数は、非常にシンプルである2を何乗すれば特定の値を得ることができるのかについて、グラフを見ながら確認することができます。

In your day to day, is there any occurring fact that can be interpreted as exponential or logarithmic functions?

1. 指数関数
指数関数の例として、アメーバの分裂を考えました。アメーバは一つの個体が二つに分裂することで増殖します。増殖した個体は、さらに二つの個体に増えていく形になります。この関係を関数で表すと増殖回数をxとしてf(x)=2^xで表現することができます。

2. 対数関数
対数関数の例として、地震の大きさを示すマグニチュードを考えました。マグニチュードは1大きくなるたびに地震の大きさが32倍になることを示す指標です。この指標は地震の大きさをxとして、f(x)=log_32(x)として表現することができます。

What strategy are you using to get the graph of exponential or logarithmic functions?

指数関数のグラフの作成について説明します。

1. xとyの関係を示す表を作成する
まずは、xとyの関係を占めす表を作成します。xが整数となる点について、5こほど見つけると良いです。
2. 表から抜粋した点をグラフにプロットする
y切片を含むいくつか点(少なくとも3点)をグラフにプロットします。
3. プロットした点をスムースにつなぐ
プロットした点をスムースな曲線で結びます。
4. domainとareaを考慮する
指数関数はグラフの向きがf(x)=b^xのbの大きさによって変化します。bが1より小さい場合はxが大きくなるにつれてyが0に収束し、bが1より大きい場合はxが小さくなるにつれてyが0に収束します。

対数関数の場合も基本的には同様のプロセスで作成します。異なるのはx切片を必ずプロットすることです。
