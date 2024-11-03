# unit6

- Sorting terminology and notation
- Basic sorting algorithms (insertion, bubble, and selection)
- Advanced sorting algorithms (shellsort, mergesort, quicksort, heapsort, binsort and radix sort)
- Comparison of sorting algorithms

## Goal

main

- Understand the terminology of sorting algorithms
- Understand and be able to implement basic sorting algorithms including:
  - Insertion sort
  - Bubble sort
  - Selection sort
- Recognize and be able to articulate the inefficiencies in these sorting algorithms
- Understand the concept of an exchanges and how this is used in exchange sorts.
- Understand and be able to implement the following advanced sorting algorithms
  - Shellsort
  - Mergesort
  - Quicksort
  - Heapsort
- Binsort and Radix Sort
- Understand and be able to apply Asymptotic analysis against sorting routines to determine their cost in terms of processing time.

ja

- ソートアルゴリズムの専門用語を理解する
- 以下の基本的なソートアルゴリズムを理解し、実装できる
  - 挿入ソート
  - バブルソート
  - 選択ソート
- これらのソートアルゴリズムにおける非効率性を認識し、明確に説明できる
- 交換の概念を理解し、交換ソートでどのように使用されるかを理解する。
- 以下の高度なソートアルゴリズムを理解し、実装できる
  - シェルソート
  - マージソート
  - クイックソート
  - ヒープソート
- バインソートおよび基数ソート
- ソートルーチンに対して漸近分析を適用し、処理時間におけるコストを決定できる。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Required:  Chapter 7: Internal Sorting in A Practical Introduction to Data Structures and Algorithm Analysis by Clifford A. Shaffer.

Chapter 7では、主に内部ソートに関するアルゴリズムを取り扱っています。内部ソートは、データがすべてコンピュータのメインメモリに収まる範囲で行われるソートを指します。この章では、まず単純なアルゴリズムとして挿入ソート、バブルソート、選択ソートが紹介されます。これらのアルゴリズムは直感的に理解しやすいものの、計算時間がΘ(n²)であり、特にデータ量が多くなると非効率的です。次に、より高度で効率的なアルゴリズムであるシェルソート、マージソート、クイックソートが取り上げられます。クイックソートは、最も一般的に使用されるアルゴリズムであり、平均計算時間が**O(n log n)で非常に高速です。ただし、最悪の場合はO(n²)となるため、適切なピボット選択が必要です。また、各アルゴリズムの最適化や、状況に応じた使い分けについても言及されています。最後に、ソートの計算量が最悪の場合Ω(n log n)**であることが理論的に証明されており、これがソートアルゴリズムの基本的な性能限界を示しています。

Recommended:  Review Chapter 8 Sorting in Data Structures and Algorithms: An Annotated Reference with Examples by Granville Barnett and Luca Del Tongo.

Chapter 8では、外部ソート、つまりデータがメインメモリに収まりきらない場合に使用されるソート手法を扱っています。この章では、外部ソートが必要となる典型的なシナリオとして、大規模なデータセットのソートやファイル処理が挙げられます。特に、マージソートをベースにした外部ソート手法が多く利用されます。マージソートは、データを小さな部分に分割し、それを順次マージしていくことで効率的にソートを行うアルゴリズムです。外部ソートでは、データの分割やファイルの読み書きに関連するI/O操作が主なボトルネックとなるため、効率的なバッファリングや読み書きの最適化が重要となります。また、分割マージ法や多段階ソートなど、特定のニーズに応じた最適化手法についても言及されています。外部ソートの基本的な手法やその応用例を学ぶことで、大規模データ処理におけるソートアルゴリズムの効率化について理解を深めることができます。

## Discussion Forum

The quicksort is an example of a divide and conquer algorithm in that it divides the sorting problem into smaller problems by dividing the list of items to be sorted into smaller subsets. The pivot is the mechanism that is used to segment the list. Describe how the quicksort works including a discussion of the pivot, how it is selected, and why the pivot is important to the quicksort.

