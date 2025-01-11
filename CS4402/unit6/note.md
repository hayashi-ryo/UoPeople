# unit6

- Overview of Object Oriented Programming
- Classes and Objects
- Encapsulation
- Inheritance
- Dynamic Polymorphism
- Structuring Classes
  - Abstract classes
  - Generics
  - Multiple Inheritance
- Class data
  - constructors
  - destructors
  - Garbage collection

## Goal

main

- Understand the concept of functional decomposition and how it relates to object oriented design.
- Understand object oriented concepts including Encapsulation, Inheritance, and Dynamic Polymorphism as they are implemented in Object Oriented Languages
- Be able to articulate how object oriented programming differs from procedural programming and the benefits of object oriented design
- Understand and be able to describe methods of structuring classes including abstract classes, generics, and multiple inheritance
- Be able to articulate the role of constructors and destructors and the process of garbage collection

ja

- 機能分解の概念とオブジェクト指向設計との関連性を理解する。
- オブジェクト指向言語で実装されているカプセル化、継承、動的ポリモーフィズムなどのオブジェクト指向の概念を理解する
- オブジェクト指向プログラミングが手続き型プログラミングとどのように異なるか、またオブジェクト指向設計の利点を明確に説明できる
- 抽象クラス、ジェネリクス、多重継承を含むクラス構造化の方法を理解し、説明できる
- コンストラクタとデストラクタの役割、およびガベージコレクションのプロセスを明確に説明できる

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

Ben-Ari, M. (2006). Understanding programming languages. Weizman Institute of Science.
  Read the following chapters:
    Chapter 14  - Object-Oriented Programming
    Chapter 15  - More on Object-Oriented Programming

## Discussion Forum

Question 1: Conduct an internet search and library research of the concept ‘Generics’ or ‘Generic Programming’ and report your findings as the response to this discussion question.  As part of your response you must define what generics are, why it they are important in OOP and you must provide examples of generics used within an object oriented program.
You are expected to make a minimum of 3 responses to your fellow student’s posts.

Question 2: Conduct an internet search and library research of the concept ‘Open Recursion’ and report your findings as the response to this discussion question.  As part of your response you must define what it is, why it is important in OOP and you must provide examples of how it can be used with an object oriented program.  This assignment is not about a specific programming language, however you may select a specific object oriented programming language as an example to illustrate open recursion.
You are expected to make a minimum of 3 responses to your fellow student’s posts.

Please note that you are expected to answer both questions in order to receive full marks for the discussion forum assignment.

質問1: 「ジェネリック」または「ジェネリックプログラミング」という概念についてインターネット検索およびライブラリリサーチを行い、このディスカッションの質問への回答として調査結果を報告してください。回答の一部として、ジェネリックが何であるか、なぜオブジェクト指向プログラミング（OOP）において重要なのかを定義し、オブジェクト指向プログラムで使用されるジェネリックの例を提供する必要があります。また、クラスメイトの投稿に最低3回の返信を行うことが求められます。

質問2: 「オープンリカーション」という概念についてインターネット検索およびライブラリリサーチを行い、このディスカッションの質問への回答として調査結果を報告してください。回答の一部として、それが何であるか、なぜOOPにおいて重要なのかを定義し、オブジェクト指向プログラムでどのように使用できるかを例を挙げて説明する必要があります。この課題は特定のプログラミング言語に限定されるものではありませんが、オープンリカーションを説明する例として特定のOOP言語を選択しても構いません。また、クラスメイトの投稿に最低3回の返信を行うことが求められます。

### Japanese Discussion

#### Question 1

ジェネリックプログラミングは、パラメータ化された型を利用することで、コードの再利用性と型安全性を向上させる技術です。オブジェクト指向プログラミング（OOP）の枠組みにおいて、ジェネリックは柔軟性のある設計を実現し、抽象化を強化する重要な役割を果たします。本回答では、ジェネリックの定義とそのOOPにおける重要性を説明し、具体的な使用例を挙げてその利点と課題を考察します。

**ジェネリックの定義**
ジェネリックとは、型をパラメータとして取り扱うことを可能にするプログラミング手法を指します。ジェネリックの目的は、データ型に依存しない汎用的なコードを記述することであり、これによりコードの再利用性と型安全性が向上します（Ben-Ari, 2006）。具体的には、ジェネリックは次の2つの主要な特徴を備えています：

1. パラメータ化された型の使用：ジェネリックは、特定のデータ型に依存しないコードを記述するために、型を引数として受け取ります。これにより、同一のロジックを異なるデータ型に適用可能です。
例: C++のテンプレート (template<class T>) は、汎用的な関数やクラスを記述するための典型的な手法です。
2. 型安全性の向上：ジェネリックを使用することで、コンパイル時に型に関するエラーを検出できるため、ランタイムでの予期しない型エラーを防ぐことができます。

**OOPにおけるジェネリックの重要性**
OOPの設計原則において、ジェネリックは抽象化、モジュール化、再利用性の向上に寄与します。以下に、OOPにおけるジェネリックの具体的な重要性を詳述します：

