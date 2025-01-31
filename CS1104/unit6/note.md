# unit6

- Machine languages.
- The Hack machine language
  - Symbolic version.
  - Binary version.
- Z80 Microprocessor and Interrupts

## Goal

- Become familiar with the assembly process.
- Become familiar with the machine instructions of the Hack computer and how to implement programs with them.
- Get a taste of low-level programming in machine language.
- Become acquainted with the Hack computer platform.

## Task

- [x] Peer Assess Unit 5 Assignment.
- [x] Complete Reading Assignment
- [x] Complete and submit Unit 6 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [x] Rate other student’s posts.
- [x] Take the Graded Quiz.
- [x] Watch the Optional Video Lectures
- [x] Post your activities throughout the week in the Learning Journal and complete the Learning Journal.

## Reading Assignment

- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Read the following:
    - Chapter 4: Machine Language
      - 機械語はプロセッサとレジスタの両方でメモリを操作するように設計されたものとして見ることができる。
      - Hack機械語とは？
        - Thus, the syntax of the Hack language mandates that memory access instructions operate on an implicit memory location labeled ‘‘M’’, for example, D=M+1.
        - このことから、データと命令の管理を簡単に行うためにも、MはAのアドレスレジスタを差し続ける慣例となっている。
        - @value
          - このコマンドは指定した値をAレジスタに格納する処理を行う。
        - C命令のジャンプフィールドは「次の命令をフェッチして実行する」「別の場所にある命令をフェッチして実行する」ことを行う
  - Assembler Tutorial
  - CPU Emulator Tutorial

## Discussion Forum

For your discussion question response, please provide a response to each of the following questions.  Make sure that you include the question followed by your answer to the question in your posting.

- In the description of the Hack machine language in chapter 4, it is stated that in well-written programs a C-instruction that may cause a jump should not contain a reference to M, and vice versa. Discuss why this should be avoided.
- Research the concept of interrupts in a computer. You may want to look into how the Z80 microprocessor handles interrupt. A good source of Z80 information is Zaks, R. (1980). Programming the Z80. Sybex. Download the pdf.
FYI, The Z80 8 bit microprocessor has been in production for forty years. Knowledge of the Z80 is a great lead-in for further study in more complicated machines.

1. まず、Hack言語におけるMの扱いについて確認する
  Thus, the syntax of the Hack language mandates that memory access instructions operate on an implicit memory location labeled ‘‘M’’, for example, D=M+1.(Nisan, N., & Schocken, 2005)
  と説明されていることから、データと命令の管理を簡単に行うために、MはAのアドレスを参照する間接参照のメモリとなる。また、C命令のジャンプフィールドは条件に応じて以下のどちらかを実行する
    次の命令をフェッチして実行する
    別の場所にある命令をフェッチして実行する
  今回の質問の主旨は、後者の命令をMに参照させて良いか、というものになる。答えとしてはもちろんNOになるが、その理由について以下に2点記載する
   1. 命令の実行速度が遅くなる
    もしジャンプフィールドにMを設定する場合以下の操作が必要です
    @X // X is goto jump field
    M=X
    この操作はメモリに2回のアクセスが必要であり、1回分無駄な操作が発生しています。
   2. メモリの使用量が増える
    一つ目の回答と似た内容ではありますが、MとAそれぞれに対してメモリの領域を確保する必要があります。この領域は本来必要のない領域です。
  ここまでの議論を総括して、Mを利用する状況としては、インクリメントなど現在参照しているアドレス自体を捜査したい場合に利用することが多いのではないかと考えます。

1. 割り込みとは、何らかの信号により処理を行なっているものを停止し違い操作を要求するものです。Z80プロセッサでは、需要度の異なる割り込みを判断するため2つの異なる信号によって区別を行なっている。
  NMI:Non Maskable Interrupt
  無視できない割込みで CPU は必ず処理する。
  INT:INTerrupt
  通常の割込みで設定によって無視できる。
  また、どちらの命令でも割り込みが発生した場合には、割り込み処理完了後に中断した命令を実行するため、中断された命令をスタックに待避する部分は共通している。