### Japanese Discussion Question

クイックソートの仕組みとピボットの役割
クイックソートは、分割統治法を活用した効率的なソートアルゴリズムの一例です。このアルゴリズムは、ソートする配列を再帰的に小さな部分に分割し、それぞれの部分を独立してソートすることで、全体のソートを完了させます。クイックソートの特徴的な要素は、「ピボット」と呼ばれる要素を使用して、配列を部分に分割する点にあります。このピボットの選定と配置が、クイックソートの成功にとって重要な役割を果たします。

ピボットの選定とその重要性
クイックソートの動作において、ピボットは配列を小さい値と大きい値に分割するための基準として機能します。ピボットの選定にはいくつかの方法があり、一般的には配列の最初の要素、中央の要素、またはランダムに選ばれた要素がピボットとして使用されます。特にピボットの選び方が不適切であると、分割が極端なバランス崩れを起こし、最悪の場合、クイックソートの時間計算量がO(n²)になる可能性があります (Shaffer, 2011)。一方で、ピボットの選定が適切であれば、平均的なケースでは計算量がO(n log n)に収まり、効率的なソートが可能です。

クイックソートの手順
クイックソートの手順は、次のように進行します。まず、配列の一つの要素をピボットとして選びます。そして、他の要素をピボットと比較しながら、ピボットより小さい値を左側に、大きい値を右側に分けます。このプロセスを「パーティショニング」と呼びます (Shaffer, 2011)。次に、左側と右側の部分配列について、再帰的にクイックソートを適用していきます。これを繰り返すことで、全体の配列がソートされます。

クイックソートの性能と利点
クイックソートは、追加のメモリを必要としないインプレースアルゴリズムであり、これが大きな利点の一つです。また、他のソートアルゴリズムと比較して、平均的なケースでの性能が非常に優れていることから、一般的なソートアルゴリズムとして広く利用されています (Shaffer, 2011)。クイックソートの平均的な時間計算量はO(n log n)ですが、最悪の場合にはO(n²)となる可能性があるため、ピボットの選定が非常に重要となります。

結論
クイックソートは、効率的で強力なソートアルゴリズムの一つであり、その成功はピボットの選定とパーティショニングに大きく依存しています。ピボットを適切に選び、バランスよく分割できれば、クイックソートは非常に高速に動作します。そのため、ピボットの選定がクイックソートの鍵となることは間違いありません。

### Japanese Discussion

## Written Assignment

Develop a sorting algorithm. Your sorting algorithm may only be an implementation of the shellsort, mergesort, or quicksort. Your algorithm must use an array of integers of at least 21 different items. The items in the list must be in random order. Your algorithm must sort the list using the sorting algorithm that you have chosen and keep track of the number of exchanges that are required to sort the list. This value along with the contents of the sorted list must be displayed as output to the algorithm to the console.

The following algorithm implements a sorting algorithm that meets the requirements of this assignment with the exception of the fact that it sorts the list using an insertion sort. The insertion sort is an example of a ‘brute force’ algorithm. A brute force algorithm is one that solves a problem in a simple way by computing every possible step. As you run this algorithm you will see how a item is often moved many times until it finds the right place and then the same thing is done with the next item. It isn’t very elegant, it works, but it does a LOT OF WORK and is not very efficient. We will define ‘Brute Force’ in more detail in CS1304. You can copy this code into the Jeliot tool to understand the output that will be required in your algorithm and the operation of a Brute Force Insertion sort algorithm.

In the preceding code example, you will note that the array to be sorted contains 21 random items, which are sorted by the algorithm, which happens to be an insertion sort. Your assignment will be to create your own sort algorithm that implements one of the following types of sort: shellsort, mergesort, quicksort. Please use the same list of items in your sort that are in the preceding example as follows:

12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77

As part of your assignment, you must submit both a description of the assignment and how your algorithm works, including an Asymptotic analysis of your algorithm. Your analysis must include the efficiency of your algorithm expressed in Big Oh, Big Omega, or Big Theta notation as appropriate.

