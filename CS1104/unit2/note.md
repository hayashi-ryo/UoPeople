# unit2

- Number systems and Representation
- Binary Addition and Subtraction
- Design of Adder and Subtractor Circuits

## Goal

- Understand the basic concepts of the binary number system
- Understand and be able to implement 1's and 2's complement of binary numbers
- Be able to add and subtract binary numbers
- Be able to implement logic circuits to add and subtract binary numbers

## Task

- [x] Complete Reading Assignments
  - [x] Chapter 3 Binary Math and Number Representations  (Tarnoff).
  - [x] Chapter 2 Boolean Arithmetic (Nisan and Schocken)
- [ ] Complete and submit Unit 2 Assignment.
- [ ] Post your answer to the question in your discussion Forum and follow it up with approximately 3-4 comments to other students’ posts. Rate other student’s posts.
- [x] Take the Self-Quiz.
- [x] Watch Optional Video Lectures
- [ ] Post your activities throughout the week in the Learning Journal and complete the learning journal assignment.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 3: Binary Math and Number Representations
    - 2進数表現について
    - 10進数表現と同様に1+1=10になる
    - 補数
      - 足し合わせて0になる数のこと
      - 1の補数
        - 01を反転させたもの
      - 2の補数
        - 1の補数に1を加えたもの
          - -をつけたものになる
- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Chapter 2: Boolean Arithmetic

## Discussion Forum

- How many gates are used in the implementation of the Xor gate in the Nissan and Schocken textbook?
  - テキストではXORゲートの実装に、ANDゲート2つ、NOTゲート2つ、ORゲート一つの計5つのゲートを利用して実装しています。
- Present your implementation to the Xor chip. How many gates are there in your implementation?
  - 私は、以下のようなXORゲートの実装を考えました。
  - この回路は、テキストよりも少ない回路数でXORゲートを実装する方法を考え、論理式をベースに実装しました。
- Please use engineer's logic and your textook to answer the following:
- Can you think of a more efficient implementation?
- Efficiency is not necessarily the number of gates used. It's all about "following the money." In other words, what does it cost to implement a new gate?
  - 「効率的な」という観点に立った場合に必要な要素として、一つのプリミティブ回路で作り上げることを考えました。もし一つの回路だけで構築することができる場合、大量生産によるコストダウンを実施することができると考えたためです。この概念に則り、XOR回路をNANDゲートのみで実装したものを以下に記載します。

## Written Assignment

## Learning Journal
