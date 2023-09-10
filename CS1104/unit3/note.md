# unit3

- Combinational Logic
- Multiplexors and De-Multiplexors
- Decoders
- Counters
- ALU (Arithmetic Logic Unit)
- ALU Design

## Goal

- Learn the basics of combinational logic
- Become familiar with the use and operation of multiplexors, demultiplexors, decoders and counter circuits.
- Become familiar and implement the centerpiece component that executes all the arithmetic and logical operations performed by the computer - the ALU.

## Task

- [x] Peer Assess Unit 2 Assignment.
- [x] Complete Reading Assignments
  - [x] Chapter 8:  Combinational Logic Circuits (Tarnoff)
- [x] Complete and submit Unit 3 Assignment.
- [x] Post your answer to the question in your Discussion Forum and follow it up with approximately 3-4 comments to other students’ posts.
- [x] Rate other student’s posts.
- [x] Watch Optional Video Lectures
- [x] Take the Graded Quiz.
- [x] Post your activities throughout the week in the Learning Journal.

## Reading Assignment

- Tarnoff, D. (2007). Computer organization and design fundamentals. <http://faculty.etsu.edu/tarnoff/138292/>
  - Chapter 8: Combinational Logic Applications

## Discussion Forum

In your implementation of the ALU there is no need to detect or handle overflow.  However, it's a good mental exercise to think about when/how an overflow might occur.  When adding numbers with different signs, overflow cannot occur because the sum must be no larger than one of the numbers.
What happens when the signs of the numbers are the same? What happens in the case of subtraction?
How do we detect when an overflow does occur?

今回のテーマに対する私の回答を以下に記載します。
具体的な例を考えるために4bitの二進数を例にとります。4bitだと、2の補数表現で表すことができる範囲は-8~7の範囲です、加減算を実施した際にこの範囲を超える場合にオーバーフローが発生します。
1)加法
5+6を考えます
0101+0110=1101
2の補数表現で1101は-3を表すため正しい結果でないことがわかり、オーバーフローが発生していることがわかります。
2)減法
-3-9を考えます
1101-0110=0001
2の補数表現で0001は1を表すため正しい結果でないことがわかり、オーバーフローが発生していることがわかります。
これらの結果から、加法及び減法を実施した際にキャリーオーバーが発生していることを検出する方法について考えます。例とし他ものでは両方とも最大bitが反転していることがわかります。2の補数表現で最大ビットは符号を示すため、加法・減法でビットが反転した場合はキャリーオーバーしていると判断することができると考えます。

## Written Assignment

## Learning Journal

今週のユニットでは、加算回路や減算回路について学習を行い、それらを論理回路として具体的に実装することを行いました。今回のユニットで学習した内容に関する私の理解を説明します。
まず、加算についてです。加算を非常に単純に考えると、二進数で表現された二数をそのまま足し合わせる行為を指します。例えば、1011と0010を足し合わせると1101のという結果を得ることができます。ここで、非常に重要な概念を自然に利用しました。桁上げという概念です。二進数の桁ごとに表現することができrうものはあくまで0と1だけです。1と1を足し合わせた場合、10という結果を得ることができなければなりません。このように、実際に計算を行うビット数よりも大きな値に伝播させる数値のことをキャリービットと呼びます。このキャリービットは、非常に基本的な概念であるため今後のunitの学習のためにも、具体的な回路を作成しながら、実践的な理解を進めました。
次に減算についてです。減算は、unit2で学習を行った2の補数を足し合わせることで計算することが可能です。そのため、A-Bという計算を行う場合は、Bを2の補数形式で表すために必要な、ビット反転と1を足し合わせる操作を行います。するとA+(-B)として計算を行うことができるようになります。これは、CPUで演算操作を単純かつ高速に実装するために非常に有意義に働いているものと推測します。
次に、Written AssignmentやExerciseの課題を通して論理回路の実装を行いました。正直なところ、今回の課題には苦労しました。理由として以下のような要因がありました。
・最初から回路全体でどのような操作をするのかを想像してしまったため
・入力のビット幅が増えた操作をイメージすることができなかったため
今回の回路の実装を通して、上記のような課題認識を得ることができ、それらについて解決するイメージするイメージをつかむことができました。例えば、written assignmentの課題で4bit全加算機の実装を行いましたが、これは詳細に分解すると1bit加算と1bit加算機のキャリービットを含めた全加算機を実装するだけだと認識することができます。このように頭で理解できる細かい単位へ回路を分解することで、回路の実装をミスなく実施することができるようになりました。unit4以降でも回路を実装する操作を行うことはあるため、最初から全体像を実装しようとするのではなく、詳細な部分がどのような実装となるのかをイメージし部品として実装していく工程を踏んでいきたいと思います。
また、今週のユニットではGraded-Quizがありました。残念ながら満点を取ることはできませんでしたが、ミスを1つに抑えることができました。これは、unit1やunit2のSelf-Quizの復習をしっかりと行い、今週のunitで学習した内容を定着させることによって実装できたと思っています。ただし、個人的に二進数を取り扱うことに苦手意識を持っています。例えば、10進数の71がバイナリでどのように表現されるか、またその値の2の補数系は何か、などです。これらの数値の操作は頭で理解するだけでなく実践することによる理解が重要な分野であると考えるため、個人的に購入したテキスト等を利用して学習を深めていきます。