Please indicate in your description whether your algorithm implements a shellsort, mergesort, or quicksort. This must include a description of how your selected algorithm functions and why it is more efficient than the insertion sort above.

We will obtain another measure of efficiency by comparing the number of exchanges that were required to complete the sort. For the insertion sort above, the required number of exchanges is 114. You should compare this with the number of exchanges required by your sorting algorithm in your description. Please discuss whether your output was what you expected.

Further, as part of your assignment, you must include the code of your algorithm. All of these elements of this assignment must be completed and posted to the assignment for Unit 6 by the end of the week for unit 6.

During Unit 7, you must review the work of at least three of your peers. As part of your review, you must copy and paste your peer’s code into the Jeliot tool and execute it. If the code does not function properly, you should make suggestions on how to correct the problems (if possible). If the efficiency of the algorithm can be improved, you should make these suggestions. You should coordinate with your fellow student and follow up on any corrections they make by re-running the code and providing additional feedback. In this assignment, each sort routine will use the same set of unsorted integers. You should compare the metrics of your sort, including the number of comparisons and the number of exchanges made, as one measure of the efficiency of the sort. Keep in mind that asymptotic analysis can provide us with insight into the efficiency of an algorithm in the worst case, best case, and in some situations in, the average case. However, we also know that the input of the algorithm has a significant impact on the actual experienced efficiency of an algorithm. As part of your review and discussion of peers' work, compare actual efficiency to what was expected from the asymptotic analysis and discuss if the experienced results differ from the expectation of the performance of the algorithm that is based upon the asymptotic analysis and actual experienced performance.

As you review your own algorithm and those of your peers, you should be looking for the following characteristics that our text outlined as being requirements of a ‘good’ algorithm.

It must provide the correct output based on the input
It must be composed of concrete steps
There can be NO ambiguity in the flow of the algorithm
The algorithm must have a finite number of steps that is determinable
The algorithm must terminate or complete
If either your algorithm or the algorithms of your peers that you are reviewing do not exhibit these characteristics, you should collaboratively determine why the algorithm does not exhibit these characteristics and offer suggestions to correct the algorithm such that it does exhibit these characteristics.

Assignment Tips:

The algorithm implements a sorting algorithm that includes each of the following:
Implements one of the following: mergesort, quicksort, or shellsort
Displays or writes out to the console the sorted array
Calculates and reports the number of exchanges made by the sort routine
Is Source code (that can be loaded and executed using the Jeliot tool) for the algorithm included in the assignment post?
Does the algorithm provide the appropriate output? (The output from Jeliot should be provided as an attachment as a screenshot of the Jeliot screen or a capture of the java output. You should not have to run the Jeliot code to get the output. However, you can and should, if possible, run the code and make suggestions to your peers)
Does the assignment post include a description of the operation of the algorithm, and does the description include an Asymptotic analysis of the algorithm expressed in Big O notation?
Is the Asymptotic analysis correct (does it match the example provided by the instructor)?

### Japanese Written Assignment Question

ソートアルゴリズムを開発しなさい。使用できるソートアルゴリズムは、シェルソート、マージソート、またはクイックソートのいずれかに限られます。アルゴリズムは、少なくとも21個の整数が含まれた配列を使用しなければならず、リスト内の項目はランダムな順序でなければなりません。選択したソートアルゴリズムを使用してリストをソートし、リストをソートするのに必要な交換回数を追跡しなければなりません。この値と、ソートされたリストの内容をアルゴリズムの出力としてコンソールに表示してください。

次のアルゴリズムは、課題の要件を満たすソートアルゴリズムを実装していますが、リストを挿入ソートを使用してソートしている点だけが例外です。挿入ソートは「ブルートフォース」アルゴリズムの一例です。ブルートフォースアルゴリズムとは、問題を単純にすべてのステップを計算することで解決するものです。このアルゴリズムを実行すると、ある項目が正しい位置を見つけるまで何度も移動され、その後、次の項目でも同じことが行われる様子を見ることができます。これは非常に効率的ではありませんが、機能します。ブルートフォースについては、CS1304でより詳細に定義します。このコードをJeliotツールにコピーして、課題で必要な出力とブルートフォースによる挿入ソートアルゴリズムの動作を理解してください。

