# unit8

- Foundation of logic programming
- Unification
- Prolog
  - Facts
  - Queries
  - Rules
  - Lists
  - Functions
  - Computation
  - Recursion
  - Unification
  - Resolution
- Advanced logic programming concepts

## Goal

main

- Articulate how logic programming differs from imperative programming
- Discuss they features of logic programming
- Understand key concepts within functional programming including:
  - Facts
  - Queries
  - Rules
  - Lists
  - Functions
  - Unification
  - Resolution
  - Recursion
- Learn basic concepts of the Prolog language
- Develop simple functional programs in prolog by following the exercises

ja

- 論理プログラミングと命令型プログラミングの違いを明確に説明できる
- 論理プログラミングの特徴について議論できる
- 関数型プログラミングにおける以下の主要概念を理解する
  - 事実
  - クエリ
  - ルール
  - リスト
  - 関数
  - 単一化
  - 解決
  - 再帰
- Prolog言語の基本概念を習得する
- 演習に従ってPrologで簡単な関数型プログラムを作成する

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
    Chapter 17 - Logic Programming

## Discussion Forum

Conduct research using the internet and the University of the People library to determine what types of computing problems are solved most efficiently using a Logic programming language such as Prolog.  As part of your response discuss a specific application and indicate what features within Prolog (or logic programming in general) make it ideally suited as a solution for your selected computing problem.

For example: Prolog is ideally suited as a programming language for the artificial intelligence routines within an industrial robot because  …

You are expected to make a minimum of 3 responses to your fellow student’s posts.

インターネットおよびUniversity of the Peopleのライブラリを使用して、Prologのようなロジックプログラミング言語を使用することで最も効率的に解決できる計算問題の種類を調査してください。回答の一部として、具体的なアプリケーションを取り上げ、Prolog（またはロジックプログラミング全般）のどのような特徴が、選択した計算問題の解決に最適であるかを示してください。

例：Prologは、産業用ロボットの人工知能ルーチンに最適なプログラミング言語であり、それは…

また、同級生の投稿に最低3回返信する必要があります。

### Japanese Discussion

1. 導入
ロジックプログラミング言語は、計算問題を宣言的に解決するための強力なツールとして知られています。その中でもDatalogは、データベースクエリと知識表現に特化した論理プログラミング言語として注目されています。Datalogは再帰的クエリを簡潔に記述できるため、複雑なデータ関係を持つ問題において高い効率性を発揮します。本回答では、Datalogがデータベースクエリの計算問題にどのように適しているかを示し、具体的な応用例として家族系譜の解析を詳しく説明します。

2. 問題の紹介
データベースクエリの計算問題は、大量のデータから意味のある情報を抽出する必要があるため、効率的かつ柔軟な解決方法が求められます。例えば、社会的ネットワーク解析では、以下のような課題が発生します：

課題1：グループの特定
特定の人物がどのグループに属しているか、またその影響範囲を特定するためにネットワーク全体を解析する必要があります。

課題2：経路探索
2人の人物間の最短経路や関係性の階層を明らかにする必要があります。

これらの問題は再帰的な構造を含むことが多く、従来のSQLでは複数の結合やネストしたクエリが必要であり、記述が煩雑になります。一方、Datalogは再帰的クエリを簡潔に表現でき、複雑なデータ関係を効率的に処理するのに適しています。特に、宣言型の記法によりクエリの記述が直感的で、可読性が高い点が優れています（Ceri et al., 1989）。

3. Datalogの特徴と利点
Datalogがデータベースクエリに適している理由を以下に挙げます：

再帰的クエリの自然な記述：Datalogは、祖先関係や経路探索といった再帰的な構造を含むクエリを簡単に記述できます。
データベース統合性：Datalogは事実とルールを用いてクエリを構築し、データベース管理システムとシームレスに連携可能です。
効率性と柔軟性：Datalogの推論エンジンは、効率的なバックトラッキングアルゴリズムを使用してクエリを実行します。
これらの特徴により、Datalogは社会的ネットワーク解析や家族系譜の調査など、複雑なデータを扱う場面で強力なツールとなります。

4. 実例の詳細
具体例：家族系譜の解析
家族系譜の解析では、親子関係データを基に「ある人物の祖先を特定する」タスクを実行する必要があります。このタスクを解決するために、Datalogを使用して以下のようなルールを記述します：

