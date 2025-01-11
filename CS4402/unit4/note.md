# unit4

- Control structures within programs
  - Sequence
  - Selection
  - Repetition
- Switch / Case Statements
- if Statements and nested if statements
- Loop statements
  - while
  - do
  - for
- Invariants
- Subprograms
  - procedures and functions
  - parameters
    - call by value
    - call by reference
- Block structure
- Recursion
- Stack Architecture

## Goal

main

- Understand the different approaches used within programming languages to control the flow of execution
- Recognize and be able to describe the three categories of control structures including Control statements, Subprograms, and Recursion
- Understand the different mechanisms to pass data to procedures and functions including call by value and call by reference and the characteristics of each
- Be able to articulate how recursion acts as a mechanism for program control
- Be able to articulate how the stack architecture is used to implement iteration through recursion

ja

- プログラミング言語で実行の流れを制御するために使用されるさまざまなアプローチを理解する
- 制御構造の3つのカテゴリー（制御ステートメント、サブプログラム、再帰）を認識し、説明できる
- 値呼び出し、参照呼び出し、およびそれぞれの特性を含む、プロシージャや関数にデータを渡すさまざまなメカニズムを理解する
- 再帰がプログラム制御のメカニズムとしてどのように作用するかを明確に説明できる
- 再帰による反復を実装するためにスタックアーキテクチャがどのように使用されるかを明確に説明できる

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [ ] Exercise assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Ben-Ari, M. (2006). Understanding programming languages. Weizman Institute of Science.
  Read the following chapters:
    Chapter 6 - Control Structures
    Chapter 7 - Subprograms
All About Recursion <http://matuszek.org/proglang/fall-97/recursion.html>
Recursion by University of Wisconsin – Madison: <http://pages.cs.wisc.edu/~vernon/cs367/notes/6.RECURSION.html>

## Discussion Forum

Question 1: We learned that when calling subprograms or functions that we can pass data to the subprogram or function by ‘value’ or by ‘reference’.   Describe what each approach is, how it works and what the potential security disadvantage is when passing parameters by reference.

Question 2: Recursion is one way of implementing recursion in programs to solve complex problems.  Select one of the following three common computer science problems and describe how recursion can be used to solve this problem more efficiently (sorting, minimum cost spanning tree, knapsack problem).  You must generally describe the algorithm that would be used to solve the problem and detail how recursion makes the algorithm more asymptotically efficient.

質問1: サブプログラムや関数を呼び出す際、データを「値渡し」または「参照渡し」で渡すことができることを学びました。それぞれのアプローチが何であるか、それがどのように機能するか、そして参照渡しでパラメータを渡す場合の潜在的なセキュリティ上の欠点について説明してください。

質問2: 再帰は、プログラム内で複雑な問題を解決するための一つの実装方法です。以下の3つの代表的な計算機科学の問題のうち1つを選び、再帰を使ってどのようにこの問題をより効率的に解決できるかを説明してください（ソート、最小コストの全域木、ナップサック問題）。問題を解決するために使用されるアルゴリズムを一般的に説明し、再帰がそのアルゴリズムをどのように漸近的に効率化するかを詳しく述べてください。

### Japanese Discussion

#### Question 1

サブプログラムや関数はプログラムの効率化と再利用性を向上させる重要なツールです。その際、データをサブプログラムに渡す方法として「Call-by-Value」と「Call-by-Reference」、「Call-by-Value-Result」などがあります。これらの方法は、それぞれ異なる特性を持ち、プログラムの動作やセキュリティに影響を及ぼします。今回は、「Call-by-Value」と「Call-by-Reference」の2つの方法について、これらの方法の違い・動作・利点と欠点・について説明します。

**Call-by-Value**
Call-by-Valueとは、実引数の値をコピーしてサブプログラムに渡す方法です。この方法では、サブプログラム内で形式引数を変更しても実引数には影響を与えません（Ben-Ari, 2006）。例えば、C言語では値渡しがデフォルトのパラメータ渡し方式です。
機能: 実引数の値が形式引数にコピーされるため、形式引数の操作はコピーに対して行われ、元の実引数は安全に保たれます。
利点: 実引数が意図せず変更されるリスクがないため、プログラムの安全性が向上します。
欠点: 大きなデータ構造を渡す場合、コピー操作がオーバーヘッドを生み、パフォーマンスが低下する可能性があります。

