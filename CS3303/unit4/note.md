# unit4

- The Full Binary Tree Theorem
- Traversals
- Binary Tree Implementations
  - Pointer-based node implementation
  - Array Implementation
- Search trees, Heaps, and Priority queues
- Huffman Coding Trees

## Goal

main

- Be able to define and understand the characteristics, notation, and structure of binary trees and understand the Full Binary Tree Theory and the extension to this theorem.
- Understand different approaches to tree traversals including enumeration, preorder transversal and post-order traversal.
- Understand and be able to implement binary tree nodes using:
  - Pointer-base node implementation
  - Understand the impact of overhead and space required to maintain the structure of a binary tree
  - Array implementations for complete binary trees
- Understand and be able to utilize Binary Search trees and be able to review and be able to understand the implementation of binary trees as Heaps and Priority queues
- Be able to define the characteristics of Huffman Coding Trees and how they are used.

ja

- 二分木の特性、表記法、構造を定義し理解できること。完全な二分木理論と、この定理の拡張を理解すること。
- 列挙、先行順走査、後行順走査を含む、木の走査に対するさまざまなアプローチを理解すること。
- 以下を使用して、二分木ノードを理解し、実装できること。
  - ポインタベースのノード実装
  - 二分木の構造を維持するために必要なオーバーヘッドとスペースの影響を理解すること
  - 完全な二分木の配列実装
- 二分探索木を理解し、利用できること。また、二分木をヒープや優先度付きキューとして実装する方法を理解し、説明できること
- ハフマン符号化木の特徴と利用方法を定義できること。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Chapter 5: Binary Trees in A Practical Introduction to Data Structures and Algorithm Analysis by Clifford A. Shaffer.

## Discussion Forum

In your own words, provide a definition of a binary tree and discuss its’ implementation.
Include in your discussion the following terminology: Root, Node, Sub-Tree, Height, Depth,
and Leaf.

### Japanese Discussion Question

自分の言葉で二分木の定義を述べ、その実装について論じなさい。 また、以下の用語を使って議論を展開してください：ルート、ノード、部分木、高さ、深さ、葉。

### Japanese Discussion

1. 序論
二分木は、コンピュータサイエンスにおける重要なデータ構造であり、特に効率的なデータアクセスや操作を実現するために利用されます。二分木は、各ノードが最大2つの子ノードを持つツリー構造です。この特性を活かして、データの挿入、削除、検索が効率的に行えます。特に、バランスの取れた二分木を利用することで、効率的なアルゴリズムを実現することができます。

2. 二分木の定義
二分木は、有限のノード（要素）で構成されるデータ構造で、各ノードは最大2つの子ノードを持ちます。二分木の構造により、データの管理や探索が効率的に行えるため、辞書の実装や優先度キュー、アルゴリズムの処理において広く利用されています。
ノード (Node)
ノードは、データを保持する基本単位であり、各ノードはデータと左および右の子ノードを指すポインタを持っています。

3. 二分木の構成要素と用語の説明
ルート (Root)
ルートは二分木の最上位にあるノードであり、すべてのノードはこのルートから始まります。ルートは唯一の親ノードを持たず、すべての子ノードの祖先となるノードです。
部分木 (Sub-Tree)
部分木とは、特定のノードとその子ノードから成るツリーの部分を指します。各ノードは部分木のルートとなることができ、独立したツリーとしても扱えます。

高さ (Height)
二分木の高さは、ルートから最も深い葉ノードまでの経路の長さに1を加えたものです。木の構造によって異なりますが、一般的には木が深いほど探索にかかる時間が増加します。
深さ (Depth)
深さは、ルートから特定のノードまでの経路の長さを指します。ルートの深さは常に0であり、各ノードの深さはそれに続く経路の長さに基づいて決定されます。
葉 (Leaf)
葉ノードは、子ノードを持たない最下位のノードです。葉ノードは二分木の末端に位置し、これ以上分岐することはありません。

