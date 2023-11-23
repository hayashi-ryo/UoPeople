# unit1

- Notations of set theory
- Relations and operations on sets
- Venn Diagrams
- Set identities
- Cardinality of sets and Principle of inclusion and exclusion (Laws of addition)

## Goal

- By the end of this Unit, you will be able to:
  - Identify set notations, types of sets, relations, and cardinality of sets.
  - Apply the basic operations of set theory and relations.
  - Create and interpret Venn Diagrams for real-world counting problems.
  - Apply set identities and principles of inclusion and exclusion (PIE) to solve problems.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Math assignment
- [ ] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA
  - In Chapter 4, More on Sets, you need to learn section 4.2, Laws of Set Theory (p. 80). Ensure that you go through all the topics including the proofs and solving the questions in the exercises.
    - 集合の基本法則を覚えていく
      - ほとんどの法則は直感的に覚えられる。ドモルガンの法則だけ一応記憶しておく。
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0
  - In Chapter 0, Introduction and Preliminaries, you need to learn section 0.3, Sets (p.24) which covers the topics of Notation, Relationships Between Sets, Operations on Sets, and Venn Diagrams. Ensure that you go through these topics including the examples and solving the questions in the exercises.
  - In Chapter 1, Counting, you need to learn section 1.1, Additive and Multiplicative Principles (p.57) which covers the topics Counting with Sets, and Principle of Inclusion and Exclusion. Ensure that you go through these topics including the examples and solving the questions in the exercises.

## Discussion Forum