prolog
コードをコピーする
ancestor(X, Y) :- parent(X, Y).
ancestor(X, Y) :- parent(X, Z), ancestor(Z, Y).
このルールは、parent関係を基に再帰的にancestorを特定します。この記述はシンプルかつ直感的であり、再帰的なデータ構造を効率的に処理します。

効率性の具体例
研究では、Datalogを使用した再帰的クエリが、伝統的なSQLに比べて大規模データセットでの処理時間を大幅に短縮することが示されています（Abiteboul et al., 1995）。例えば、交通ネットワーク解析では、Datalogが効率的に最短経路を計算し、再帰的な関係を処理できることが確認されています（Ullman, 1988）。

比較と優位性
SQLでは複雑な結合やネストが必要となるクエリも、Datalogでは簡潔なルールで表現可能です。これにより、クエリの保守性が向上し、開発コストが削減されます。

5. 結論
Datalogは、再帰的クエリを含むデータベースクエリ問題を効率的に解決するための最適なツールです。特に、家族系譜の解析や社会的ネットワークの解析といった複雑な関係性を持つ問題において、そのシンプルさと効率性が際立っています。今後、Datalogの応用範囲は知識ベースシステムやAI推論システムにさらに広がる可能性があります。その強力な推論エンジンと柔軟性は、データ解析の未来を切り開く重要な要素となるでしょう。

引用文献
Abiteboul, S., Hull, R., & Vianu, V. (1995). Foundations of Databases. Addison-Wesley.
Ceri, S., Gottlob, G., & Tanca, L. (1989). Logic Programming and Databases. Springer-Verlag.
Ullman, J. D. (1988). Principles of Database and Knowledge-Base Systems. Computer Science Press.

## Exercise Assignment

The following exercises align to specific topics within the unit.  These are informational and experiential in nature but not graded. The exercises should be completed as part of your learning process just as you complete reading assignments, self-quizzes and optionally video lectures.

Using JLog

Before you start to do these exercises, you will need to get a prolog interpreter installed on your computer.  One option is to use the JLog.  JLog runs in a browser as a Java Applet.  The easiest way to use JLog is to download a copy from the following site.

<http://sourceforge.net/projects/jlogic/files/>

Extract the contents of the zip file into a directory on your computer, in this directory search for the JLog.html file and double click to open.  This will open the HTML file in a browser and the java applet that implements the Prolog interpreter with it.

More details on use JLog and documentation can be found at the following site.

<http://jlogic.sourceforge.net/>

To use JLog, click on the tab in the applet that is titled “Consult” you enter all of your code (Prolog statements) into this text box.  When you have finished entering all of your code, you must compile it by clicking on the “Consult” button that is in the lower right-hand corner of the applet. You should see a message “consulting. completed.” in the message box at the bottom if your code compiles correctly. To enter a query against your program, click on the “Query” tab.  Enter your query in the text box labeled query.  The results of your query will be displayed in the output box below.

Using IDEONE

An alternative to JLog is to use the IDEONE site.  To use IDEONE, navigate to the IDEONE site, and make sure that you select “Prolog (swi)” as the language.  

<http://ideone.com/>

Post your code into the top input text box and enter your query by clicking “click here to enter input (stdin) or additional note” which will cause another text box to appear below the one where you enter your code.  You can enter your queries into this text box.  

Unit 8 Exercise 1: Create a simple Prolog program

In this first exercise, we want to get our feet wet creating a functional program in Prolog so we will create the somewhat ubiquitous “Hello world” program using Prolog.  We have completed this exercise using other languages so this exercise provides us with a good understanding of how Prolog differs from other languages (such as Haskell and Imperative languages).  What we find is unique about Prolog is the idea that it is a set of rules and facts which comprise the ‘logic’ of our program and we utilize this ‘program’ by querying against it.

In the hello world program we have no facts or rules.  All that we have is the need to display output to the console so in this interesting example we need no code we only need a query directive to produce the output which is what we see below. This query statement is entered in the ‘input’ or ‘query’ box in either JLog or IDEONE.

Using IDEONE, cut the following code and paste it into input box in IDEONE, or the query field in Jlog.  

write('Hello World!').

We see that the output produced from this program looks like the following.

Hello World!
yes

This output demonstrates a unique feature of Prolog.  We see the output of our write directive followed by the word yes.  What this ‘yes’ is telling us is that our ‘program’ produced output AND the logical evaluation of our query was true.  Prolog, as a logic programming language, conducts logical evaluations using the facts, rules, and functions that comprise the code of a Prolog program.  As such, every query we perform will evaluate the ‘logic’ and determine if our query statement evaluates logically to true (yes) or false (no).