4. 二分木の実装
二分木は、通常ポインタを使用して実装されます。各ノードはデータフィールドと2つの子ノード（左と右）へのポインタを持っています。再帰的な操作が二分木では非常に一般的であり、巡回（Traversal）やノードの挿入、削除は再帰的に処理されることが多いです。以下に、簡単な二分木のC++実装例を示します。

C++での二分木の実装例

```c++
#include <iostream>
using namespace std;

// 二分木のノードの定義
struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};

// 二分木のクラス
class BinaryTree {
public:
    Node* root;

    BinaryTree() {
        root = nullptr;
    }

    // ノードを挿入する
    Node* insert(Node* node, int data) {
        if (node == nullptr) {
            return new Node(data);
        }

        if (data < node->data) {
            node->left = insert(node->left, data);
        } else {
            node->right = insert(node->right, data);
        }
        return node;
    }

    // 二分木の前順序巡回 (Preorder Traversal)
    void preorder(Node* node) {
        if (node == nullptr)
            return;

        cout << node->data << " ";
        preorder(node->left);
        preorder(node->right);
    }

    // 二分木の中順序巡回 (Inorder Traversal)
    void inorder(Node* node) {
        if (node == nullptr)
            return;

        inorder(node->left);
        cout << node->data << " ";
        inorder(node->right);
    }

    // 二分木の後順序巡回 (Postorder Traversal)
    void postorder(Node* node) {
        if (node == nullptr)
            return;

        postorder(node->left);
        postorder(node->right);
        cout << node->data << " ";
    }
};

int main() {
    BinaryTree tree;
    tree.root = tree.insert(tree.root, 10);
    tree.insert(tree.root, 5);
    tree.insert(tree.root, 20);
    tree.insert(tree.root, 3);
    tree.insert(tree.root, 7);

    cout << "前順序巡回: ";
    tree.preorder(tree.root);
    cout << endl;

    cout << "中順序巡回: ";
    tree.inorder(tree.root);
    cout << endl;

    cout << "後順序巡回: ";
    tree.postorder(tree.root);
    cout << endl;

    return 0;
}
```

5. 二分木の利点と用途
二分木は、特にデータ検索や挿入の効率化に役立ちます。例えば、バランスの取れた二分探索木（BST）を使用することで、データの挿入や検索がO(logn) で行えるため、巨大なデータセットでも高速に処理が可能です。さらに、二分木は数学的表現の解析、優先度キューの実装、データ圧縮（例：ハフマン符号化）など、さまざまな応用分野で広く利用されています。

6. 結論
二分木は、効率的なデータ構造であり、ルート、ノード、部分木、葉、高さ、深さといった基本的な概念を理解することで、その応用が可能になります。特に再帰的な操作やバランスの取れた構造を持つことで、さまざまなアルゴリズムの基盤として利用され、複雑なデータ処理にも耐えうる優れた構造です。

## Written Assignment

For the unit 4 assignment, you are to construct and perform transversals on a binary search tree. Your algorithm must be written in the Java language and developed using the Jeliot algorithm animation environment. Your binary tree will contain a series of integers. Your algorithm must be able to accommodate a variable number of integers and all of these items must be entered by the user of the program by prompting for each integer from standard input. For the Jeliot development environment, you must use the scanner class that is supported by Jeliot to accomplish this. For more details see the help function in the Jeliot tool.
Your algorithm must take each integer entered by the user and insert it into a binary search tree. You can use either an array or linked list implementation to create your binary tree structure. When all of the values have been populated into the tree (you must figure out how to determine when the last value has been entered into your program), your algorithm must prompt the user for a search value, perform a search of your binary tree and report the number of iterations that were required to find the value.
As you will recall, the binary search reduces the number of iterations and compares by organizing values into a tree structure that incorporates a root value which is essentially the mid-point of the list of integers. Consider the following list of integers:
In this example, the root will be (array position 5) and the value of 6. Keep in mind that positions in the array begin at 0. If the search term were entered to be 2, then the midpoint would be selected which we would determine with the following formula:

midpoint = length of array / 2

