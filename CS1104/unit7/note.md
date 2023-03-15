# unit7

- Developing high level data structures in assembler language.
- Program translation.
- Symbol resolution.This unit we will focus on devleoping code that has few
- symbols.  In the next unit we will continue to develop our assembler language skills and introduce the use of symbols.

## Goal

- Understand how assemblers translate programs written in the assembly representations into programs written in the binary representations.
- Learn how to develop assembler code.

## Task

- [x] Peer Assess Unit 6 Assignment.
- [x] Complete Reading Assignment
  - [x] Chapter 6: Assembler (Nisan and Schocken).
- [ ] Complete and submit Unit 7 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [ ] Rate other student’s posts.
- [x] Take the Self- Quiz.
- [x] Watch the optional Video Lectures
- [ ] Post your activities throughout the week in the Learning Journal.

## Reading Assignment

- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Read the following:Chapter 6: Assembler
    - CPUアーキテクチャがサポートするバイナリ形式の命令をシンボル形式で表現する
    - このシンボル形式の表現をアセンブリ言語、翻訳ブログラムをアセンブラと呼ぶ。
    - メモリを直接操作することは難しくないが、変数やループ処理ラベルなどを実際のメモリアドレスに対応させることは簡単なことではない。

## Discussion Forum

- For your discussion question response, please provide a response to each of the following questions.  Make sure that you include the question followed by your answer to the question in your posting.
  - The Hack assembler is a two-pass assembler. Explain why there is a need for going twice over the code.
  - There is a method named backpatching that solves this issue with one pass only. Describe this method.
  - What are the pros and cons for one pass assembly vs. two pass assembly?

- The Hack assembler is a two-pass assembler. Explain why there is a need for going twice over the code.
  - Hack言語では、シンボル(変数)を含むことができます。シンボルは実際のアドレスへの参照を示すものであり、実際の値をメモリ上に格納するためには
    - プログラムに含まれるシンボルを読み込み
    - RAMとROM上のアドレスと紐づける
  - プロセスを行う必要があります。このようなプロセスを実施するためにHack言語ではコードを2回解析しています。
- There is a method named backpatching that solves this issue with one pass only. Describe this method.
  - コードの解析を一度で行うための方法としてバックパッチングと呼ばれる方法があります。バックパッチングの流れをテキストのコードを例に取って説明します。

  ``` Code with symbols
    // Computes sum=1+...+100
    i=1
    sum=0
    loop:
      if i=101 goto end
      sum=sum+i
      i=i+1
      goto loop
    end:
      goto end
  ```

  Code with symbolsのコード解析を行う場合、「goto end」の部分でメモリ空間上のどこを示すべきかわからなくなります。本来であればこの後コード解析をおこなるメモリアドレスに対してジャンプするべきか決定する必要がある部分です。ここでgoto 2など一旦自分自身のメモリアドレスを登録し、本来ジャンプするべきアドレスがわかったタイミングで2右6と更新を行う方法です。このように仮アドレスを挿入した上で後から正しいアドレスに更新すうr方法を指します。

- What are the pros and cons for one pass assembly vs. two pass assembly?
  - one-pass assembly
    - advantages:
      - two-pass assemblyより高速である
    - diadvantages:
      - 変数定義を前方で行なっていた場合にバックパッチできない場合がある。
  - two-pass assembly
    - advantages:
      - 前方参照を含む参照の問題が解決できる
      - パスごとに解決すべき課題が明確なので設計がシンプルになる
    - diadvantages:
      - one-pass assemblyより動作が遅い

## Written Assignment

## Learning Journal
