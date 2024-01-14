# unit2

- Definition of a Function, Description, Domain, Codomain, and range
- Injective, Surjective, and Bijective Functions, Identity, and Inverse
- Composition of functions
- Sequences- arithmetic and geometric sequences

## Goal

- By the end of this Unit, you will be able to:
  - Explain functions, domain, codomain, and range.
  - Recognize the image of an element under a function and find the inverse function.
  - Identify and explain functions as injective, surjective, or bijective.
  - Apply composition of functions to a real-world problem.
  - Calculate the partial sum of infinite sequences.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [ ] Math Assignment
- [x] Take Self-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA <https://discretemath.org/ads/chapter_7.html>
  - Read Chapter 7 - Functions, sections 7.1, 7.2, and 7.3 to learn the concepts of functions with counter examples and composition of mappings. Attempt the exercise problems from this section for a better understanding of the concepts.
    - 7.1 Definition and Notation
      - 普遍的な関数の定義は、ある値が特定の一意の値へ変化する関係のこと
        - この概念は集合にも適用される。
    - 7.2 Properties of Functions
      - 単射関数
        - 入力が一つの出力に定義される関数
      - 全射関数
        - 全ての入力が異なる出力に定義される関数
      - 鳩の巣原理
        - 鳩の巣より鳩の方が多い場合、どのような場合でも2羽以上の鳩が同じ巣を共有する必要があることから
    - 7.3 Function Composition
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0 <https://discrete.openmathbooks.org/dmoi3/>
  - In Chapter 0 – Introduction and Preliminaries, read section 0.4 to understand the concepts: describing functions, surjective function, injective function, bijective function, inverse, and the images of elements.
  - In Chapter 2 – Sequences, read sections 2.1 and 2.2 that covers: sequences, describing sequences, closed formulae for sequences and to find the sum of infinite sequences by using basic arithmetic and geometric sequences. This lays the foundation for recursive functions and recurrence relations that you will explore in Unit 4. Ensure that you go through these topics, including the examples. Attempt solving all the questions in the exercises.

## Discussion Forum

(i) Make sure you use a two-lined representation of a function using the sets A and B of your choice and include the following items in your discussion:

How did you determine that it is indeed a function?
Share your opinion on whether it is one-one and onto explain, why?
Does it have an inverse? Justify your choice with the above representation.
Discuss the images of each element in the function you defined.
(ii) Explain the concepts of function, injective function, surjective function, and bijective function, and provide examples and counterexamples for each.

(i) 選択した集合AとBを用いて、必ず関数を2行で表現し、以下の項目を含めて論述しなさい：
  それが本当に関数であるとどのように判断しましたか？
  それが1-1であるかどうかについてのあなたの意見を述べ、その理由を説明してください。
  逆関数はあるか？上記の表現を用いて、あなたの選択を正当化しなさい。
  あなたが定義した関数の各要素のイメージについて説明しなさい。
(ii) 関数、射影関数、外積関数、両対称関数の概念を説明し、それぞれについて例と反例を示しなさい。

クラスメートの皆さん、こんにちは。
(i)(ii)それぞれの質問に対する私の理解を説明します。
(i)
私は二つの集合として以下を考え、それが関数であるかを議論することととします。
A={-1,0,1,4,10}
B={-2,0,2,8,20}

f=\begin{pmatrix}
-1 & 0 & 1 & 4 & 10\\
-2 & 0 & 2 & 8 & 20 \\
\end{pmatrix}
Levinによれば、関数とは各入力を一つの出力を割り当てるルールのことを指します。今回の例では、入力となる集合Aがそれぞれ集合Bの各要素のみに対応していることから、関数であることが判断できます。
また、この関数は異なるAの要素が異なるBの要素に重複せず対応しています。このことから、この関数はone-one対応(単射)であると言えます。さらに、単射であることは逆関数が存在していることを示します。今回私の考えた例に対する逆関数f^-1は以下になります。
f^-1=\begin{pmatrix}
-2 & 0 & 2 & 8 & 20 \\
-1 & 0 & 1 & 4 & 10\\
\end{pmatrix}

(ii)
一つ一つ説明していきます。

1. 関数（Function）:
   - 概念: (i)で説明した通り、集合AとBが与えられた時に、Aの各要素に対してただ一つのBの要素が対応する関係のことを関数と呼びます。
   - 例: \(f: \mathbb{R} \to \mathbb{R}\)、\(f(x) = x^2\)。各実数に対してその二乗を返す関数。
   - 反例: \(g: \mathbb{R} \to \mathbb{R}\)、\(g(x) = \pm \sqrt{x}\)。この関数は負の実数に対して定義されていないため関数ではありません。

