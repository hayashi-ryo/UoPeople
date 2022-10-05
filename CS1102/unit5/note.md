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
- [ ] Complete an entry in the Learning Journal
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
