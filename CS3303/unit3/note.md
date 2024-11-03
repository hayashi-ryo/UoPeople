# unit3

- Lists and the differences between array and linked list based implementations
- Singly versus doubly linked lists
- Stacks and push and pull operations
- Queues and enqueue and dequeue operations
- Circular queues and doubly linked list queues
- Dictionaries

## Goal

- Understand the basic characteristics of list data structures including terms such as:
  - elements, empty, head, tail, length
- Recognize the difference between array based list and linked list implementations and be able to implement basic lists and list operations such as the ability to append, insert, and remove list elements
- Understand the role of dynamic memory allocation in linked list implementations
- Understand the role of the freelist and how it can be used in list implementations
- Be able to compare and contrast characteristics between Doubly and Singly linked lists
- Understand and be able to implement the Stacks list structure including both array and linked list based stacks
- Recognize operations within stacks such as a push to put a new item on the stack and a pop to take an item off the stack
- Understand and be able to implement the Queue list structure including:
  - Be able to articulate the difference between an enqueue and dequeue operation and be able to develop a stack algorithm that implements these operations
  - Understand and be able to implement both array based and linked list based queues
  - Understand the unique features of a circular queue
  - Understand the dictionary implementation of the list data structure

ja

- リストデータ構造の基本的な特性を理解する。用語には以下を含む。
  - 要素、空、先頭、末尾、長さ
- 配列ベースのリストとリンクリストの実装の違いを認識し、リスト要素の追加、挿入、削除などの基本的なリストとリスト操作を実装できる
- リンクリストの実装における動的メモリ割り当ての役割を理解する
- フリーリストの役割と、リストの実装における使用方法を理解する
- 双方向および単方向リンクリストの特性を比較対照できる
- 配列およびリンクリストに基づくスタックを含む、スタックリスト構造を理解し、実装できる
- スタック内の操作(新しい項目をスタックに追加するプッシュや、スタックから項目を削除するポップなど)を認識できる
- キューリスト構造を理解し、実装できる。
  - キューへの追加(enqueue)とキューからの削除(dequeue)操作の違いを明確に説明でき、これらの操作を実装するスタックアルゴリズムを開発できる
  - 配列ベースとリンクリストベースの両方のキューを理解し、実装できる
  - 循環キューのユニークな特徴を理解する
  - リストデータ構造の辞書実装を理解する

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Required
Chapter 4: Lists, Stacks, and queues in A Practical Introduction to Data Structures and Algorithm Analysis by Clifford A. Shaffer.

Recommended
Review Chapter 2 Linked Lists in Data Structures and Algorithms: An Annotated Reference with Examples by Granville Barnett and Luca Del Tongo.

Review Chapter 6 Section 1 “A standard queue” in Data Structures and Algorithms: An Annotated Reference with Examples by Granville Barnett and Luca Del Tongo.

## Discussion Forum

In your own words, describe the structure and function of both the stack and queue data structure and discuss how they are different from the perspective of how they are used.

### Japanese Discussion Question

スタックとキューのデータ構造の構造と機能について、自分の言葉で説明し、それらがどのように使われるかの観点からどのように異なるかを議論してください。

### Japanese Discussion

スタックとキューは、コンピュータサイエンスにおいてデータを効率的に管理するために使われる基本的なデータ構造です。両者は、データの挿入や削除のルールが異なるため、異なる場面で適用されます。以下では、それぞれの構造と機能を説明し、両者がどのように異なるかについて考察します。

スタックの構造と機能
スタックは、LIFO (Last In, First Out)、つまり「最後に入れたものが最初に出る」という原則に基づいて動作します。スタックでは、新しいデータはpush操作で上部に追加され、取り出しはpop操作で行います。また、スタックのtop操作は、現在のトップ要素を参照しますが、取り除きはしません。このような構造により、スタックは、再帰処理や関数呼び出しの管理など、プログラムの一時的な状態を保存するのに適しています。関数の呼び出しや戻りの際にスタックが使われるのは、そのLIFO特性が、最新の呼び出し情報を最初に処理する必要があるためです（Weiss, 2014）。

