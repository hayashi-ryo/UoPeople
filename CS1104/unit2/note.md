# unit2

- Number systems and Representation
- Binary Addition and Subtraction
- Design of Adder and Subtractor Circuits

## Goal

- Understand the basic concepts of the binary number system
- Understand and be able to implement 1's and 2's complement of binary numbers
- Be able to add and subtract binary numbers
- Be able to implement logic circuits to add and subtract binary numbers

## Task

- [x] Complete Reading Assignments
  - [x] Chapter 3 Binary Math and Number Representations  (Tarnoff).
  - [x] Chapter 2 Boolean Arithmetic (Nisan and Schocken)
- [x] Complete and submit Unit 2 Assignment.
- [x] Post your answer to the question in your discussion Forum and follow it up with approximately 3-4 comments to other students’ posts. Rate other student’s posts.
- [x] Take the Self-Quiz.
- [x] Watch Optional Video Lectures
- [x] Post your activities throughout the week in the Learning Journal and complete the learning journal assignment.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 3: Binary Math and Number Representations
    - 2進数表現について
    - 10進数表現と同様に1+1=10になる
    - 補数
      - 足し合わせて0になる数のこと
      - 1の補数
        - 01を反転させたもの
      - 2の補数
        - 1の補数に1を加えたもの
          - -をつけたものになる
- Nisan, N., & Schocken, S. (2005). The elements of computing systems. MIT Press. <http://f.javier.io/rep/books/The%20Elements%20of%20Computing%20Systems.pdf>
  - Chapter 2: Boolean Arithmetic

## Discussion Forum

- How many gates are used in the implementation of the Xor gate in the Nissan and Schocken textbook?
  - テキストではXORゲートの実装に、ANDゲート2つ、NOTゲート2つ、ORゲート一つの計5つのゲートを利用して実装しています。
- Present your implementation to the Xor chip. How many gates are there in your implementation?
  - 私は、以下のようなXORゲートの実装を考えました。
  - この回路は、テキストよりも少ない回路数でXORゲートを実装する方法を考え、論理式をベースに実装しました。
- Please use engineer's logic and your textook to answer the following:
- Can you think of a more efficient implementation?
- Efficiency is not necessarily the number of gates used. It's all about "following the money." In other words, what does it cost to implement a new gate?
  - 「効率的な」という観点に立った場合に必要な要素として、一つのプリミティブ回路で作り上げることを考えました。もし一つの回路だけで構築することができる場合、大量生産によるコストダウンを実施することができると考えたためです。この概念に則り、XOR回路をNANDゲートのみで実装したものを以下に記載します。

## Written Assignment

## Learning Journal

今週のユニットでは、ユニット1で学習した2進数表現の拡張とそれを回路として実装することを実施しました。まずはそれらに対する私の理解を説明します。
まず、2進数表現はunit1で学習したようにハードウェアに対して入力を与えたりハードウェアからの出力を受け取るために必須の表現です。今週のユニットでは、補数という概念を学びました。これは、普段使っている10進数の形で何気なく利用している負の数をより効率的に、かつ演算しやすい表現とするために考案された方法です。この方法を学んだ際、特に2の補数表現は非常に感動を覚えました。それは以下のような要素からです。
・大量の数をより少ないビット数で表現することができる
・ビット演算の結果をそのまま利用することができる
上記の要素は、2新数の値を利用する上で非常に重要で、開発を発展させる要素であったのではないかと感じています。
次に、いくつかの加算回路について学びました。私は今までの人生で桁上がりの概念を自然に理解することができています。しかし、2進数でそのような演算をどのように考慮するのか、またそれをどのような回路形式で実装するのかをイメージすることはできていませんでした。今回のユニットでそれらの内容についてより深くイメージをすることができました。利用するために重要だったことは、桁を上げるcビットと合計を表すsビットがどのような出力になるのか、真理値表を利用して実際の値をイメージすることです。私自身の理解を深める要素として、イメージと実践をつなげていく作業が非常に大事なものなので、今回のユニットで行ったこの作業は非常に有意義なものとすることができました。
次に、今回のディスカッションについてです。私は、与えられたテーマに対して回路図と真理値表を実際に利用した形でポストを行いました。すると、クラスメイトからは比較的良い評価をもらうことができました。unit1のポストでは具体的な回路イメージや真理値表を載せることをしていなかったことにコメントをもらう場面もあったので、その対策として実施したものでした。結果としてよりわかりやすい投稿を実施することができたと個人的にも、クラスメイトの評価的にも考えることができています。来週以降のユニットでも、質問に対する回答をより具体的な形で表現し、それを含めた説明とすることを意識していきたいと思います。また、具体的なイメージを含めるにはlogisimを含めた各種ツールの扱いに慣れていなければならないため、エクササイズ等の実践等を通してツールへの理解を深める作業を並行して進めていきます。
最後に、unit3はGraded-Quizのある週です。unit2終了の段階では、Self-Quizやテキストのエクササイズに関して十分な理解をすることができているのではないかと考えています。よりよい結果を出すためにもunit3のコース内容の学習・振り返りと、unit1~2の振り返りを計画的に実施し、日曜日時点でGraded-Quizを受けたいと思います。今回のコースはAおよびA+を個人的な目標としているので、その目標のために必要なことは今後も継続して実施していきます。
