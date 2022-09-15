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
- [x] Participate in the Discussion Assignment (post, comment, and rate in the Discussion Forum)
- [x] Complete and submit the Programming Assignment
- [x] Complete an entry in the Learning Journal
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

今週のユニットでは、while/do..while/forといったloop statementと、if/switchといったbranch stagementについて学習しました。これらのstatementは解決したい問題に対する解決策を模索するアプローチの中で必ず必要になる重要な要素です。
まず、loop statementについてです。プログラムを作成する際は、同じ処理を繰り返し実行したい場合がよくあります。このような場合に、一つ一つの処理をそれぞれ記載していると、バグを混入してしまう可能性が高く、作成にも非常に手間がかかります。このような場合に、loop statementを活用します。loop statementにはいくつかの処理が存在しますが、基本的な概念としては"条件を満たすまで処理を繰り返し行う"ことです。この概念によってプログラマーは同じものを何度も作成する退屈な時間を避けることができます。
次に、branch statementです。問題解決を行うためには"入力AならばBという処理を行う、入力がA以外であればCという処理を行う"という設計を行いたい場面が多数存在します。このような場面にifやswitchなどのbrance statementを利用します。これらのswitch statementは、条件ごとに処理を分岐させ、場合分けすることができます。場合分けは非常に便利ですが、多用することは気をつけなければなりません。例えばif構文は以下のようにネストして実装することができます。
if(A==X) {
  if(B==Y) {
    if(C==X) {
      if(D==Y) {
        stamement;
      }
    } else{
      statement;
    }
  }
}
しかし、この記載は非常に可読性が悪くpragmaticsに欠けるプログラムです。多くても2までのネストにするか、条件式としてANDやORを利用することで一目で判断できるよう実装することが重要であると学びました。
ここまでに説明した内容について、私はサンプルプログラムを作成し、実際に動かしながら確認を進めました。私の学習態度としては、テキストで学習した内容を完璧に定着させるには実際に手を動かしながら体験する手法が非常に効果的であることを、unit1/2を通して感じています。
全体を通して、私の今回のユニットに関する理解は非常に深まったと感じています。テキストで学習し、サンプルを作成しながら手を動かし、その後クラスメイトとのディスカッションで理解をさらに深める。この一連の流れは私の理解を向上させるだけではなく、私が意識していない問題点やクラスメイトが気にするポイントを浮き彫りにしてくれます。今回のテーマでは、loop回数がきまっているかどうかや最低一度実行したいかなどstatementを実装するにあたってきにするべきポイントに関する意識が合っていることが確認できました。

In this week's unit, we learned about loop statements such as while/do..while/for, and branch statements such as if/switch. These statements are essential elements in any approach that seeks a solution to a problem that we want to solve.
First, let's talk about the loop statement. When creating a program, it is often the case that you want to execute the same process repeatedly. In such cases, if each process is described individually, there is a high possibility of introducing bugs, and it is very time-consuming to create a loop statement. In such cases, loop statements can be used. loop statements have several processing types, but the basic concept is to "repeat the process until the condition is satisfied. This concept allows programmers to avoid the tedium of creating the same thing over and over again.
Next is the branch statement. To solve a problem, there are many situations in which we want to design a program that "if the input is A, then do process B. If the input is not A, then do process C." In such situations, we can use "if" and "else" statements. In such situations, branch statements such as "if" and "switch" are used. These switch statements can be used to branch the process according to each condition and divide it into cases. Although case separation is very useful, one must be careful not to use it too often. For example, if statements can be nested as follows:
if(A==X) {
  if(B==Y) {
    if(C==X) {
      if(D==Y) {
        stamement;
      }
    } else{
      statement;
    }
  }
}
However, this description is very unreadable and lacks pragmatics. I learned that it is important to nest up to two at most, or to use AND and OR as conditional expressions so that decisions can be made at a glance.
I created a sample program and checked the contents explained up to this point by actually running the program. As for my learning attitude, I feel that hands-on experience is a very effective method to fully consolidate the contents learned in the textbook through unit1/2.
Overall, I feel that my understanding of this unit was greatly enhanced. Learning from the text, working hands-on with samples, and then further deepening my understanding through discussions with my classmates. This sequence of events not only improves my understanding, but also highlights issues that I am not aware of and points that my classmates are concerned about. In this case, I was able to confirm that we were all aware of the points that we should be concerned about when implementing statements, such as whether or not the number of loops is fixed and whether or not we want to execute a statement at least once.
