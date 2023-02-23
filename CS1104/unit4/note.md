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

- [x] Peer Assess Unit 3 Assignment.
- [x] Complete Reading Assignments
  - [x] Chapter 3:  Sequential Logic (Nisan and Schocken)
  - [x] Chapter 10: Latches (Tarnoff)
  - [x] Chapter 12: Introduction to Memory (Tarnoff)
- [x] Complete and submit Unit 4 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [x] Rate other student’s posts.
- [x] Take the Self- Quiz.
- [x] Watch the Optional Video Lectures
- [x] Post your activities throughout the week in the Learning Journal.

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

今週のユニットでは、Dフリップフロップ／Dラッチと呼ばれる基本的な回路や、それを利用したメモリの仕組み、RAMについて学習を行いました。まずはそれらに関する私の理解を説明します。
一つ目にDラッチとDフリップフロップについてです。どちらも入力を保持して出力を行うという点については共通しています。しかし、内部で保持する値や出力として扱うことができる値の形式に違いがあります。まず、Dラッチは一つのデータ入力に対して1つのデータ出力を持ちます。また、出力を制御する入力があります。出力は以下の性質を持ちます。
・クロックがHighの時は、データ入力をそのまま出力する
・クロックがRowの時は、直前のデータ出力を保持する
すなわち、クロック回路がHighの時のみデータ出力が変化するように動作する回路です。
次に、Dフリップフロップについてです。DフリップフロップもDラッチと同様、一つのデータ入力に対して一つのデータ出力を持ちます。また、出力を制御する入力がある点も同様です。出力は以下の性質を持ちます。
・クロックがHighになった瞬間のデータ入力をそのまま出力する
・クロックがHighになる瞬間以外では、直前のデータ出力を保持する
Dフリップフロッップはクロックの立ち上がりを検出して、その時点のデータを出力します。そのため、このようなクロックの立ち上がりのことをエッジと呼んだりします。Dラッチと大きく異なる点はとしてDラッチは「クロックがHignの間の入力をそのまま出力し続ける」のに対して、Dフリップフロップは「クロックの立ち上がりの瞬間のでーた入力を出力」します。このフリップフロップの特性は、大規模な非同期回路を実装する際などに非常に有用に働きます。
また、Dフリップフロップは制御入力の値が変わらなければ1ビットのデータを保持し続けることが可能です。そのため、1bitのメモリーとして利用することができます。Dフリップフロップを複数個連結すれば、それだけのbit数分のデータを保持することも可能です。今回のwritten assignmentでは、この特性を利用して、unit3で実装したALUに対して4ビットのメモリ入力を付与した回路の実装を行いました。この課題は、単純に回路を実装するだけではなく、実際に回路の動作をシミュレーションしながら体験することができたため、私の理解を非常に助けてくれました。
今週の課題は、全体を通してunit3までよりも複雑で難しい課題であったと感じました。おそらく真理値表などの形で整理することが難しくなり、制御回路とデータ入出力を組み合わせてイメージする必要があったためです。このような課題は、来週以降も続いていく想定ですので、回路の動作を理解する手段について知見を深めていきたいと思います。今週のユニットでは、クロック回路の波形とデータ入出力を組み合わせて表現している資料が私の理解を助けてくれました。このような資料へ辿り着くために、参考文献等を活用していきたいと思います。
最後に、課題への計画的な取り組みについてです。unit3からですが仕事が忙しくなってしまったことも影響して、計画的な時間を取りづらくなく状況が続いています。そんな中でもしっかりと学習を進めるためにも、オンオフの切り替えや友好的な時間の使い方などを身につけていきたいと思います。
