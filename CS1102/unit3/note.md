# unit3

Topics:
  Black-Box Interfaces
  Defining Static Methods
  Calling Static Methods
  Using Static Member Variables

## Goal

- By the end of this Unit, you will be able to:
- Describe the difference between formal parameters and actual parameters.
- Define and call static methods in Java programs.
- Apply static member variables in Java programs.

## Task

- [x] Peer assess Unit 2 Programming Assignment
- [x] Read the Learning Guide and Reading Assignments
- [ ] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [ ] Complete an entry in the Learning Journal
- [ ] Take the Self-Quiz
Take the Graded Quiz

## Reading Assignment

- Chapter4
  - 一番知りたいこと
    - formal parameterとacutual parameterがそれぞれどのような概念なのか
    - formal parameter
      - サブルーチンに渡される値を示すために、メソッドで使用されるもの
      - これは、わかりやすく単純な識別子である必要がある
    - acutual parameter
      - 実際にメソッドに渡される値
      - これは、形式パラメータに問題なく代入できる値である必要がある。定義がfloatならfloat型、intならint型の値を与える。

## Discussion Forum

Discuss the concept of parameters. What are parameters for? What is the difference between formal parameters and actual parameters? Give an example in Java code that illustrates formal parameters and actual parameters.

プログラムを実装する上では、サブルーチンやメソッドと呼ばれるものを利用します。テキストによるとサブルーチンは、"A SUBROUTINE CONSISTS OF INSTRUCTIONS for performing some task"(Eck, 2019)とされ、特定の動作をする一連の処理をまとめて定義したものとなります。例えば、「半径xの球の体積を求める」「文字列をパースし、必要な情報だけ抜き出す」などです。ではなぜ、このサブルーチンのような仕組みを利用するのでしょうか？それは、プログラムを実装する上でサブルーチンの中を理解することが本質的に重要ではなく、あくまでその結果をどのように活用するかが重要であるからです。しかし、サブルーチンが具体的にどのような操作をしているか把握していなくても、なんらかのインターフェースが必要になります。このインターフェースがパラメータです。先ほどの例に戻るとパラメータは以下のような内容になります。
半径xの球の体積を求める
パラメータは半径
文字列をパースし、必要な情報だけ抜き出す
パラメータは
次に具体的なプログラムを利用しながらパラメータについて確認します。パラメータはformal parameters and actual parametersの二つがあります。テキストによると" Parameters in a subroutine definition are called formal parameters or dummy parameters. The parameters that are passed to a subroutine when it is called are called actual parameters or arguments. "(Eck, 2019)説明されています。
この内容について、球の体積を求めるサブルーチンを利用して説明します。

サブルーチンCalVolofSphereとそれを利用するmainメソッドがあります。この時、CalVolofSphereの中で利用されるRadiusという変数は実際の値を持たず、サブルーチンの中でパラメータがどのように利用されるかを示したものになります。このパラメータがformal　parametetです。
次に、mainメソッドでCalVolofSphereを呼び出している部分を確認すると、r=1と5という値が引数として与えれれていることがわかります。このように、実際の処理に渡される値のことをacutual parameterと呼びます。

## Written Assignment

## Learning Journal