1. 抽象化とモジュール化
ジェネリックは、型を抽象化することで、特定の型に依存しないモジュールを構築することを可能にします（Ben-Ari, 2006）。例えば、Javaのジェネリックコレクション（ArrayList<E>など）は、任意のデータ型を受け入れることができるため、異なる用途に応じた再利用が可能です。

2. 型安全性とエラー削減
ジェネリックを使用することで、コンパイル時に型の整合性がチェックされるため、ランタイムエラーのリスクが大幅に低減されます。これにより、複雑なプログラムにおけるデバッグ作業が軽減され、保守性が向上します。

3. 開発効率の向上
ジェネリックを使用することで、同じロジックを複数のデータ型に適用可能となり、重複したコードを書く必要がなくなります。これにより、開発時間の短縮と保守性の向上が実現します。

4. 実例: JavaとC++におけるジェネリック
Java: `List<E>`を用いることで、型安全で拡張可能なコレクションを提供。
C++: テンプレート機能を用いた汎用的な関数やクラスの定義。

**オブジェクト指向プログラムでのジェネリックの使用例**

例1: Javaのジェネリッククラス
Javaでは、ArrayList<E>のように、ジェネリック型を利用して型安全なコレクションを作成できます。

```java
ArrayList<String> list = new ArrayList<>();
list.add("Hello");
String value = list.get(0); // 型安全
```

例2: C++のテンプレート
C++では、テンプレートを使用して汎用的な関数を作成できます。

```cpp
template <typename T>
T add(T a, T b) {
    return a + b;
}
int main() {
    cout << add(5, 10) << endl; // 出力: 15
    cout << add(3.5, 2.5) << endl; // 出力: 6.0
}
```

**ジェネリックの利点と課題**
利点

- 型安全性: 不正な型の使用をコンパイル時に防ぐ。
- 再利用性: 同一のコードを多様な状況で利用可能。
- 拡張性: 新しい型に容易に適応できる。
課題
- 学習曲線: 初学者にとって抽象的な概念が難解。
- 言語ごとの制約: 例えば、Javaでは型消去によりランタイムでの型情報が失われる問題がある（Ben-Ari, 2006）。

**結論**
ジェネリックは、OOPにおいて抽象化を実現し、開発効率とプログラムの品質を向上させる重要な概念です。特に、大規模なシステムや複雑なデータ構造を扱う際にその価値が発揮されます。今後、ジェネリックのさらなる進化がプログラミングの可能性を広げるでしょう。

#### Question 2

Open Recursion（オープンリカーション）は、オブジェクト指向プログラミング（OOP）において、サブクラスがスーパークラスのメソッドを再利用しつつ拡張するための仕組みです。この概念は、コードの再利用性と設計の柔軟性を高める重要な役割を果たします。本回答では、オープンリカーションの定義、OOPにおける重要性、具体的な使用例、利点と課題を順に考察します。

**オープンリカーションの定義**
オープンリカーションとは、スーパークラスのメソッドを呼び出してその処理を再利用しつつ、サブクラスで独自の処理を追加するプログラミング手法です。これには、superやselfなどのキーワードを使用して、スーパークラスのメソッドを「自己参照」する仕組みが含まれます。
通常の再帰（関数が自身を呼び出す）とは異なり、オープンリカーションではクラス間の継承関係を活用します。スーパークラスが提供する汎用的な振る舞いに加え、サブクラス固有の動作を柔軟に組み込むことが可能です。
例えば、Pythonではsuper()を使用して、スーパークラスのメソッドを呼び出します。

```python
class Parent:
    def greet(self):
        print("Hello from Parent")

class Child(Parent):
    def greet(self):
        super().greet()  # Parentのgreetを呼び出し
        print("Hello from Child")

child = Child()
child.greet()
```

**OOPにおけるオープンリカーションの重要性**

1. 設計の柔軟性
オープンリカーションは、スーパークラスの振る舞いをそのまま利用しつつ、新しい振る舞いを追加することを可能にします。これにより、スーパークラスを改変することなく、サブクラスで動作を拡張できます。
2. コードの再利用
スーパークラスが提供する基本的な機能をそのまま活用できるため、重複したコードを記述する必要がなくなります。これにより、開発効率が向上し、コードの一貫性も保たれます。
3. カプセル化の維持
スーパークラスの内部実装を隠蔽しながら、特定の振る舞いを拡張可能です。これにより、OOPの重要な原則であるカプセル化を維持しながら柔軟な設計が実現します。

**オブジェクト指向プログラムでのオープンリカーションの使用例**
Rubyの例
Rubyでもsuperを使用してスーパークラスのメソッドを呼び出します。

```ruby
class Parent
  def greet
    puts "Hello from Parent"
  end
end

class Child < Parent
  def greet
    super
    puts "Hello from Child"
  end
end

child = Child.new
child.greet
```

**オープンリカーションの利点と課題**

1. 利点

- 再利用性の向上: スーパークラスの機能を活用しつつ、新しい機能を追加可能。
- 設計の柔軟性: サブクラスが独自の動作を追加できる。
- 可読性の向上: 再利用されるコードが明確で、一貫性がある。