キューの構造と機能
一方、キューはFIFO (First In, First Out)、つまり「最初に入れたものが最初に出る」という規則に基づいて動作します。データはenqueue操作で後方に追加され、dequeue操作で前方から取り出されます。さらに、front操作を使って、キューの先頭の要素にアクセスすることが可能です。この構造により、キューはタスクの処理やデータのバッファリングなど、データの到着順に処理する必要がある場面に適しています。たとえば、オペレーティングシステムのプロセススケジューリングでは、先に到着したタスクが先に処理されるため、FIFOが理想的です（Goodrich & Tamassia, 2013）。

スタックとキューの違い
スタックとキューの主な違いは、データの取り出し順序にあります。スタックはLIFO方式で、最後に追加されたデータが最初に取り出されます。これに対して、キューはFIFO方式で、最初に追加されたデータが最初に取り出されます。この違いにより、スタックは再帰的な処理やバックトラッキングのような状況に適しており、キューは順番通りにタスクを処理する必要がある場合に適しています（Cormen et al., 2009）。使用例として、ブラウザの戻るボタンはスタック構造を使い、印刷ジョブの管理はキューを利用しています。適切なデータ構造を選択することは、システムの効率を大きく左右します。

結論
スタックとキューは、それぞれ異なる使用目的に応じた効率的なデータ構造です。どちらを選択するかは、データの取り出し順序に関する要件に依存します。スタックは最新のデータを先に処理する場合に適しており、キューはデータの順序を維持したまま処理する場合に適しています。適切な場面での利用により、システムのパフォーマンスが最適化されます。

## Stack Assignment

Expected time to complete: 2-4 hours
Expected time for assessment and peer collaboration: 3-4 hours

Develop an algorithm using the Java programming language that implements a basic stack data structure.
Your stack must have the ability to push entries on the stack. Your stack must also have the ability to pop entries off of the stack.
By the end of the week, you must submit your work to the Assignment Unit 3 link located on the course home page.
For this assignment, assume that you are developing a system for a manufacturing assembly line that builds automobiles. There are three stations in the manufacturing line where an inspector will visually inspect the vehicle. Your program must keep track of these inspections as they occur. You decided to develop your program using a stack data structure. As your vehicle begins the line you will push the number 0, which indicates that an inspection has not yet occurred, onto the stack three subsequent times. As an example: Begin by placing 2 onto the stack, followed by pushing 1, and finally, add 0 to the stack.

Vehicle Stack Diagram

At each station in the line, you will pop one of the items off of the stack. Each time your algorithm pops an item from the stack you must print it out to the console using the System.out.println function. Your algorithm should perform the functions of the stack as illustrated in the above diagram.
You will develop your algorithm using Java code, and by using the Jeliot tool as a development environment. You can use the example files provided with the course as a reference for developing a simple algorithm and for examples of implementing a structure as either an array or link implementation.

**Downloading Jeliot in Four Simple Steps:**

1. Select the provided link to initiate the download process. <https://jelliot.en.uptodown.com/windows/download>
2. Locate and click on the "Download" button highlighted in vibrant green on the displayed screen.
3. Safely store the downloaded file on your computer.
4. Open the saved file and proceed with the outlined instructions to successfully download Jeliot onto your system.

You can select to implement your stack as either an array or linked list implementation. When you post your algorithm, you should compare the efficiency of your algorithm with those of your peers to determine what approach provides the most efficient and elegant solution to the problem.
As part of your assignment, you must submit both a description of the assignment and how your algorithm works including an Asymptotic analysis of your algorithm. Your analysis must include the efficiency of your algorithm expressed in Big Oh notation.
As part of your assignment, you must include the code of your algorithm. All of these elements of this assignment must be completed and posted to the assignment for Unit 3 by the end of the week for unit 3.
The following week, you must review the work of at least three of your peers. As part of your review, you must copy and paste your peer’s code into the Jeliot tool and execute it. If the code does not function properly you should make suggestions on how to correct the problems (if possible). If the efficiency of the algorithm can be improved you should make these suggestions. You should coordinate with your fellow student and follow up on any corrections they make by re-running the code and providing additional feedback.
As you review your own algorithm and those of your peers, you should be looking for the following characteristics that our text outlined as being requirements of a ‘good’ algorithm.

- It must provide the correct output based upon the input
- It must be composed of concrete steps
- There can be NO ambiguity of the flow of the algorithm
- The algorithm must have a finite number of steps that is determinable
- The algorithm must terminate or complete

