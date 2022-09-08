# unit1

## Goal

- By the end of this unit, I will be able to:
  - Identify the basic elements of a Java program.
  - Describe the difference between syntax errors and semantic errors.
  - Apply an understanding of operator types and precedence in Java expressions
  - Write and run a simple Java program.

## Task

- [x] Reading assignment
- [x] DF
  - [x] first post
  - [x] reply three classmate
- [x] PA
- [x] LJ
- [x] Self-Quiz

## Reading Assignment

- Chapter 1
  - プログラミングを学ぶ前の心構えとして、プログラムがどのように動作するのかを説明している
  - プログラムの実行にはコンパイルが必要で、環境ごとにコンパイルした資源を作成する必要がある。
  - Javaはコンピュータに向けてコンパイルするのではなく、JVMに向けてコンパイルする
    - こうすると、JVMさえ導入してあれば、コンパイルしたJava Bytecodeをどのような環境でも実行することができる、これがJavaの非常に優位な点。
  - プログラミングはもともとトップダウン的なアプローチだったが、ボトムアップ的なアプローチが標準的なものになってきた
    - ボトムアップアプローチとは？
      - 解決方法がわかっているモジュールを差し込むことで、全体的な問題解決を図るやり方、プログラマは基本的に怠惰で、再利用可能なものはどんどん再利用しようとするため、このような考え方が広がるのはある種当然
  - オブジェクト指向プログラミング（OOP）
    - データやサブルーチンを含む、オブジェクトを中心として開発を行う。
    - 具体的なアプローチとしては、問題に関与するオブジェクトとそれが応答すべきメッセージを特定することから始まる。
  - 1
- Chapter 2
  - 基本的なJavaプログラムの作成を行う。
  - syntax
    - Human Languageとは異なる、Programming Languageの文法のこと。
    - syntaxを満たしていないプログラムはコンパイルすることができず、機械語に翻訳することができない
  - semantics
    - プログラムで表現したルールなど、どのような動作をプログラムに求めるのかのルール
  - programics
    - syntaxもsemanticsも満たしていれば良いわけではない、保守性や可読性に優れていなければプログラムは再利用できず陳腐化する。このような要素のことを指す。
  - valiable
    - データはメモリ上のどこかの領域に格納されている。この領域はプログラマは自分達で管理したくないので、変数と呼ばれるメモリ上の位置の名前をわかりやすくしたものを介してアクセスを行う
  - Literal
    - プログラムが扱う定数値のこと。明確にリテラルであることを示すためにシングルクォードなどで囲んで表現する。
  - 環境構築
    - java17

## Discussion Forum

- Explain what is meant by the syntax and the semantics of a programming language. Give Java examples to illustrate the difference between a syntax error and a semantics error. Use different examples than those found in the textbook.

- Answer
  - JA
    - Javaに代表されるプログラミング言語は、特定の目的を解決するために作成され、そこにはいくつかのルールが存在します。今回のディスカッションではそのルールについて説明します。
    - まず、syntaxについてです。プログラムを実行するためには、コンパイルと呼ばれる、コンピュータに命令を行うために機械語に翻訳する必要があります。コンパイルを行うためには、プログラミング言語ごとに規定された文法を満たしている必要があり、満たしていない場合には実行することすらできません。このように、プログラミング言語ごとに規定され、プログラムを実行することができるものか判断するルールをsyntaxと呼びます。これは、Eclipseなどでエラー表示されるため、比較的発見が簡単です。
    - 次に、semanticsについてです。プログラムは特定の目的を解決するために作成されます。このようなプログラム自体に求める動作のことをsemanticsと呼びます。semanticsが適切な状態であるかどうかは、デバッグやテストによってしか発見することができず、発見することが難しいものとなります。
    - この二つのルールを、javaのプログラムを利用して誤った状態になっている場合の例を記載します。
    - syntax error
      - javaは行の最後に";"を付与する必要があります。この";"を忘れるとエラーとなります。以下のプログラムは;で行を終わらせるというsyntaxを満たしておらず、実行することができません。
    - semantics error
      - 私は、nameという変数に格納した名前と"Hello!"という文字列を結合したものを出力しようとしました。しかし、以下のプログラムは適切な出力ができません。

syntaxとsemanticsのそれぞれについて例を利用しながら非常に良く説明されています。あなた自身が非常に良く理解できていることが感じられました。
Hi Vikas,
Each of the syntax and semantics is explained very well with the use of examples. I could sense that you have a very good understanding of the subject yourself. Good work!

syntaxとsemanticsについて、特にsemanticsの具体的な例を複数あげながら説明している点が素晴らしいと感じました。また、コードも非常に簡潔で読みやすいです.
Hi Pyae,
I found the explanation of syntax and semantics, especially the multiple concrete examples of semantics, to be excellent. The code is also very concise and easy to read. Good work!

