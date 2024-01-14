# unit5

- Propositional Logic
- The rules of inference (Logical laws)
- Validity of the arguments
- Predicate logic
- 命題論理
- 推論のルール（論理法則）
- 論証の妥当性
- 述語論理

## Goal

- By the end of this Unit, you will be able to:
  - Demonstrate an understanding of propositional logic and predicate logic.
  - Apply logical and quantifier notations to word problems.
  - Translate natural language into logical statements.
  - Organize arguments in coherence to check for validity by applying the rules of inference.
- ja
  - 命題論理と述語論理を理解する。
  - 論理と量化子の記法を単語問題に適用する。
  - 自然言語を論理的な文に変換する
  - 推論のルールを適用して妥当性をチェックするために、一貫性のある論証を整理する。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Math Assignment
- [x] Take Self-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA <https://discretemath.org/ads/chapter3.html>
  - Chapter 3
    - 真理値表など、AND/OR/NOT等の内容について学習する。
    - 3.2
      - 論理演算は否定を最初に処理する
    - 3.3
      - 全ての場合に当てはまる論理変数式をトートロジーと呼ぶ
    - 3.4
    - 3.5
    - 3.8

## Discussion Forum

1. Explain each of the logical connectives in words and provide self-made examples related to a detective case. Represent them symbolically and discuss in detail the truth or false of the compound propositions. Additionally, explain the hierarchy of these operators if they are included in parentheses.
2. Consider any conditional proposition of your choice related to a detective case and write the Converse, Contrapositive, and Inverse to the proposition. Represent all of them symbolically, and determine whether the statements or propositions obtained are true or false.
3. Observe three of your peers' answers to the questions. Throw some insight into their examples related to detective work.

ja

1. 各論理接続詞を言葉で説明し、刑事事件に関連した自作の例を示す。それらを記号で表し、複合命題の真偽を詳しく論じなさい。また、これらの演算子が括弧に含まれている場合は、その階層を説明しなさい。
2. 探偵事件に関する任意の条件命題を考え、その命題の逆、逆接、逆数を書きなさい。それらをすべて記号で表し、得られた文や命題が真か偽かを判断しなさい。
3. 質問に対する仲間の答えを3つ観察しなさい。探偵の仕事に関連する彼らの例について、何らかの洞察を投げかけなさい。

クラスメートの皆さん、こんにちは。
今回の質問に対する私の回答を説明します。

1. まずは各論理演算子について説明します。

v(OR): 論理和を表し、2つの命題のどちらか一方でも真であれば、全体の命題が真であることを示します。例えば、「証人Aが犯行現場にいた v 証人Bが犯行現場にいた」という命題の場合、どちらかの命題が真であるならば全体の主張が真であると言えます。
Λ(AND): 論理積を表し、2つの命題がどちらも真である場合に全体の命題が真であることを示します。例えば、「監視カメラの映像が被疑者Xを写している Λ 物的証拠が一致している」という命題の場合、どちらの命題も真である場合に全体の主張が真であると言えます。
→(IMPLICATION): 含意を表し、前提が真であるならば結論も真であることを示します。例えば、「証言が正しいならば犯人はXである」の場合、証言が真である場合にのみ、結論が真となります。
↔(BICONDITIONAL): 双条件を表し、二つの命題が「共に真である」場合か「共に偽である」場合に、全体の命題が真になります。例えば、「証言が真であるのは犯人がXである場合のみであり、それ以外の場合は証言が偽である」ことを示します。
¬(NOT): 否定を表し、命題の真偽を逆転します・例えば、「証言が真でない」ことは「証言が偽である」ことを表します。
また、命題に括弧が含まれる場合数学の計算と同じく、括弧内の論理演算を最初に評価します。例えば(P ∧ Q) ∨ Rという命題の場合、P ∧ Qが最初に評価され、その後に∨Rを評価します。

これらの論理演算子を複合的に利用した例を作成しました。
命題:
(P→Q)Λ(¬R↔S)
この命題を説明します。
P→Q: もし探偵が特定の証拠Pを見つけた場合、結論Qが導かれる。これは条件付き命題です。
¬R↔S: 証拠Rが存在しないことが、特定の状況Sが発生することと同等である。これは論理双条件です。
これらの条件が同時に成り立つことを要求するために論理演算子Λを利用しています。

