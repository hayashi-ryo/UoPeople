# unit3

- Elementary Data Types
  - Encoding ASCII and UNICODE
  - Integers and Integer Math
    - Binary and Two’s complement
    - Integer math addition, subtraction, multiplication, division
    - Overflows
  - Enumeration types
  - Character types
  - Boolean
  - Expressions: Evaluation and Order of Operations
  - Assignments
- Composite Data Types
  - Records
  - Arrays
  - References
  - String type
  - Multi-dimensional arrays
  - Bitwise computation
  - Big and little endians
- Variables, Binding, and Scope

## Goal

main

- Define and understand the implementation of elementary data types within programming languages
- Define and understand the implementation of assignments and expressions within programming languages
- Define and understand the implementation of composite data types such as records, arrays, strings, multi-dimensional arrays
- Define and understand the implementation of various reference types within programming languages
- Be able to implement bitwise computation using data types within programming languages
- Understand the concepts of big and little endians and be able to articulate why they are important

ja

- プログラミング言語における基本データ型の実装を定義し理解する
- プログラミング言語における代入および式の実装を定義し理解する
- レコード、配列、文字列、多次元配列などの複合データ型の実装を定義し理解する
- プログラミング言語におけるさまざまな参照型の実装を定義し理解する
- プログラミング言語におけるデータ型を使用してビット単位の演算を実装できる
- ビッグエンディアンとリトルエンディアンの概念を理解し、その重要性を明確に説明できる

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Exercise assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

Ben-Ari, M. (2006). Understanding programming languages. Weizman Institute of Science.
  Read the following chapters:
    Chapter 4 - Elementary Data Types
    Chapter 5  - Composite Data Types
    Chapter 7  - Section 4 (7.4)
    Chapter 9  - Real Numbers

Introduction to Static and Dynamic Typing  By Premshree Pillai: <http://www.sitepoint.com/typing-versus-dynamic-typing/>

Little endian vs. big endian by James M. Curran: <https://www.noveltheory.com/TechPapers/endian.html>

Lecture 6: Bindings by Benjamin J. Keller of the Department of Computer Science, Virginia Tech available at: <http://courses.cs.vt.edu/~cs3304/Spring02/lectures/lect06.pdf>

Lecture notes in Programming Language Theory by Nancy E. Reed of the University of Hawaii available at: <https://pdfs.semanticscholar.org/ce14/aff89ec1e53c5df86cfabe607cb33af3a54d.pdf>

Programming Languages Session 2 – Main Theme Imperative Languages: Names, Scoping, and Bindings by Dr. Jean-Claude Franchitti of New York University available at: <http://www.nyu.edu/classes/jcf/g22.2110-001_sp11/slides/session2/ImperativeLanguages-NamesScopingAndBindings.pdf>

## Discussion Forum

Question 1: Assume that you are the instructor.  Prepare a short written lecture that describes Big Endian, Little Endian and the advantages and disadvantages of each approach.

Question 2: In this unit, we discussed integer data types and integer math.  One of the concepts that we learned about was an overflow.  As part of your response describe what an overflow is an how it occurs.  Conduct research on the internet and based upon your research, describe some of the problems that overflow causes there are many but one area that you should research (among others) is the concept of integer based security attacks.

質問1:
あなたが講師だと仮定してください。Big EndianとLittle Endianについて、それぞれの利点と欠点を説明する短い講義文を書いてください。

質問2:
このユニットでは、整数データ型と整数演算について学びました。その中で、オーバーフローという概念についても学びました。回答の一環として、オーバーフローとは何か、そしてそれがどのように発生するかを説明してください。インターネットで調査を行い、その調査に基づいて、オーバーフローが引き起こす問題について説明してください（多くの問題がありますが、その中でも「整数型に基づくセキュリティ攻撃」の概念について調査してください）。

### Japanese Discussion

## Exercise Assignment

### Exercise 1:  Binary Math and 2’s Complement Problems

Convert the following decimal integers to binary:

a. 2
b. 27
c. 128
d. 31
e. 245
f. 127
g. 17
h. 257

Given the binary number 11011011, what is its decimal value if it is a:

a. unsigned binary number
b. sign and complement number
c. 2's complement number

Convert +24 into a 2's complement number.

After completing each of these problems check your answers with the answer key below.

Convert the following decimal integers to binary:

a. 2 = 102
b. 27 = 110112
c. 128 = 100000002
d. 31 = 111112
e. 245 = 111101012
f. 127 = 11111112
g. 17 = 100012
h. 257 = 1000000012

Given the binary number 11011011, what is its decimal value if it is a:

a. unsigned binary number Ans: 219
b. sign and complement number Ans: -91
c. 2's complement number Ans: -37

Convert +24 into a 2's complement number.

Ans: 011000 Note the leading zero!

### Exercise 2:  Character encoding in Unicode

Using the following converter, spell your first name (or the first 6-7 characters of your name if you have a long first name) using Unicode equivalent characters encoded to UTF-16 (16-bit representation of the Unicode character) and converted into binary.

You can use the following URL <http://unicodinator.com/#Block-Basic_Latin>  to determine the Unicode equivalent of each letter in your name (unless of course your name uses icons from a non-Latin character set that doesn’t map to letters).

An example is the name Dr. Taipala, which translates into the Unicode characters:

