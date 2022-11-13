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
- [ ] Try to do as many of the exercises in Chapter 8 of the textbook as possible in order to reinforce your knowledge.
- [ ] Also, do the non-graded exercise that appears at the end of this Learning Guide and post your solutions to the Learning Journal.
- [ ] Perform Labs 1 and 2.
- [ ] Post your answer to the question in the Discussion Forum and follow it up with approximately 3-4 comments to other students' posts. Rate other students’ posts.
- [ ] Submit your Assignment.
- [ ] Post your activities throughout the week in the Learning Journal.
- [ ] Test yourself by taking the self-quiz.

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
