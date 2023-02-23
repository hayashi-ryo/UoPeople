# unit4

- Sequential Logic.
- Clock.
- Flip-flop gates.
- Registers.
- RAM.

## Goal

- Become familiar with and be able to implement flip flops as memory circuits.
- Become familiar with and be able to implement register circuits.
- Become familiar with and be able to implement RAM circuits.

## Task

- [ ] Peer Assess Unit 3 Assignment.
- [ ] Complete Reading Assignments
  - [ ] Chapter 3:  Sequential Logic (Nisan and Schocken)
  - [ ] Chapter 10: Latches (Tarnoff)
  - [ ] Chapter 12: Introduction to Memory (Tarnoff)
- [ ] Complete and submit Unit 4 Assignment.
- [ ] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [ ] Rate other student’s posts.
- [ ] Take the Self- Quiz.
- [ ] Watch the Optional Video Lectures
- [ ] Post your activities throughout the week in the Learning Journal.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 10: Latches
    - D-latch
  - Chapter 12: Introduction to Memory

- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Chapter 3: Sequential Logic

## Discussion Forum

D-Latch is a simple clocked memory element in which the output is equal to the stored state inside the element.

In D-Latch the state is changed whenever the appropriate inputs change and the clock is asserted. A D-Latch has two inputs and two outputs.

The inputs are the data value to be stored and a clock signal that indicates when the latch should read the value on the data input and store it. The outputs are simply the value of the internal state and its complement.

When the clock input is asserted, the latch is said to be open, and the value of the output becomes the value of the data input. When the clock input is de-asserted, the latch is said to be closed, and the value of the output is whatever value was stored the last time the latch was open.

What is the difference between DFF and D-Latch?

Can one chip be used for constructing the other? Explain.

クラスメイトの皆さんこんにちは。今回のテーマに対する私の理解を説明します。
Dラッチは、クロック入力によって発生した特定のタイミングのデータ入力の値を保持する回路です。そのため、入力の値に応じて出力を変化させたり、状態を記憶させることができません。このような問題点を解決した回路がDフリップフロップです。Dフリップフロップは、入力にデータビットとクロックがある点はDラッチと同様です。異なる点は、出力として二つの値が存在しその値が常に反対の状態である点です。この特性によって、Dラッチでは実現できなかった入力値の状態に応じて出力を変化させることができます。もう少し詳細な内容としては、クロック入力立ち上がりと立ち下がりによって出力をセット/リセットさせる動作等が存在します。また、クロックではなくレベル回路を入力として、1と0の値だけで出力を判定させることも可能です。このように、与えられた入力を、クロックやレベルなどの副次回路の状態によって変化/そのまま出力させることができる点はDラッチとは大きくことなるものとなります。
また、DFFはDラッチを二つ繋げることで実装することができます。二つ目のDラッチの入力を一つ目のラッチの出力とクロック入力の反転値とすることでDフリップフロップの動作を実現することができます。これは、Dラッチがクロック入力の状態に応じて入力値をそのまま出力する特性を利用しています。

## Learning Journal
