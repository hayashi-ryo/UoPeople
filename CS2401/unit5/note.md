# unit5

- Test-driven Implementation
  - Overview of Software Testing
  - Test Coverage and Code Coverage
  - Practical Aspects of Unit Testing
  - Integration and Security Testing
  - Test-driven Implementation
  - Refactoring: Improving the Design of Existing Code
- Modeling and System Specifications
  - What is a system?
  - Problem Frames
  - Specifying Goals

## Goal

- By the end of this Unit, you will be able to:
  - Learn about Test driven Implementation
  - Distinguish between the different types and levels of testing(unit, integration, systems).reate and evaluate a test plan for a given program and software.
  - Define system specifications of a proposed system

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
<<<<<<< HEAD
- [x] Learning Journal
=======
- [ ] Learning Journal
>>>>>>> 74e42afd741790b86130fb29ecfdf8a16e1500e2
- [x] Take Self-Quiz

## Reading Assignment

- Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>
  - 2.7 Test-driven Implementation
    - テスト工藤開発では、実装する機能の決定→テストコードの作成→コードの実装→テスト実行→テスト結果検証の流れで実行する
    - 2.7.1  Overview of Software Testing
      - テストはできるだけ早い時期に開始すべきである。この極端な例がテスト駆動開発だ
      - テストは欠陥の存在だけを示し、欠陥がないことを示すものではない
      - 重要なトレードオフはテストケースにかけるコストとその人的コスト
    - 2.7.2  Test Coverage and Code Coverage
      - テストカバレッジ
        - 仕様やコードがテストによってどの程度実行されたかを測定する
    - 2.7.3  Practical Aspects of Unit Testing
    - 2.7.4  Integration and Security Testing
    - 2.7.5  Test-driven Implementation
    - 2.7.6  Refactoring: Improving the Design of Existing Code
      - コードの内装は変えるが、外部から観測可能な動作は変更しない
  - Modeling and System Specifications
    - システムがどのような機能を達成するのかを明示した文書「システム仕様書」について、UMLという一般的な記法で標準的に学んでいく(ただし、UMLだけでは不十分で必要に応じて他の記法の利用も行う)
    - 3.1 What is a system?
      - アクターと外界の相互作用によるアプローチには限界がある。直接作用することのないアクターが考慮から漏れてしまうことなどだ。
    - 3.3  Problem Frames
    - 3.4  Specifying Goals

## Discussion Forum

If you could select only three test case design methods to apply during unit testing, what would they be and why? Try to support your answer with apt example/ scenarios.
単体テスト中に適用するテストケース設計手法を3つだけ選ぶとしたら、それは何ですか？あなたの答えを、適切な例やシナリオでサポートしてください。

実装されたソフトウェアのテストは、階層構造によって分割された論理モデルによって実施されます。その中でも、ソフトウェアの単体テストは実装したコードと設計モデルの差異を発見するために実施します(Marsic、2012)。テストでは実装されたコードのの欠陥を見つけることが主な目的ですが、ほとんどのテストでは欠陥は検出することができません。できるだけ多くの欠陥を検出しつつ、コストも抑えた形でテストを実施するためのシナリオで選択するテストケース設計手法を3つ説明します。

Equivalence Testing:正常に動作、想定されたエラーを検出するため
Boundary Testing:プログラムの実装を行う上でバグを混入しやすい箇所は分岐処理であり、特に境界値テストは需要である
State-based Testing:入力に対する出力がオブジェクトセットで与えられる場合はこのテストケース設計手法が有意義に動作する。
今回は、エッジカバレッジやステートメントカバレッジなどコードベースのテスト設計は重点を置かなかった。基本的な考えとして、テストで検出すべきは入力に対する出力が正しいかどうかであり、コードベースの確認はコードレビュー時に完了しているべきだろうという考えの元である。

Testing of implemented software is carried out using a logical model divided by a hierarchical structure. Among them, software unit tests are conducted to find differences between the implemented code and the design model (Marsic, 2012). Although the main goal of testing is to find defects in the implemented code, most tests fail to detect defects. This section describes three test case design techniques that can be selected in a scenario to detect as many defects as possible while keeping costs low.

Equivalence Testing: to detect normal operation and expected errors
Boundary Testing: In implementing a program, the most likely place to introduce bugs is in the branching process, and boundary value testing is particularly demanding.
State-based Testing: This test case design method works well when the output for an input is given as a set of objects.
In this study, we did not focus on code-based test designs such as edge coverage and statement coverage. The basic idea is that the test should detect whether the outputs are correct for the inputs, and the code base should be checked at the time of code review.

References:
Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>

## Written Assignment

The Classic Triangle Testing Problem, (Myer's Triangle): A program reads three integer values. The three values are interpreted as representing the lengths of the sides of a triangle. The program prints a message that states whether the triangle is scalene, isosceles, or equilateral. Develop a set of test cases (at least 6 ) that you feel will adequately test this program. (This is a classic testing problem and you could find numerous explanations about it on the internet. I would recommend that you try to submit your own answer, based on your understanding of the topic)

今回の設問に対して、想定される欠陥を考えました。

1. 正三角形を二等辺三角形として認識してしまう
2. 三角形の成立条件を満たしていないものを三角形と判定してしまう
3. 不正な値が入力されてしまう

その上で、テストケースを作成しました

三角形が成立するケース

1. scalene三角形が成立する(3,5,6)
2. エッジケースとなるscalene三角形が成立する(3,4,5)
1. isosceles三角形が成立する(5,5,7)
2. equilateral三角形が成立する(5,5,5)

三角形が成立しないケース

1. (3,0,6): 入力に0が与えられる
2. 負の数が与えられる(-1,4,5)
3. 全ての値が整数だが、三角形が成立しない(1,2,4)など

## Learning Journal
<<<<<<< HEAD

今週のユニットでは、主にテスト設計方式について学習を行った。ユニットテストを実施する場合の設計手法は仕事でも生きる場面が多く参考になると考えるため、私の理解を整理していく。
まず、テストを行う場合はシステム全体をすぐにテストするのではなく、部品に分けてテストを実施していく。この考え方はシステムを実装する場合とは真逆のプロセスとなる。（実装する場合はシステムの概要から詳細部分へと詳細化する形でプロジェクトが進んでいく）プこのようなプロジェクト全体の考え方をV-モデルと表現する場合もある。
また、テストの目的は欠陥を見つけること(Marsic、2012)であるが、私の経験上90%以上のテストケースは欠陥を検出することはできない。これはテストケースが悪いのではなく、テストケースに起こすような箇所は実装的にも重要な箇所であり、プログラムを実装する中で気を付けるために実施していると考える。今回学習したテストケース設計手法は、単なるテストケースの実装だけではなくプログラムを設計する場合にも気を付ける箇所だと感じることができた。
=======
>>>>>>> 74e42afd741790b86130fb29ecfdf8a16e1500e2
