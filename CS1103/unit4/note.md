# unit4

- This unit will address the following topics:
  - Abstract data types
  - Stacks
  - Queues
  - Binary Trees

## Goal

- Learn about Backus-Naur Form for expressing the basic structure of human languages and conversion computer programs. See how BNF can be applied to parsers.
- Study how Generic Programming lets programmers write code that will work for many types of data.
- Learn about some of the generic data structures in the Java Collection Framework.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
  - [x] Peer Assessment
  - [x] done Lab
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Section 9.5: A Simple Recursive Descent Parser
  - プログラミング言語の構文規則は、BNF(Nackus-Naur Form)で表現されることが多い。
  - パーサーは、BNFで表現されたプログラミング言語を機械後に翻訳する役割を持つ。
- Section 10.1: Generic Programming
  - generic programmingとは、多くの種類のデータに対して動作するコードを記述すること。
    - 汎用プログラミングという概念に近い、ArrayList型はこの概念を実現しているものと言える。
  - ==を利用して等しいことをたしかめるのはそこまで簡単じゃない。オブジェクトに対して適用すると、二つのオブジェクトが等しいメモリ空間を指定しているかをテストする。
  - しかし、オブジェクト型に対する等号演算はオブジェクトのメモリ空間ではなく「同じ文字列であるか」「同じ値であるか」をテストすべきものである。

## Discussion Forum

The class Object defines an equals() method to compare objects. Specify the advantages and disadvantages of using this method and suggest an alternative for equality.

今回の課題に関する私の見解を説明します。
メリット
直感的にわかりやすい形で比較演算を行うことが可能です。オブジェクトの比較において等号演算子==を適用すると、二つのオブジェクトの内容が一致しているかではなく、メモリ空間で同一を指しているかを判定するため、想定した挙動と異なってしまいます。しかし、equialsメソッドを利用する場合、オブジェクトの内容の比較を実施することができるため、非常に直感的なプログラムとすることが可能です。サンプルプログラムを提供します。

```java
  String test = new String("sample");
  String test2 = new String("sample");

  System.out.println("equals() method : "+test.equals(test2));
  System.out.println("== operator : "+(test==test2));
```

```output
equals() method : true
== operator : false
```

このプログラムでは、基本的にequals()メソッドの場合のみtrueを出力します。

デメリット
equals()は基本オブジェクトクラスにのみ実装されている機能であるため、ユーザが独自のクラスを設計する場合はeqaulsメソッドをオーバーライドして設計する必要があります。このことは、オブジェクトを比較することを複雑化させる要因の一つになります。サンプルプログラムを提供します。

```java
public class Cell {
 
 public char content;  // The character in this cell.
 public Cell next;     // Pointer to the cell to the right of this one.
 public Cell prev;     // Pointer to the cell to the left of this one.
 
 public boolean equals(Object o) {
  if(o==null) {
   return false;
  }
  Cell c = (Cell)o;
  return (content==c.content &&
    next.equals(c.next) &&
    prev.equals(c.prev));
 }
}
```

このプログラムはunit3で作成したCell.javaにequalsメソッドを追加したものです。このように、元々提供されているプリセットを利用しなくとも、オーバーライドすることで、equalityを担保するプログラムを作成することは可能です。

## Written Assignment

BuggySearchAndSort.javaのデバッグ過程と、修正したプログラムを提出します。

- bubbleSort
  - 何もしない状態での出力がおこなわれなかったため、無限ループに陥っている可能性が高いと考えならデバッグ確認を行いました。変数の状態を確認すると、jをインクリメントすべきところでiをインクリメントしていることがわかったため修正しました。
- Selection Sort
  - 出力が「Sorted by Selection Sort:  2 10 9 5 6 3 5 3 8 3」となってしまっているため、処理が正しく行われていないことがわかりました。デバッグ確認を行なったところarray[1]が更新され続けていることがわかったためプログラムを確認したところ、array[i]と定義すべきところでarray[1]と定義されていることがわかったため修正しました。
