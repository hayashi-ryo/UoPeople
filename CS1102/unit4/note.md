# unit4

- The Relationship between Objects and Classes
- Instance Methods and Variables, including Getters and Setters
- Constructors and Object Initialization
- Object-Oriented Design

## Goal

- By the end of this Unit, you will be able to:
  - Describe the relationship between Java objects and classes.
  - Define new Java classes with constructors, methods, and member variables.
  - Construct Java objects and use their methods and member variables.

## Task

- [x] Peer assess Unit 3 Programming Assignment
- [x] Read the Learning Guide and Reading Assignments
- [x] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [x] Complete an entry in the Learning Journal
- [x] Take the Self-Quiz

## Reading Assignment

- クラスは変数とメソッドを含むことができる、オブジェクトも同様。では本質的に何が異なるのか。
  - クラスはオブジェクトの生成のために利用される
  - オブジェクトはプログラムの実行に伴って生成・消滅し、同じクラスで生成されたオブジェクトは同じ構造を持つ
  - 重要な要素は、classは構造自体を示すこと、オブジェクトはclassを利用して作成されたより実態に近いもので、振る舞いや状態を示すこと

## Discussion Forum

Give an example of a class and an example of an object. Describe what a class is, what an object is, and how they are related. Use your examples to illustrate the descriptions.
Your Discussion should be at least 250 words in length, but not more than 750 words. Once you’ve completed your initial post, be sure to respond to the posts of at least 3 of your classmates.

クラスメートの皆さんこんにちは。今回のユニットでは、オブジェクト指向プログラミング(OOP)において非常に重要な要素となるクラスとオブジェクトに関して説明します。
前提として、クラスとオブジェクトは非常に密接な関係にあります。The Java tutorials. Oracle(Gallardo et al., 2016)から、私は二つの要素の重要な違いが、クラスは構造自体を説明し、オブジェクトは振る舞いや状態を示す、ということだと理解しています。この考えをさらに深めるためにPersonというクラスを考えました。

```java
public class Person {
    public String name = "default";
    public int age = 20;

    // 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String show() {
        return String.format("%s (%d yers old）", this.name, this.age);
    }
}
```

このクラスは、以下の要素を持ちます。

1. nameとageを変数として保有し、それぞれのデフォルト値は"defalut","20"である。
2. 名前と年齢を出力するshow()メソッドが実装されている。

このクラス単体では、振る舞いや状態は持たず、あくまでPersonというものがどのような要素や振る舞いをするかを説明するものとなります。次にこのクラスを呼び出すPersonBasicクラスを考えます。

```java
package unit4;

public class PersonBasic {
 public static void main(String[] args) {
  // Create a p1 object and set its name and age.
  var p1 = new Person();
  p1.name = "Yamada Taro";
  p1.age = 30;
  
  // Create p2 object in default form
  var p2 = new Person();
  
  // Output show() method results for p1 and p2 objects
  System.out.println("Output of object methods");
  System.out.println(p1.show());
  System.out.println(p2.show());
  
  // element and output in the same form as the show() method
  System.out.println("Output from element");
  System.out.printf("%s（%d years old）\n", p1.name, p1.age);
  System.out.printf("%s（%d years old）\n", p2.name, p2.age);
  }
}

```

このクラスは、Personクラスを呼び出し、p1やp2というオブジェクトを生成します。コードに記載しているように、それぞれのオブジェクトは同じ構造をしているものの、要素自体はそれぞれ異なる内容を保持しています。最後に、PersonBasicを実行した結果は以下となります。

```text
Output of object methods
Yamada Taro (30 years old）
default (20 years old）
Output from element
Yamada Taro（30 years old）
default（20 years old）
## Written Assignment
```

Personクラスで設計した通りの振る舞いをp1やp2オブジェクトがしていることがわかります。

ここまでの内容をまとめると以下となります。
class:人、犬、車など、同じ要素を含むものをまとめ、どのような要素を持つか、振る舞いをするのかの設計図
ocject:classを利用して生成され、より具体的な要素や振る舞いを行うもの

## Learning Journal

今週のユニットでは、クラスとオブジェクトという非常にJavaアプリケーションにおいて非常に重要な概念について学びました。
特に重要な概念である、クラスとオブジェクトの関係について私の理解や作業について説明します。

まず、クラスについてです。クラスについて非常に簡単な言葉で表すと、"設計図"です。特定の処理や要素をまとめてあらかじめ定義しておくことができます。クラスについて重要なポイントは、呼び出されるまで実行されず、実行したあとはすぐに消滅するという点です。引数や返り値など様々な要素があり、プログラミングを行う上では非常に重要な要素です。

次に、オブジェクトについてです。オブジェクトはディスカッションフォーラムでの話をした通り、クラスと非常に密接な関係があります。学習を始めた時点ではないようについて十分に理解することが難しかったのですが、テキストの以下の文を読んでから自分の中でのイメージが明確になりました。
"Real-world objects share two characteristics: They all have state and behavior. " (Gallardo et al., 2016)
オブジェクトはクラスを利用して生成されるものであり、本質的には「振る舞い」や「要素」について表現を行うものとなります。それぞれをjavaプログラムで言い換えると以下のイメージに結びつきます。
振る舞い：method
要素：class and instance parameter

これらの概念を学ぶための活動として自己学習も進めたが、Programming assignmentが非常に役に立ちました。unit3では静的なクラスとして定義していたクイズに関する処理が、オブジェクトとして生成することによって、より便利に使えることのイメージが湧きました。今回の課題提出には含めませんでしたが、一度生成したオブジェクトはプログラムの実行が完了するまで消滅しない特性があるので、最初に呼び出したオブジェクトをまだどこかで呼び出すといったことが可能になります。この考え方は、静的なクラス定義では実現しにくい内容です。

今回学んだオブジェクトは非常に重要な概念であり、今後もjavaの学習や実装を行う上では常に必要なものとなります。そのような際に困らないように、オブジェクトの生成について、より具体的なユースケースや分割方法について自身で学習を進めていきたいと思います。

最後に、学習した内容とは直接関連しない事項ですが、unit4では仕事が忙しくunitの初めのタイミングでディスカッションなどの課題に取り組むことができず、有意義なコメントをもらうことやクラスメートの課題にコメントすることができませんでした。せっかくクラスメートとの相互評価のプロセスが存在するので、活用するためにより計画的に進められるよう努めていきます。

References:
Gallardo, R., Hommel, S., Kannan, S., Gordon, J., and Zakhour, S.B. (2016). The Java tutorials. Oracle.
Retrieved from <https://docs.oracle.com/javase/tutorial/java/concepts/object.html>
