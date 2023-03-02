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

- [x] Peer Assess Unit 4 Assignment.
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

CPUはメモリ上に格納されたデータに対して、命令を与えることで処理を行うものです。処理を行うためにはいくつかのステップや要素が必要になるのでそれらについて説明します。

1. ALU (Arithmetic Logic Unit)
  The ALU is a collection of logic circuits designed to perform arithmetic (addition, subtraction, multiplication, and division) and logical operations (not, and, or, and exclusive-or). "(Tarnoff, 2007)と説明されるように、ALUはCPUの最も基本的な要素です。求めたい結果を演算する方法を決定したら値やコマンドをALUに送ることで処理を行います。

2. Instruction Decoder
  ALUで処理を実行するためには、どの回路でどのような動作をすればいいかを決定する必要があります。この時に送る信号は、人間に解釈することが難しい機械語であるため機械語に変換し、適切な回路を選択するコンポートネントが必要になります。それがInstruction Decoderです。Instruction Decoderはメモリから読み取った命令を解釈しALUに制御信号を指示します。最後に、処理結果をメモリ上に格納して一連の流れが終了します。

3. Clock and Program Counter
  コンピュータ内部のあらゆる処理は一定の間隔で同期をとって実施されます。クロックはこの同期信号を送信するコンポーネントです。例えば、1クロック目で命令を読み込み、2クロック目で命令を解読、3クロック目で処理を実行し、4クロック目で結果の書き込みを行う、といった形です。もちろん1クロックで処理できる量は決まっているため例のように単純な形式ではありませんが、基本的にクロック信号をベースとして処理を行います。
  また、命令はメモリ上に格納されているため、取得する命令を選択させるコンポートネントが必要です"The PC is the register that contains the address of the next instruction to be fetched."(Nisan, N., & Schocken, S. (2005))と説明されるように、プログラムカウンタは次に実行すべき命令のメモリアドレスを指します。分岐動作の場合は分岐条件が決定したあと、プログラムカウンタが分岐先の命令を取得するよう更新されます。

4. Control Codes
  ALUは様々な演算を行うことができるよう設計されています。そのため今回の処理ではどのような演算回路を利用するかを決定させる必要があります。そのために送る信号がControl Codesです。例えばALUに8つの命令が実装されている場合、演算を切り替えるために3bitの制御信号を与える必要があります。

5. Control Unit
  "The control unit is the main component that directs the system operations by sending control signals to the datapath. These signals control the ﬂow of data within the CPU and between the CPU and external units such as memory and I / O. Control buses generally carry signals between the control unit and other computer components in a clock-driven manner."(Berger, A. S. (2006))と説明されるように、コントロールユニットはCPU内部のデータの流れを統括するコンポーネントです。クロックにより制御された処理のタイミングは、何かのコンポーネントで統括して管理する必要があります。そのためにControl Unitは制御信号を送信し、処理のタイミングを制御します。
  
## Learning Journal
