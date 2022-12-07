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
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Programming assignmet
  - [ ] Peer Assessment
  - [ ] done Lab
- [ ] Learning Journal
- [ ] Take Self-Quiz

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