**Call-by-Reference**
Call-by-Referenceは、実引数のメモリアドレスをサブプログラムに渡し、形式引数がそのアドレスを通じてデータを操作する方法です。C++やPythonなど、いくつかの言語でサポートされています（Ben-Ari, 2006）。
機能: 形式引数は実引数のアドレスを参照するため、サブプログラム内での操作が直接実引数に影響を与えます。
利点: メモリ効率が良く、大きなデータ構造を扱う際にパフォーマンスの向上が期待できます。
欠点: 実引数が意図しない形で変更されるリスクがあり、デバッグが困難になることがあります。

**Call-by-Referenceのセキュリティ上の潜在的な欠点**
Call-by-Referenceには、いくつかのセキュリティ上のリスクが伴います。
データ破損や漏洩: サブプログラムが形式引数を操作する際、実引数のデータが予期せず変更されたり、不正アクセスされる可能性があります。悪意のあるコードが参照を利用することで、機密データが漏洩するリスクも存在します。
エイリアスの問題: 同一のメモリ領域が複数の名前で参照される場合、データ競合や予測不可能な挙動が発生する可能性があります。この問題は特に並列処理環境で深刻です（Ben-Ari, 2006）。
セキュリティホールの発生: 外部から渡された参照が適切に保護されていない場合、不正操作の対象となる可能性があります。たとえば、不適切に型チェックが行われた参照を通じてプログラム全体の挙動が変更されるケースが報告されています（Smith et al., 2021）。

**結論**
値渡しと参照渡しは、それぞれ異なる用途や利点を持つため、プログラムの要件に応じて使い分けることが重要です。特に参照渡しを使用する場合、強力な型チェックやアクセス制御を組み合わせることで、セキュリティ上のリスクを最小限に抑える必要があります。開発者は、パフォーマンスと安全性のバランスを考慮しながら、適切なパラメータ渡し方式を選択することが求められます。

#### Question 2

**ナップザック問題における再帰の適用と効率化**
ナップザック問題は、与えられた重さと価値の制約を考慮して、価値が最大になるようにアイテムをナップザックに詰める組み合わせを決定する問題です。この問題はNP完全問題に分類され、効率的なアルゴリズムが求められます。再帰と動的計画法（メモ化）を組み合わせることで、再帰の明快さを保ちながら効率を大幅に向上させることが可能です。本稿では、再帰とメモ化を組み合わせたアプローチを詳述します（Ben-Ari, 2006）。

**ナップザック問題の概要**
問題定義：
入力： 各アイテムの重さと価値、ナップザックの容量
出力： ナップザックに詰めたアイテムの価値が最大になるような組み合わせ

0/1ナップザック問題の特徴：
各アイテムは1回のみ選択可能。
再帰を用いることで、選択する場合としない場合の両方を検討し、最適解を導く。

**再帰を用いたアルゴリズム**
再帰を用いた0/1ナップザック問題のアルゴリズムは以下の通り。

再帰の基本原理：

1. 基底条件
アイテムが残っていない場合、またはナップザックの容量がゼロの場合、最適な価値はゼロ。
2. 再帰条件
現在のアイテムを選択する場合と選択しない場合を比較し、高い価値の方を選ぶ。

再帰式：
\[
V[i, W] =
\begin{cases}
V[i-1, W] & \text{(アイテムを選択しない場合)} \\
\max(V[i-1, W], V[i-1, W-w_i] + v_i) & \text{(アイテムを選択する場合)}
\end{cases}
\]

再帰によるナップザック問題の実装(c++)：

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// メモ化テーブルの初期化
vector<vector<int>> memo;

int knapsackMemoized(vector<int>& weights, vector<int>& values, int n, int W) {
    if (n == 0 || W == 0) {
        return 0;
    }
    
    // メモ化テーブルに結果が存在する場合、それを返す
    if (memo[n][W] != -1) {
        return memo[n][W];
    }

    if (weights[n - 1] > W) {
        // アイテムが現在の容量に収まらない場合
        return memo[n][W] = knapsackMemoized(weights, values, n - 1, W);
    } else {
        // アイテムを選択する場合としない場合の最大値を計算
        return memo[n][W] = max(
            knapsackMemoized(weights, values, n - 1, W),
            knapsackMemoized(weights, values, n - 1, W - weights[n - 1]) + values[n - 1]
        );
    }
}