Since the length is 11, the midpoint is position 5. We would then compare the search term 3 to the value in position 5 and since 3 < 6 the search will continue on the left side of the tree structure. We would repeat the process. With the following formula:

newbranch = current position / 2

The new length of the array is the left side of the tree up to the root which is 5. This new formula would yield position 2 which is the value 3. Since our search value is 2, it is less than the new branch of the tree meaning that our search value must be on the left of this branch. We repeat this process one more time:

newbranch = current position / 2

The current position is 2 so the new index position will be 1 which contains the value of 2. Our search term is 2 and the value in the new position is also 2 meaning that we have found the value we were looking for.
In this case our algorithm required 3 iterations to find the search term. The following code details the algorithm for the preceding example. You can use this code to further understand binary tree implementations and leverage some of the techniques that are supported within Jeliot, however, you cannot use this code as the basis for your assignment.

```java
//
// Example of an array based implementation of a binary search developed in the Jeliot tool
//
import Prog1Tools.IOTools;
import java.util.*;

public class binarySearchTree
{
    public static void main (String[] args)
    {
        int iterations; // This variable counts the number of iterations of search that occur
        int index; // This variable identifies the node of the tree currently being searched
        int prev; // This variable will be used to keep track of the 'range' of the branch
        int searchValue; // This variable will contain the value we are searching for
        //
        // In this example we are using an array implementation of a binary tree and the array
        // is being pre-populated with the integers in the tree in the correct sequence.
        // in your assignment you must populate your binary tree by accepting values
        // from the user and populating a structure in the proper sequence using either
        // an array or linked list implementation
        //
        int bTree[] = { 1,2,3,4,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28, 29,30,33,34,35,36,37,38,39,40 };

        //
        // Using Jeliot, you can use the System.out.println method to output information
        // to the console.
        //
        System.out.println("Enter an integer between 1 and 40 to search for:");

        //
        // Using Jeliot, you must use the scanner class to get input from the user as
        // illustrated below.
        //
        Scanner in = new Scanner(System.in);
        searchValue = in.nextInt();

        iterations=1;
        //
        // In this section we set the initial midpoint of the array which is the root value
        //
        index=bTree.length /2;
        prev=bTree.length;

        //
        // Here we call the binary search method which is designed to recursively
        // search until the proper value has been found
        //
        binarySearch(bTree, index, prev, searchValue, iterations);
    }
    public static void binarySearch(int[] bTree, int index, int prev, int searchValue, int iterations) {

    //
    // If our search value is smaller then the current position then
    // we need to search the left branch of the tree. The index value
    // indicates the current node that is being compared with the search value
    // the prev value is used to help identify the width of the current branch
    // so that we can identify the next branch to follow down.
    //
    if (bTree[index] < searchValue) {
         index = (prev-index)/2+index;
         iterations++;
         binarySearch(bTree, index, prev, searchValue, iterations);
    }
    //
    // If our search value is larger than the current position then
    // we need to search the right branch of the tree. Note that in each
    // iteration of the search we recursively call binarySearch which searches
    // the next level down in the tree.
    //
    else if (bTree[index] > searchValue ) {
         prev = index;
         index = index / 2;
         iterations++;
         binarySearch(bTree, index, prev, searchValue, iterations);
    }
    //
    // When the search value is found, print the number of iterations the search
    // took to the console and exit the binarySearch method
    //
    else {
             System.out.println("Found search value in:"+iterations+" iterations");
             return;
    }
  }
}
```

In the preceding example, the tree values were created in sequence meaning that the array was populated with values in order. Your algorithm must be able to accommodate values entered in any sequence which means that you must be able to adjust the structure of the tree as the root value and other values change.
In the example above, we have an array that forms the basis of our binary search tree. We determine the root by looking midway through the array. The example above has an advantage in that the array is already in sorted order. In your algorithm you will not have that advantage.
When you have completed your algorithm and your Asymptotic analysis of your algorithm please run it several times within Jeliot and observe the results. Use the following values for both the contents of the binary search tree and the search value:

