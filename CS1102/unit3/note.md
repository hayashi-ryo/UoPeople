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
- [x] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [x] Complete an entry in the Learning Journal
- [x] Take the Self-Quiz
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

今週のユニットでは、サブルーチン(Javaではメソッドと呼ばれることもある)やLambda Expressionsなど、Javaアプリケーションの実装を進める上で非常に重要な概念を学びました。

まず、サブルーチンはテキストによると以下のように説明されています。
"A SUBROUTINE CONSISTS OF INSTRUCTIONS for performing some task"(Eck, 2019)
これは、特定の動作をする一連の処理をまとめて定義したもので、繰り返し似た処理を行う場合や、複数人で開発を行う場合には必要不可欠なものとなります。今回のユニットで私は「半径xの球を求めるサブルーチン」を作成しましたが、「データベースから特定の情報を抜き出す」「ファイルアップロード処理を実装する」など、さまざまな具体例があると考えています。同様の処理を繰り返し利用して問題解決を行うことは、プログラムを利用して問題を解決するために必要な基本的な思想だと考えているため、Exercisesなどを通して私自身の理解をさらに深めていきます。

次にLambda Expressionsについてです。テキストによると、Lambda Expressionsは以下のように説明されています。
"A lambda expression represents an anonymous subroutine, that is, one without a name."(Eck, 2019)
また、syntaxとしては以下のように定義されます。
( parameter-list )  ->  { statements }
Lambda Expressionsは、テキストの説明にもあるように、以下の二つの処理を同時に行う形で実装されています。

1. クラスインターフェース定義
サブルーチンに与えるパラメータを定義する。
2. 匿名サブルーチン定義
サブルーチンでどのような処理を行うのか定義する

この二つの仕組みを活用して、Lambda Expressionsという仕組みが実装されていることとその実装をどのように進めていくべきかにについては少し理解することができました。しかし、正直なところ単純にメソッドを定義して呼び出す形ではいけないのかという疑問から派生して、具体的な利用方法についてイメージすることができていません。6章や10章を学ぶ際に便利であることがテキストで説明されていたので、基本概念の定着をおこなった上で該当ユニットを楽しみに待ちたいと思います。

また、今回のディスカッションでは非常に有意義にコメントをもらうことができました。
"In this case, Radius is the formal parameter, and r is another formal parameter; it is redundant, but the redundancy explains the concept."というものです。私としては冗長なプログラムを実装したつもりではなかったのですが、コメントを確認した上で確認すると、確かに無駄な処理を実装してしまっており、自身のプログラムを見直すきっかけにすることができました。この体験によって、ディスカッションの重要性を再認識することができたので、今後の自分のコメントが今回クラスメイトからもら得たような有意義なものとできるよう学習を進めます。

今回のユニットの学習は、Javaという言語を利用したプログラミングでは非常に重要なものだったと確信しています。Lambda Expressionsなど私自身が理解を深めるために必要な領域はまだありますが、今回の静的サブルーチンと次のユニットで学習する予定である非静的サブルーチンを理解することで、スキルを向上させていきたいと思います。
