# unit6

- Topics:
  - Systems of Linear Equations
  - Systems of Non-Linear Equations

## Goal

- By the end of this Unit, you will be able to:
  - Solve systems of linear equations.
  - Solve systems of non-linear equations.
  - Examine graphs for information about equations.

## Task

- [x] Reading assignment
- [x] Peer assess Unit 5 Written Assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

### Discussion Forum

私は以下の3つの方程式を作成しました。
2x+3y−z=−3
−x+2y+2z=1
x+y−z=−2
この3つの方程式を拡張行列で表現すると以下となる。

$$\left[\begin{array}{ccc|c}
2 & 3 & -1& -3\\
-1& 2 & 2 & 1 \\
1 & 1 & -1 & -2
\end{array}\right]
$$

行列演算によって計算を行う場合、row-echelon formと呼ばれる形式へ変更することを目指します。row-echelon formはテキストによると以下の形式で示される。
$$\left[\begin{array}{ccc|c}
1 & A_1 & A_2& A_3 \\
0 & 1 & B_1 & B_2\\
0 & 0 & 1 & C_1
\end{array}\right]
$$
この形式を得るための過程について以下に記載する

1. 1行1列目を1にするために、1行目と3行目を入れ替える。

$$R_1 \leftrightarrow R_3 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -1 & -2\\
-1& 2 & 2 & 1 \\
2 & 3 & -1& -3
\end{array}\right]
$$

2. 2行一列目をを0にした上で、2列を1にする

$$R_1 + R_2 = R_2 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -1 & -2\\
0 & 3 & 1 & -1 \\
2 & 3 & -1& -3
\end{array}\right]
$$

$$R_2/3 = R_2 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -2 & -2\\
0 & 1 & 1/3 & -1/3 \\
2 & 3 & -1& -3
\end{array}\right]
$$

3. 3行1列目と2列を0にする。その上で3列目を1にする。
$$-2R_1+R_3 = R_3 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -2 & -2\\
0 & 1 & 1/3 & -1/3 \\
0 & 1 & 1& 1
\end{array}\right]
$$
$$-R_1+R_3 = R_3 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -2 & -2\\
0 & 1 & 1/3 & -1/3 \\
0 & 0 & 2/3& 4/3
\end{array}\right]
$$

$$3/2*R_3 = R_3 \rightarrow
\left[\begin{array}{ccc|c}
1 & 1 & -2 & -2\\
0 & 1 & 1/3 & -1/3 \\
0 & 0 & 1& 2
\end{array}\right]
$$
よって、z=2が求められた。この結果から、yとxも求めることができ、今回の方程式の解は(x,y,z)=(1,-1,2)となる。
この方程式をグラフに示したものを以下に記載する。

グラフを観察すると、3つの平面が1点で交わっていることがわかる。
次の設問として、私はNo2を選択しました。今回私が与えた関数二つをグラフに表示すると以下のようになります。

このグラフを観察すると、二つの平面ではなく、一つの平面と一つの線でグラフが表される場合があります。これは、この方程式の解がこの線分上の全ての点を通ることを示しており、今回のユニットで学習した平面の交差を確認することができました。

### Learning Journal

Reflect on the concepts of linear and non-linear systems. What concepts (only the names) did you need to accommodate the concept of linear and non-linear systems in your mind?
今回のユニットで学んだ線形システムと非線形システムについて、私の理解を説明します。

1. 線形システム
一次方程式二つによって表現されるものであり、直線のみがグラフとして表現されます。このシステムでは、方程式の解、すなわちグラフの交点は最大1つ持ちます。

2. 非線形システム
線形システムと異なり、方程式の最高次数が二次以上になっているもののことを指します。このシステムでは、グラフが放物線などの形となるため、グラフの交点が1つだけではなく、二つ以上存在する場合があります。

What are the simplest linear system and non-linear system you can imagine?
最も単純なシステムについてそれぞれ説明します。

1. 線形システム
最も単純なものは、原点を交点とする以下ふたつの方程式で表現されるシステムだと思います。
y=x
y=-x
このシステムは、原点を交点とするだけではなく直角に交差していることもわかります。

2. 非線形システム
単純な例として以下の方程式を考えました。
y=(x-2)^2
y=x
このシステムは、x=1とx=4を交点に持つ、非常に基本的なシステムを示します。

In your day to day, is there any occurring fact that can be interpreted as linear systems and non-linear systems?
身の回りの例について説明します。

1. 線形システム
固定費と変動費を利用した、損益の計算式は身の回りで最も基本的な線形システムです。私の会社の場合では、会社のオフィスの費用や電気代が固定費であり、人件費が変動費です。また、一人あたりどの程度の利益を上げることができるのか、ということを加えて考えることで、損益分岐点や単純な利益を計算することができます。

2. 非線形システム
具体的な例ではなく、私が知っている計算で非線形システムのものがあります。ある速度を持った物体のエネルギーは二次方程式で表現されます。それに対して、もともと持っていたエネルギを付与するシステムは非線系なものとなります。

What strategy are you using to get the graph of linear systems and non-linear systems?
今回のユニットで学んだこととして、グラフを得ること自体は重要でないと考えています。重要なのは、グラフからどのようなことを得ることができるのか、という点です。
例えば、非線形システムは交点を持たない場合があるとします。これは、ふたつのグラフは並行であることを示しており、どちらの方程式も同等の比率で増加していきます。また、非線形システムで2つの交点を持つ場合は、どのような設定がなされているのかという点に左右されますが、二つの交点の間の値は、システムとしてとりうる点だ、という議論ができる可能性が高いです。

### Programming Assignment
