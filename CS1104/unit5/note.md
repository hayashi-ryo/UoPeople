# unit5

- The Stored Program Concept.
- The von Neumann Architecture.
- Memory.
- Central Processing Unit.
- Registers.
- Input and Output.

## Goal

- Build the Hack computer platform, culminating in the top-most Computer chip.
- Receive a good understanding of how modern computers work at the low hardware and software levels.

## Task

- [ ] Peer Assess Unit 4 Assignment.
- [x] Complete Reading Assignment
  - [x] Chapter 5:  Computer Architecture (Nisan and Schocken)
  - [x] Chapter 15:  Introduction to Processor Architecture (Tarnoff).
- [ ] Complete and submit Unit 5 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [ ] Rate other student’s posts.
- [x] Take the Self-Quiz.
- [x] Watch the Optional Video Lectures
- [ ] Post your activities throughout the week in the Learning Journal.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 15: Introduction to Processor Architecture
    - プロセッサのコンポーネント
      - バス
        - 目的を満たすためにグループ化されたワイヤの束。主な用途はデータ転送
      - レジスタ
        - ラッチ群を使用して、バイナリ値を格納、保持する。用途に応じて、データ・アドレス・命令・フラグなどの種類がある。
      - バッファ
        - ある処理が完了して、次の処理を待ち合わせる間、結果を保持してうしわ慣れないようにしておく仕組みが必要。スタック動作を利用して保持する
      - I/O ports
        - プロセッサと外部デバイスの間のあらゆる接続を指す。
- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Chapter 5: Computer Architecture
    - データと命令を分けて保存している。

## Discussion Forum

- The Hack architecture partitions the address space, and does not allow both data and instructions to be stored in the same space.
- What are the implications of this architecture?
- Explain and discuss in your own words.
  - This will require outside research:
- Discuss is the difference between RISC and CISC architecture. What are the advantages and disadvantages of each architecture?

- JA
  - Hackアーキテクチャは、アドレス空間を分割し、データと命令の両方を同じ空間に格納することを許さないものです。
  - このアーキテクチャはどのような意味を持つか。
  - 自分の言葉で説明し、議論してください。
    - これには外部研究が必要です。
  - RISCアーキテクチャとCISCアーキテクチャの違いについて説明しなさい。それぞれのアーキテクチャの長所と短所は何ですか？

- このアーキテクチャはどのような意味を持つか。
  - 二つの意味を持つと思う
    - Hackコンピュータは命令メモリに格納されたプログラムを実行する。プログラムの格納領域をを分けておけば新しいプログラムへのロードが簡単にできる。
    - The Hack computer executes programs that reside in its instruction memory. The instruction memory is a read-only device, and thus programs are loaded into it using some exogenous means.

今回のテーマに対する私の見解を説明します。

1. The Hack architecture partitions the address space, and does not allow both data and instructions to be stored in the same space. What are the implications of this architecture?

命令メモリとデータメモリを分ける利点について3点記載します。

  1. CPUが命令の読み込みとデータ操作を並列して実行することができる
    Hackアーキテクチャが処理を行うにあたり時間を要するのは、データの取得とメモリへの格納です。もし命令メモリとデータメモリを分けずに管理する場合、命令を実行するたびにデータを取得する必要があり処理のオーバーヘッドが大きくなります。命令メモリとデータメモリを分けることによって、一度取得したデータをシーケンシャルに処理することなどが可能になります。
  2. プログラムとデータを効率的に管理することができる
    命令メモリに格納されるのは、与えられたデータをどのように処理するかを決定するプログラムです。プログラムは機能追加をおこなったり修正を行ったりする可能性があるため、置き換えが必要な場合があります。このような場合に命令メモリを独立させることによりデータの状態に依存させずにプログラムの置き換えを行うことが可能になります。同様に、プログラムの状態に依存させずにデータメモリの状態を変更させることも可能になります。
  3. CPUの不正動作を防ぐことができる
    もし不正な命令がデータに格納されてしまった場合、命令メモリとデータメモリを分割していないと実行されてしまう可能性があります。しかし、命令メモリとデータメモリを独立させることにより不正な命令が混在したとしても実行することを防ぐことが可能になります。

  2. Discuss is the difference between RISC and CISC architecture. What are the advantages and disadvantages of each architecture?

RISC(Reduced Instruction Set Computing)はその名の通り、CPU命令の数を削減することによりCPU設計の簡易化や消費電力の削減を目的としています。CISCは(Complex Instruction Set Computing)は、より複雑なCPU命令を実装する音で、一つの命令で複数の命令が実行でき、プログラムがより短く実装することが可能です。それぞの特徴を表にまとめます。

|特徴|RISC|CISC|
|--|--|--|
|命令セット|小さい|大きい|
|実装されている命令の数|少ない|多い|
|消費電力|少ない|多い|
|実行速度|遅い|早い|
|メモリアクセス数|多い|少ない|
|CPUの設計コスト|低い|高い|

以上を踏まえて、モバイルデバイスなどの大量生産かつ消費電力が少ないCPUが求められる場合にはRISCアーキテクチャを採用し、サーバのCPUではより高速な処理を行うためにCISCアーキテクチャを採用するなど、場面ごとの取捨選択が必要となります。

## Written Assignment

## Learning Journal