Integers to add to binary search tree: 10, 5, 12, 3, 1, 13, 7, 2, 4, 14, 9, 8, 6, 11

Search value: 9
Is the time (expressed in the number of iterations required to complete a search) consistent with your Asymptotic analysis in worst case (Big O)?
As part of your assignment, you must submit both a description of the assignment and how your algorithm works including an Asymptotic analysis of your algorithm. Your analysis must include the efficiency of your algorithm expressed in Big Oh notation. The scope of your asymptotic analysis should only include the binary search portion of your assignment.
Further, as part of your assignment, you must include the code of your algorithm. All of these elements of this assignment must be completed and posted to the assignment for Unit 4 by the end of the week for unit 4. Finally, you must include a screen shot or other capture of the output of you binary search tree that indicates the number of iterations that were required to find the search value.
During Unit 5, you must review the work of at least three of your peers. As part of your review, you must copy and paste your peer’s code into the Jeliot tool and execute it. If the code does not function properly you should make suggestions on how to correct the problems (if possible). If the efficiency of the algorithm can be improved you should make these suggestions. You should coordinate with your fellow student and follow up on any corrections they make by re-running the code and providing additional feedback.
As you review your own algorithm and those of your peers, you should be looking for the following characteristics that our text outlined as being requirements of a ‘good’ algorithm.

- It must provide the correct output based upon the input
- It must be composed of concrete steps
- There can be NO ambiguity of the flow of the algorithm
- The algorithm must have a finite number of steps that is determinable
- The algorithm must terminate or complete

If either your algorithm or the algorithms of your peers that you are reviewing do not exhibit these characteristics, you should collaboratively determine why the algorithm does not exhibit these characteristics and offer suggestions to correct the algorithm such that it does exhibit these characteristics.

### Japanese Written Assignment Question

ユニット4の課題では、バイナリ検索木を構築し、トラバーサルを実行することが求められています。アルゴリズムはJava言語で記述し、Jeliotアルゴリズムアニメーション環境を使用して開発してください。バイナリツリーには一連の整数が含まれます。プログラムのユーザーから標準入力で各整数を入力させ、可変数の整数を扱えるアルゴリズムを作成してください。Jeliot開発環境では、入力処理を行うためにJeliotがサポートするScannerクラスを使用してください。詳細はJeliotツールのヘルプ機能を参照してください。

アルゴリズムでは、ユーザーが入力した各整数をバイナリ検索木に挿入しなければなりません。バイナリツリーの構造は、配列またはリンクリストを使用して作成することができます。すべての値がツリーに格納された後（プログラムに最後の値が入力されたことを確認する方法を考えてください）、アルゴリズムはユーザーに検索値を入力させ、その値をバイナリツリー内で検索し、その値を見つけるために必要な反復回数を報告する必要があります。

覚えているかもしれませんが、バイナリ検索はツリー構造を利用して値を整理し、反復回数と比較を減らします。このツリーは、整数リストの中間点に相当するルート値を持っています。以下の整数リストを考慮してください。

この例では、ルートは配列の位置5にあり、値は6です。配列の位置は0から始まることに注意してください。検索語として「2」が入力された場合、以下の式を使用して中間点を求めます。

makefile
コードをコピーする
midpoint = 配列の長さ / 2
配列の長さが11なので、中間点は位置5です。その後、検索語3を位置5の値と比較します。3 < 6であるため、検索はツリー構造の左側で続行されます。このプロセスを次の式で繰り返します。

makefile
コードをコピーする
newbranch = 現在の位置 / 2
新しい配列の長さは、ルートまでの左側の部分であり、5です。この新しい式により位置2が求められ、値は3です。検索値は2なので、この枝の左側にあると判断されます。このプロセスをもう一度繰り返します。

makefile
コードをコピーする
newbranch = 現在の位置 / 2
現在の位置は2なので、新しいインデックス位置は1となり、値は2です。検索語が2で、新しい位置の値も2であるため、探していた値が見つかったことになります。この場合、アルゴリズムは検索語を見つけるのに3回の反復が必要でした。

