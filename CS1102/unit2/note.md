# unit2

- Looping Control Structures in Java: While, Do-While, and For
- Branching Control Structures in Java: If and Switch
- Top-Down Design of Algorithms
- Debugging

## Goal

- By the end of this Unit, you will be able to:
  - Implement the following looping control structures in Java programs.
    - while
    - do-while
    - for
  - Utilize the following branching control structures in Java programs.
    - if
    - switch
  - Apply test and debug procedures to Java programs that use control structures.

## Task

- [x] Peer assess Unit 1 Programming Assignment
- [x] Read the Learning Guide and Reading Assignments
- [ ] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [ ] Complete an entry in the Learning Journal
- [x] Take the Self-Quiz

## Reading Assignment

- Programming in the Small II:Control
  - 3.1 Blocks, Loops, and Branches
    - loop statement
      - while loop, do...while loop, for loopがある
    - branching statement
      - if, switchがある
    - while loop
      - 与えられたstatementを何度も繰り返すために利用する

      ``` java
        while (boolean-expression) {
          statements;
        }
      ```

      - boolean判定がfalseになるまで繰り返し処理を行う
  - 3.2 Algorithm Development
    - デバッグは複数のメッセージに同時に対処するのではなく、一つ一つ着実に対処しましょう
    - バグを完全に回避する方法は見つけられていない、バグを恐れず局所的な影響として対応するのだ
  - 3.3 The while and do..while Statements
    - do...while loop
      - ループの最初ではなく、ループの最後で条件を判定する

      ``` java
      do {
        statements;
      } while (boolean-expression);
      ```

      - どのような状況でも少なくとも一度statementが発行される
  - 3.4 The for Statement
    - for loop
      - ループの制御に関わるstatement(初期化、継続条件、更新)を一行目にまとめることで、ループ自体がどのように行われるのかをわかりやすく表現できる

## Discussion Forum

Give an example of a while loop, then provide the equivalent do-while loop and for loop.  Then give a different example of a do-while loop, along with the equivalent while loop and for loop. Finally, give an example of a for loop, along with the equivalent while loop and do-while loop. Use your examples to illustrate the advantages and disadvantages of each looping structure, and describe those advantages and disadvantages.
Your Discussion should be at least 250 words in length, but not more than 750 words. Once you’ve completed your initial post, be sure to respond to the posts of at least 3 of your classmates.

私は3のサンプルとそのプログラム(Example.java)を作成しました。それぞれのサンプルプログラムの動作は以下の通りです。

- Example1
  - 10以下の乱数を生成して、偶数の場合ループを終了する
- Example2
  - 30までの数字について、条件に基づいた出力を行う
    - 3で割り切れる場合:Fizz
    - 5で割り切れる場合:Buzz
    - 3と5で割り切れる場合:FizzBuzz
- Example3
  - 15までの数値を順に一列で出力する  
- ここまでの内容を踏まえて、いずれのloop構造の与えられたstatementが判定を満たすまで繰り返し実施することができることがわかる。その上で、それぞれのloop構造の長所と短所をまとめると以下のようになる

|項目| while loop | do..while loop | for loop |
| -- | -- | -- | -- |
|式の評価|statement実行前|statement実行後|statement実行前|
|式の条件|statement内部で表現|statement内部で表現|loopの初期化時に設定|
|expression evaluation|before statement execution|after statement execution|before statement execution|before statement execution|before statement execution
|Condition of expression|expressed inside of statement|expressed inside of statement|set at loop initialization|

こののことからそれぞれのloop構造のユースケースとして私は以下が適切であると考えます。

- while loop / do..while loop
  - 上限まで繰り返し行われるstatementではなく、特定の条件を満たした入力を探査する際などの不特定な上限までstatementを実行したい場合に利用する。その上で、一度もstatementを実行しなくとも問題ないものがwhile loop、最低一度は実行するべきものをdo..while loopで表現する
- for loop
  - loopの条件を一行で表現でき、非常に可読性が高い。そのため、特定の回数繰り返しstatementを実行したい場合などはこの構造を利用する。
  -

## Written Assignment

## Learning Journal
