# unit3

- Combinational Logic
- Multiplexors and De-Multiplexors
- Decoders
- Counters
- ALU (Arithmetic Logic Unit)
- ALU Design

## Goal

- Learn the basics of combinational logic
- Become familiar with the use and operation of multiplexors, demultiplexors, decoders and counter circuits.
- Become familiar and implement the centerpiece component that executes all the arithmetic and logical operations performed by the computer - the ALU.

## Task

- [x] Peer Assess Unit 2 Assignment.
- [x] Complete Reading Assignments
  - [x] Chapter 8:  Combinational Logic Circuits (Tarnoff)
- [x] Complete and submit Unit 3 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [x] Rate other student’s posts.
- [x] Watch Optional Video Lectures
- [x] Take the Graded Quiz.
- [ ] Post your activities throughout the week in the Learning Journal.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 8: Combinational Logic Applications

## Discussion Forum

In your implementation of the ALU there is no need to detect or handle overflow.  However, it's a good mental exercise to think about when/how an overflow might occur.  When adding numbers with different signs, overflow cannot occur because the sum must be no larger than one of the numbers.
What happens when the signs of the numbers are the same? What happens in the case of subtraction?
How do we detect when an overflow does occur?

今回のテーマに対する私の回答を以下に記載します。
具体的な例を考えるために4bitの二進数を例にとります。4bitだと、2の補数表現で表すことができる範囲は-8~7の範囲です、加減算を実施した際にこの範囲を超える場合にオーバーフローが発生します。
1)加法
5+6を考えます
0101+0110=1101
2の補数表現で1101は-3を表すため正しい結果でないことがわかり、オーバーフローが発生していることがわかります。
2)減法
-3-9を考えます
1101-0110=0001
2の補数表現で0001は1を表すため正しい結果でないことがわかり、オーバーフローが発生していることがわかります。
これらの結果から、加法及び減法を実施した際にキャリーオーバーが発生していることを検出する方法について考えます。例とし他ものでは両方とも最大bitが反転していることがわかります。2の補数表現で最大ビットは符号を示すため、加法・減法でビットが反転した場合はキャリーオーバーしていると判断することができると考えます。

## Written Assignment

## Learning Journal
