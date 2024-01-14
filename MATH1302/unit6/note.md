# unit6

- Properties of relations
- Different representations of relations
- Closure of relations
- Mathematical induction
- 関係の特性
- 関係のさまざまな表現
- 関係の閉包
- 数学的帰納法

## Goal

- By the end of this Unit, you will be able to:
  - Create and interpret diagrammatical and matrix representations of relations.
  - Describe congruence and property relations.
  - Prove a mathematical statement using mathematical induction.
- ja
  - 関係の図式表現と行列表現を作成し、解釈する。
  - 合同と性質の関係を説明する。
  - 数学的帰納法を使用して数学的ステートメントを証明する。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Take Self-Quiz
- [x] Take Graded-Zuiz
- [x] Math Assignment

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA <https://discretemath.org/ads/chapter_6.html>
  - Chapter 6
    - 6.1
    - 6.2
    - 6.3
    - 6.4
    - 6.5
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0 <https://discrete.openmathbooks.org/dmoi3/sec_seq-induction.html>
  - Chapter 2
    - 2.5

## Discussion Forum

1. Consider the relation R defined on the states of the United Kingdom. State A is related to B if and only if they are connected by roadways, assuming that each state is connected to the other, and to itself by roadways. Explain whether this relation is a partial order or an equivalence relation. Also, discuss the difference between a partial order and an equivalence relation.
2. How do you define congruence modulo n, where n is any positive integer? Explain with any two examples for n and determine if the congruence relation is a partial ordering.

ja

1. イギリスの州に定義された関係Rを考える。州Aは州Bと道路で結ばれている場合のみ関係があり、各州は他の州とも、またそれ自身とも道路で結ばれていると仮定する。この関係が部分順序であるか同値関係であるかを説明しなさい。また、部分順序と同値関係の違いについても述べよ。
2. nは任意の正の整数である。nについて任意の2つの例を挙げて説明して、その合同関係が部分順序であるかどうかを判定しなさい。

ans

クラスメートの皆さん、こんにちは。
今回の質問に対する私の回答を説明します。

1. まず、同値関係と部分順序関係についての定義を確認します。
DoerrとLevasseurによれば、同値関係は以下の3つの性質を満たす関係です。
反射性: 全ての要素xに対して、xは自身と関係がある。(xRx)
対称性: 任意の要素x,yに対して、xがyに関係するのであればyもxと関係がある(xRyならばyRx)
推移性: 任意の要素x,y,zに対して、xがyと関係gあり、yがzと関係するのであれば、xもzと関係がある。(xRyかつyRzならば、xRz)
次に、部分順序関係は以下の3つの性質を全て満たす関係です。
反射性・推移性: 同値関係と同じ性質
反対称性: 任意の要素x,yに対して、xがyと関係があり、yもxと関係があるならば、xとyは等しい(xRy かつ yRxならば、x=y)
今回のケースでは、イギリスの隔週は自分自身の州とも道路で繋がっているため、反射性が存在する。また、ある州から別の州に対して道路があれば、その逆も当然存在するため対称性も満たしている。さらに、ある州Aから州Bに対して道路があり、州Bから州Cに対して道路がある場合、州Aから州Cに対して間接的な道路が存在するため、推移性も満たしている。
したがって、この関係は同値関係であると言える。部分順序関係の性質である反対称性については、州Aと州Bが関係する場合、州Bと州Aも関係を持つが、州Aと州Bは異なるため満たさないことがわかる。

2. nを法とする合同は、整数論における一種の等価関係です。二つの整数a,bが正の整数nに対して合同であるとは、aとbの差がnの倍数であることを示す。数学的には、a ≡ b (mod n)と表現される。この関係について二つの例を用いて説明をします。
例1: n=5
整数7と17を考える。7と17の差は10で、これは5の倍数だ。したがって、7 ≡ 17 (mod 5)となる、
異なる整数3と8についても同様に、差が5であることから3 ≡ 8 (mod 5)となる。
例2: n=3
整数10と1を考える。10と1の差は9でこれは3の倍数である。したがって、10 ≡ 1 (mod 3)となる。
ここで、合同が部分順序であるかについて考える。部分順序の性質は反射性・推移性・反対称性を満たす必要がある。
反射性(任意の整数aについて、a ≡ a (mod n))と推移性(a ≡ b (mod n) かつ b ≡ c (mod n) ならば、a ≡ c (mod n))は満たすが、反対称性は満たさない。例えば、7 ≡ 12 (mod 5) かつ 12 ≡ 7 (mod 5) ですが、7と12は異なる整数だ。したがって、合同関係は部分順序ではなく、同値関係に分類される。

## Math Assignment

1. Explain what a partial ordering relation is by taking an example of one of the three relations: subset  (\subseteq) , divides (|), and less than or equal to ( \leq ) on a set containing at least three elements of your choice. Draw a Hasse diagram of the relation using MS Word, a hand-drawn image, or the graph online tool. Explain the Hasse diagram.

2. (i) What is Transitive closure of relations. Where is it used? Explain with an example.
(ii) Consider the relation R defined on the set of integers as R = {(x,y): x,y \in ℤ, (x-y) is a multiple of 11}. Show that R is an equivalence relation.

            (a) Find the equivalence class of 0 for the relation R

            (b) Calculate the number of equivalence classes for the relation R.