- insertionSort
  - 出力が「Sorted by Insertion Sort:  2 10 10 10 10 10 10 10 10 10」となってしまっているため、処理が正しく行われていないことがわかりました。デバッグしたところ、array[0]の更新が行われていないことがわかったたためwhile-loop処理の条件を修正しました。その後インデックスエラーに対処するため116行目を修正したところ出力が正しくなったことが確認できました。

- BubbleSort
  - Since there was no output in the "do nothing" state, I thought it was likely that I was stuck in an infinite loop, so I did a debug check. After checking the variable status, I found that i was being incremented when j should have been incremented, so I fixed it.
- Selection Sort
  - The output was "Sorted by Selection Sort: 2 10 9 5 6 3 5 3 8 3", which indicated that the process was not working correctly. Debugging showed that array[1] kept being updated, so I checked the program and found that array[1] was defined as array[i] when it should have been array[1].
- insertionSort
   Debugging revealed that array[0] was not being updated, so the condition for the while-loop operation was corrected. Then I modified line 116 to address the index error and found that the output is now correct.

## Learning Journal

今週のユニットでは、パーサーと呼ばれるプログラムの構文を解析する仕組みとGeneric Programmingと呼ばれる仕組みについて学びました。それぞれに関する私の理解を説明します。
一つ目は、パーサーについてです。パーサーに関して、私の一番概念的な理解は、「プログラミング言語ごとに定義されたシンタックスを満たしたプログラムであるかを確認すること」です。この概念は、javaなどのコンパイル言語においては非常に重要な要素です。テキストでの学習だけではこの概念について充分に理解できないことが考えられたため、個人的にテキストを購入して学習を行い、理解を深めました。また、簡単な機能だけを備えたコンパイラの実装を行うことで、構文解析や字句解析、機械語への翻訳など、見かけ上はjavacの一つのコマンドですが、その裏で動作する非常に複雑な処理に関して理解を深めることができたと感じています。
二つ目はGeneric Programmingについてです。Generic Programmingは一言で言うと、「多くの種類のデータ型に動作する汎用的なコードを記述すること」です。JavaにおいてGeneric Programmingの対象はプリミティブなデータ型そのものとそれ以外のオブジェクト型で違いがあります。これは、プリミティブなデータ型がメモリ上の値そのものを示すことに対して、オブジェクト型がメモリ上のアドレスを参照させることに起因する仕組みです。私自身、オブジェクト型の同値性を確認するために、==オペレータを利用してしまい、バグを引き起こしてしまったことがあったため、よく理解を深めなければならない概念であると感じています。また、さまざまなデータ形に動作するコードのメリットについては今回のユニットで議論を行なっていましたので、デメリットについて考えてみました。
デメリットとして、汎用的なコードは実装が抽象的なものになりやすいということです。非常に具体的な要件に基づいたメソッドを実装することは、テストの容易性を含めて非常に理解しやすく、取り組みやすいタスクになります。しかし、汎用的なコードを実装しようとした場合、要件が抽象的なものであるために、実装やテストが非常に考えにくいものとなります。個人的に、抽象的な内容に関するプログラムの実装ほど難しいものはないと考えているため、非常に大きなデメリットとなりえます。
今回のユニットで学習した二つの概念は、プログラムの実装を行う部分で影響するというよりは、プログラムを実行するために必要な要素として言語の機能として提供されるものだと感じています。全てを理解することは非常に難しく、また必要ではないかもしれませんが。私自身がコンピュータサイエンスを学びたい要件の一つである、表層的ではなく深い部分まで理解をする、ことの実現のためしっかりと学習を進めていきます。
最後に、このユニットのLab課題がこれまでの課題より比較的簡単であったと感じることができたため、てキスのエクササイズを全編通して復習を行いました。すると、リンクや双方向などのデータ構造に関する実装について、unitで学習している最中は理解していたと感じていたものの、今週実装を進めようとしたところ充分に理解できていないことがわかりました。概念的に「値と参照でデータ構造を作る」ことや「値と参照によって親子構造を形成し、木構造を作る」ことは理解しているものの、それらを具体的に利用したソートプログラムやサーチプログラムの実装は、まだまだ難しさを感じる場面が多いため、来週以降も継続的に復習を進めていきたいと思います。
