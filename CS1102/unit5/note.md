# unit5

- Inheritance: Superclasses and Subclasses
- Polymorphism: Overriding Methods
- "This" and "Super"
- Interfaces

## Goal

- By the end of this Unit, you will be able to:
  - Illustrate the uses for Java keywords "this" and "super".
  - Write Java programs that use abstract classes, inheritance, and polymorphism.
  - Interpret Java programs that use inheritance, polymorphism, and interfaces.

## Task

- [x] Peer assess Unit 4 Programming Assignment
- [x] Read the Learning Guide and Reading Assignments
- [x] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [x] Complete an entry in the Learning Journal
- [x] Take the Self-Quiz

## Reading Assignment

- Chapter 5
  - section 5.5
    - 継承とポリモーフィズム
      - 継承
        - サブクラスとして拡張したい場合、拡張という概念を用いる
        - この場合、元のクラスのメソッドや変数は全て生成され、加えて独自に生成された要素にアクセスすることができる。
        - このように、構造や振る舞いの一部または全てを利用することを、継承とよぶ。Aを継承してBを定義する場合の呼び出し方をいかに記載する、

        ```java
        class B extends A {
        method
        variable
        }

        ```

      - ポリモーフィズム
        - メソッドが継承先クラスに依存するような形で変化する場合がある
        - このような場合は、実行されるオブジェクトに応じて適用されるメソッドが異なる
        - このような特性のことをポリモーフィズムと呼ぶ
        - スーパークラスを定義した時点では具体的な動作を指定しなくても、メソッドの形だけ用意しておきそれぞれの具体的な処理はサブクラス側で定義することができる。
    - section 5.6
      - this and super
        - thsi
          - あるオブジェクトに属する変数に外部からアクセスする場合はA.variableのような形で定義する
          - では、オブジェクトの中でアクセスするためにはどのようにしたら良いか
          - 答えはthisを利用して、this.variableのような形でアクセスする。もちろんメソッドも同様の形でアクセスすることができる。
        - super
          - superという特殊変数は、スーパークラスに属するメソッドや変数を参照するために利用される
          - これは、super classの特定の要素にアクセスしたい場合などに利用される。
          - たとえば、継承元クラスの特定のメソッドを全てオーバーライドした上で、少しだけメソッドを追加したい場合がある。この場合は以下のように記載を行うと便利である。

          ```java
          // スーパークラスのroll()メソッドを全て実行した上で、redrwo()というメソッドを実行する形を定義することができる。
          public void roll() {
            super.roll()
            redraw()
          }
          ```

    - Section 5.7
      - Interfaces
        - Javaでは多重継承はできない。その代わりにインターフェースという機能が存在する。
        - interfaceで定義し、定義される側はimplementsという予約後で明示的に実装していることを表現する
        - interfaceは具体的な内容ではなく、あくまで抽象クラスと同じ位置付けとなる。
        - また、interfaceは一つのクラスに対して複数実装することができる。
    - Section 5.7
      - Nested Classes
        - クラスは入れ子構造をとることができる。

## Discussion Forum

Give examples showing how "super" and "this" are useful with inheritance in Java. Include examples of using "super" and "this" both as constructors and as variables.

クラスメイトの皆さんこんにちは。今回の課題に関する私の見解を説明します。
thisとsuperについて説明する前に、まず今回のunitのテーマでもある”継承"について触れる必要があります。テキストの継承の説明は以下の通りです。
"The term inheritance refers to the fact that one class can inherit part or all of its structure and behavior from another class. "(Eck, 2019)
これは、既に存在するクラスを利用しながら新しいクラスを"少しの修正で"作成する、非常に有意義な方法です。thisとsuperは、このような継承を利用するために用いられる、特別な変数です。作成したコードを用いて。これらに特殊な変数について説明します。
私は、今回のディスカッションのために、継承元となるclass"Person"とPersonを継承して作成したclass"BuisinessPerson"、そしてそららを呼び出すclass"PersonBasic"を作成しました。
まずは、class"Person"についてです。
図を挿入
このクラスは以下の要素や振る舞いをします。