3. Prove for all positive integers 5n > 4n for n≥ 1 using Mathematical induction.

4. Let A be a set of five integers of your choice. Establish a relation R = ‘≥’ (greater than or equal to) on A. For this relation (≥):
(i) Draw the diagrammatical representation R on A
(ii) Find an adjacency matrix R on A
(iii) Draw the Hasse diagram R on A
You may use MS Word, hand-drawn images, or the graph online tool.
(Ensure that you do not take the same examples discussed in the textbooks and resources)

ans

1. DoerrとLevasseurによれば、部分順序関係は以下の3つの性質を満たす関係です。
反射性: 全ての要素xに対して、xは自身と関係がある。(xRx)
反対称性: 任意の要素x,yに対して、xがyと関係があり、yもxと関係があるならば、xとyは等しい(xRy かつ yRxならば、x=y)
推移性: 任意の要素x,y,zに対して、xがyと関係gあり、yがzと関係するのであれば、xもzと関係がある。(xRyかつyRzならば、xRz)
今回は以下(\leq)を例として考えます。集合を{1,2,3}とした時に部分順序関係の性質を考えます。
反射性: 1≦1,2≦2,3≦3より反射性を満たす。
反対称性: 任意の要素x,yについて、x≦yかつy≦xとなるのはx＝yの場合のみであり、これは反対称性の性質を満たしている。
推移性: 1≦2かつ2≦3の場合1≦3となるため、推移性を満たす。
よって、以下(\leq)の関係は部分順序関係です。
次にHasse diagramを考えます。Hasse diagramとは、部分順序集合を逗子するためのツールで集合内の要素間の順序関係を視覚的に表現します。今回の例とした集合{1,2,3}に対するHasse diagramは以下のようになります。
画像を差し込む

2. (i) 推移閉包は、与えられた関係Rにおいて推移性を満たす最小の関係を表します。
例: 集合A={1,2,3}と関係R={(1,2),(2,3)}を定義します。ここでRは1≦3の関係を含んでいないことから、推移性を満たしていません。推移閉包R'は足りない要素(1,3)を追加するしたR'={(1,2),(2,3),(1,3)}となる。
(ii) Rが同値関係であることを示すには、反射性、対称性、推移性の3つの性質を満たすことを確認する必要があります。それぞれについて確認します。
反射性: 任意の整数xについて、x-x=0は11の倍数となるため、(x,x)は反射性を満たします。
対称性: もし(x-y)が関係Rを満たすのであれば、y-x=-(x-y)も関係Rを満たします。対称性を満たします。
推移性: し(x, y) ∈ Rかつ(y, z) ∈ Rならば、x - yとy - zは11の倍数です。この場合、x - z = (x - y) + (y - z)も11の倍数です。したがって、推移性を見たします。
これらの条件を満たすため、Rは同値関係となります。
(a)0の同値類は、Rにおいて0と同値なすべての要素の集合です。すなわち、{y ∈ ℤ | (0, y) ∈ R}。0 - yが11の倍数である必要があります。これはyが11の倍数である場合に該当します。したがって、0の同値類は11ℤ（11の倍数全体の集合）です。
(b)整数の集合上での同値類の数は11です。これは、各同値類が11で割った余りに基づいているため、0から10までの各余りに対応する同値類が存在します。

3. まず、命題に対してn=1の場合を考える。このとき、5^1>4^1すなわち5>4。これは明らかに真となる。
次に、ある自然数kに対して5^k>4^kが成り立つを仮定する。ここで、5^{k+1}>4^{k+1}が成立することを示す。
5^k>4^k・・・(仮定)
5^k✖️5>4^k✖️5・・・(両辺に✖️5)
5^{k+1}>4^k✖️4+4^k・・・(5を4+1に分割)
5^{k+1}>4^{k+1}+4^k
ここで、右辺の4^{k+1}+4^kは明らかに4^{k+1}より大きい。よって
5^{k+1}>4^{k+1}
以上より、n=1の場合に命題が成立し、任意のkに対して命題が成立するのであればk+1に対しても成立することが示されれた。したがって、数学的帰納法により全ての正の整数nに対して5^n>4^nが成立する。

4. 集合A={2,3,5,7,11}とする。
(i)図的表現では、各要素をノードとして表現して、関係を線で結ぶ。この関係を表現したものが以下となります。

画像を挿入

(ii)隣接行列
隣接行列は要素間の関係を行列の形で表したものである。5つの要素が存在するため5✖️5の行列を作成し、Aの各要素が他の要素以上であればそのセルに1を入れていきます。集合Aに対する隣接行列は以下となります。
\[
\begin{array}{cccccc}
 & 2 & 3 & 5 & 7 & 11 \\
2 & 1 & 0 & 0 & 0 & 0 \\
3 & 1 & 1 & 0 & 0 & 0 \\
5 & 1 & 1 & 1 & 0 & 0 \\
7 & 1 & 1 & 1 & 1 & 0 \\
11 & 1 & 1 & 1 & 1 & 1 \\
\end{array}
\]

(iii)Hasse diagram
Hasse diagramは一つ目の質問で回答したように、より小さな要素を下に、より大きな要素を上に配置する。集合Aに対するHasse diagramは以下のようになる。

画像を挿入

## Learning Journal
