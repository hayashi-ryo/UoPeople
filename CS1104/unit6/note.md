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
- [ ] Complete and submit Unit 6 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [ ] Rate other student’s posts.
- [x] Take the Graded Quiz.
- [x] Watch the Optional Video Lectures
- [ ] Post your activities throughout the week in the Learning Journal and complete the Learning Journal.

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

## Learning Journal
