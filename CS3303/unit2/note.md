# unit2

- Best, worst, and average cases for algorithm performance
- Asymptotic analysis
  - Upper and Lower Bounds
  - Big O, Big Omega, and Big Theta notation
- Determining the running time of an algorithm

## Goal

Learning Objectives:

- Understand and be able to apply basic concepts of Asymptotic analysis
- Recognize the cost /benefit tradeoffs that are inherent in the design of algorithms and the role of Asymptotic analysis to understand those characteristics in specific algorithms and data structures
- Be able to determine the best, worst, and average case performance of a particular algorithm and be able to identify and articulate for any algorithm
  - The upper bound in Big O (O) notation for the algorithm
  - The lower bound in Big Omega (Ω) notation for the algorithm
  - The notation used when the upper and lower bounds are the same which is the Big Theta (Θ) notation for the algorithm
- Recognize and be able to apply the simplifying rules outlined in section 3.4.4 of the Shaffer text.

ja

- 漸近解析の基本概念を理解し、応用することができる。
- アルゴリズムの設計に内在するコストと便益のトレードオフを認識し、特定のアルゴリズムやデータ構造におけるそれらの特性を理解するための漸近解析の役割を理解することができる。
- 特定のアルゴリズムのベストケース、ワーストケース、アベレージケースの性能を決定することができ、あらゆるアルゴリズムについて特定し、明確に説明することができる。
  - そのアルゴリズムのBig O (O)表記による上界
  - アルゴリズムのビッグオメガ（Ω）表記による下界
  - アルゴリズムの上界と下界が同じ場合に使用される表記法（ビッグ・シータ（Θ）表記法
- Shafferテキストの3.4.4節に概説されている簡略化規則を認識し，適用できる．

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Chapter 3: Algorithm Analysis in A Practical Introduction to Data Structures and Algorithm Analysis by Clifford A. Shaffer.

アルゴリズムの実行時間に関して、T=cnのような一次方程式の形式ではコンピュータ性能は実行時間に対して直接の影響を与えない。
  一般的に、コンピュータの性能が改善されると問題サイズもそれに比例して大きくなるため。
big-Oh表記は、アルゴリズムの実行時間上限を表現する。
Supplemental Video Lectures

MIT (Analysis of Algorithms Video Lecture Part 1)
URL: <http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-046j-introduction-to-algorithms-sma-5503-fall-2005/video-lectures/lecture-1-administrivia-introduction-analysis-of-algorithms-insertion-sort-mergesort/>

MIT (Analysis of Algorithms Video Lecture Part 2)
URL: <https://ocw.mit.edu/courses/6-046j-introduction-to-algorithms-sma-5503-fall-2005/resources/lecture-2-asymptotic-notation-recurrences-substitution-master-method/>

## Discussion Forum

For the following problems, develop your own answers and post your answers to the discussion forum.  Review the responses of at least 3 of your peers.  If you find that your peer has come up with a different answer than your own, engage your peer in a dialogue to ‘compare notes’ to determine where the problem lies.  
If you have discovered a different way of understanding the problem or solving the problem share your approach with your peers.  The objective of this assignment is to collaboratively learn and develop correct results for each of the problems.    Asymptotic analysis is a difficult concept to master as such we will all benefit by understanding each others perspectives.

1. Suppose that algorithm A takes 1000n3 steps and algorithm B takes 2n steps for a problem of size n. For what size of problem is algorithm A faster than B (meaning algorithm A has fewer steps than B)?  In your answer describe not only what the answer is but how you arrived at the answer.  
2. Give the upper bound (big O notation) that you can for the following code fragment, as a function of the initial value of n.

for(int i = 0; i < n; i++) {
    for(int j = 0; j < i; j++){
        //do swap stuff, constant time
    }
}

Do you think that the lower bound is likely to be the same as the answer you gave for the upper bound? In your response state why or why not.

### Japanese Discussion Question

以下の問題について、自分自身の解答を作成し、それをディスカッションフォーラムに投稿してください。最低でも3人の仲間の回答を確認し、もし仲間が自分とは異なる答えを出していた場合、対話を通じて「ノートを比較」し、問題の所在を見つけるようにしてください。
もし、問題の理解や解決方法において異なるアプローチを発見した場合は、その方法を仲間と共有しましょう。この課題の目的は、協力して学び、各問題に対して正しい結果を導き出すことです。漸近解析（アシンポティック解析）は習得が難しい概念であるため、互いの視点を理解することが全員の利益につながります。

1. アルゴリズムAが1000n³ステップを必要とし、アルゴリズムBが2nステップを必要とする場合、問題のサイズnがいくつのときにアルゴリズムAの方がBよりも速い（つまり、アルゴリズムAのステップ数がBよりも少ない）でしょうか？あなたの回答には、答えだけでなく、その答えにどのようにたどり着いたかの説明も含めてください。