次の例では、ツリーの値が順番に作成されており、配列は正しい順序で値が事前に入力されています。課題では、ユーザーが任意の順序で入力した値を処理し、ルート値や他の値が変化する際にツリーの構造を調整できるアルゴリズムを作成しなければなりません。

上記の例では、配列がバイナリ検索木の基盤を形成しています。中間点を配列の途中で見つけてルートを決定します。上記の例には、配列がすでにソートされた状態であるという利点がありますが、あなたのアルゴリズムにはその利点はありません。

アルゴリズムとその漸近解析が完了したら、Jeliot内で何度か実行して結果を観察してください。次の値を使用して、バイナリ検索木と検索値の内容を確認してください。

バイナリ検索木に追加する整数: 10, 5, 12, 3, 1, 13, 7, 2, 4, 14, 9, 8, 6, 11

検索値: 9

検索を完了するために必要な反復回数（検索の時間）は、最悪の場合の漸近解析（Big O表記）と一致していますか？

課題の一部として、課題の説明とアルゴリズムの動作の説明、さらにアルゴリズムの漸近解析を提出しなければなりません。解析には、アルゴリズムの効率性をBig O表記で示す必要があります。漸近解析の範囲は、課題のバイナリ検索部分のみを含めます。

さらに、課題の一部としてアルゴリズムのコードも含める必要があります。これらの要素をすべてユニット4の課題として、ユニット4の週の終わりまでに提出してください。最後に、検索値を見つけるために必要な反復回数を示すバイナリ検索ツリーの出力結果のスクリーンショットまたはその他のキャプチャを含めてください。

ユニット5では、少なくとも3人のクラスメイトの作業をレビューしなければなりません。レビューの一環として、クラスメイトのコードをJeliotツールにコピーして実行してください。コードが正常に動作しない場合は、問題を修正するための提案を行ってください（可能であれば）。アルゴリズムの効率性を向上させることができる場合は、その提案も行ってください。クラスメイトと連携し、修正を行った後のコードを再実行し、追加のフィードバックを提供してください。

自分のアルゴリズムやクラスメイトのアルゴリズムを確認する際には、教科書で説明された「良い」アルゴリズムの要件を確認する必要があります。

入力に基づいて正しい出力を提供しなければならない
具体的なステップで構成されていなければならない
アルゴリズムの流れに曖昧さがあってはならない
ステップ数が有限であることが判定可能でなければならない
アルゴリズムは終了しなければならない
自分のアルゴリズムやクラスメイトのアルゴリズムがこれらの特性を備えていない場合、なぜそれらの特性を備えていないのかを共同で確認し、アルゴリズムがこれらの特性を備えるように修正するための提案を行ってください。

### Japanese Written Assignment

1. 序論
この課題では、Java言語を用いて二分探索木（Binary Search Tree, BST）の構築と探索操作を行うプログラムを実装しました。本プログラムでは、ユーザーが標準入力から入力した一連の整数を二分探索木に挿入し、木構造を維持しながら探索を行います。さらに、入力された値を探索し、指定された検索値が木の中に存在するかどうかを確認する機能を持っています。最終的な動作確認はJeliot環境で実施しましたが、動作が非常に遅いため基本的な確認はオンラインのjavaコンパイラを利用して行いました。

2. アルゴリズムの設計
本プログラムでは、まず二分探索木を構成するNodeクラスを定義しました。このクラスは、ノードのデータ（整数値）、左の子ノード、右の子ノードを格納します。BinarySearchTreeクラスでは、新しいノードを挿入するためのinsert()メソッドと、木の中を探索するためのsearch()メソッドを提供しています。
挿入アルゴリズムでは、二分探索木の基本的な特性を活かし、挿入される値が現在のノードよりも小さい場合は左の子ノードに、大きい場合は右の子ノードに挿入します。この再帰的な挿入方法により、木構造が常に適切な形状を維持されます。
また、探索アルゴリズムでは、同様に再帰的な方法で木の中を検索し、目的の値が見つかるかどうかを確認します。

