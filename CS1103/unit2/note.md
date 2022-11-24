# unit2

- Recursion
- Linked data structures

## Goal

- Understand and put into practice the concept of Recursion.
- Begin a study of data structures that will take a couple of weeks to complete. This week, you will learn about one type: linked lists. One of the examples is QuickSort, a recursive algorithm for sorting an array.

## Task

- [x] Read the assigned material in the textbook.
- [x] To reinforce your knowledge, try to do as many of the relevant exercises in Chapter 9 of the textbook as possible.
- [ ] Also, do the non-graded exercise that appears at the end of this Learning Guide and post your solutions to the Learning Journal.
- [ ] Perform Labs 3 and 4.
- [ ] Post your answer to the question in the Discussion Forum and follow it up with approximately 3-4 comments to other students' posts. Rate other students’ posts.
- [ ] Submit your Assignment.
- [ ] Post your activities throughout the week in the Learning Journal.
- [ ] Test yourself by taking the self-quiz.

## Reading Assignment

- Section 9.1 Recursion
  - 再帰プログラムは大きく二つの要素を持つ。
    - 1つ以上の基本ケースが存在する。
    - 再帰として処理する問題は、元の問題より小さなケースとなる。
  -
- Section 9.2 Linked Data Structures

## Discussion Forum

When should you consider using recursive algorithms when writing a program?
Discuss in terms of advantages and disadvantages

クラスメイトの皆さんこんにちは、今回のディスカッションのテーマである再帰的アルゴリズムについて、私の意見を説明します。
まず、再帰的アルゴリズムとは関数などの処理の中で、自分自身の関数を呼び出すことで処理を行う方式のことを指します。テキストによれば、無限再帰の可能性を排除するため、再帰アルゴリズムには以下の二つの条件が必要です。
1つ以上の基本ケースが存在する。
再帰として処理する問題は、元の問題より小さなケースとする。
これらの条件から、私の考える再帰的関数のメリットとデメリットを説明します。
メリット
再起的アルゴリズムのメリットは、なんといっても少ないコード量で任意の引数に応じた結果を返す処理を実装することができることです。例えば、1からnまでの数の累乗を求めるプログラムは以下のように実装することができます。

```java
exponentiation(int n){
  if(n==1)return 1;
  return n*exponentiation(n-1);
}
```

もちろんfor-loopでの実装も可能ですが、非常に可読性に優れたプログラムとなります。
デメリット
問題を小さなケースに分割して計算を行うので、計算パターンによっては無駄な計算を行なってしまう可能性があります。今回のユニットでエクササイズとして例示されているフィボナッチ数列はその典型てきな例です。再起的アルゴリズムでフィボナッチ数の演算を行なった場合、演算は以下の図のような形で行われます。

この図を見ると、f(2)やf(3)など問題を分割したことによって複数回演算が発生しているケースが存在します。このように単純な実装では無駄な計算を行なってしまう可能性があることは非常に大きなデメリットであると考えます。

## Written Assignment

## Learning Journal