2. 次のコード片について、初期値nを変数とする上限（ビッグO記法）を答えてください。

```cpp
コードをコピーする
for(int i = 0; i < n; i++) {
    for(int j = 0; j < i; j++){
        //swapの処理、一定時間
    }
}
```

下限も上限と同じだと考えますか？その理由を述べてください。

### Japanese Discussion

クラスメイトの皆さん、こんにちは。今回のテーマに対する私の理解を説明します。

1. アルゴリズムAのステップ数がが\(1000n^3\)、アルゴリズムBのステップすが \(2^n\)なので、これらを比較するために不等式を立てます。
\[
1000n^3 < 2^n
\]
この不等式を解くと、nがどのような値の場合にアルゴリズムAがアルゴリズムBより高速であるかを確認することができます。この不等式を解析的に解くことは難しいため、具体的な値を代入して確認する方法をとります。
以下は、それぞれのnに対してアルゴリズムAとアルゴリズムBの具体的なステップ数がどのような値にあるかを表に示したものです。

n Algorithm A Algorithm B A < B
1 1,000 2 FALSE
2 8,000 4 FALSE
3 27,000 8 FALSE
10 1,000,000 1,024 FALSE
15 3,375,000 32,768 FALSE
20 8,000,000 1,048,576 FALSE
21 9,261,000 2,097,152 FALSE
22 10,648,000 4,194,304 FALSE
23 12,167,000 8,388,608 FALSE
24 13,824,000 16,777,216 TRUE
25 15,625,000 33,554,432 TRUE

この表を確認すると、n=24の場合に初めてアルゴリズムAのステップ数があアルゴリズムBのステップ数よりも小さくなります。
よって、問題のサイズがn=24より大きい場合に、アルゴリズムAの方がアルゴリズムBよりも速くなることが確認できました。

2. このコードでは、外側のループが i = 0 から i = n - 1 まで n 回繰り返されます。内側のループは j = 0 から j = i - 1 まで繰り返されるため、各ループの繰り返し回数は i に依存します。
内側のループの回数は、i = 0 のとき0回、i = 1 のとき1回、i = 2 のとき2回、と続きます。つまり、内側のループ全体では、次のような和になります：

\[
0 + 1 + 2 + ... + (n - 1)
\]

この和は等差数列の和の公式を用いて、計算することができます：

\[
\frac{(n-1)n}{2}
\]

したがって、ループ全体のステップ数は \frac{(n-1)n}{2} であり、これは漸近的に O(n^2) となります。

また、このコードの各ステップは必ず実行されるため、下限も上限と同じく O(n^2) です。ループの回数が常に上記のように増加していくため、下限も O(n^2) であると考えられます。

## Written Assignment

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
- Finally, describe one important thing that you are thinking about in relation to the activity
You are required to write at least 500 words.

### Japanese Jearning Journal Question

ラーニングジャーナルは、学習プロセスに関する自己反省のためのツールです。指定されたタスクを完了することに加えて、ラーニングジャーナルを使用して、自分の活動を記録し、直面した問題を記録し、ディスカッションフォーラムや課題のための回答を下書きすることが推奨されます。ラーニングジャーナルは定期的（週に1回）に更新する必要があり、最終成績の一部としてインストラクターによって評価されます。

ラーニングジャーナルへの記入には、次の質問を考慮した反省文が必要です：

- 何をしたかを説明してください。これは、投稿したものや準備した課題をコピー＆ペーストするという意味ではありません。実際に行ったことと、その方法を説明する必要があります。
- それに対する自分の反応を説明してください。
- 受けたフィードバックや、特定のやり取りがあれば、それらについて説明し、それらがどのように役立ったかを議論してください。
- 自分の感情や態度について説明してください。
- 学んだことを説明してください。

ラーニングジャーナルに含めるべき別の質問：

- 自分にとって驚いたことや疑問に思ったことは何ですか？
- 特に難しく感じたことは何ですか？なぜそれが自分にとって難しかったのか？
- どのようなスキルや知識が身についていると感じますか？
- 自分が学習者として気付いていることは何ですか？
- 学んだアイデアや概念をどのように自分の経験に適用できていますか？
- 最後に、その活動に関連して考えている重要なことを一つ説明してください。
最低500文字を書く必要があります。

### Japanese Learning Journal

プロンプト用雑記

今週学習した内容

- 漸近解析の基本概念を理解し、応用することができる。
- アルゴリズムの設計に内在するコストと便益のトレードオフを認識し、特定のアルゴリズムやデータ構造におけるそれらの特性を理解するための漸近解析の役割を理解することができる。
- 特定のアルゴリズムのベストケース、ワーストケース、アベレージケースの性能を決定することができ、あらゆるアルゴリズムについて特定し、明確に説明することができる。
  - そのアルゴリズムのBig O (O)表記による上界
  - アルゴリズムのビッグオメガ（Ω）表記による下界
  - アルゴリズムの上界と下界が同じ場合に使用される表記法（ビッグ・シータ（Θ）表記法