以下が詳しく記載されていた
<https://edu.isc.chubu.ac.jp/naga/Z80/Z802c.html#1>

## Written Assignment

Program1
定数2+3の結果をR0にロードするプログラムです。この結果を得るためにHack機械語は以下のような操作を行なっています。
@2 //set value=2
D=A // load value to D
@3 //set value=3
D=D+A // add D and value
@0 // set value=2
M=D //load value(2+3) to M

Program2
R0とR1の値を比較して、大きい方をR2にロードするプログラムです。この結果を得るためにHack機械語は以下のような操作を行なっています。
@0 //set value=0
D=M //load value of R0
@1 //set value=1
D=D-M //Subtract R1 from R0
@10 //set value=10
D;JGT // if(R0-R1)>0 goto END
@1 // Processing after the jump thereafter
D=M
@12
0;JMP
@0
D=M
@2
M=D
@14
0;JMP

## Learning Journal

今週のユニットでは、基本的な機械語を学び具体例としてHack言語をバイナリとシンボルの形式で実装しながら学習を行いました。今回のユニットで学習した内容に関する私の理解を説明します。
最初に機械語についてです。機械語を一言で表すと「プロセッサが直接実行できる命令コードの集合」です。例えば以下のようなバイナリ形式で表現されます。
0000000000000010
1110110000010000
0000000000000011
1110000010010000
0000000000000000
1110001100001000
この例はHack機械語で2+3の結果をメモリのR0にロードする処理を実行する機械語です。16bitのバイナリの値に応じて様々な演算を処理することが可能です。しかしバイナリ言語を理解した上で実装することは非常に難しいです。そのため、機械語を作成するために通常は以下のステップを踏みます。

1. アセンブリ言語の実装
人間は命令番号そのものを理解した上でプログラムを実装することは非常に困難です。そのため、命令番号ごとに意味を類推しやすいアルファベットの並びと対応づけ他ものを利用してプログラムを記述する手法が存在します。この手法がアセンブリ言語です。C言語やPythonといった言語と比較してよりハードウェアを直接制御することが可能ですが、複雑なプログラムの実装や大人数での分業には向いていません。OSやデバイスドライバなどハードウェアを直接制御する必要のあるプログラムなどで利用されることが多いです。
2+3の結果をR0にロードする処理をアセンブリ言語(Hack言語)で記載すると以下の形式で表現されます。
@2 // value=2
D=A // D=A(A=value)
@3 // value=3
D=D+A // D=D+A
@0 //value=0
M=D // R0=D
この形式であれば、バイナリ形式よりも処理の方式をよりイメージすることが可能です。
2. アセンブル
アセンブリ言語をバイナリ形式に変換すること(コンパイルとも呼ぶ)をアセンブルと呼びます。この処理を実行することでアセンブリ言語からプロセッサが認識できるバイナリ形式のコードを生成することができます。

このような機械語を学ぶにあたっていくつか他の処理を実装してみました。
program.asm
この処理はR0とR1を乗算し、結果をR2に格納する処理です。このプログラムを実装することで、Assignment Unit 6ではインクリメントを利用した処理の実装を行わなかったため、インクリメントする形で処理を実装しました。この経験により、今まで実装したことのあったC言語の処理がプロセッサに対してどのような操作を行なっているのかをより明確にイメージすることができました。逆に、pythonなどのなどの言語はメモリ管理の概念がプログラマ側にないため、言語の処理系の中で全て賄っていることを再認識することができました。
最後に、今週のユニットではGraded-Quizがありました。前回のQuizで満点を取ることができなかったことに問題意識があったため、今回のテストでは満点を取るためにSelf-Quizやテキストのエクササイズを繰り返し実施し、自分自身の理解をより深めることに注力しました。また、インプットするだけではなく、それぞれのキーワードがどのようなつながりを持っているのか、どのような目的でどんな処理をしているのか、をyロイ明確にイメージできるようにしました。その結果、今回のテストでは満点を取ることができ非常に満足しています。残り3ユニットもこの調子で学習を進めて、自分自身の知識執着を図りたいと思います。
