# unit4

- Recursion
- Generating recurrence relations
- Solutions to recurrence relations
  - Iteration method
  - Characteristic root method
- 再帰
- 再帰関係の生成
- 再帰関係の解
  - 反復法
  - 特性根法

## Goal

- By the end of this Unit, you will be able to:
  - Discuss recursion and recurrence relation.
  - Demonstrate an understanding of homogeneous and non-homogeneous recurrence relations.
  - Apply iteration and characteristic methods to solve recurrence relations.
- ja
  - 再帰と再帰関係について説明する。
  - 同次および非同次の漸化式の理解を示す
  - 再帰関係を解くために反復法と特性法を適用する

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Math Assignment
- [x] Take Self-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA <https://discretemath.org/ads-latex/ads.pdf>
  - 8.1
  - 8.3
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0 <https://discrete.openmathbooks.org/dmoi3/sec_recurrence.html>
  - 2.4

## Discussion Forum

1. Let's start by discussing what a recurrence relation is. What are the essential characteristics of a recurrence relation? Provide at least two examples to illustrate your points.
2. Next, we will delve into homogeneous and non-homogeneous recurrence relations. What is the difference between these two types of recurrence relations? Provide at least two examples to illustrate the differences between he two.
3. Which type of recurrence relation is easier to solve (homogeneous or non-homogeneous) for calculating the number of paths through the maze, and why? Discuss the reasons behind your answer and provide some examples to illustrate your points.
4. What does it mean to solve a recurrence relation, and what is arrived from it? What are the various methods for solving recurrence relations, and when are they used? Provide some examples to illustrate the solution process for calculating the number of paths.

1. まず、再帰関係とは何かということから始めよう。再帰関係の本質的な特徴は何か。少なくとも2つの例を挙げて説明しなさい。
2. 次に、同種の漸近関係と非同種の漸近関係について説明する。この 2 種類の漸近関係の違いは何か。少なくとも2つの例を挙げて、両者の違いを説明しなさい。
3. 迷路を通る経路の数を計算する場合、どちらのタイプの漸化式関係 (同次式と非同次式) が解きやすいか。また、その理由は何ですか?
4. 漸化式を解くとはどういうことか、また漸化式から何が得られるか。漸化式を解くための様々な方法にはどのようなものがあり、それらはどのような場合に使われるのか。パスの数を計算するための解法について、いくつかの例を挙げて説明しなさい。

1. 再帰関係は、ある項がそれ以前の項に依存している数列や数学的な関係を指します。再帰関係の主な特徴は、初期条件と再帰的な規則です。初期条件は、数列や関係の最初の項に対する値であり、再帰的な規則はそれ以降の項がどのように計算されるかを定義します。再帰関係は通常、次のような形を取ります：
\[ a_n = f(a_{n-1}, a_{n-2}, \ldots, a_1, a_0) \]
ここで、\( a_n \) は数列や関係の第 \( n \) 項であり、関数 \( f \) は再帰的な規則を表しています。初期条件と再帰的な規則を満たすと、数列や関係全体が定義されます。
例えば、フィボナッチ数列は典型的な再帰関係の例です。初期条件は \( F_0 = 0 \) および \( F_1 = 1 \) であり、再帰的な規則は \( F_n = F_{n-1} + F_{n-2} \) です。
もう一つの例として、階乗を求める再帰関係も挙げられます。初期条件は \( 0! = 1 \) および \( n! = n \times (n-1)! \) です。
これらの例は、再帰関係がどのように構築され、数列や関係がどのように進展するかを示しています。

2. 均質再帰関係と非均質再帰関係の主な違いは、非均質再帰関係においては、非同次項が存在する点です。以下にそれぞれの特徴を説明し、例を挙げます。

- 均質再帰関係
  - 特徴: 再帰的な規則において非同次項が存在しない。よって、再帰関係は同次の項のみで構成されている。
  - 例: フィボナッチ数列の再帰関係 \( F_n = F_{n-1} + F_{n-2} \) は均質再帰関係を表す例だ。
- 非均質再帰関係
  - 特徴: 再帰的な規則において、非同次項が素材する。すなわち、自分自身の前の項意外が関与する関係を表す。
  - 例: 線形非同次再帰関係 \( a_n = 2a_{n-1} + 3 \) は非均質再帰関係を表す例だ。ここで、非同次項は定数項の3である。

3. 迷路を通る経路の数を計算する場合は、均質な再帰関係の方が解きやすいと考えます。地点や具体的な方法について議論します。
均質再帰関係の利点
  非同次項が存在しないため、計算をシンプルに行うことが可能です。また、項が前の項飲みに依存するため、予測を行うことが容易になります。
非均質再帰関係の課題
  非同次項が含まれることによって計算が複雑なものになります。数学的手法を用いてもこの複雑な計算は難しい場合が多いです。
具体的な手法を考えると、迷路の各セルは上下左右に進むことが可能です。ここで、均質な再帰関係を利用すれば、各セルが直前のセルにのみ依存するため、直前のセルに到達する条件の数を加算して行くことで計算を行うことが可能です。

4. 漸化式を解くことは、数学的な関係において、数列や数値の項を求めることを指す。このプロセスによって、再帰関係が定義する数学的な構造から特定の項や数列の値を求めることができる。いくつかの代表的なな手法について説明する。
(i) 代入法
漸化式に決定された項の情報を代入することで、再起関係を単純な形に変形して解を求める。
(ii)特性方程式
再帰関係の特性方程式を見つけ、その方程式から解を求める。
(iii)動的計画法
再起的な計算を避けるため、部分問題の結果をメモ化しながら効率的に解を求める。