3. プログラムの動作概要
プログラムは以下のような動作を行います：
   1. ユーザーは整数値を入力します。0が入力されると、入力が終了します。
   2. 入力された整数は、二分探索木に挿入され、木の構造が保持されます。
   3. その後、検索値を入力すると、その値が木の中に存在するかどうかが検索され、結果が表示されます。
   4. 最後に、木の内容が中順走査（InOrder Traversal）で表示されます。

4. 計算量の解析
二分探索木の平均的な挿入および探索の時間計算量は、O(log n) です。ただし、最悪の場合（すべてのノードが一方向に偏った場合）、時間計算量は O(n) になります。今回の実装では、ユーザー入力に基づき、データがランダムな順序で挿入されるため、通常はO(log n)の効率で探索が行われます。

5. コードの実装
今回実装したコードはmain.javaとして提出しています。オンラインコンパイラで実装の確認を行う際は1行目の`import Prog1Tools.IOTools;`をコメントアウトして実行確認を行います。これは、jeliot特有のライブラリファイルであるためです。

6. 実行結果と考察

今回の二分探索木の入力としては以下を与えます。
`10 5 12 3 1 13 7 2 4 14 9 8 6 11 0`
この入力によって作成される二分探索木は以下となります。

Figure 1 Binary Tree

それぞれの値に対する探索回数を事前に整理しておくと以下のようになります。Search countは、各ノードに対して検索が行われた回数を示しています。ルートから始まり、ノードの値が探索値より小さいか大きいかを比較していく過程でカウントを行います。
Searce count : 1 -> 10
Searce count : 2 -> 5, 12
Searce count : 3 -> 3, 7, 11, 14
Searce count : 4 -> 1, 4, 6, 9, 14
Searce count : 5 -> 2, 8

その上で実行した結果のスクリーンショットを以下に記載します。

Jeliot環境では、入力例として提示されていたものを利用して実行確認を行いました。
入力
`10 5 12 3 1 13 7 2 4 14 9 8 6 11 0`
`9`

Figure 2 Jeliotで実行した結果
ここで、検索値9の想定search countは4ですが、結果と一致していることがわかります。

オンラインjavaコンパイラの環境では、二分探索木に入力したすべての値のsearch countの出力を行いました。

Figure 3 オンラインjavaコンパイラで実行した結果
この結果は、あらかじめ整理したsearch countと一致していることがわかります。

これらの結果から、作成された二分探索木に対して想定通りの探索回数でそれぞれの値を探索することができていることが確認できました。

6. 結論
今回の課題では、二分探索木の基本的な特性を活かした挿入および探索アルゴリズムを実装しました。Jeliot環境およびオンラインjava環境を利用して、木構造を適切に構築し、効率的な検索を行うアルゴリズムを実装することができました。今回の実装を通じて、二分探索木が持つ効率的な検索機能を理解し、その利点と課題を体感することができました。今後は、木のバランスを最適化するアルゴリズム（例えば、AVL木や赤黒木）についても学び、さらに効率の良いデータ構造の設計を目指していきたいと考えています。

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
- Finally, describe one important thing that you are thinking about in relation to the activity

You are required to write at least 500 words.

### Japanese Jearning Journal Question

### Japanese Learning Journal

今週学習した内容

- 二分木の特性、表記法、構造を定義し理解できること。完全な二分木理論と、この定理の拡張を理解すること。
- 列挙、先行順走査、後行順走査を含む、木の走査に対するさまざまなアプローチを理解すること。
- 以下を使用して、二分木ノードを理解し、実装できること。
  - ポインタベースのノード実装
  - 二分木の構造を維持するために必要なオーバーヘッドとスペースの影響を理解すること
  - 完全な二分木の配列実装
- 二分探索木を理解し、利用できること。また、二分木をヒープや優先度付きキューとして実装する方法を理解し、説明できること
- ハフマン符号化木の特徴と利用方法を定義できること。

今週学習した内容について感じたこと