2. 課題

- 設計の複雑化: 過剰に依存関係が形成されると、設計が複雑化する可能性がある。
- デバッグの難易度: スーパークラスとサブクラスの間の動作を追跡する必要がある。
- 過剰利用のリスク: オープンリカーションの乱用により、かえって設計が混乱する場合がある。

**結論**
オープンリカーションは、OOPにおける柔軟性と再利用性を高める重要な技術です。適切に使用すれば、コードの保守性と生産性を向上させることができます。一方で、過剰利用は設計の複雑化を招く可能性があるため、バランスの取れた設計が求められます。今後も、OOP設計におけるオープンリカーションの役割はますます重要になると考えられます。

## Learning Journal

The Learning Journal is a tool for self-reflection on the learning process. In addition to completing directed tasks, you should use the Learning Journal to document your activities, record problems you may have encountered and to draft answers for Discussion Forums and Assignments. The Learning Journal should be updated regularly (on a weekly basis), as the learning journals will be assessed by your instructor as part of your Final Grade.

Your learning journal entry must be a reflective statement that considers the following questions:

- Describe what you did. This does not mean that you copy and paste from what you have posted or the assignments you have prepared. You need to describe what you did and how you did it.
- Describe your reactions to what you did
- Describe any feedback you received or any specific interactions you had. Discuss how they were helpful
- Describe your feelings and attitudes
- Describe what you learned

Another set of questions to consider in your learning journal statement include:

- What surprised me or caused me to wonder?
- What happened that felt particularly challenging? Why was it challenging to me?
- What skills and knowledge do I recognize that I am gaining?
- What am I realizing about myself as a learner?
- In what ways am I able to apply the ideas and concepts gained to my own experience?

Finally, describe one important thing that you are thinking about in relation to the activity.
Answer all questions that apply, however, you are expected to complete the Learning Journal assignment in 400-600 words.

### Japanese Learning Journal

1. 今週の概要
今週は、オブジェクト指向プログラミング（OOP）の基礎概念と応用について深く掘り下げました。主なトピックとして、クラスとオブジェクト、カプセル化、継承、動的ポリモーフィズムなどのOOPの基本要素を学びました。また、抽象クラスやジェネリクス、複数継承といったクラス構造の手法に加え、コンストラクタやデストラクタの役割、ガベージコレクションの仕組みについても詳細に理解を深めました。これらの知識は、プログラムの柔軟性や再利用性を向上させるOOPの特長を実践的に理解するための重要な基盤となります。

2. 自分の感想
OOPの概念を再確認する中で、特に設計段階における情報隠蔽の重要性を強く感じました。例えば、ジェネリクスを利用した型安全性の確保や、動的ポリモーフィズムによる動的な振る舞いの実現が、コードのメンテナンス性と再利用性をどれほど向上させるかを学びました。一方で、複数継承の複雑さや、ガベージコレクションのパフォーマンスへの影響について議論を進める中で、OOP設計における選択肢の重要性を実感しました。特に「何をオブジェクトとするべきか」という判断が、システム全体の安定性や保守性に大きく関わることを理解しました。

さらに、Chapter 14で紹介された「オブジェクト指向設計がもたらす柔軟性」を読む中で、現実のソフトウェア開発において、要件変更に対する適応力がいかに重要であるかを再認識しました。この章の例では、抽象クラスを利用してコードの再利用性を最大化する方法が示されており、自分自身のプロジェクトにも応用できると感じました。

3. 特に深く学習したこと
ジェネリクスに関する調査では、ジェネリクスが型安全性を確保しながらコードの汎用性を高める方法について深く掘り下げました。たとえば、Javaにおけるジェネリクスの実装では、異なるデータ型を扱うリストを安全に管理する具体的な方法を理解しました。また、C++のテンプレートやAdaのジェネリックパッケージを比較する中で、異なるプログラミング言語が提供する型パラメータ機能の長所と短所を検討しました。

オープンリカーシブについては、動的ポリモーフィズムと再帰的なアルゴリズム設計の関連性を学びました。具体例として、C++で仮想関数を利用した動的バインディングによる処理の柔軟性を確認しました。この仕組みにより、派生クラスで独自の実装を追加しながらも、基底クラスの機能を活用する方法を理解しました。

さらに、ガベージコレクションの仕組みを学び、C++とJavaでの実装の違いについて比較しました。C++では明示的なデストラクタが必要な一方で、Javaでは自動ガベージコレクションによりメモリ管理が効率化されている点に注目しました。このような比較を通じて、プロジェクトの規模や要件に応じて適切な言語や手法を選択する判断力を養うことができました。

4. 今後の課題と来週に向けて
今後の課題として、ジェネリクスやオープンリカーシブを利用したプログラムを自分で設計し、実際に動作させることで実践的なスキルを身につけたいと考えています。また、複数継承の問題点を克服する設計手法や、ガベージコレクションの最適化技術についてさらに掘り下げて学ぶ予定です。来週は、これらの概念を他の学生と共有し、新たな視点を得るためのディスカッションに積極的に参加したいと考えています。
