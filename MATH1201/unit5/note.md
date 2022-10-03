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
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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

### Learning Journal

### Programming Assignment