前述のコード例では、ソートされる配列に21個のランダムな項目が含まれており、アルゴリズムによって挿入ソートでソートされています。あなたの課題は、シェルソート、マージソート、またはクイックソートのいずれかを使用して独自のソートアルゴリズムを作成することです。ソートには、次の例と同じリストの項目を使用してください。

12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77

課題の一環として、アルゴリズムの動作の説明と、アルゴリズムの漸近解析（Asymptotic analysis）も提出する必要があります。この解析には、アルゴリズムの効率性をビッグオー（Big O）、ビッグオメガ（Big Omega）、またはビッグシータ（Big Theta）表記で表すことが含まれなければなりません。

また、選択したソートアルゴリズムがシェルソート、マージソート、またはクイックソートのどれであるかを説明し、そのアルゴリズムがどのように機能するのか、なぜ挿入ソートより効率的であるのかを記述してください。

さらに、ソートを完了するのに必要な交換回数を比較することで、効率性のもう一つの指標を取得します。挿入ソートでは、必要な交換回数は114です。あなたのソートアルゴリズムで必要だった交換回数を説明し、期待通りの結果だったかどうかを議論してください。

また、課題の一部として、アルゴリズムのコードも提出する必要があります。これらすべての要素を完了し、ユニット6の課題として今週の終わりまでに投稿してください。

ユニット7では、少なくとも3人のクラスメートの作業をレビューする必要があります。レビューの一環として、クラスメートのコードをJeliotツールにコピーして実行します。コードが正しく動作しない場合は、問題を修正するための提案を行ってください（可能であれば）。アルゴリズムの効率が改善できる場合は、その提案をしてください。クラスメートと調整し、彼らが行った修正を再実行して、追加のフィードバックを提供してください。

### Japanese Written Assignment

1. 課題の概要
この課題では、21個のランダムな整数を配列として用い、それをマージソート（mergesort）アルゴリズムを使ってソートすることが求められています。ソートの過程で交換が行われた回数を追跡し、その結果を表示します。さらに、アルゴリズムの効率性について、漸近解析を行い、挿入ソートとの比較を行います。

2. アルゴリズムの説明
**マージソート（Merge Sort）アルゴリズムの説明**
マージソートは「分割統治法（Divide and Conquer）」に基づくソートアルゴリズムで、リストを分割して、それぞれを再帰的にソートし、最後にマージすることでリストを並べ替えます。具体的には、以下のステップで動作します。

1. リストを半分に分割し、個々の部分リストが1つの要素になるまで再帰的に分割します。
2. 分割されたリストを、順序を保ちながらマージしていきます。
3. 最終的に1つのソートされたリストが完成します。

**挿入ソートとの比較**
挿入ソートは「ブルートフォース」アルゴリズムであり、リストを順次走査し、各要素を正しい位置に挿入します。挿入ソートは実装が比較的単純で、要素数が少ない場合には有効ですが、交換回数が非常に多くなるため、大規模なデータセットでは効率が低くなります。
一方、マージソートは分割統治法を使用するため、挿入ソートに比べて交換回数が少なく、特に大規模なデータセットではより効率的に動作します。

3. 実装の詳細
マージソートの実装においては、与えられたリスト 12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75, 69, 31, 88, 101, 14, 29, 91, 2, 0, 77 を使用し、ソートを実行しました。ソートの過程で、交換回数を追跡し、最終的な交換回数は挿入ソートでの114回と比較します。

以下に、実装したマージソートのコードとソート結果を示します。

CODE

EXECUTION RESULT

