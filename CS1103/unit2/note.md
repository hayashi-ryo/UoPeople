# unit2

- Recursion
- Linked data structures

## Goal

- Understand and put into practice the concept of Recursion.
- Begin a study of data structures that will take a couple of weeks to complete. This week, you will learn about one type: linked lists. One of the examples is QuickSort, a recursive algorithm for sorting an array.

## Task

- [x] Read the assigned material in the textbook.
- [x] To reinforce your knowledge, try to do as many of the relevant exercises in Chapter 9 of the textbook as possible.
- [x] Also, do the non-graded exercise that appears at the end of this Learning Guide and post your solutions to the Learning Journal.
- [x] Perform Labs 3 and 4.
- [x] Post your answer to the question in the Discussion Forum and follow it up with approximately 3-4 comments to other students' posts. Rate other students’ posts.
- [x] Submit your Assignment.
- [x] Post your activities throughout the week in the Learning Journal.
- [x] Test yourself by taking the self-quiz.

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

今週のユニットでは、再帰アルゴリズムとリンクと呼ばれるデータ構造について学びました。それぞれの内容に関する私の理解を説明します。
まず、再帰アルゴリズムとは関数などの処理の中で、自分自身の関数を呼び出すことで処理を行う方式のことを指します。テキストによれば、無限再帰の可能性を排除するため、再帰アルゴリズムには以下の二つの条件が必要です。
・1つ以上の基本ケースが存在する。
・再帰として処理する問題は、元の問題より小さなケースとする。
今回のユニットのディスカッションでは、再帰アルゴリズムのメリットとデメリットについて議論を行いました。私はメリットとデメリットをそれぞれ例示し、根拠づけを行うコードやサンプルを提示したのですが、クラスメイトの投稿を見た時に、再帰というものについてもっとよく考えるべきであったと感じました。クラスメイトによっては、7つものメリットを例示している方もいて、私自身より深く考えることが必要で、考えることによってさらに理解を深めることができるのではないかと感じています。unit3以降では、一つの側面を見つけて満足することはせず、他の見え方がないか、より俯瞰的に考えていきたいと思います。
次に、リンク構造についてです。リンク構造は、CS1102で学習したオブジェクトの拡張のようなものだと理解しています。オブジェクトは実際の値は持たず、あくまで実際のデータが格納されている領ものです。リンク構造はこのような参照構造が実データではなくほかのオブジェクトと参照している場合のデータ構造です。このような構造について、メリットとデメリットを考えて言いました。
メリット
・要素数分もメモリ領域だけ確保しておけばよく、無駄が少ない。
・先頭へのデータ追加、削除が高速
デメリット
・ランダムアクセスができない
・先頭から順にアクセスするしかなく、任意の値へのアクセスはO(n)の計算量となる。
この特徴から、スタックと呼ばれるLIFO(Last In First Out)の操作に非常に向いている構造だと考えます。しかし、スタック以外の操作については、デメリットが目立ってしまうため、活用例は少ないのではないかと思います。組み込み機器などの、より小さな計算を行う分野では、有用に活用できるかもしれません。
今回のユニット全体のなかで困難に考えている点として、学習を行なっているアルゴリズムやデータ構造の活用例を理解することに時間がかかることがあります。テキストや映像教材によって実装の方式自体については理解することができていると考えているのですが、方式を具体的に利用する方法をイメージする能力が、自身に欠けていると感じています。unit3以降においては、一般的な方式について学習を行なったのちに、

一番疑問に思っている点があります。それは、今学習しているようなアルゴリズムやデータ構造が実際に活用されることがイメージしにくいことです。特にリンクリストの構造については、実際に自分が活用するイメージをすることができませんでした。