2. 単射関数（Injective Function）:
   - 概念: 異なる要素が異なる要素に対応する関数。すなわち、異なるAの要素に対して、異なるBの要素が対応する。
   - 例: \(h: \mathbb{R} \to \mathbb{R}\)、\(h(x) = 2x\)。異なる実数に異なる実数が対応する。
   - 反例: \(k: \mathbb{R} \to \mathbb{R}\)、\(k(x) = x^2\)。この関数は異なる実数に同じ実数が対応する。

3. 全射関数（Surjective Function）:
   - 概念: Bの全ての要素が何らかのAの要素に対応している関数。
   - 例: \(p: \mathbb{R} \to \mathbb{R}\)、\(p(x) = x^3\)。任意の実数に対して、その実数の立方が対応する。
   - 反例: \(q: \mathbb{R} \to \mathbb{R}\)、\(q(x) = e^x\)。この関数は負の実数に対応する要素が存在しないため全射ではない。

4. 全単射関数（Bijective Function）:
   - 概念: 単射かつ全射である関数。異なるAの要素に異なるBの要素が対応し、かつBの全ての要素が何らかのAの要素に対応している。
   - 例: \(f: \mathbb{R} \to \mathbb{R}\)、\(f(x) = 2x\)。異なる実数に異なる実数が対応し、かつ全射である。
   - 反例: \(g: \mathbb{R} \to \mathbb{R}\)、\(g(x) = x^2\)。単射ではあるが、全射ではない。

## Math Assignment

単射性、全射性および逆関数について確認する
(i)単射性
関数が単射的であるためには、範囲内の異なる要素が異なる要素に対して出力されることを指します。与えられた関数で異なる奇数a,bを考えます。
f(a)=a+3 , f(b)=b+3
となり、aとbは異なる値であるために出力であるf(a)とf(b)も異なることがわかります。偶数に対しても同様となるため、与えられた関数は単射的です。
(ii)全射性
関数が全射的であるためには、コドメイン内の全ての要素がドメイン内のある要素によって出力値となることが必要です。
任意の値yを考えます。もしyが奇数であるならば、ある奇数xによってy=x+3となります。yが偶数の場合もある偶数xによってy=x-5となります。このように、どのような値yについてもドメイン内のある要素によって出力されます。したがって、与えられた関数は全射的です。
(iii)逆関数
ある関数について逆関数が存在するためには、任意の出力yとなるxがただ一つ存在する必要があります。与えられた関数は全単車の条件を満たしているため、逆関数が存在することがわかります。
逆関数g(x)を見つけるためには、入力と出力の役割を入れ替えれば良いので以下のように表現することができます。

\[ g(n) = \begin{cases} n - 3 & \text{if } n \text{ is odd} \\ n + 5 & \text{if } n \text{ is even} \end{cases} \]

三つの集合A、B、Cを考え、それぞれ3つの要素を持つとし、集合AからBへの関数fと、集合BからCへの関数gを特定の要素への写像を指定して定義します。集合A、B、Cを次のように定義します：

\[ A = \{a_1, a_2, a_3\} \]
\[ B = \{b_1, b_2, b_3\} \]
\[ C = \{c_1, c_2, c_3\} \]

関数\( f: A \rightarrow B \)を次のように定義します：

\[ f(a_1) = b_1, \quad f(a_2) = b_2, \quad f(a_3) = b_3 \]

関数\( g: B \rightarrow C \)を次のように定義します：

\[ g(b_1) = c_1, \quad g(b_2) = c_2, \quad g(b_3) = c_3 \]

そして、関数fogおよびgofの合成について議論します。

- **fog (gにfを合成):**
   \[ (fog)(a) = g(f(a)) \]
   \[ (fog)(a_1) = g(f(a_1)) = g(b_1) = c_1 \]
   \[ (fog)(a_2) = g(f(a_2)) = g(b_2) = c_2 \]
   \[ (fog)(a_3) = g(f(a_3)) = g(b_3) = c_3 \]

- **gof (fにgを合成):**
   \[ (gof)(a) = f(g(a)) \]
   \[ (gof)(b_1) = f(g(b_1)) = f(c_1) \]
   \[ (gof)(b_2) = f(g(b_2)) = f(c_2) \]
   \[ (gof)(b_3) = f(g(b_3)) = f(c_3) \]

等しいかについて確認していきます。
\[ (fog)(a_i) = c_i \]
\[ (gof)(b_i) = f(c_i) \]

もしすべての\( i = 1, 2, 3 \)に対して \( f(c_i) = c_i \) であれば、fogとgofは等しいです。そうでなければ、等しくありません。この条件を満たすためには、fがCからの逆関数が存在する必要があります。

1. 学生から点数への写像と点数から成績への写像を定義します：

- 学生から点数への写像 \( S \):
   \[ S(\text{Ani}) = 75, \quad S(\text{Leon}) = 60, \quad S(\text{Linh}) = 85, \]
   \[ S(\text{Liam}) = 95, \quad S(\text{Abdul}) = 60 \]

