# unit8

- Topics:
  - Object-Oriented Features Used in Programming
  - Practice with Inheritance and Polymorphism

## Goal

- By the end of this Unit, you will be able to:
  - Analyze the use of object-oriented programming.
  - Examine the different features of object-oriented programming.

## Task

- [x] Peer Assess unit7
- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

## Reading Assignment

- Chapter 5
  - Section 5.2 Constructors and Object Initialization
    - オブジェクト自体を生成するために利用する。オブジェクトのフィールドの初期化や外部リソースの準備を行う
  - Section 5.5 Inheritance, Polymorphism, and Abstract Classes
    - 継承:元になるクラスを引き継ぎながら、新しい機能を追加したり元の機能を上書きする仕組み
    - 継承先(サブクラス)で異なる挙動をさせたい場合は、抽象クラスを用意しサブクラス側で具体的な仕組みを実装する
      - このようなことをする理由は何か？
        - メソッド名が同一ということは、ユーザ側にとってメリットとなる場合があるため
  - Section 5.6 this and super
    - 特別変数
  - Section 5.7 Interfaces
    - Javaでは多重継承が認められていないため、継承したいメソッドがある場合は一つの親クラスにまとめる必要がある。この部分を解消する方法としてインターフェースがある。インターフェースは、抽象クラスで実装だけ用意して、サブクラス側の実装を行わせる。

## Discussion Forum

Quiz.javaはunit2での提出から、unit7における提出まで大きな変化がありました。この変化について、オブジェクト指向の概考え方がどのように用いられているかを説明します。
元々Quiz.java、複数の質問に対する回答を画面に表示するという"メソッド"が実装されていました。しかし、unit7で提出したQuiz.javaは問題文とその回答を保持し、特定のメソッドを呼び出すだけになっています。これは、オブジェクト指向の考え方によって、"回答を判定する処理"や"回答を表示する処理"、"正答数を記録する処理"をまとめることができたために実現することができています。実現にあたっていくつかの概念が必要となりましたのでそれぞれ説明します。
インスタンス変数
インスタンス変数は、それぞれのインスタンスに属する変数です。Quizプログラムでは、一つ一つの問題をインスタンスとして生成しているため、問題文自体やその回答をインスタンス変数として保持しました。
クラス変数
クラス変数は、全てのインスタンスで共有したい共通情報に利用します。Quizプログラムでは、"問題数"と"正答"数は全てのインスタンスで共有したい情報なので、クラス変数として定義しました。
継承
継承は元になるクラスを引き継ぎながら、新しい機能を追加したり、元の機能を上書きしたりする仕組みです。Quizプログラムでは、T/Fで答えさせるパターンと5つの選択肢から正当を選ばせるパターンの二つの実装を行いました。この二つのプログラムでは共通して、"現在の問題数と正答数を出力する"機能や"特定のフィールド情報で初期化したい"といった要件があるため、それらの機能をQuestion.javaに実装した上で、MultipleChoiceQuestion.javaやTrueFalseQuestion.javaにて継承することで、同じ仕組みを複数回実装することを伏せずことができました。
ポリモーフィズム、抽象クラス
Quizプログラムでは、画面に表示したウィンドウに対して選択肢や問題文を追加する処理がMultipleChoiceQuestion.javaとTrueFalseQuestion.javaで異なる挙動となります。このように継承先で異なる挙動をさせたい場合、ポリモーフィズムという考え方を利用して、サブクラス側で具体的な実装を行うことが可能です。この場合、親クラスは抽象クラスとして宣言する必要があります。
this,super
継承を行ったクラスは親クラスのフィールドにもアクセスすることが可能です。しかし、同一名で定義されていることがあるので、thisとsuperという特殊変数を利用して、具体的なアクセス先を記載することが必要です。Quizプログラムでは、親クラスのコンストラクタを実行するためにsuperを利用し、自分自身のインスタンス変数であることを明言するためにthisを利用しました。
インターフェース
Javaでは多重継承が認められていません。そのためQuestionDialog.javaでは、JDialogというクラスを継承した上でActionlisnerをインターフェースとして追加しています。このように、複数のクラスから実装を利用したい場合、親クラスとインターフェースを利用して実装を行うことが大切です。
イベントリスナー
Quizプログラムでは、ユーザからの画面操作を待ち受ける必要があります。具体的には、ウィンドウのボタン押下です。このボタン押下のような事象は、プログラムはイベントとして検知することが可能です。このようなイベントを検知するインターフェーズがイベントリスナーです。QuestionDialog.javaにて、actionPerformedメソッドの実装に画面を選択したイベントを検知するリスナーを定義しています。

## Written Assignment

## Learning Journal
