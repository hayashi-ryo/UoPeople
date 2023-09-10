# unit1

- This unit will address the following topics:
  - A review of some topics in the CS 1102 course
  - The switch statement
  - Advanced topics in exceptions; the try..catch statement
  - Analysis of algorithms

## Goal

- Practically review the features of Eclipse
- Refresh your knowledge of top-down design, bottom-up design, pseudocode,nd modularity
- Review techniques for creating arrays, initializing arrays, and processing arrays.
- Study the following:
  - Exceptions and exception classes
  - The try statement
  - Throwing exceptions
  - Mandatory exception handling
  - Programming with exceptions
- Learn some techniques and results of Analysis of Algorithms.

## Task

- [x] Read the assigned material in the textbook.
- [x] Try to do as many of the exercises in Chapter 8 of the textbook as possible in order to reinforce your knowledge.
- [x] Also, do the non-graded exercise that appears at the end of this Learning Guide and post your solutions to the Learning Journal.
- [x] Perform Labs 1 and 2.
- [x] Post your answer to the question in the Discussion Forum and follow it up with approximately 3-4 comments to other students' posts. Rate other students’ posts.
- [x] Submit your Assignment.
- [x] Post your activities throughout the week in the Learning Journal.
- [x] Test yourself by taking the self-quiz.

## Reading Assignment

- Section 3.6.1: The Basic switch Statement
  - 特定のラベルの箇所へ直接ジャンプすることができる機能
  - どのラベルにも該当しない場合は、defaultに遷移する
  - よく利用されるのはメニューの選択
- Section 8.3: Exceptions and Try..catch
  - プログラムはエラーが発生する。このエラーを全て補足することは現実的に難しく、基本的には「例外」として処理を行う
- Section 8.5: Analysis of Algorithms

## Discussion Forum

- Who should be responsible for catching and handling exceptions: the computer or the computer program?
- 私は例外に関する取り扱いは、基本的にコンピュータプログラムで責任を負って処理を行うべきと考えています。その理由について2つ説明します。
- まず一つ目の理由としては、コンピュータは例外の発生自体は検知できるが、その処理を行うことはできないということです。例外をどのような扱いとするかを明確にすることは、コンピュータプログラムに責任があります。プログラムで例外の扱いを明記しない場合は、クラッシュが発生してしまい、動作の継続を行うことができなくなってしまいます。
- 二つ目の理由は、適切な例外処理の利用は、プログラム自体を明確で、わかりやすいものとする効果があることです。例えば、入力に対して演算した結果を出力するプログラムを実装する場合は考えます。例外処理を行わない場合は、適切な演算を行うために入力に対して以下のような確認を行う必要があります。
  - 入力が数値であること
  - 桁数が適切であること
  - 0除算が行われないこと
  - 入力引数の数が正しいこと
  - 演算子が適切であること
- このことをまとめて、テキストでは以下のように表現しています。
- Furthermore, trying to anticipate all the possible problems can turn what would otherwise be a straightforward algorithm into a messy tangle of if statements.
- もし例外処理で上記の実装を行うと、本質的に重要である演算部分にのみ着目することが可能となり、それ以外の部分に対しての検討を最小限とすることが可能となります。
- これらの理由から、私は例外に関する扱いはプログラム側で実装すべきであり、例外を適切かつ効率的に実装することが非常に重要な要素であると考えます。

## Written Assignment

## Learning Journal

unit1では、まずCS1102で学習した内容について振り返りを行った上で、いくつかの新しい事項について学習しました。それは、switchとtry-catchについてです。それぞれの内容について私の理解を説明します。
まず、switch句についてです。これは、メニュー選択など、特定の項目から一定の値をユーザやプログラムに選択させる場合に便利に活用することができます。同様の操作はif-elseの構文でも実現することは可能ですが、if statementとの重要な違いは、計算量です。例えば、x個の項目についてif分で判断するブログラムを実装した場合、その計算量はオーダー記法を利用したO(x/2)で表現することが可能です。しかし、switch statementであれば、O(1)で計算を行うことができるので、非常に高速な演算を行うことができます。それぞれのメソッドについて、メリットやデメリットが存在するため、状況に応じて適切な構文を利用することが重要であると今回のユニットで学習することができました。
次に、try-catch構文についてです。この構文は、あるstatementの実行に際して、例外事象の発生をプログラムでハンドリングするために利用することができます。このtry-catchの構文は、プログラムを行う上で非常に重要な考えであると私は感じています。なぜなら、例外処理を全てif statementで実装した場合、プログラムが冗長で、メンテナンス性に欠けるものとなってしまうためです。もちろん、処理の根幹的な部分はif statementで実装を行うべきですが、ファイルオープンエラーやプロセスハンドリングなど、プログラムの内容以外に関する部分に関する例外処理は、積極的に例外処理を利用したプログラムの実装を行うべきであると感じています。私自身の体験として、今働いている会社のソースコードは、例外処理を適切に利用したものが明快で、非常に可読性に優れている内容であると確信しています。
また、CS1102のコースと比較した際に、Written Assignmentの難易度に違いを感じました。CS1102のコースでは、正直なところ内容について十分な理解ができていない状態であっても、提供された手順に基づいて確認を行えば、成果物の作成ができていました。しかし、CS1103のコースに入り、unitの内容について十分に理解した上で、要件を明確化し、その内容を実装するスキルをさらに求められていると感じています。この取り組みは、私にとって非常にプラスなものとなると確信しているため、わからないことがあればフォーラムで確認しながら、自分自身の理解を深めていきたいと考えています。
最後に、このコースを通じてCS1102の内容をさらに高度にしたものを、自分自身のスキルとするために、定型的なスケジュールや能動的な学習スキルといった自発的学習の能力をしっかりと実践していきたいと考えています。unit1の時点で、わからないことがあれば積極的に確認するべきであるということは感じているので、期限の直前で成果物を提出するのではなく、計画的に学習を実施していきます。