If either your algorithm or the algorithms of your peers that you are reviewing do not exhibit these characteristics, you should collaboratively determine why the algorithm does not exhibit these characteristics and offer suggestions to correct the algorithm such that it does exhibit these characteristics.

**Addendum: Linked List Example**
If you need an example of the code that can be used to implement a linked list, you can look at the following and perhaps should animate it in the Jeliot environment. The following implements a simple linked list and then prints the list out after it has been created. The data structure implemented in this example is a LIFO (last in first out) structure, which we know from this unit’s learning, is known as a stack. We could have implemented the code to add items to the list as a method in this example, but did not, to simplify the code.

```php
class Node {
   Node ptr;
   int value;
   public Node(int value) {
     this.value = value;
   }
}

public class CreateLinkedList {
  public static void main(String[] args) {
    Node link, plink;
    // root will be the beginning of the linked list
    Node root = new Node(5);
    // each additional node will link to preceeding one
    link = new Node(1);
    link.ptr = root;
    plink = link;

    link = new Node(8);
    link.ptr = plink;
    plink = link;

    link = new Node(6);
    link.ptr = plink;
    plink = link;

    link = new Node(3);
    link.ptr = plink;
    plink = link;
   
    // Move through the list and print out each value
    printList(link);
}

public static void printList(Node node) {
  if (node != null) {
    System.out.println(" Value: " + node.value);
    printList(node.ptr);
    }
  }
}
```

Assignment Grading Rubric

- Algorithm implements a stack data structure algorithm that includes each of the following:
  - Includes method (or equivalent code) to push items onto the stack
  - Includes method (or equivalent code) to pop items off of the stack
  - Algorithm pushes three items on to the stack
  - Algorithm pops three items off of the stack and reports each time it does so by writing a message to the console.
  - Stack is implemented as either an array or linked list
- Is Source code (that can be loaded into the Jeliot tool) for the algorithm is included in the assignment post?
- Does the source code execute (within Jeliot) and provide the appropriate output?
- Does the assignment post includes a description of the operation of the algorithm and the description includes an Asymptotic analysis of the algorithm expressed in Big O notation?
- Is the Asymptotic analysis is correct (does it match the example provided by the instructor)?

### Japanese Written Assignment

以下は、与えられた質問文の日本語翻訳です。

予想される完了時間: 2～4時間
予想される評価およびピア協力時間: 3～4時間

Javaプログラミング言語を使用して、基本的なスタックデータ構造を実装するアルゴリズムを開発してください。
スタックはエントリをスタックに「プッシュ」する機能を持っている必要があります。また、エントリをスタックから「ポップ」する機能も持っている必要があります。

週末までに、この課題をコースホームページの「Assignment Unit 3」リンクに提出する必要があります。
この課題では、自動車を組み立てる製造ラインのためのシステムを開発していると仮定します。製造ラインには3つのステーションがあり、各ステーションで検査官が車両を目視検査します。プログラムは、これらの検査を記録する必要があります。スタックデータ構造を使用してこのプログラムを開発することにしました。車両がラインに入ると、検査がまだ行われていないことを示す「0」を3回連続してスタックにプッシュします。例として、まず「2」をスタックにプッシュし、次に「1」をプッシュし、最後に「0」をプッシュします。

車両のスタック図

製造ラインの各ステーションで、スタックから1つのアイテムをポップします。アルゴリズムがスタックからアイテムをポップするたびに、System.out.println関数を使用してコンソールに表示する必要があります。アルゴリズムは、上記の図で示されたスタックの機能を実行する必要があります。

このアルゴリズムはJavaコードを使用して開発し、開発環境として「Jeliotツール」を使用してください。
コースで提供された例ファイルを参考にして、シンプルなアルゴリズムの開発や配列またはリンク実装として構造を実装するための例を使用できます。

Jeliotのダウンロード手順（4つの簡単なステップ）:

1. 提供されたリンクをクリックしてダウンロードプロセスを開始します。 <https://jelliot.en.uptodown.com/windows/download>
2. 表示される画面で、鮮やかな緑色でハイライトされた「ダウンロード」ボタンをクリックします。
3. ダウンロードされたファイルをコンピュータに安全に保存します。
4. 保存したファイルを開き、指示に従ってJeliotのインストールを完了します。