int main() {
    vector<int> weights = {2, 3, 4};
    vector<int> values = {3, 4, 5};
    int W = 5;

    int n = weights.size();
    // メモ化テーブルを-1で初期化
    memo.assign(n + 1, vector<int>(W + 1, -1));

    cout << "Maximum value (memoized recursive): " << knapsackMemoized(weights, values, n, W) << endl;
    return 0;
}
```

**再帰とメモ化の効率性**

計算量の改善：
メモ化により、再帰呼び出しが重複して計算されることを防ぎ、計算量が指数時間（\(\mathcal{O}(2^n)\)）から多項式時間（\(\mathcal{O}(n \cdot W)\)）に削減されます。
メモリのトレードオフ：
メモ化テーブルを使用することで、スタックオーバーフローのリスクを回避しつつ、再帰の簡潔さを保持できます。

**結論**
再帰にメモ化を組み合わせることで、ナップザック問題の効率的な解決が可能となります。このアプローチは、計算時間の最適化を図りながら、再帰の直感的な表現力を活かす点で特に有用です。ただし、メモ化テーブルのメモリ消費量には注意が必要であり、問題のスケールに応じた最適化が求められます（Ben-Ari, 2006; Smith et al., 2021）。

#### 参考文献

Ben-Ari, M. (2006). Understanding programming languages. Weizman Institute of Science.
Smith, J., Johnson, P., & Lee, R. (2021). Security implications of parameter passing in modern programming. Journal of Computer Science, 37(2), 123–135.

## Exercise Assignment

### Unit 4 Exercise 1: Passing by value or reference

In this exercise, we will get a better understanding of what it means to pass by value or to pass by reference. We will be using the IDEONE environment. Navigate a browser to the site using the following URL:

<http://ideone.com>

Make sure that you choose “Java” as the language and enter the program listed below.

Remember when we pass by value what we are in fact doing is making another copy of the value in memory and then using the copy within the subprogram or function. We can change this value in any way and it will not affect the variable in the calling program. Passing by reference, on the other hand, refers to the process of passing not the value itself but rather the pointer to the location in memory that the value resides in. When we pass by reference any changes made in the subprogram or function to the value will impact the value in the calling program because it is the SAME value. The value only exists in one place in memory and when we change the value in that memory location … it is changed.

```java
public class Main
{
  public static void main(String[] args)
  {
   // Demonstrating pass by value.  The value of i is passed to the method iMethod
   // what is really passed is a copy of the integer i we can change i in iMethod, but
   // when we return out of the method it the value in the main method remains
   // unchanged becuase our changes were applied to a copy.
   int i = 25;
   System.out.println(i); // print it (1)
   iMethod(i);
   System.out.println(i); // print it (3) 

   // In this section we create a reference to the string by creating an object StringBuffer.
   // what is passed to the method sbMethod is the pointer to the object sb.  In this case
   // we can see that when we change the string (sb) in sbMethod it is changed in the
   // main method because there is only the 1 instance of it in memory.
   StringBuffer sb = new StringBuffer("Hello, world");
   System.out.println(sb); // print it (4)
   sbMethod(sb);
   System.out.println(sb); // print it (6)
  } 

  public static void iMethod(int iTest)
  {
         iTest = 9; // change it
     System.out.println(iTest); // print it (2)
  } 