- 点数から成績への写像 \( M \):
   \[ M(75) = \text{B}, \quad M(60) = \text{C}, \quad M(85) = \text{B+}, \]
   \[ M(95) = \text{A}, \quad M(60) = \text{C} \]

それでは、これらの関数の定義域と値域を考えます。

- \( S \) の定義域：\(\{\text{Ani}, \text{Leon}, \text{Linh}, \text{Liam}, \text{Abdul}\}\)
- \( S \) の値域：\(\{75, 60, 85, 95\}\)

- \( M \) の定義域：\(\{75, 60, 85, 95\}\)
- \( M \) の値域：\(\{\text{B}, \text{C}, \text{B+}, \text{A}\}\)

次に、これらの関数を用いて合成関数を作成します。

合成関数 \( M \circ S \) は、学生から成績への写像です：
\[ (M \circ S)(\text{Ani}) = M(S(\text{Ani})) = M(75) = \text{B} \]
同様に、他の学生についても同様に計算できます。

次に、合成関数 \( S \circ M \) を考えます：
\[ (S \circ M)(75) = S(M(75)) = S(\text{B}) \]
同様に、他の成績についても同様に計算できます。

これらの合成関数はともに定義されていますが、合成の順序が異なるため、\( M \circ S \) と \( S \circ M \) が等しいかどうか確認する必要があります。

\( M \circ S \) の場合：
\[ (M \circ S)(\text{Ani}) = \text{B}, \quad (M \circ S)(\text{Leon}) = \text{C}, \]
\[ (M \circ S)(\text{Linh}) = \text{B+}, \quad (M \circ S)(\text{Liam}) = \text{A}, \quad (M \circ S)(\text{Abdul}) = \text{C} \]

\( S \circ M \) の場合：
\[ (S \circ M)(75) = \text{Ani}, \quad (S \circ M)(60) = \text{Leon}, \]
\[ (S \circ M)(85) = \text{Linh}, \quad (S \circ M)(95) = \text{Liam}, \quad (S \circ M)(60) = \text{Abdul} \]

合成関数 \( M \circ S \) と \( S \circ M \) は異なる結果を与えるため、合成の順序が可換ではありません。これは、関数 \( S \) と \( M \) がそれぞれの順序で異なる写像を行うためです。

それぞれの概念について私の理解を説明します。
**数列 (Sequence):**

- 数列は、数の順序付きのリストです。たとえば、フィボナッチ数列は典型的な例です。
- 例: フィボナッチ数列 (1, 1, 2, 3, 5, 8, 13, 21, ...)

**再帰関数 (Recursive Function):**

- 再帰関数は、関数が自分自身を呼び出す方法で定義される関数です。階乗関数は再帰的な例です。
- 例: 階乗関数
     \[ n! = n \times (n-1)! \]
     この式の中で、\( (n-1)! \) 部分が同じ関数を再帰的に呼び出しています。

**数列の閉じた公式 (Closed Formula for the Sequence):**

- 閉じた公式は、数列の任意の項を計算するための式です。フィボナッチ数列に対する閉じた公式を考えましょう。
- 例: フィボナッチ数列の閉じた公式
     \[ F_n = \frac{{\phi^n - (1 - \phi)^n}}{{\sqrt{5}}} \]
     ここで、\(\phi\) は黄金比です。

**等差数列 (Arithmetic Sequence):**

- 等差数列は、各項が前の項に一定の差を足すことで生成される数列です。例として、初項が3で公差が4の等差数列を考えましょう。
- 例: 等差数列 (3, 7, 11, 15, ...)

**等比数列 (Geometric Sequence):**

- 等比数列は、各項が前の項に一定の比率をかけることで生成される数列です。初項が2で公比が3の等比数列を考えましょう。
- 例: 等比数列 (2, 6, 18, 54, ...)

i. **閉じた公式と次の4つの項：**

- 与えられた数列は、\(n\) が偶数のときは \(n/2\)、奇数のときは \((n+1)/2\) に対応する順番に数字を増やしていくことで生成されています。
- 閉じた公式: \(a_n = \frac{n + (-1)^n}{2}\)
- 次の4つの項: \(13, 14, 14, 15\)

ii. **次の3つの項と閉じた公式、および最初のn項の和:**

- 与えられた系列は、初項が6で公比が6の等比数列です。
- 閉じた公式: \(a_n = 6^n\)
- 次の3つの項: \(6^5, 6^6, 6^7\)
- 最初のn項の和の式: \(S_n = \frac{6(6^n - 1)}{5}\)

iii. **次の3つの項と閉じた公式、および最初のn項の和:**

- 与えられた系列は、初項が21で公差が3の等差数列です。
- 閉じた公式: \(a_n = 21 + 3(n-1)\)
- 次の3つの項: \(30, 33, 36\)
- 最初のn項の和の式: \(S_n = \frac{n}{2}(2a_1 + (n-1)d)\)

## Learning Journal