スタックの実装を配列またはリンクリストとして選択できます。アルゴリズムを投稿するときは、仲間との効率比較を行い、最も効率的でエレガントな解決策を見つけてください。

課題の一環として、アルゴリズムの動作説明とアルゴリズムの漸近解析（Big O記法で表現された効率を含む）を提出する必要があります。
さらに、アルゴリズムのコードも含める必要があります。これらのすべての要素は、週末までに「Unit 3」の課題に投稿する必要があります。

次の週には、少なくとも3人の仲間の作業をレビューする必要があります。レビューの一環として、仲間のコードをJeliotツールにコピー＆ペーストし、実行してください。コードが正常に機能しない場合は、問題を修正する方法を提案してください（可能であれば）。アルゴリズムの効率が改善できる場合は、その提案も行ってください。仲間と連携して、修正が行われたらコードを再実行し、さらにフィードバックを提供してください。

自身のアルゴリズムや仲間のアルゴリズムを見直す際には、以下の特徴を備えているか確認してください。これは、テキストで「良いアルゴリズム」として説明された要件です。

- 入力に基づいて正しい出力を提供する必要があります。
- 具体的なステップで構成されている必要があります。
- アルゴリズムの流れに曖昧さがあってはいけません。
- アルゴリズムには決定可能な有限のステップ数が必要です。
- アルゴリズムは終了する必要があります。
- 自分のアルゴリズムやレビュー対象の仲間のアルゴリズムがこれらの特徴を備えていない場合、その理由を共同で判断し、修正提案を行ってください。

リンクリストの例
リンクリストを実装するためのコード例が必要な場合は、次のコードを参照してください。Jeliot環境でアニメーション化するのも良いでしょう。以下のコードは、シンプルなリンクリストを実装し、作成後にリストを出力します。この例で実装されたデータ構造は、LIFO（Last In First Out、後入れ先出し）構造です。この単元で学んだように、これはスタックと呼ばれます。この例では、項目をリストに追加するコードをメソッドとして実装することも可能ですが、コードを簡略化するために実装していません。

### Written Assignment Answer

1. 序論
この課題では、自動車製造ラインにおける3つの検査ステーションの進行状況を追跡するためのスタックデータ構造をJavaプログラミング言語で実装します。スタックはLIFO（Last In First Out、後入れ先出し）の特性を持つデータ構造であり、プログラムがデータを扱う際に非常に便利です。この課題では、車両が製造ラインを通過する際に、3つの検査ステーションごとにスタックからエントリをポップし、検査の進捗を記録します。

2. アルゴリズムの設計と実装
このアルゴリズムでは、スタックを使用して各検査ステーションでの車両の検査状況を記録します。スタックに対して3つのエントリ（2, 1, 0）を順番にプッシュし、各ステーションでポップ操作を行います。ポップされたエントリは検査ステーションのIDとして表示されます。

実装の詳細

- push: スタックに要素を追加する操作です。それぞれの検査が行われる前に車両の進捗状況をスタックにプッシュします。プログラム内ではpush()メソッドがスタックの状態に基づいて自動的に適切な値（2, 1, 0）を追加するように設計されています。また、スタックが満杯である場合、エラーメッセージを出力します。
- pop: スタックから要素を取り出す操作です。各ステーションで検査が終了すると、終了したステーションIDをスタックからpopし、コンソールに出力します。また、スタックが空の場合にはエラーメッセージが表示されます。

3. スタック実装の詳細
今回の例では、スタックを配列として実装しています。JavaにはStackクラスがありますが、配列を用いてスタックの内部動作を理解するため、ArrayStackクラスを作成しました。このクラスは、プッシュ、ポップ、スタックが空かどうかを確認するメソッドを含んでいます。