4. 漸近解析（Asymptotic Analysis）
マージソートの計算量は、分割統治法の特性により、最悪・最良・平均の場合のいずれもO(nlogn) です(Shaffer, 2011)。これは、リストを再帰的に分割する際にかかるlogn の時間と、マージする際にかかるn の時間から導き出されます。
対して、挿入ソートは最悪の場合
O(n^2)、最良の場合O(n) で、データがほぼ整列している場合は有効ですが、ランダムなデータセットでは効率が低下します​(Shaffer, 2011)。

5. 結果の分析
マージソートを実行した結果、交換回数は 30回 であり、挿入ソートでの 114回 に比べて大幅に少ないことが確認されました。これは、マージソートが挿入ソートよりも効率的であり、特に大規模なデータセットにおいて交換回数が少なくなるためです。
期待通りの結果であり、マージソートが効率的に動作することを示しています。また、漸近解析でも確認された通り、挿入ソートはO(n^2) の複雑性を持つため、ランダムなデータセットに対して多くの交換が必要となります。これに対して、マージソートはO(nlogn) の計算量を持ち、より少ない交換回数でソートを完了することができました。

6. 結論
今回の課題では、マージソートを実装し、挿入ソートとの効率性の比較を行いました。マージソートは、挿入ソートと比較して効率的であり、特に大規模なデータセットにおいてその性能が顕著に現れます。交換回数を追跡した結果、マージソートの方が挿入ソートより少ない交換でソートできることが確認されました。今後、他のソートアルゴリズムとも比較し、適切な場面で使用できるアルゴリズムを選択できるようにすることが重要です。

参考文献

## Learning Journal

A guide for writing a “reflective journal:”

Who will read the journal?

The contents of your journal will be only visible to the instructor.  Unlike discussion forums or blogs, the journal is an area for reflection without a wide audience.

Why do it?

Maintaining a journal serves several purposes:

1. A means of communication, conversation (e.g., between material and yourself, yourself and instructors).

2. Provides regular feedback between you and the instructors and helps to match expectations.

3. Platform for synthesis of knowledge and ideas

4. Help develop critical thinking

5. Helps to elicit topics of interest, challenging topics that need improvement, etc.

What to write?

First write a brief summary of the contents of a lecture, lab activity, group discussion or reading material. Then reflect upon these activities. Record your own thoughts, ideas, responses and reactions to any of the above activities. Make notes about concepts, questions you have, and any confusion that may arise. Use the journal to explore possible solutions to problems being raised in class or alternative activities to the ones presented in class. Record new insights and problem solving strategies realized during discussions with fellow students and instructors. The journal reflects your own thoughts and ideas. Be as original and critical (constructive) as you can.

Some additional ideas:

Describe any feedback you received or any specific interactions you had.

Discuss how they were helpful Describe your feelings and attitudes What surprised me or caused me to wonder?

What happened that felt particularly challenging? Why was it challenging to me?

What skills and knowledge do I recognize that I am gaining?

What am I realizing about myself as a learner?

In what ways am I able to apply the ideas and concepts gained to my own experience?

What not to do:

Do not copy and paste any material from the discussion forum, your own assignment, or any other source.  The entries in the journal must be your own words.

When do I use the journal?

You are expected to use the journal for each week of the course.

How will it be graded?

Each weekly journal must be at least 200 words long.  Please use proper grammar and keep your writing on the class topic.  Deductions from a full credit on this assignment would be taken if you copy and paste content.  As long as you write down your own reflection about the learning activities, deductions will not be taken.  You will receive a single grade for each week and the grades will count toward your final grade in the course.

### Japanese Jearning Journal Question

### Japanese Learning Journal

今週学習した内容

- ソートアルゴリズムの専門用語を理解する
- 以下の基本的なソートアルゴリズムを理解し、実装できる
  - 挿入ソート
  - バブルソート
  - 選択ソート
- これらのソートアルゴリズムにおける非効率性を認識し、明確に説明できる
- 交換の概念を理解し、交換ソートでどのように使用されるかを理解する。
- 以下の高度なソートアルゴリズムを理解し、実装できる
  - シェルソート
  - マージソート
  - クイックソート
  - ヒープソート