2. 条件付き命題として「被害者が特定の場所にいた場合、犯人が近くにいる」というものを考える。
命題(P): 被害者が特定の場所にいる
命題(Q): 犯人がその近くにいる
この場合、逆・対偶・逆対はそれぞれ以下のようになる。
逆: 犯人が近くにいるならば、被害者は特定の場所にいる。記号的にはQ→Pと表される。犯人偽近くにいるからと言って被害者が特定の場所にいるとは限らないため、この論理は破綻しています。
対偶: 犯人が近くにいない場合、被害者は特定の場所にいない。記号的には¬P→¬Qと表されます。被害者の近くに犯人がいると考えられるため、元の命題が正しい場合対偶であるこちらの正しいです。
逆対: 被害者が特定の場所にいない場合、犯人が近くにいない。記号的には¬Q→¬Pと表されます。被害者が特定の場所にいない場合においても、犯人がその近くにいないとは限らないです。

## Math Assignment

1. Based on the concepts of basic logical laws (rules of inference) for propositions, that you learned this week, check the validity of the arguments. Show all steps and write the logical laws applied at each step (wherever required).
 A \rightarrow B, A   v  C, C \rightarrow    ¬ B ,  D \rightarrow B,  ¬ C \Lambda D \Rightarrow B \Lambda    ¬ C
2. Explain quantifiers and its types. Provide examples of propositions involving quantifiers in words and represent them symbolically. Discuss the truth of the predicates you used as examples. (Ensure that you do not take the same examples discussed in the textbooks or the internet).

ja

1. 今週学んだ、命題に関する基本的な論理法則（推論のルール）の概念に基づいて、論証の妥当性をチェックしなさい。すべてのステップを示し、各ステップで適用される論理法則を書きなさい。

 A Ⓐ B, A v C, C Ⓐ ¬ B , D Ⓐ B, ¬ C Ⓐ ラムダ D Ⓐ B Ⓐ ラムダ ¬ C
2. 量化子とその種類について説明しなさい。量化子を含む命題の例を言葉で示し、それらを記号で表しなさい。例として用いた述語の真偽を論じなさい。(教科書やインターネットで議論されているのと同じ例を取らないように注意すること）。

ans

1. 前提条件から段階的に証明を進めていきます。

前提条件

a. A → B
b. A v C
c. C →¬B
d. D → B
e. ¬C Λ D

証明のステップ

1. 前提条件bより、AまたはCが真となる。
2. 1と前提条件aより、Aが真の場合、Bが真となる。(Modus Ponensの法則)
3. 1と前提条件c、前提条件eより、(C →¬B) Λ ¬Cとなるため、Bが真となる。(Modus Ponensの法則)
4. 前提条件dと前提条件eより、(D → B) Λ Dとなるため、Bが真となる。
5. したがって、Bが真であり、¬Cが真であることがわかります。これが求めたかった結論(B Λ ¬C)です。

よって、結論(B Λ ¬C)は前提条件から論理的に導かれるため、この議論が有効であることがわかりました。

2. 量化子とその種類について説明します。
量化子は述語論理で使われ、命題の範囲を指定します。主な量化子には普遍量化子（全称量化子）と特化量化子（存在量化子）があります。
普遍量化子（全称量化子）（記号：\(\forall\)）は、「すべての」という意味で、述語が全ての要素について真であることを主張します。
特化量化子（存在量化子）（記号：\(\exists\)）は、「少なくとも一つの」という意味で、述語が少なくとも一つの要素について真あることを主張します。
例を挙げます。

例 1:
普遍量化子の例
命題：「すべての猫は動物である」
記号化：\(P(x)\) を「\(x\) は猫である」、\(Q(x)\) を「\(x\) は動物である」とすると、\(\forall x (P(x) \rightarrow Q(x))\)
この命題は、どんな \(x\) が猫であってもそれは必ず動物であることを主張しています。

例 2:
特化量化子の例
命題：「少なくとも一つの学生は数学が好きである」
記号化：\(P(x)\) を「\(x\) は学生である」、\(Q(x)\) を「\(x\) は数学が好きである」とすると、\(\exists x (P(x) \land Q(x))\)
この命題は、学生の中に少なくとも一人は数学が好きであることを主張しています。

述語の真実性については、命題の主張に依存します。例えば、「すべての猫は動物である」という命題は、実際には真であると考えられますが、個別の状況によって真偽が変わることもあります。同様に、「少なくとも一つの学生は数学が好きである」という命題も、特定の状況で真であるかどうかはその文脈に依存します。

## Learning Journal