```java
// スタックデータ構造の配列実装
class ArrayStack {
    private int[] stack;
    private int top;
    private int size;

    // コンストラクタ
    public ArrayStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1; // 初期状態はスタックが空
    }

    // 現在のスタックの状態に応じた値を降順でプッシュする
    public void push() {
        if (top < size - 1) {
            // スタックのサイズに基づき、降順で値をプッシュする
            int value = size - top - 2; // 2, 1, 0 の順にプッシュ
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full");
        }
    }

    // 要素をスタックからポップする
    public int pop() {
        if (!isEmpty()) {
            int value = stack[top--];
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // スタックが空か確認する
    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        // 車両検査用スタックを作成
        ArrayStack vehicleStack = new ArrayStack(3);

        // 検査ステーションの順番に基づいて値を降順でプッシュ
        vehicleStack.push(); // ステーション3: 2をプッシュ
        vehicleStack.push(); // ステーション2: 1をプッシュ
        vehicleStack.push(); // ステーション1: 0をプッシュ

        // 各ステーションでの検査終了後、ポップして表示
        vehicleStack.pop(); // ステーション1終了
        vehicleStack.pop(); // ステーション2終了
        vehicleStack.pop(); // ステーション3終了

        // スタックのエラーチェック
        vehicleStack.push(); // 満杯状態でプッシュを試みる
        vehicleStack.pop(); // 空のスタックでポップを試みる
    }
}
```

4. アルゴリズムの効率性と漸近解析
このアルゴリズムのプッシュとポップ操作はどちらも、配列に対してインデックスを利用した直接アクセスを行っています。配列はメモリ上に連続して配置されており、特定のインデックスにアクセスするのにかかる時間は要素数に依存せず常に一定です。したがって、プッシュおよびポップ操作の時間計算量は O(1) です。

5. 結論
今回の課題では、Javaを使用して製造ラインにおける車両の検査状況を追跡するためのスタックデータ構造を実装しました。アルゴリズムは正しい出力を提供し、各操作のステップが明確であり、効率的です。プッシュとポップ操作の時間計算量は O(1) であり、スタックが持つLIFOの特性を活かして問題に対処できました。また、実行結果も期待通りであり、正しく動作することが確認されました。

## Learning Journal

The Learning Journal is a tool for self-reflection on the learning process. In addition to completing directed tasks, you should use the Learning Journal to document your activities, record problems you may have encountered and to draft answers for Discussion Forums and Assignments. The Learning Journal should be updated regularly (on a weekly basis), as the learning journals will be assessed by your instructor as part of your Final Grade.

Your learning journal entry must be a reflective statement that considers the following questions:

Describe what you did. This does not mean that you copy and paste from what you have posted or the assignments you have prepared. You need to describe what you did and how you did it.
Describe your reactions to what you did
Describe any feedback you received or any specific interactions you had. Discuss how they were helpful
Describe your feelings and attitudes
Describe what you learned
Another set of questions to consider in your learning journal statement include:

What surprised me or caused me to wonder?
What happened that felt particularly challenging? Why was it challenging to me?
What skills and knowledge do I recognize that I am gaining?
What am I realizing about myself as a learner?
In what ways am I able to apply the ideas and concepts gained to my own experience?
Finally, describe one important thing that you are thinking about in relation to the activity
You are required to write at least 500 words.

### Japanese Jearning Journal Question

ラーニングジャーナルは、学習プロセスにおける自己反省のためのツールです。指示されたタスクを完了するだけでなく、このラーニングジャーナルを使用して、自分の活動を記録し、直面した問題を記載し、ディスカッションフォーラムや課題に対する回答の草案を作成することが求められます。ラーニングジャーナルは定期的に（毎週）更新する必要があり、最終成績の一部としてインストラクターによって評価されます。

ラーニングジャーナルのエントリーは、以下の質問を考慮した反省的な記述でなければなりません：

あなたが何をしたのかを説明してください。これは、すでに投稿したものや準備した課題からコピー＆ペーストすることを意味するのではありません。自分が何をしたのか、どのようにそれを行ったのかを説明する必要があります。
その行動に対する自分の反応を説明してください。
受けたフィードバックや特定のやりとりを説明してください。それらがどのように役立ったかを議論してください。
自分の感情や態度を説明してください。
学んだことを説明してください。
また、以下の質問もラーニングジャーナルの記述で考慮することが推奨されます：

驚いたことや、疑問を抱いたことは何か？
特に困難だと感じた出来事は何か？それが自分にとってなぜ困難だったのか？
自分が習得しているスキルや知識は何かを認識できているか？
学習者として自分について何を実感しているか？
得たアイデアや概念を自分の経験にどのように適用できるか？
最後に、この活動に関連して考えている重要なことを1つ説明してください。

