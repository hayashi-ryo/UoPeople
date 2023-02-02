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
- [x] Complete the Unit 1 Exercise
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts. Rate other student’s posts
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

今週のユニットはコースの最初ということもあり、内容として難しいものではなく、コース全体をイメージすることと、新しいツールを利用した学習という大きく二つの内容を実施しました。
一つ目は、CS1104というコース全体で学ぶ概要をイメージすることです。このコースで学ぶことはシラバスによると以下となる。
This course is an introduction to computer systems. In this course, we will begin by exploring the internal design and functionality of the most basic computer components. From there, we will use an online hardware simulator to actually “build” a computer and develop an assembler from the ground using concepts we will learn in the class. In the process, we will cover the ideas and techniques used in the design of modern computer hardware and discuss major trade-offs involved in system design as well as future trends in computer architecture and how those trends might affect tomorrow’s computers.
この学習目標に対して、一つ一つのユニットで学習している事項がどのようなつながりを持つのか、今学んでいている内容がどのようなついながりを持つのかをイメージすることは、私自身が8週間という期間同じテーマを学習するに当たって、能動的な学習を進めるために非常に重要な要素となります。シラバスから学習計画を立てたところ、やはり後半のユニットの方が難しい内容であると見受けられるため、より計画的かつ事前準備を実施する必要があることを把握することができました。
次に、このコースで実際に学習した内容について振り返ります。unit1では、全ての論理回路の基本となるAND/OR/NOなどのプリミティブゲートについて学習を行いました。それぞれのゲートがどのような処理をするのかや、ゲートがどのような出力を出すのかについては以前学習したことがあったため、理解を早く進めることができました。しかし、実際に論理回路の設計とシミュレーションをする過程を踏んだことは経験したことがなかったため、実際の手を動かす工程により私自身理解をさらに深めることができたと感じています。論理回路の設計を行うことは今後3ユニットほど継続して実施していくテーマとなるので、今週のユニットで簡単なテーマに対して手を動かして実装することができたことは、非常にためになったと感じています。
また、CSのユニットを進めていく上でクラスメイトのレベルが上がっていることを感じています。イントロダクションとなるクラスから数えると4クラス目となる本コースは、ある程度本気でやりたい人だけが残って学習を進めていけているのだということを実感しました。私自身の目的のためにもクラスメイトの知見やディスカッションの投稿を吸収し、より学習効果を上げていきたいと思います。
最後に、このクラス全体を進める上での私自身の目標を宣言したいと思います。一つ前のCS1103では、仕事とのスケジュール調整がうまくできず1ユニット十分な結果を残すことができない状態となってしまいました。今回のクラスではそのような状況を引き起こさないよう、より計画的に、また計画を進める上で必要な要素を整理しながら学習を進めたいと思います。
