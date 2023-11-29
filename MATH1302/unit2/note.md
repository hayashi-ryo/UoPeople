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

## Learning Journal