- バインソートおよび基数ソート
- ソートルーチンに対して漸近分析を適用し、処理時間におけるコストを決定できる。

今週利用したテキスト

Required:  Chapter 7: Internal Sorting in A Practical Introduction to Data Structures and Algorithm Analysis by Clifford A. Shaffer.

今週学習した内容について感じたこと

- さまざまなソートアルゴリズムについて、理論を学習した。
- 特に、クイックソートとマージソートに関しては、ディスカッションとAssignmentにおける題材として、具体的な実装と漸近解析まで実施した。
- 通常プログラミングを行う際は、それぞれのソートアルゴリズムを深く意識することはなく、標準機能として提供されているソート関数を利用するが、ソート対象の特性によって使い分けることが、最終的な処理時間の向上につながる可能性があることを知ることができた。

来週学習すること

- プライマリ・ストレージとセカンダリ・ストレージの違いを理解し、明確に説明できる。
  - コンピュータのRAMメモリ
  - ディスクドライブおよびその他のセカンダリ・ストレージ・デバイス
  - 永続性メモリと揮発性メモリの概念
  - セカンダリ・ストレージに実装されたデータ構造（ファイル構造
- ディスクドライブの用語とアーキテクチャを理解する
- ヘッドの移動とシーク時間に関連するディスク・アクセス・コストの概念を理解する
- 以下のような概念を組み込んだバッファ・キャッシュを理解し、実装できる。
  - バッファ・プール
  - FIFO、LFU、LRUアプローチなどのヒューリスティクス
  - 仮想メモリ
- 外部ソートを理解し、実装できる。また、以下の主要概念に精通している。
  - キーソートとインデックスファイル
  - クイックソートとマージソートの実装
  - 置換選択アルゴリズム
  - マージ

1. 今週の概要
今週は、さまざまなソートアルゴリズムの理論的背景と実装方法について学びました。具体的には、挿入ソート、バブルソート、選択ソートといった基本的なアルゴリズムから始まり、シェルソート、マージソート、クイックソート、ヒープソートなどの高度なアルゴリズムについても理解を深めました。また、これらのソートアルゴリズムにおける非効率性や、交換の概念に基づく交換ソートの仕組みについても学習しました。さらに、バインソートおよび基数ソートの理解を深め、それらのアルゴリズムに漸近分析を適用し、処理時間のコストを決定する方法を学びました（Shaffer, 2011）。

2. 自分の感想
今回の学習を通じて、普段意識することの少ないソートアルゴリズムの詳細な理解が得られました。特に、クイックソートとマージソートの実装を通して、漸近解析を実施したことは非常に有益でした。普段、プログラミングを行う際は、標準ライブラリのソート機能を利用していたため、それぞれのソートアルゴリズムを深く意識することはあまりありませんでした。しかし、ソート対象の特性に応じてアルゴリズムを使い分けることで、処理時間の大幅な改善が見込めることを学び、非常に興味深かったです（Shaffer, 2011）。

3. 特に深く学習したこと
今週は、特にクイックソートとマージソートに関して深く学びました。両者ともに漸近的にはO(nlogn) という効率の良いアルゴリズムですが、クイックソートは最悪の場合
O(n^2) となることがあり、ピボットの選び方がパフォーマンスに大きく影響することを理解しました。また、マージソートは安定したソートアルゴリズムであり、大規模なデータセットに対して有効な手法であると感じました（Shaffer, 2011）。これらの知識をもとに、Assignmentでは具体的な実装と分析を行い、ソートアルゴリズムがどのように機能するかを体感できました。

4. 今後の課題と来週に向けて
来週は、コンピュータのプライマリ・ストレージとセカンダリ・ストレージの違いを理解し、ディスクドライブやその他のストレージデバイスに関する知識を深めたいと考えています。また、ヘッドの移動やシーク時間に関連するディスクアクセスコストの概念についても理解を深める予定です。これにより、外部ソートや仮想メモリの実装など、さらに複雑なデータ構造やアルゴリズムへの理解を進めていきたいと思います。