テキストの引用を行いながら非常に良く説明されています。semanticsの例として挙げられている初期化忘れは、良く発生するものですね。。私も気をつけます。
Hi Frank,
The semantics example of forgetting to initialize is a common occurrence. I will take care of it. Good work!

## Written Assignment

## Learning Journal

私は今週のユニットで大きく二つの事項を学びました。
一つ目は、javaプログラムを実装してから動作するまでの流れについてです。教科書では、javaファイルをJVMに向けたjava bytecodeに変換していると説明がありました。私自身javaの開発に何度か携わったことがあったため、これがどれほどインパクトの大きい事項であるか理解しているつもりです。様々な環境(windows,macOS, distributionの異なるLinuxなど)それぞれに対して開発を行うことや、Linux環境のみを利用した開発は開発者のスキルに依存する部分があり非常に難しいものがあります。javaに代表される最近の言語はこの点を考慮している点が素晴らしいことだと考えています。
二つ目に学んだ事項としては、プログラムを作成する上でのルールについてです。大きくsyntax、semantices、pragmaticsの3つがあります。まずsyntaxはプログラム言語を実装する上でのルールです。javaを例にすると、プログラムはコンパイルという操作を経て機械が認識できる形式に変換されます。このコンパイルの操作を行う際に特定の形式を満たしていないと、syntaxエラーとなります。代表的なものとして、文末の;を忘れてしまうことなどが上げられます。
次に、semanticsはプログラムのある入力に対して一定の出力を定義するなど、プログラムに求める動作のことを指します。このエラーはコンパイルなど機械的に発見することが難しく、デバッグやテストなどの工程を経て確認を行います。個人的に一番発見が難しいエラーだと考えています。
最後に、pragmaticsです。programicsはプログラム自体の構文を人間が解釈するためのルールです。個人でプログラムを作成している場合はあまり大きな問題にならないかもしれませんが、大人数が関わるプロジェクトなどで、各開発者が独自の実装を行うとプログラムの解釈が非常に難しくなります。解釈を簡単に、かつ品質を均質化するためにコーディング規約などで一定のルールを設けてプログラム全体が一貫した作りとなるようにします。大量にネストされたif文などはそれ自体を読むことが苦痛なので、このような人間が解釈しにくいものについては出来るだけ実装段階から排除する工夫が必要だと考えています。
また、今回のユニットにおけるクラスメイトからの指摘や、クラスメイトのディカッションポストによって自身の理解を深めることができた点が素晴らしいことだったと考えています。例えば、クラスメイトから"The code that you wrote is pretty simple and I think that it is handful for the first time with java but you could include more illustrations from the textbook and more functions to make is look more formidable."といったコメントがありました。私自身としては、説明や例示が足りていると考えていても、他の人から見るとまだまだ例示や説明が足りていないことの証拠となります。私の投稿がクラスメイトからどのように見えているのか、どの程度私と周りの感覚がずれているのかについて、このコースで理解を深めたいと思います。

I learned two major matters in this week's unit.
The first is about the process of implementing a java program and then making it work. The textbook explained that java files are converted to java bytecode for the JVM. I have been involved in java development several times, so I understand how impactful this is. I think it is great that recent languages, such as java, take this into account. I think it is wonderful that recent languages such as java consider this point.
The second thing I learned was about the rules of programming. There are three main types of rules: syntax, semantics, and pragmatics. First, syntax is the rule for implementing a programming language. java, for example, is a program that is converted into a machine-recognizable format through an operation called compilation. If this compilation operation does not meet a certain format, a syntax error occurs. Typical examples include forgetting the ";" at the end of a sentence.
Next, semantics refers to the behavior required of a program, such as defining a certain output for a certain input of the program. This error is difficult to detect mechanically, such as by compilation and is checked through processes such as debugging and testing. I consider it the most difficult error to detect.
Finally, pragmatics are rules for human interpretation of the syntax of the program itself. This may not be a major problem for an individual programmer, but in a project involving a large number of developers, it can be very difficult to interpret the program if each developer implements his or her implementation. To simplify interpretation and ensure uniform quality, a coding rule should be established to ensure that the entire program is consistent. Since it is painful to read a large number of nested if statements, we believe it is necessary to eliminate such statements that are difficult for humans to interpret from the implementation stage as much as possible.
I also think it was great that I was able to deepen my understanding of the unit with the help of my classmates' pointers and their discussion posts. For example, a classmate said to me "The code that you wrote is pretty simple and I think that it is a handful for the first time with java but you could include more illustrations from the textbook and more functions to make is look more formidable.". I have heard comments such as "I'm not sure what you mean by that. Even though I think that I have enough explanations and examples, others see it as evidence that I am still lacking in examples and explanations. I hope to gain a better understanding in this course of how my classmates see my contributions and the extent to which my perceptions are out of sync with theirs.

Reference:
Eck, D. J. (2019). Introduction to programming using Java, version 8.1. <http://math.hws.edu/javanotes>.
