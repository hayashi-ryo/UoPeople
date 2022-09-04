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
  - [ ] reply three classmate
- [x] PA
- [ ] LJ
- [ ] Self-Quiz

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

- EN

  -

## Written Assignment

## Learning Journal
