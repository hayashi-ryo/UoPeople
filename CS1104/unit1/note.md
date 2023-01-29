# unit1

- Introduction (Hello, World Below)
- Introduction to Boolean Algebra
- Introduction to digital circuits and logic gates
- Install and become familiar with the operation of Logism simulator

## Goal

- Become familiar with the elementary logic gates
- Become familiar with boolean algebra
- Install and become familiar with the operation of the Logism simulator

## Task

- [x] Complete reading assignments
- [x] Download and install the Hardware Simulator on your computer
- [x] Optionally watch Video Lectures
- [ ] Complete the Unit 1 Exercise
- [ ] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts. Rate other student’s posts
- [x] Take the Self-Quiz
- [ ] Post your activities throughout the week in the Learning Journal

## Reading Assignment

Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>

- Chapter 4: Logic Functions and Gates
  - 論理ゲートは入力信号に対してアルゴリズムを適用し、1ビットの出力を行うもの
  - NOTゲート
    - 入力ビットを反転させる
  - ANDゲート
    - 入力が全て1の時に出力が1になる
  - ORゲート
    - 入力に1が含まれる場合に出力が1になる
  - XORゲート
    - 入力される1の数が奇数か偶数かによって論理出力を変化させる
  - Truth Tables(真理値表)を作成することで、よりアウトプットをわかりやすい形にすることができる。
- Chapter 5: Boolean Algebra
  - 回路図と真理値表は複雑な回路の動作を説明するにはデメリットがある
    - スペースを要する
    - 入力の組み合わせごとの整理ができない(回路図)
    - 回路の実態の情報がわからない(真理値表)
  - このような問題に対してデジタル回路を式で表現する学問がある。

- 回路図
    -

  - 真理値表

Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>

- Introduction: Hello, World Below URL
- Chapter 1: Boolean Logic
  - 全ての基本ゲートNAND
  - コンピュータのハードウェアは2進数の値の表現と操作に基づいて行われているため、bool関数は非常に重要な役割を果たす
  - 全ての論理ゲートはand/or/notで表現することができる
    - これは、NAND関数で全て示すことができることも間接的に証明される
  - ゲートとは、bool関数を実装する物理的なデバイスのこと
  - primitive gate
    - 基本回路：and/or/not
  - composite gate
    - 基本回路によって表現され、ユーザには中朝的な部品として定義された回路。例えば、XORゲートや3つの入力abc全てのandをとる回路などが該当する。
  - Multiplexor
    - 選択ビットと呼ばれる仕組み。入力に応じて他の二つの入力の一つを選択して出力する
  - Demultiplexor
    - マルチプレスサの逆。入力をどちらの出力とするかを選択ビットによって決定する仕組み

## Discussion Forum

- Why do Boolean functions play a central role in hardware architectures?
- Describe Composite Gates.
- Describe Multiplexors and Demultiplexors? What is the importance of the use of the selection bit and the data bits?

- ブール関数がハードウェアアーキテクチャの中心的な役割を果たすのはなぜか？
- コンポジットゲートについて説明しなさい。
- マルチプレクサとデマルチプレクサについて説明してください。選択ビットとデータビットを使用することの重要性は何ですか？

Since computer hardware is based on the representation and manipulation of binary values, Boolean functions play a central role in the specification, construction, and optimization of hardware architectures.()

クラスメイトの皆さんこんにちは。今回のテーマに対する私の理解を説明します。

1. Why do Boolean functions play a central role in hardware architectures?
私たちが扱う世界では10進数やアルファベットを利用して意思の疎通を行いますが、コンピュータのハードウェアは2進数の値の表現に基づいて行われるため、ハードウェアアーキテクチャを設計する上で非常に重要な役割を担います。
2. Describe Composite Gates.
コンポジットゲートについて扱う前に、対となるプリミティブゲートについて議論する必要があります。プリミティブゲートとは、AND/OR/NOTの非常に基本的な回路のことを指します。全ての論理回路を分解するとこれら三つのプリミティブ回路へ必ず行きつきます。その上でコンポジットゲートの具体例を以下に二つ記載します。
3つの入力に対して、全ての入力が1であれば出力を1とするゲート
4つの入力から、出力する文字の桁数と大きさを出力するゲート
上記のような例は、利用者からすると一つの論理回路のように見えます。しかし、内部について分解していくとかならずプリミティブゲートの集合であることがわかります。このように、プリミティブゲートの組み合わせによって得られる論理的なアルゴリズムのことをコンポジットゲートと呼びます。
3. Describe Multiplexors and Demultiplexors? What is the importance of the use of the selection bit and the data bits?
マルチプレクサとは「選択ビット」と呼ばれる入力の値に応じて、複数の入力から「データビット」と呼ばれる出力を決定する仕組みです。Demultiplexorは、一つの「データビット」をどの出力に行うか「選択ビット」の値に応じて決定する仕組みです。これらの仕組みは、コンピュータアーキテクチャを検討する上で非常に重要である「入力信号から必要なものと選別して出力する」「入力信号を必要な箇所へ出力する」機能を実装しています。

## Written Assignment

## Learning Journal