In this unit, you have learned about the fundamental concepts of set theory, operations, and mathematical notations. Before you start with the discussion assignment, you need to know the importance of set theory in the real world to help you build upon this knowledge. Here is an example that will help you understand its importance:
Consider a grocery store where customers can purchase items from a wide range of categories like fruits, vegetables, dairy, bakery, etc. The store wants to analyze the purchasing behavior of its customers and determine the most popular items in each category. They can use set theory to create sets of customers who purchase items from each category and then find the intersection of these sets to determine which customers purchase items from multiple categories.
Now, engage in a discussion with your peers by completing the following task and posting it in the discussion forum:
Create three sets A, B having 4 elements in each, and U, a Universal set of any possible number of elements of your interest. (For example, you can consider the sets A = {a, b, c, d}, B = {1, 2, 3, 4} and U = {a, b, c, d, 1, 2, 3, 4, apples, mangoes, avocados}.

この単元では、集合論の基本概念、演算、数学的表記法について学びました。ディスカッションの課題に取り掛かる前に、実社会における集合論の重要性を知っておく必要があります。その重要性を理解するのに役立つ例を挙げます：
果物、野菜、乳製品、ベーカリーなど、幅広いカテゴリーから商品を購入できる食料品店を考えてみましょう。この店は、顧客の購買行動を分析し、各カテゴリーで最も人気のある商品を決定したい。集合論を使って、各カテゴリーから商品を購入する顧客の集合を作り、これらの集合の交点を求めて、どの顧客が複数のカテゴリーから商品を購入するかを決定することができる。
では、以下のタスクを完了し、ディスカッション・フォーラムに投稿することで、仲間とディスカッションを行いましょう：
それぞれ4つの要素を持つ3つの集合A、B、およびUを作成しなさい。(例えば、集合A = {a、b、c、d}、B = {1、2、3、4}、U = {a、b、c、d、1、2、3、4、リンゴ、マンゴー、アボカド}を考えることができます。

クラスメートの皆さんこんにちは。
今回の質問では、集合に対する各種操作が必要だったため、作成する集合に重複する要素を追加することを意識して作成しました。今回の私の例は以下の通りです、
A = {10,100,1000,10000}
B = {100,200,1000,2000}
U = {10,100,1000,10000,100,200,1000,2000,abc,def,ghi}
それぞれの質問に対して回答します。

i. A ∪ B
A ∪ B = {10,100,1000,10000,200,2000}

ii. A ∩ B
A ∩ B = {100, 1000}

iii. (A ∩ B) ∪ U  
(A ∩ B) ∪ U = {10,100,1000,10000,100,200,1000,2000,abc,def,ghi}

iv. The Power set of A.  
パワーセットは集合は全ての部分集合を含む集合です。元の集合の要素数がn個の場合、2^n個の部分集合が存在します。私の例では要素数は4ですので、2^4=16 個の部分集合が含まれます。
P(A) = {},{10},{100},{1000},{10000},{10,100},{10,1000},{10,10000},{100,1000},{100,10000},{1000,10000},{10,100,1000},{10,100,10000},{10,1000,10000},{100,1000,10000},{10,100,1000,10000}

v. A’  
A’は全体集合からAの要素を抜き出したものです。
A’ = U - A ={200,2000,abc,def,ghi}

vi. ∅∩B
∅は空集合を表す記号です。空集合は要素を含まないためどのようなに対しても∩演算を行うと空集合になります。
∅∩B = ∅

vii. A × B  
集合の直積はそれぞれの行列の各要素の組み合わせを含む集合です。計算結果を以下に記します。
A × B = {(10,100),(10,200),(10,1000),(10,2000),(100,100),(100,200),(100,1000),(100,2000),(1000,100),(1000,200),(1000,1000),(1000,2000),(10000,100),(10000,200),(10000,1000),(10000,2000)}

viii. A-B  
Aの要素からBの要素を取り除く動作を行うことで結果を得ることができます。
A−B={10,10000}

ix. (A − B) ∪ (B − A)
A − B = {10,10000}
B - A = {200,2000}
であるので、
(A − B) ∪ (B − A) = {10, 200, 2000, 10000}

x. Prove any one De Morgan identity for A and B.
De Morgan identity は集合の補集合に関する法則です。具体例として、二つの集合AとBに対してMorganの法則は以下のように表されます。
(A ∪ B)' = A' ∩ B'
(A ∩ B)' = A' ∪ B'
今回は一つ目の例について証明を行います。
まず左辺に考えるためにA ∪ Bを計算します。
A ∪ B =  {10,100,1000,10000,200,2000}
補習号を取ります
(A ∪ B)' = U - (A ∪ B)
=  {abc,def,ghi} ...(1)
次に右辺について考えます。まずは集合AとBの補習号を考えます
A' = {200,2000,abc,def,ghi}
B' = {10,10000,abc,def,ghi}
A' ∩ B'を計算します
A' ∩ B' = {abc,def,ghi} ...(2)
(1)と(2)が等しいことが証明されました。

## Math Assignment

Based on the concepts of sets, basic operations on sets, Venn diagrams, and set identities that you learned this week, answer the following questions:

1. If A is the set of people who got jobs in the IT sector and B is the set of people who got jobs. Describe the people in each of the following sets:
(a) A ∩ B (b) A ∪ B (c) A − B (d) B − A

(a) A ∩ B
会社に就職した人でかつIT部門に就職した人を指す集合を表す。すなわちAのことだ。
(b) A ∪ B
A ⊆ B であるため、この結果はBのことを指す。
(c) A − B
A ⊆ B であるためこの演算を実施すると、Aの全ての要素を削除する必要がある。即ちØを表す。
(d) B − A
会社に就職した人のうち、IT部門以外に就職した人を指す集合を表す。

2. Suppose that A is the set of people living in the USA and B is the set of people having a house in Canada. Express each of the following sets in terms of A and B using set operations:
(a) the set of people living in the USA and having a house in Canada (b) the set of people living in the USA who are not having a house in Canada (c) the set of people who either live in the USA or have a house in Canada (d) the set of people who are either non-US residents or do not own a house in Canada.

(a)
A ∩ B
(b)
A ∩ B'
(c)
A ∪ B
(d)
A' ∪ B' = (A ∩ B)' ...(ドモルガンの法則より)

3. An IT company offered two benefits for the employees. 750 of the employees take the privilege of cabs. 900 of them take breakfast privilege. If 530 employees take both benefits, how many employees work in the company if there are 60 employees who do not take any benefits? Which concept do you use to calculate the number of employees in the company? You can either use a Venn diagram or you can use the principle of inclusion and exclusion.

包含と排除の原理を利用して会社の従業員数を計算します。まず、それぞれの特典を受け取っている従業員数を整理します。
タクシー特典を受け取っている従業員数:750...(a)
朝食特典を受け取っている従業員数:900...(b)
両方の特典を受け取っている従業員数:530...(c)
どの特典も受け取っていない従業員数:60...(d)
これらの情報と包含と除外の原理を利用して全体の従業員数の計算を行う。

全体の従業員数 = タクシー得点(a) + 朝食得点(b) - 両方の特典(c) + どちらも受け取っていない従業員数(d)
→
全体の従業員数 = 750+900−530+60
= 1180

したがって、この会社の従業員数は1180人です。

## Learning Journal