D          r       .                  T           a      I           p          a      l           a

0044 0072 002E 0020 0054 0061 0069 0070 0061 006C 0061

in Hexdecimal

in Binary

00000000 01000100 00000000 01110010 00000000 00101110 00000000 00100000 00000000 01010100 00000000 01100001 00000000 01101001 00000000 01110000 00000000 01100001 00000000 01101100 00000000 01100001

You might have noticed that each character translates into two 8 bit bytes and the value of the first byte is 0. The reason that this occurs is that the name Dr. Taipala uses only Latin characters.  If, for example, you were to write your name using Arabic, you would need to use the code page represented by hexadecimal 06 so the first 8 bits would contain binary 00000110 .

### Japanese Written Assignment

## Learning Journal

The Learning Journal is a tool for self-reflection on the learning process. In addition to completing directed tasks, you should use the Learning Journal to document your activities, record problems you may have encountered and to draft answers for Discussion Forums and Assignments. The Learning Journal should be updated regularly (on a weekly basis), as the learning journals will be assessed by your instructor as part of your Final Grade.

Your learning journal entry must be a reflective statement that considers the following questions:

- Describe what you did. This does not mean that you copy and paste from what you have posted or the assignments you have prepared. You need to describe what you did and how you did it.
- Describe your reactions to what you did
- Describe any feedback you received or any specific interactions you had. Discuss how they were helpful
- Describe your feelings and attitudes
- Describe what you learned

Another set of questions to consider in your learning journal statement include:

- What surprised me or caused me to wonder?
- What happened that felt particularly challenging? Why was it challenging to me?
- What skills and knowledge do I recognize that I am gaining?
- What am I realizing about myself as a learner?
- In what ways am I able to apply the ideas and concepts gained to my own experience?

Finally, describe one important thing that you are thinking about in relation to the activity.

Answer all questions that apply, however, you are expected to complete the Learning Journal assignment in 400-600 words.

### Japanese Learning Journal

1. 今週の概要
今週は、プログラミング言語における基本的なデータ型（Elementary Data Types）と複合データ型（Composite Data Types）、および変数のバインディングとスコープについて学びました。基本的なデータ型では、ASCIIとUNICODEのエンコーディング、整数演算（加算、減算、乗算、除算、オーバーフローを含む）、列挙型、文字型、ブール型などが取り上げられました。特に、演算の評価順序や式と代入の仕組みに関する理解が重要でした。複合データ型においては、レコード、配列、参照型、文字列型、多次元配列、ビット演算、エンディアン（ビッグエンディアンとリトルエンディアン）に加え、それぞれの実装方法と重要性についても触れました。
学習目標として、これらのデータ型と演算の仕組みを定義し、実装方法を理解することが掲げられ、特にビット演算やエンディアンの概念について深く学びました。また、ディスカッション課題ではオーバーフローとエンディアンに関連する問題が出され、これらの知識の応用力を求められました。

2. 自分の感想
今週の内容は、基本的なデータ型と複合データ型の理解に焦点が当てられており、プログラミングの基礎を固めるために非常に重要だと感じました。特に、オーバーフローの概念やそれが引き起こすセキュリティリスクについての学習は、プログラムの安全性を考慮する上で欠かせない知識だと気づきました。また、エンディアンの違いがデータ処理やファイルフォーマットに与える影響を知り、これらの基本概念が実際のプログラミングにどのように影響するのかを理解できたことが有益でした。
一方で、ビット演算や多次元配列の仕組みを理解するのに時間がかかり、特にエンディアンの違いが具体的にどのように適用されるのかを明確にイメージするのが難しかったです。今後は、実際のコードを通じてこれらの概念をより深く理解したいと思います。

3. 特に深く学習したこと
今週、特に深く学習したのはエンディアンの概念とオーバーフローの影響です。エンディアンについては、ビッグエンディアンとリトルエンディアンの違いがデータのメモリ表現にどのように影響を与えるかを学びました。具体的には、ビッグエンディアンが直感的で人間にとって読みやすい一方で、リトルエンディアンは特定のアーキテクチャで効率的であることが分かりました。また、それぞれのアプローチの長所と短所を比較することで、どのような場面で適切な選択が求められるかについても考えました。
オーバーフローについては、特に整数型での演算中に発生する問題とその影響を掘り下げました。インターネットリサーチを通じて、オーバーフローが原因で発生するセキュリティ攻撃（例えばバッファオーバーフロー攻撃）について学び、これが現実世界でのプログラムの脆弱性につながる可能性があることを理解しました。これらの学びを通じて、単なる理論的知識ではなく、現実のプログラムにおける実践的な注意点を意識するようになりました。

4. 今後の課題と来週に向けて
来週は制御構造や再帰、サブプログラムについて学習する予定です。これらはプログラムのフローを制御する上で欠かせない概念であり、特に再帰とスタックアーキテクチャの理解が重要だと予想されます。また、データの渡し方（値渡しと参照渡し）の違いについても深く学びたいと思います。
今後の課題として、今週学んだデータ型や演算の概念をさらに実践的に使いこなすことを挙げています。具体的には、実際のプログラムを書きながら、ビット演算やエンディアンの影響をより具体的に体験し、それを基に理解を深めることを目指します。また、来週の学習内容に備えて、事前に再帰やサブプログラムの基本概念を復習する予定です。
