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
- [x] Complete and submit Unit 7 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [x] Rate other student’s posts.
- [x] Take the Self- Quiz.
- [x] Watch the optional Video Lectures
- [x] Post your activities throughout the week in the Learning Journal.

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

今回のユニットでは、unit6で学習した内容を踏まえて、様々なアセンブリプログラムの実装やテストを実装しました。まずは、前回のユニットと比較して新たに学んだシンボルという概念について説明します。
シンボルとは、参照型の変数やIF分岐におけるジャンプ先など、実際のメモリアドレスではなく人間がより理解しやすい形式で表現を行うための技法です。今回のユニットでは、シンボルと使って例えば以下のようなアセンブリの実装を行いました。

D=A
@j
M=D // initiarize i=1
@i
M=1
(LOOP)
@i
D=M
@5
D=D-A
@END
D;JGT // if(5-i)<=0 goto end
@i
D=M
@j
M=M-1
@i
M=M+1
@LOOP
0;JMP
@END
(END)
0;JMP

このプログラムではiを1から5まで増加するループ処理を行う必要があり、@LOOPという場所から(LOOP)という場所はジャンプする必要があります。実際のPCを意識した上で実装する場合はPC=5へ戻る処理を行うなどの必要がありますが、固定のプログラムカウンタを示すアドレスを指定すると拡張性に乏しく、処理をイメージすることが難しくなります。このような場合にシンボル形式が役に立つのです。
また、シンボル形式のアセンブリをアセンブルするための手法としてtwo-pass方式について知りました。シンボルを利用する形で実装を行なっている場合は、シンボルと実際のメモリアドレスを紐づけるテーブルを作成しその後プログラム全体のアセンブルを行なっていきます。この手法をとることによってシンボル形式など参照型の実装が許容できることがわかりました。
また、私は仕事を行う中でC言語やCOBOL言語を扱うことがあるのですが、今回のユニットの学びによって仕事で扱うプログラムに起こっていることが少し理解できました。C言語は参照型の変数を宣言していないとエラーが出るのですが、これはシンボルテーブルに作成されていない変数を扱おうとするためにコンパイラがエラーを出力していると考えています。他にもforループの終了位置の指定や構文エラーなど何気なくみているコンパイルエラーがどのような仕組みで引き起こされているのかイメージすることができました。
また、COBOLソースを実装する場合は一番左に000100のような6桁の周知を100刻みで付与していたのですが、PCを擬似的に表していた時の名残であるとイメージできました。
このように今まで理解できていなかったことをより詳細に意識することができるようになってきたため、今後も引き続き学習を進めていきたいと思います。
