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

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
  - [x] peer assessment
  - [x] submit unit3
- [x] Take Self-Quiz
- [x] Take Graded-Quiz
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

今週のユニットでは、スタックやキューに代表されるADTs(abstract data types)とBinary Treesと呼ばれるデータ構造について学びました。それぞれに関する私の見解を説明します。
まず、ADTsについてです。ADTsはディスカッションでも議論したように、特定のデータとデータに対する操作の集合のことを指します。例えば、スタックというデータ構造はLIFO型の操作とそれを実現するためのデータ構造を定義する必要があり、その実装についてリンクリストと配列方式の二つを学びました。
ADTについて初めて見た際、CS1102で学習したclassと異なる概念はなんだろう、という部分が気になり自分なりに整理しました。すると、classやオブジェクトの概念に存在してADTに存在しない概念が二つ見つかりました。「継承」と「ポリモーフィズム」です。どちらの概念も、プログラムの堅牢性/モジュール性に影響を与えるものであり、プログラムの冗長化を防ぐ効果があります。このことから、大規模なプロジェクトに置いて、よりプログラムを有効に活用しながら実装を行いたい場合にクラスやオブジェクトを利用するのだと理解しています。
次に、Binary Treesというデータ構造についてです。Binary Treesは、リンクリストの参照先が一つではなく二つのオブジェクトへのポインタを含み、より複雑なデータ構造をとります。リンクした状態を図で表すと木のような形を取るため、「tree」の名前が入っています。
テキストでは、Binary Treesに操作方法についてpreorder/inorder/postorderの三つについて学びました。これらの探索アルゴリズムは、Binary Treesの整理状況や、求める操作によって変更を加える必要がある点だと考えています。例えば、整理されたBinary Treesに対して、特定の値を検索する場合を考えます。値の整理されていることから葉の値によってこれより先の葉に存在するかあたりをつけることができるので、inorder方式が適切であると考えられます。
これらの二つについて、概念自体や動作の概要レベルに関しての理解はありましたが、改めて内部構造を含めた実装を行うことは初めてだったため、非常に有意義な体験とすることができました。特に、スタックの操作について、結果として同じ動作を行う構造を複数のパターンで実装する、という体験はプログラムの最適化のプロセスにおいて非常に重要なものであると感じています。今後のユニットでも、もし自分がこのプログラムを改善するのであれば、という観点を持ち、手を動かしならが学習を進めていきたいと思います。
最後にこのユニットで一番困難だった点ですが、コースの内容というよりはGraded-Quizの準備に時間を要してしまいました。ユニットごとにSelf-Quizの復習は実施していたんものの、内容に関する復習や理解が甘いのではないか、という不安がありなかなかテストに踏み出せませんでした。自分なりの理解度の基準やその基準を達成するためのスケジュールが甘いためにこのような状況になってしまいました。このクラスでは、後2回テストを実施する機会が残っているため、しっかりとスケジュールを立てた上で対応を進めていきたいと思います。