- 二分木を利用したアルゴリズムや関数を利用したことはあったが、実際に二分木に関するプログラムの実装を行ったことは初めてであったので、気づきがあった。
  - アルゴリズムの実装は何らかの処理の実装よりも、計算量の概念を強く意識するものである。
  - メモリ使用量に関しても同様に、アルゴリズムの実装だからこそ強く意識するものであった。
- ハフマン符号木に関しては、符号化の概念はしていたものの初めての学習であった。
- これは、頻度を考慮するプログラムの実装を行うことがあった際には、覚えておいた方が事項である。
- また、今週のユニットではディスカッションの投稿とProgramming Asignmentの両方でプログラムの実装を行なった。要件からjavaでコードの実装を行ったが、久しぶりの利用であったため先週に引き続き最初は戸惑いがあった。
- Jeliotツールに関しては、自分で実装したアルゴリズムがアニメーションで動作している様を見て、頭の中で概念的に思い描いていた内容と一致したことに嬉しさを覚えた。

1. 今週の概要
今週は、二分木に関する理解を深め、木構造の走査技術と実装に重点的に取り組みました。二分木の特性、記法、構造について明確に理解し、完全な二分木理論とその拡張について学びました。さらに、ハフマン符号化木というデータ圧縮技術にも触れ、これも新しい学びでした。実践的には、先行順走査、後行順走査、中間順走査といったさまざまな走査方法を実装することで、これらの概念をしっかりと身につけました。加えて、二分探索木の構築だけでなく、それを優先度付きキューやヒープとして利用する方法も学びました。

2. 自分の感想
今回、二分木アルゴリズムを初めて実装することで、メモリ管理や計算量の重要性を強く感じました。例えば、二分探索木では、ノードの挿入や検索の効率がツリーのバランスに大きく依存しており、これがアプリケーション全体のパフォーマンスに影響を与えることを実感しました。これにより、時間計算量（例: BST検索ではO(log n)）とメモリの使用量のトレードオフについて、より深く考えるようになりました。

ハフマン符号化木を実装する際には、データの頻度パターンを活用してメモリ使用量を最小限に抑える方法に気付きました。理論的には知っていたものの、実際にツリーを構築し、頻度に基づいてデータを圧縮する過程を経験したことで、新たな発見がありました。この理解は、今後のデータ圧縮や最適化を必要とするプロジェクトにおいて非常に役立つでしょう。

さらに、Javaを使った実装では、久しぶりに使う言語だったため、最初は構文やメソッドを思い出すのに苦労しましたが、これがスキルを刷新する良い機会となりました。プログラミング言語を定期的に使用し続けることの重要性も改めて感じました。

3. 特に深く学習したこと
今週の大きな学びの一つは、Jeliotツールを使ってアルゴリズムの動作を可視化したことです。特に、走査アルゴリズムや二分探索木の操作をアニメーションで確認することで、理論的な概念がより深く理解できました。リアルタイムでアルゴリズムの動作を見ながら、デバッグやコードの改良がしやすくなり、自信がつきました。

また、完全な二分木の配列ベースの実装やポインタベースの実装について学ぶことで、メモリのオーバーヘッドと効率のトレードオフを理解することができました。配列ベースの実装はシンプルですが、ポインタベースの実装と比べて柔軟性に欠ける一方で、メモリ管理が簡単です。これらの違いを理解することで、問題に応じた最適なデータ構造の選択ができるようになりました。

4. 今後の課題と来週に向けて
今週の課題を通じて、二分木の基本概念についてはしっかりと理解できましたが、まだ応用において学ぶべきことが多くあります。特に、より複雑なデータ構造やアルゴリズムにこれらの概念を適用する際に直面する課題を感じました。二分探索木の時間計算量とメモリ使用量の管理が難しかったため、来週はこれらの課題に集中し、効率的に扱うための練習を増やす予定です。来週の目標は、より高度な木構造やアルゴリズムの最適化に取り組み、プログラミングの効率と問題解決能力をさらに向上させることです。
