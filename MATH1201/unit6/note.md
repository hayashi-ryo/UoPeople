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
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz
- [ ] Take Graded-Quiz

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

### Programming Assignment