- Shafferテキストの3.4.4節に概説されている簡略化規則を認識し，適用できる．

今週学習した内容について感じたこと

- 今週のユニットでは「アルゴリズム設計を行う上でコストと便利さのトレードオフ関係」や「アルゴリズムの性能決定の考え方」などを学習した。
- 私自身は競技プログラミングを趣味としていることもあり、ビッグ・オー記法とその考え方については一定の理解をしているが、ビッグオメガやシータに関してはしっかりと理解することができていなかったので、これを機に整理したいと思う。

1. 今週の概要
今週は、アルゴリズムの漸近解析の基本概念を学びました。特に、ビッグ・オー、ビッグオメガ、ビッグ・シータ記法のそれぞれがアルゴリズムの性能評価にどのように使われるかを理解しました。また、Shafferテキストの3.4.4節に記載されている簡略化規則についても学び、複雑なアルゴリズムの分析に役立つ知識を得ました。さらに、アルゴリズム設計において、コストと便益のトレードオフを考慮することが重要であることを再確認し、ベストケース、ワーストケース、アベレージケースにおけるアルゴリズムの性能をどのように決定するかについても学びました。これらを通じて、実践的な理解が深まりました。

2. 自分の感想
今週の学習を通じて、アルゴリズムの評価における漸近解析の考え方を深く理解することができました。特に、アルゴリズム設計においてコストと便益のトレードオフを意識するためには、インプットとなるデータや条件をしっかりと整理する必要があることを再認識しました。Webサービスなどの分野では、これらの要素がサービスの成長や規模に応じて変動し、設計やアルゴリズムの改善が求められる点が非常に興味深いと感じました。私は競技プログラミングを趣味としており、ビッグ・オー記法に関してはある程度の理解があったものの、ビッグオメガやビッグシータに関しては十分に整理できていませんでした。しかし、今回の学習でこれらの記法についても新たな視点を得ることができたため、非常に有意義な学びとなりました。

3. 特に深く学習したこと
今週は、アルゴリズム評価において重要な役割を果たすビッグオー、ビッグオメガ、ビッグシータ記法について、具体的な関数を使って深く学習しました。
まず、**ビッグオー記法 (Big O)** は、アルゴリズムの最悪ケースにおける時間的または空間的複雑さの上限を示します。例えば、関数 \( f(n) = 3n^3 + 2n^2 + n \) の場合、最も支配的な項は \( n^3 \) であり、この関数のビッグオーは \( O(n^3) \) となります。これは、入力サイズ \( n \) が大きくなると、アルゴリズムの実行時間が最大で \( n^3 \) のオーダーで増加することを意味します。
次に、**ビッグオメガ記法 (Big Omega)** は、最良ケースにおけるアルゴリズムの下限を表します。同じく関数 \( f(n) = 3n^3 + 2n^2 + n \) について考えると、最も少ない時間で動作する部分は線形項 \( n \) です。したがって、ビッグオメガは \( \Omega(n) \) となり、最良ケースでも少なくとも \( n \) のオーダーで時間がかかることを示します。
最後に、**ビッグシータ記法 (Big Theta)** は、上限と下限が一致する場合に適用されます。この記法を適用する場合、関数の成長が最悪でも最良でも同じオーダーであることを示します。例えば、関数 \( f(n) = 3n^3 + 2n^2 + n \) の場合、支配的な項が \( n^3 \) であるため、この関数のビッグシータは \( \Theta(n^3) \) となり、アルゴリズムがどのケースでも同様の成長を見せることを意味します。
これらの具体的な関数を通じて、ビッグオー、ビッグオメガ、ビッグシータの記法がアルゴリズムの評価にどのように使われるかを理解することができました。特に、アルゴリズムの設計や選定において、どのようなシナリオでも効率的に機能するかを判断するための重要な指標となることを再確認しました。

4. 今後の課題と来週に向けて
来週はリスト構造とリンクリスト構造について学習する予定です。リスト構造はデータ構造の基礎であり、配列やリンクリストのように要素を連続的または動的に格納する方法を学びます。特に、リンクリスト構造では、動的なメモリ割り当てや要素の挿入・削除が効率的に行えるという点が重要です。これにより、柔軟なデータ管理が可能となり、さまざまなアルゴリズムやアプリケーションでの活用が期待されます。来週の学習では、これらのデータ構造の基本的な操作や、それらがどのように時間・空間効率に影響するかを深く理解することを目標としています。また、今後の競技プログラミングにおいて、これらの構造を活用して効率的なアルゴリズムを設計できるようになることを目指しています。