1. 要素として、名前・年齢・誕生日をもつ
2. 名前と年齢を出力するshowPerson()メソッドがある
3. 誕生日を出力するshowBirthdayu()メソッドがある。

ここで、class"Person"のコンストラクターに注目します。例えば、名前の定義がthis.name=name;となっています。これは、パラメータとして与えられた形式パラメータであるnameを、インスタンス内部で参照できるnameに代入する操作です。このように、特定のインスタンス内部で変数やメソッドを扱いたい場合には、特殊変数thisを利用してアクセスすることが可能です。

次に、Personを継承して作成したclass"BuisinessPerson"についてです。
図を挿入
このクラスについて、一つ一つ確認します。まずはコンストラクターについてです。コンストラクーの記載がsuper(name,age)となっています。これは継承元クラスであるPersonのコンストラクターを呼び出している操作です。このように、継承元クラスの特定要素に明示的なアクセスを行いたい場合に特殊変数superを利用します。
次に、メソッドについてです。showPerson()メソッドが特殊変数superと新たな処理によって定義されています。このように、継承元クラスと同名のメソッドを定義して、新たな処理を定義することをオーバーライドと呼びます。BusinessPersonでは、superによってclass"Person"のshowPerson()メソッドを呼び出し、その上でclass"BusinessPerson"特有の処理を追加しています。

最後に、classの呼び出しを行うPersonBasicおよびその出力結果についてです。
図を挿入。
出力からわかるように、オーバーライドしたメソッドや記述していないメソッドにアクセスできていることがわかります。

## Written Assignment

## Learning Journal

今週のユニットでは、クラスの継承と継承を行う際の特別な変数について学びました。これらの概念について、私の理解が学習を行うための作業を説明します。

まず、クラスの継承についてです。一度設計したクラスに新たなメソッドを追加したり、変数を追加したい場合があります。このような場合、新たなクラスを0から作成するのではなく、継承と呼ばれる概念を利用することができます。この概念の理解には、テキストの以下の記載が役に経ちました。
"Object-oriented programming allows classes to inherit commonly used state and behavior from other classes. In this example, Bicycle now becomes the superclass of MountainBike, RoadBike, and TandemBike."(Gallardo et al., 2016)
この概念は、一度作成したクラスに実装されている内容を無駄にせず有効活用できる非常に便利な方法だと考えています。しかし、継承元と継承先をどのように分割するのか、という部分については非常に注意が必要な領域です。
また、クラスの継承はポリモーフィズムと呼ばれる要素も持ちます。ポリモーフィズムを私の言葉で一番シンプルに説明すると、"同じ名前のメソッドが異なる挙動をする”ということです。たとえば、"図形"というクラスをスーパークラスとして、"三角形"と"四角形"をサブクラスとして定義する場面を考えます。ここで、"面積を求める"メソッドを定義する場合、同一メソッドがクラスによって異なる振る舞いをします。このような場合には、スーパークラスにて抽象的なメソッドを定義し、サブクラスにて具体的な処理を記載することで実装を行います。ポリモーフィズムは、振る舞いが異なるがメソッド名を統一したい場合に、便利に活用することができる概念です。

次に、特殊変数"super"と"this”についてです。それぞれの変数を一言で説明した内容を以下に記載します。
super:継承元クラスを参照する
this:現在のインスタンス自体を参照する
物事をオブジェクトとして定義し、継承を行うことでメソッドの実装を最小限に抑えるオブジェクト指向プログラミングでは、この二つの特殊変数は間違うことなく利用しなければならない概念です。

これらの概念を学ぶために、昔使っていたJavaのテキストを利用して復習を行いまいた。非常に簡単なクラスで概念について理解を行った上で、具体的な利用方法について学ぶことができるため、今回のユニットの目標を達成することができたと考えています。

最後に、先週のlearning journalにて目標としてあげた計画的な作業進行について、今週のユニットではうまく進めることができました。スケジュールの管理方針として学んだUNIV1001クラスの内容が生きていると感じることができ、非常に嬉しく思っています。

References:
Gallardo, R., Hommel, S., Kannan, S., Gordon, J., and Zakhour, S.B. (2016). The Java tutorials. Oracle.
Retrieved from <https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html>