Unit 8 Exercise 2: Using Facts and Rules

In this next exercise, we will demonstrate the features of facts and rules within Prolog.  We will then issue a query against these facts and rules.

Cut the following code and paste it into code input box in IDEONE, or the code text box in Jlog.  

character(hercules).
character(abraham_lincoln).
character(george_washington).
character(ulysses_grant).
character(zeus).
character(venus).
character(hermes).
character(cleopatra).
real(abraham_lincoln).
real(george_washington).
real(ulysses_grant).
real(cleopatra).
mythological(hercules).
mythological(zeus).
mythological(hermes).
mythological(venus).
immortal(X) :-
          mythological(X).
mortal(X) :-
          real(X).

Follow the instructions provided above to ‘consult’ these facts when using Jlog.  When using IDEONE make sure that you enter your query into the input box before submitting.  When using JLog enter your query into the query field.  The query to apply against our above program is:

mortal(X).
X = abraham_lincoln
yes

X = george_washington
yes

X = ulysses_grant
yes

X = cleopatra
yes
no

Unit 8 Exercise 3: Counting using Functions

In our third experiment with prolog, we will use a simple function to demonstrate how to count with prolog.  As we have learned, prolog does not have iterative statements such as do, while, or for so we need to implement iteration by recursively calling a function.   In this example we create a simple prolog program to count from some number (such as 5 in the example) down to 0.  We do this recursively.  Notice how we execute our query against the bounded_ctr function.   The bounded_ctr function calls ct_des.  In prolog, there is a process called unification where a query is matched against the facts, rules, and functions that make up the prolog program. In the following example the first definition of the function ct_des has arguments of X and N.  This indicates that X and N are different variables and will not have the same value.  The second definition of ct_des has arguments N and N indicating that the same number.  The only time that prolog will be able to match this second function is when both parameters have the value of 0.

bounded_ctr(X,Bound) :-
        ct_des(X,Bound).

ct_des(X,N) :-
        N > 0,
        N1 is N - 1,
        write(N1), write('\n'),
        ct_des(X,N1).
ct_des(N,N).

The output of exercise 3 when queried with the following statement will look as follows:

input:
bounded_ctr(X,5).

output:
4
3
2
1
0

This example shows now only a recursive method to count using prolog but also demonstrates the concepts of unification and resolution as Prolog must ‘match’ input with functions to unify the function. Experiment with this program using large numbers to count.  Further, see if you can modify this program to produce a list and see if you can sum the numbers generated in the list.

Unit 8 Exercise 4: Recursion example, Towers of Hanoi

The Towers of Hanoi game is a favorite in computer science. The game has 3 posts and disks that sit on top of the posts. The objective is to move the disks from left post to the right posts.  The problem is that the disks must look exactly as they do on the left side, you can only move one disk at a time, and you can never place a larger disk on a smaller disk.  As you add disks the problem becomes more difficult to solve and requires more moves. The objective is to move all of the disks in the minimum number of moves.  The setup of the game with 3 disks looks like the following:

Typically this problem is solved recursively as each required move generates another call to the recursive routine.  The following is the code in prolog to solve the towers of Hanoi puzzle.

% move(N,X,Y,Z) - move N disks from peg X to peg Y, with peg Z being the
%                     auxilliary peg
%
% Strategy:

% Base Case: One disc - To transfer a stack consisting of 1 disc from
%        peg X to peg Y, simply move that disc from X to Y

% Recursive Case: To transfer n discs from X to Y, do the following:
             Transfer the first n-1 discs to some other peg X
             Move the last disc on X to Y
             Transfer the n-1 discs from X to peg Y
         move(1,X,Y,_) :-
             write('Move top disk from '),
             write(X),
             write(' to '),
             write(Y),
             nl.

         move(N,X,Y,Z) :-
             N>1,
             M is N-1,
             move(M,X,Z,Y),
             move(1,X,Y,_),
             move(M,Z,Y,X). 

Here is what happens when Prolog solves the puzzle with N=3 or 3 disks

         move(3,left,right,center).
         Move top disk from left to right
         Move top disk from left to center
         Move top disk from right to center
         Move top disk from left to right
         Move top disk from center to left
         Move top disk from center to right
         Move top disk from left to right          

         yes