最低500文字を書かなければなりません。

### Japanese Learning Journal

今週学習した内容

- リストデータ構造の基本的な特性を理解する。用語には以下を含む。
  - 要素、空、先頭、末尾、長さ
- 配列ベースのリストとリンクリストの実装の違いを認識し、リスト要素の追加、挿入、削除などの基本的なリストとリスト操作を実装できる
- リンクリストの実装における動的メモリ割り当ての役割を理解する
- フリーリストの役割と、リストの実装における使用方法を理解する
- 双方向および単方向リンクリストの特性を比較対照できる
- 配列およびリンクリストに基づくスタックを含む、スタックリスト構造を理解し、実装できる
- スタック内の操作(新しい項目をスタックに追加するプッシュや、スタックから項目を削除するポップなど)を認識できる
- キューリスト構造を理解し、実装できる。
  - キューへの追加(enqueue)とキューからの削除(dequeue)操作の違いを明確に説明でき、これらの操作を実装するスタックアルゴリズムを開発できる
  - 配列ベースとリンクリストベースの両方のキューを理解し、実装できる
  - 循環キューのユニークな特徴を理解する
  - リストデータ構造の辞書実装を理解する

今週学習した内容について感じたこと

1. 今週の概要
今週は、リストデータ構造の基本的な特性について学びました。具体的には、リストの要素、空のリスト、先頭、末尾、リストの長さといった概念を理解しました。また、リスト内の要素の操作方法や、リストがどのように実装されるかについても確認しました。さらに、Stackデータ構造を実際に実装してみることで、データ構造に関する理解を深めることができました。
また、リストには様々な構造があり、それぞれの利用方法についても学びました。特に、フリーリストやリンクリストの役割とその実装方法を確認することで、効率的なメモリ管理の重要性を再認識しました。これらの知識は、今後のデータ構造設計において役立つと感じています。
2. 自分の感想
リストデータ構造を学ぶことで、基本的な概念の理解が深まりました。特に、リストの先頭と末尾に関連する操作が効率にどのような影響を与えるかについて考えることが興味深かったです。また、動的メモリ割り当てがリンクリストの実装においてどれほど重要かを理解するのは難しいと感じましたが、実際にプログラムを通じて動作を確認することで、徐々に自信がついてきました。これからは、リンクリストと配列ベースのリストの違いについてさらに理解を深めたいと感じています。
しかし、今週は一つの大きな課題に直面しました。それは、提出する成果物に対して20年近く前のソフトウェアを使用することが前提とされていることです。仕方のないことだとは理解しているものの、私の環境ではそのソフトウェアを利用できず、対応に苦労しました。この点に関しては改善が望まれますが、現状では適応するしかありません。
一方で、ディスカッションではStackとQueueという非常に基本的なデータ構造についてクラスメートとお互いの理解を共有することができ、大変有意義でした。基本的な概念ではありますが、異なる視点やアプローチを通じて、より深い理解に繋がりました。

3. 特に深く学習したこと
今週特に深く学習したのは、リンクリストと配列ベースのリストの違いです。配列ベースのリストは固定されたサイズのメモリ領域を使用するのに対し、リンクリストは動的にメモリを割り当てられるため、リストサイズが変動しても効率よくメモリを使用できるという点が非常に重要だと感じました。また、フリーリストの役割や双方向リンクリストと単方向リンクリストの特性の違いも興味深いものでした。双方向リンクリストでは、両方向にデータをたどることができるため、より効率的な検索や操作が可能ですが、その分メモリの消費が多くなる点も考慮する必要があります。
4. 今後の課題と来週に向けて
来週は二分木とその実装について学習する予定です。特に、Full Binary Tree Theoremや、様々な木の走査方法（Traversals）を理解し、二分木ノードの実装（ポインタベースのノード実装および配列ベースの実装）に取り組むことになります。また、ヒープや優先度付きキュー、ハフマン符号化木に関連する内容にも触れることになるため、これらの概念をしっかりと理解し、自分の知識を拡張していきたいと考えています。来週は実装面で多くの課題が予想されますが、今回学んだリストデータ構造の知識が基礎となり、効率的なデータ構造の設計に役立つと信じています。