これらの手法は、漸化式の特性や構造に応じて適切なものを選択する。例えば、経路の数を求める場合には(iii)動的計画法が有効である。

## Math Assignment

1. Explain the recursive function with simple examples.
2. A company manufactures washing machines by importing internal parts from other countries. In the first month, the company produces one washing machine, and in the second month, it produces two machines. Each month, the company assembles the parts to make n machines in the nth month.
  a) Set up a recurrence relation to describe the number of machines produced by the company in the first n months.
  b) How many washing machines are produced by the company in the first year?
  c) Find an explicit formula for the number of washing machines produced by the company in the first n months. Mention the method used to find the formula and show the steps clearly.

ja

1. 再帰関数について簡単な例を挙げて説明しなさい。
2. ある会社は、外国から内部部品を輸入して洗濯機を製造している。最初の月に1台、2ヶ月目に2台の洗濯機を生産する。毎月、同社は部品を組み立て、n 番目の月に n 台の洗濯機を製造する。
  a) 最初の n か月に同社が生産した洗濯機の数を表す漸化式を設定せよ．
  b) その会社が最初の年に生産する洗濯機の台数は何台か．
  c) 会社が最初の n か月間に生産した洗濯機の数を表す明示的な式を求めよ．その公式を求めるために使用した方法に言及し，その手順を明確に示せ．

ans

1. 再帰関数は、関数が自分自身を呼び出すことによって定義される関数のことだ。典型的な例として、階乗を計算する再帰関数を挙げる。階乗は、ある非負整数 n に対して n!（nの階乗）と表され、1から n までの整数をすべて掛け合わせた値です。
階乗の再帰関数をPythonで定義すると以下のようになる。

```python
def factorial(n):
    # ベースケース: 0の階乗は1
    if n == 0:
        return 1
    # 再帰ステップ: n! = n * (n-1)!
    else:
        return n * factorial(n-1)
```

この再帰関数では、ベースケース（nが0のとき）と再帰ステップ（nが0でないとき）が定義されています。ベースケースは再帰を終了させる条件であり、再帰ステップは関数が自分自身を呼び出す部分です。
例えば、`factorial(5)`を計算すると、以下のようになります：

```
factorial(5) = 5 * factorial(4)
             = 5 * 4 * factorial(3)
             = 5 * 4 * 3 * factorial(2)
             = 5 * 4 * 3 * 2 * factorial(1)
             = 5 * 4 * 3 * 2 * 1 * factorial(0)
             = 5 * 4 * 3 * 2 * 1 * 1   # ベースケースに達したので再帰終了
             = 120
```

このようにして再帰的に階乗が計算されます。再帰関数は問題をより小さな部分問題に分解し、それを解いていく手法として広く利用されています。

2.

a) 最初のnヶ月における企業の製造した洗濯機の数を表す再帰関係は以下の通りです：
\[ a_n = a_{n-1} + n \]
ここで、\( a_n \) はn番目の月に製造された洗濯機の数を表します。
b) 企業が最初の年に製造する洗濯機の総数は、最初から12ヶ月までの洗濯機の数を合計すれば良いです。数学的には、次のようになります：
\[ a_{\text{year}} = a_1 + a_2 + \ldots + a_{12} \]
この合計を計算すればよいので答えは78です。

c) 最初のnヶ月における企業が製造した洗濯機の数の明示的な式は、前述の再帰関係を解くことで得られます。具体的な手順は次の通りです：

\[ a_n = a_{n-1} + n \]

この式を解くために、初期条件 \( a_1 = 1 \) を使用します
c) 最初のnヶ月における企業が製造した洗濯機の数の明示的な式を見つける手順を詳しく解説します。元の再帰関係式は以下です：

\[ a_n = a_{n-1} + n \]

ここで、初期条件は \( a_1 = 1 \) です。

手順：

1. **初期条件の代入**: \( n = 1 \) の場合、初期条件 \( a_1 = 1 \) を代入します。
   \[ a_1 = 1 \]

2. **再帰関係の適用**: 再帰関係式 \( a_n = a_{n-1} + n \) を適用します。
   \[ a_2 = a_1 + 2 \]
   \[ a_3 = a_2 + 3 \]
   \[ \vdots \]
   \[ a_n = a_{n-1} + n \]

3. **式の整理**: これらの式を整理していくつかの項を組み合わせます。
   \[ a_2 = 1 + 2 \]
   \[ a_3 = (1 + 2) + 3 \]
   \[ a_4 = ((1 + 2) + 3) + 4 \]
   \[ \vdots \]
   これを簡潔に表現すると次のようになります：
   \[ a_n = 1 + 2 + 3 + \ldots + n \]

4. **等差数列の和の公式の適用**: このような数列の和は、等差数列の和の公式を用いて計算できます。公式は以下です：
   \[ S = \frac{n}{2}(a_1 + a_n) \]
   ここで、\( S \) は和、\( n \) は項の数、\( a_1 \) は最初の項、\( a_n \) は最後の項です。
   この場合、\( a_1 = 1 \)、\( a_n = n \) なので、
   \[ a_n = \frac{n}{2}(1 + n) \]
これにより、最初のnヶ月における企業が製造した洗濯機の数を表す明示的な式が導かれます。

## Learning Journal