Experiment with different numbers of N to get a sense for how the recursion in the routine works.

### Japanese Exercise Assignment

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

1. 今週の概要
今週は、論理プログラミングの基礎的な概念を理解し、Prologを用いたプログラム作成に取り組みました。主な学習内容として、単一化（Unification）、解決（Resolution）、再帰といった基本的な仕組みを中心に、Prologの構文や特徴的な概念を学びました。また、事実（Facts）、規則（Rules）、クエリ（Queries）、リスト（Lists）、関数（Functions）といった主要トピックについても深く掘り下げました。

さらに、命令型プログラミングとの違いを考察し、論理プログラミングが特定の計算問題、特に人工知能や推論システムにどのように適しているかをディスカッションしました。演習課題では、Prologを用いて「Hello World」プログラムの作成、事実と規則を使用したプログラムの定義、再帰を活用したカウント機能の実装、さらには「ハノイの塔」を解決するプログラムに挑戦しました。

2. 自分の感想
Prologを学ぶ中で、命令型プログラミングとは全く異なる思考アプローチに触れることができ、非常に興味深かったです。命令型プログラミングでは、手続き的な手順を細かく指定しますが、Prologではプログラム全体を事実と規則として定義し、クエリを用いてその論理を評価します。この「何をするか」ではなく「どうすべきか」を記述する方法は、慣れるまでは難しかったものの、非常に効率的であると感じました。

特に、Prologが推論エンジンのように働き、事実や規則に基づいて解を導く過程に感銘を受けました。例えば、「mortal(X)」というクエリが「誰が死すべき存在か」をリストアップする際、自分で条件を指定することなく、自動的に全ての該当する事実を導き出す仕組みは、非常に強力だと感じました。

また、「ハノイの塔」のプログラムを作成する際、再帰的な考え方を通じて効率的に問題を解決できることに驚きました。このプログラムでは、複数の関数呼び出しを組み合わせて再帰的にディスクを移動させるロジックが実現されており、再帰を理解する良い練習にもなりました。

しかし、Prolog特有の文法や思考法に慣れるまでには時間がかかり、特にクエリの記述やエラーメッセージの解釈において苦労しました。例えば、単一化エラーが発生した際、その原因を追跡するのは初めは難しかったですが、演習を繰り返す中で次第に理解が深まりました。

3. 特に深く学習したこと
論理プログラミングと単一化（Unification）
論理プログラミングにおける単一化（Unification）は、プログラムの動作を理解する上で最も重要な概念の一つです。単一化とは、クエリが事実や規則に一致するかを検証し、一致する場合に変数に値を割り当てるプロセスです。例えば、「mortal(X)」というクエリを実行すると、Xに一致する全ての値が探索され、結果が順次返されます。この自動化された探索プロセスは、命令型プログラミングとは異なり、開発者が細かい条件を指定する必要がない点で非常に効率的です。

また、単一化の過程では、変数がどのようにバインドされるかを詳細に観察することが重要であると感じました。例えば、リストや関数を含む複雑なクエリにおいても、Prologが正確に結果を導き出す様子は、論理プログラミングの強力さを示しています。

再帰の活用と論理的解決（Resolution）
再帰は、Prologのプログラム設計において中心的な役割を果たします。命令型プログラミングで一般的なループ構造がPrologには存在しないため、再帰を用いて繰り返し処理を実現します。例えば、カウントダウンの例では、再帰的に関数を呼び出すことで、数字を減少させながら処理を進める方法を学びました。このような再帰的処理を用いることで、複雑な問題を分解しながら解決する手法を実感しました。

さらに、「ハノイの塔」のプログラムでは、基本ケースと再帰ケースを明確に分けることで、効率的に問題を解決する方法を体験しました。この例では、Prologが再帰を用いて問題を解決する際、事実や規則と照合して結果を導く「解決（Resolution）」のプロセスが、非常に効果的であることを学びました。

Prologを用いた実践的な課題解決
演習課題を通じて、Prologの実用的な側面についても学ぶことができました。特に、Prologが人工知能（AI）や推論エンジンの分野で広く使用される理由を理解するため、具体的な応用例について調査しました。例えば、Prologは法医学における証拠推論システムや、チャットボットの会話エンジンなど、事実と規則に基づいて結論を導くシステムに適していることが分かりました。このような応用例を通じて、Prologの持つ可能性について具体的にイメージすることができました。
