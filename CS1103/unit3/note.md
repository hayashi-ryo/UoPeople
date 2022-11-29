# unit3

- This unit will address the following topics:
  - Abstract data types
  - Stacks
  - Queues
  - Binary Trees

## Goal

- Continue the study of data structures by understand ADTs.
- Study and practice stacks and queues.
- Learn about applying binary trees to advanced programming tasks.

## Task

- [ ] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [ ] Programming assignmet
  - [x] peer assessment
  - [ ] submit unit3
- [ ] Take Self-Quiz
- [ ] Take Graded-Quiz
- [ ] Learning Journal

## Reading Assignment

- Section 9.3: Stacks, Queues and ADTs
  - ADTとは、とりうる値とその値に対する操作の集合を指す。
  - 例えば、スタック型のリストを作成する時に、内部実装は、リンクリストでも配列としてもよい。このことは、外部IFを変更せずに内部仕様を修正することができ非常に優位に活用できる。
- Section 9.4: Binary Trees

## Discussion Forum

Using ADTs (abstract data types) has advantages for program modularity. Discuss

クラスメイトの皆さんこんにちは、今回のテーマに関する私の見解を説明します。
今回の主題について考えるためには、はじめにモジュール化について議論する必要があります。
Jaca Documentationによれば、モジュール性の利点として、二つ挙げられています。
・特定のオブジェクトのソースコードを他のオブジェクトとは独立して管理することができる
・一度作成したオブジェクトをシステム内で簡単に移動することができる。(Gallardo et al., 2016)
この概念は、CS1102のコースで学んだオブジェクト指向プログラミングの概念そのもので、ロジックの実装部分とその利用者の分離や、メソッドの再利用を便利に行うことができるものです。この前提を踏まえた上で、ADTsについて考えます。
ADT(abstract data types)は、テキストで以下のように説明されます。
The term abstract data type, or ADT, refers to a set of possible values and a set of operations on those values, without any specification of how the values are to be represented or how the operations are to be implemented. (Eck, D. J. 2019)
例えば、「数値の集合とその平均値を返す操作」や「配列の昇順ソート操作」などを指し、オブジェクト指向プログラミングに置けるclass(データ)とメソッド(操作)を組み合わせた概念と考えられます。このADTsの概念を利用することで、利用者はデータの定義と操作のIFのみを把握しておれば良いです。もし、ADTsを利用せずにスタックの操作を実装する場合、利用する箇所全てでスタックの操作や利用するデータ型に関して定義を行う必要があり、重複したプログラミングが存在する非常に冗長なコードとなってしまいます。

References:
Eck, D. J. (2019). Introduction to programming using Java, version 8.1. Hobart and William Smith Colleges. <http://math.hws.edu/javanotes>
Gallardo, R., Hommel, S., Kannan, S., Gordon, J., and Zakhour, S.B. (2016). The Java tutorials. Oracle.
Retrieved from <https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html>

## Written Assignment

## Learning Journal
