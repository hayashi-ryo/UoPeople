# unit8

- Properties of Operations
- Algebraic Systems and Abelian Groups
- Properties of Groups
- Division Algorithm and Modular Arithmetic
- 演算の性質
- 代数系とアーベル群
- 群の性質
- 除算アルゴリズムとモジュラー算術

## Goal

- By the end of this Unit, you will be able to:
  - Describe algebraic structures.
  - Explain the properties of operations and groups.
  - Apply Modular arithmetic and division algorithm.
- ja
  - 代数的構造を説明する。
  - 演算と群の性質を説明する
  - モジュラー演算と除算アルゴリズムを適用する

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Math Assignment
- [x] Take Self-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). <https://discretemath.org/ads/chapter_8.html>
  - Chapter 11
    - 11.1
    - 11.2
    - 11.3
    - 11.4

## Discussion Forum

For this assignment, we will explore the basic algebraic structure group. As we near the end of this course, we assume that you are well acquainted with the notations of different number systems such as ℤ, ℝ, ℕ, and ℚ.
Your task is to provide an example and a counter-example of the Abelian group by choosing any number system (mentioned above) and any algebraic operation such as addition (+), subtraction (-), multiplication (×), division (÷), addition modulo ( +_n ), or multiplication modulo (n X_n ).

この課題では、基本的な代数的構造群を探究する。このコースも終わりに近づき、ℤ, ℕ, ℚ, ↪Lu_211D などのさまざまな数系の表記法についてよく理解していると仮定する。
あなたの課題は、（上記の）任意の数系と、加算（+）、減算（-）、乗算（×）、除算（÷）、加算モジュロ（+_n ）、乗算モジュロ（n X_n ）などの任意の代数演算を選択して、アーベル群の例と反例を示すことである。

ans

クラスメートの皆さん、こんにちは。
今回の質問に対する私の回答を説明します。

まず、アーベル群の定義から開始します。アーベル群とは以下の特徴を持つ群のことです。
・閉じている
・結合法則／交換法則が成り立つ
・各要素が逆元を持つ群
これらの性質を踏まえ、減算を例に取って説明します。
減算を選択した理由としては、減算が非常に日常的な操作であるためです。また、減算は加算の逆操作として理解されることも多いため、加算を踏まえた上で学習することが群の概念を深く理解することにつながると考えました。
ここからは減算の操作に対して、アーベル群を形成する例と反例を説明します。
アーベル群を形成する例・反例
結論として、減算はどのような群に対してもアーベル群を形成しません。これは、減算がアーベル群のいくつかの定義を満たさないからです。
閉性: 群の演算は集合内で閉じていなければなりません。しかし、減算は特定の数の集合（例えば自然数）においては閉じていません。例えば、自然数の集合で5-7のような演算は自然数の範囲外になります。
結合法則: 三つの要素に対して演算を行った場合、その順序に依存せず結果が同じでなければなりません。減算は結合法則に従いません。例えば、(7-5)-3 ≠ 7-(5-3)です。
単位元の存在: 任意の元aに対して、ある元e（単位元）が存在し、aとeの演算結果がa自身となる必要があります。減算にはこのような単位元が存在しません。
各要素の逆元の存在: 任意の元aに対して、ある元bが存在し、aとbの演算結果が単位元となる必要があります。減算では、このような逆元が定義できません。
交換法則: 任意の二つの要素aとbに対して、aとbの演算結果がbとaの演算結果と同じでなければなりません。減算は交換法則に従いません（例: 5-3 ≠ 3-5）。

## Math Assignment

1. Choose a pair of two-digit numbers and find their greatest common divisor. Show the steps.
最大公約数とは二つの数が共通して持つ最大の約数のことです。今回は例として、「24」と「60」を選択し、最大公約数を見つけます。手順としてはユークリッドの互除法を利用しました。手順を説明します。
60を24で割ります。60 ÷ 24 = 2 余り 12
次に、24を先ほどの余り12で割ります。24 ÷ 12 = 2 余り 0
余りが0になった時点で、最後の除数（この場合は12）が24と60の最大公約数になります。

2. Choose any one modular arithmetic operation (addition modulo  +_n   or multiplication modulo n X_n  ) from the set of positive integers ℤ (for example, ℤ5= {0,1,2,3,4} do not use the same example with your choice of n. Find the identities and inverses of all elements with respect to the operation you choose. If they do not exist, explain why. You can use an operation table to explain your reasoning. (The table can be drawn using MS Word.)
加算モジュロ7を選択し、等元と各要素の逆元を見つけます。この場合、正の整数の集合はℤ7 = {0, 1, 2, 3, 4, 5, 6}です。
恒等元の特定:
加算モジュロ7における恒等元は0です。これは、任意の要素aに対して、a + 0 ≡ a (mod 7) となるためです。
逆元の特定:
0の逆元は0自身です（0 + 0 ≡ 0 (mod 7)）
1の逆元は6です（1 + 6 ≡ 0 (mod 7)）
2の逆元は5です（2 + 5 ≡ 0 (mod 7)）
3の逆元は4です（3 + 4 ≡ 0 (mod 7)）
4の逆元は3です（4 + 3 ≡ 0 (mod 7)）
5の逆元は2です（5 + 2 ≡ 0 (mod 7)）
6の逆元は1です（6 + 1 ≡ 0 (mod 7)）

3. Find and explain solution for the equation x2+ 5x +1 = 0 in ℤ3, the integers modulo 3.
Use APA citations and references if you use ideas from the readings or other sources.
ℤ3は {0, 1, 2} の集合です。この問題では、方程式の各項を3で割った余りを考慮します。方程式をモジュロ3に適用すると、x^2 + 5x + 1 ≡ 0 (mod 3) となります。ここで、5 ≡ 2 (mod 3) ですので、方程式は x^2 + 2x + 1 ≡ 0 (mod 3) と単純化できます。
次に、ℤ3の各要素（0, 1, 2）を方程式に代入して、どれが方程式を満たすかを確認します。
x = 0 の場合：
0^2 + 2×0 + 1 ≡ 1 (mod 3)
1 ≢ 0 (mod 3)
よって、x = 0 は解ではありません。
x = 1 の場合：
1^2 + 2×1 + 1 ≡ 4 ≡ 1 (mod 3)
1 ≢ 0 (mod 3)
よって、x = 1 も解ではありません。
x = 2 の場合：
2^2 + 2×2 + 1 ≡ 9 ≡ 0 (mod 3)
0 ≡ 0 (mod 3)
これは方程式を満たすため、x = 2 は解です。
結果として、ℤ3における方程式 x^2 + 5x + 1 = 0 の解は x = 2 です。