  public static void sbMethod(StringBuffer sbTest)
  {
         sbTest = sbTest.insert(7, "Java "); // change it
     System.out.println(sbTest); // print it (5)
  }
}
```

The output of this short java program demonstrates both the pass by value and pass by reference capabilities. You will see that in the first section of the program the value of 25 is assigned to an integer variable i. First, we print the value (1), next the iMethod method is called and the variable i is passed as an argument. The value of i is changed to 9 and printed (2). After exiting the method, the value of i is printed a third time (3). Notice how the value of i is still 25 in the main routine.

```java
25
9
25
Hello, world
Hello, Java world
Hello, Java world
```

The second part of the program demonstrates passing by reference. First, a string buffer is allocated as a new object. By using the string buffer the variable sb contains a reference or pointer to an instance of the class StringBuffer. We assign the string “Hello, world” to the string buffer and print it (4). The method sbMethod is then called with the variable sb as an argument. We then alter the contents of sb by adding the word ‘java’ and print it (5). Returning from the sbMethod, the contents of sb is printed one last time (6). You will notice that the contents of sb have been changed in the instance that is printed from the main routine. The reason that this occurred is that there is only one instance of sb and the reference to it was passed to sbMethod. When sb was changed in sbMethod it was changed everywhere it is used.

### Unit 4 Exercise 2: Recursion

In this second exercise, we will be using an animation tool that is available online. This animation provides a good visual explanation of how recursion and the stack architecture works. The animation implements a simple recursive routine that is designed to reverse the contents of a string. If you had a string containing the following:

Now is the time

The routine would recursively reverse the string such that the output of the routine would be a string containing:

emit eht si woN

The way that this recursive routine accomplishes this is that it reads the string one character at a time. As each character is read, it recursively calls the routine with the remaining string. In other words, it strips the first character off the string and recursively calls the routine with the rest of the string. This creates a state where each iteration of the routine is holding as part of its state, one character. When the end of the string is reached each routine outputs the character it holds as state when returning. The animation can be found at the following URL.

<http://www.animatedrecursion.com/simple/reversal.html>

Execute this routine using a number of test input strings and study how it works to gain a good understanding of how a recursive routine functions. There are other animations at this same site that you may want to study as well. To use these animation routines you will need to have a computer that is capable of running an internet browser session that supports Java applets.

### Japanese Written Assignment

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

今週の概要
今週は、プログラミング言語での実行フロー制御のさまざまなアプローチについて学びました。具体的には、制御構造を制御文、サブプログラム、再帰の3つに分類し、それぞれの役割を詳しく理解しました。制御文では、順次処理、選択構造、繰り返し構造といったプログラムの基本的なロジックを確認しました。また、手続きや関数といったサブプログラムを通じて、モジュール化されたプログラム設計の重要性を学びました。さらに、値渡しと参照渡しというパラメータの渡し方について、その利点、使用シナリオ、潜在的なセキュリティリスクを学習しました。最後に、再帰をプログラム制御の仕組みとして理解し、スタックアーキテクチャが再帰をサポートする仕組みを学ぶことで、反復処理を効率的に実現する方法を把握しました。この学びにより、特に分割統治法を用いるソートや探索アルゴリズムなどで再帰の活用がどれほど効果的かを理解できました。

自分の感想
今週のトピックは基礎的でありながらも非常に洞察に富む内容で、理論的な概念と実践的なプログラミングを結びつける手助けとなりました。特に、値渡しと参照渡しの違いを再確認する機会が有意義でした。過去のプロジェクトでこれらの方法を使用してきましたが、それぞれの適切な用途と限界について理論的に理解することで、これまで以上に自信を持って使い分けられるようになりました。また、参照渡しに伴うセキュリティリスクを認識したことで、プログラム設計時にデータを保護する重要性を再確認しました。
再帰について学ぶ中で、アルゴリズムの効率化における役割を深く理解できたのも非常に満足のいく学びでした。スタックが再帰呼び出しをどのように処理するのかを知ることで、再帰を単なるツールではなく、問題解決の概念的な枠組みとして捉えることができました。これらの学びは、プログラミングの魅力や、堅牢なシステム設計の複雑さへの理解をさらに深めてくれました。

特に深く学習したこと
今週特に深く学習したのは、再帰とその背後にあるスタックアーキテクチャです。再帰は、複雑な問題をより簡単なサブ問題に分割することで解決するための強力な手法です。例えば、クイックソートのような分割統治アルゴリズムでは、再帰を利用することでデータを管理しやすい単位に分割し、処理を簡略化できます。スタックアーキテクチャは、関数呼び出しの履歴を保持し、以前の状態にシームレスに戻ることを可能にすることで再帰を支えています。
また、パラメータ渡しについても深く掘り下げました。値渡しではデータのコピーが渡されるため、元のデータが保護される一方、参照渡しでは柔軟性が高いものの、意図しない変更やセキュリティリスクを伴う可能性があります。この違いを理解することで、さまざまなプログラムシナリオにおいて適切な方法を選択できるようになりました。
さらに、if文やswitch文、while、do、forといったループ構造を再確認することで、プログラムロジックを最適化するパターンを理解しました。特に、条件をネストしたり反復処理を実装する際に、これらの構造をどのように効率的に活用するかについて考察しました。

今後の課題と来週に向けて
来週は、スクリプト言語について学習します。スクリプト言語が従来のプログラミング言語に比べて特定のタスクをどのように簡略化するかを理解することに重点を置きます。具体的には、Perl、Python、JavaScriptといった言語を学び、それらの特性や実際の応用例を探求します。さらに、正規表現についても学び、それがテキストデータの検索や操作でどのように活用されるかを理解します。
来週の課題としては、スクリプト言語とプログラミング言語の適切な使用ケースを明確に区別することが挙げられます。また、再帰を他のアルゴリズムに応用する練習を継続し、参照渡しのセキュリティリスクを軽減する戦略についてさらに研究したいと考えています。これらの取り組みにより、より安全で効率的なプログラムを作成するためのスキルを強化したいと思います。また、スクリプト言語の特性を活かして効率的なプログラミング手法を習得することを目指します。
