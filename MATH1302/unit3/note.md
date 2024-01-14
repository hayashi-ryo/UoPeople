# unit3

- Permutations
  - 順列
- Combinations
  - 組み合わせ
- Binomial Theorem
  - 二項定理

## Goal

- By the end of this Unit, you will be able to:
  - Apply permutations and/or combinations to counting problems.  
  - Apply the Binomial Theorem and/or coefficients to counting problems.
  - Explain the number of derangements, bit strings, and counting functions.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x]] reply classmates
- [x] Math Assignment
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

- Doerr, A., & Levasseur, K. (2022). Applied discrete structures (3rd ed.). licensed under CC BY-NC-SA <https://discretemath.org/ads/chapter_2.html>
  - Chapter 2
    - section 2.2
      - 順列(Permutation)は順序が関係ある場合に利用する
      - 公式: $nPk = n!/(n-k)!$
        - 例: 5人の順位のパターン $5!/(5-5)! = 120 ... 0!=1$
    - section 2.4
      - 組み合わせ(Combination)は順序が関係ない場合に利用する
      - 公式: $nCk = n!/{k!(n-k)!}$
      - 二項定理は、二項式の冪展開を表現するための公式
      - 公式: $[ (a + b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k ]$
- Levin, O. (2021). Discrete mathematics: An open introduction (3rd ed.). licensed under CC 4.0 <https://discrete.openmathbooks.org/dmoi3/>
  - Chapter 1
    - section 1.2
    - section 1.3
    - section 1.4

## Discussion Forum

- Part 1
  - You are organizing a swimming competition with ‘n’ participants. The school has announced scholarships for the top three swimmers. The details of the scholarship is as follows:
    1. First place - 100 % scholarship to study abroad
    2. Second-place - 100 % scholarship to study in any school all over the country
    3. Third-place – 50% scholarship to study in any school all over the country
  - Take ‘n’ as any two-digit number representing the total number of participants in the competition. Find how many possible ways are there to award these scholarships if there are no ties during the competition. Explain in detail.
- Part2
  - A group of n -school principals are trained for implementing innovative education in their schools. (Choose a two-digit number for n). As a part of the innovative education scheme, 9 schools are to be offered equal funds from the government.
    1. n how many ways can 9 schools be selected from the trained group?
    2. If your school is one among the 9 selected schools, how many ways will be left to choose the other schools?
- In both parts 1 and 2, which concepts are you using? Explain the reason to choose the concept. Also, discuss how combinatorics helps to solve real-world counting problems.

クラスメートの皆さんこんにちは、今回のテーマに対する私の見解を説明します。

1. n人の参加者がいる大会では、1位2位3位それぞれのパターンを求めてそれを乗算することで何通りのパターンがあるかを求めることができます。順位ごとに確認してみます
1位: n人の参加者が存在するため、選手を選ぶ方法はn通り
2位: 1位の選手以外から選ぶ必要があるため、n-1通り
3位: 1位と2位の選手以外から選ぶ必要があるため、n-2通り
よって、1位から3位までのパターンを乗算することで奨学金を付与するパターンを求めることができます
奨学金を付与するパターン = n×(n−1)×(n−2)
例えば、参加者nが50の場合、奨学金を付与するパターンは
50×(50−1)×(50−2) = 117600 (通り)になります。
この考え方は順列と呼ばれ、順序に意味がある組み合わせを求める計算です。Applied discrete structuresによれば、順列の数は$nPk = n!/(n-k)!$で与えられます。例と同一であるかを確かめてみます。n=50, k=3を代入します。
$50P3 = 50!/47! = 117600$
このように順序だてて計算した結果と等しいことがわかりました。

2. この設問では順番を考慮する必要はありません。そのため、Binomial Coefficient Formulaを利用して計算することが可能です。
(i)n校から9校を選択すれば良いので、公式から計算することが可能です。今回はn=20として計算したいと思います。
$20C9 = 20!/{9!11!} = 125,960$
よって、20校から資金が提供される9校を選ぶパターンは125,960通りです。
(ii)自分の学校はすでに選ばれることが確定しています。そのため、残りの19校から8校を選ぶパターンを求めれば良いです。Binomial Coefficient Formulaより
$19C8 = 19!/{8!11!} =5,005$
よって、自分の学校が選ばれている場合他の学校を選ぶパターンを全部で5,005通り存在します。

今回の設問では、今週のユニットで学習した順列と組み合わせの概念を利用して計算を行いました。選択した理由は計算過程で示しましたが、重要なことは「順番が関係あるか」です。
また、これらの組み合わせ論は日常生活のさまざまな場面で役に立ちます。例えば、特定のスキルセットを持つ人々からなるチーム構築や、部品と商品の関係の計算などです。

## Math Assignment

1. Imagine you received a scholarship that would cover only 3 courses out of the 11 courses related to your field of study at your university. How many ways will you have to choose the three courses and how many ways can you choose for the remaining two courses if one course- English (out of the 11 courses) is mandatory to take? Explain how you arrived at the answer.
2. Consider two sets A and B having cardinality of your choice. Explain how many injective and bijective functions are possible from set A to set B. Please avoid the examples given in textbooks or online resources and come up with your own unique example.
3. Find the coefficient of   x^{7}   in the expansion of   x^{3} (x+2)^{10} + (x+5)^{7}
4. A newly constructed apartment has 30 club members. The club has planned to create a sports committee consisting of 7 club members. How many different sports committees are possible? How many committees are possible if it is mandatory to have the selected treasurer of the club members in the sports committee? Explain in detail.
5. Answer the following questions:
   1. Explain bit string in your own words.
   2. Give an example of a bit string with any length and weight and explain how combinations help find the number of bit strings possible for the example.
   3. Choose a 3-digit number example and explain the number of derangements that can be formed from it.
   4. To create a 4 digit- password for your Android phone,
      1. How many ways are there to crack the password if no digit repeats?
      2. If the digits can be repeated, how many ways are there to crack the password?

ja

1. あなたが大学で専攻する分野に関連する11科目のうち、3科目のみをカバーする奨学金を受け取ったとします。11コースのうち英語1コースが必修科目である場合、残りの2コースはどのように選択できますか。どのようにしてその答えを導き出したか、説明してください。
2. 任意のカーディナリティを持つ2つの集合AとBを考える。集合Aから集合Bへの射影関数と両射影関数はいくつ可能か説明しなさい。教科書やオンライン・リソースで与えられている例を避け、あなた独自の例を考えてください。
3. x^{3} (x+2)^{10}+ (x+5)^{7} の展開における x^{7} の係数を求めよ。
4. 新築のマンションには30人のクラブ会員がいる。このクラブは、7 名のクラブ会員から成るスポーツ委員会の設立を計画しました。何種類のスポーツ委員会が考えられますか。クラブ会員の中から選出された会計をスポーツ委員会に参加させることが必須である場合、いくつの委員会が考えられますか。詳しく説明してください。
5. 以下の質問に答えてください：
   1. ビット列を自分の言葉で説明しなさい。
   2. 任意の長さと重さを持つビット列の例を挙げ、その例で可能なビット列の数を求めるのに、組み合わせがどのように役立つかを説明しなさい。
   3. 3桁の数の例を選び、そこから形成されうる錯乱の数を説明しなさい。
   4. アンドロイド携帯の4桁のパスワードを作成する、
      1. 桁の繰り返しがない場合、パスワードを解読する方法はいくつあるか。
      2. 桁の数字を繰り返すことができる場合、パスワードをクラックする方法はいくつありますか？

1. 英語のコースは必修科目であるため、11-1=10コースから残りの2コースを選択する必要ある。選択する科目は順番の考慮が不要であるため、組み合わせの概念を利用して計算することができる。
10C2 = (10*9)/(2*1) = 45
よって、奨学金をカバーするコースの選択のうち、英語が必修科目であるパターンは45通りである。

2. 二つの集合AとBを以下のように考える。
A = {1,2,3,4}
B = {a,b,c}
まず、集合AからBへの単射を考える。単射では集合Aの要素を全て使う必要があるが、集合Bの要素は全てマッピングされる必要はない。つまり集合Aから見ると集合Bの要素の数だけ選択肢が存在することになります。よって例に挙げた条件における単射関数の数は
3*3*3*3 = 3^4 = 81 となる。
次に、全射について考える。全射では集合Bの要素が全て出力として割り当てられる必要がある。そのため、全射関数の数は集合Bの各要素に対してAの要素を割り当てる組合せの数になる。よって例として挙げた条件における全射関数の数は、
4*4*4 = 4^3 = 64 となる

3. 二項定理によって計算を行う。計算はまとまりごとに実施する。
(i) x^{3} (x+2)^{10}
x^{3}を乗算する必要があるため、(x+2)^{10}のうち、x^4に関連する部分だけ計算を行えば良い。(x+2)^{10}のx^4に関連する項は
=> 10C6*2^6 = 210*64 = 13,440
(ii)乗算する項が存在しないため、二項定理を利用してそのまま計算を行う。
=> 7C0*x^7*5^0=1
(i)と(ii) を加算すれば良い、答えは13,441となる。

4. この問題は順番を考慮する必要はないため、組合せの概念を用いて計算を行うことができる。会計係を選択する飛鳥があるパターンとないパターンをそれぞれ考える。
(i) 30人から7人を選ぶ組み合わせの数を求めれば良いので、
30C7 = 2,035,800
(ii)会計係が一人すでに選出されているため、合計から1引いた29人から6人を選ぶ組み合わせを考えればよい。よって、
29C6 = 475,020

5.
1. bit stringは0と1から高異性される情報の一つです。主な用途としてはコンピュータが情報を表現するために利用し、それぞれの0と1はビットと呼ばれます。コンピュータシステムの分野では通常0と1の組み合わせでデータや命令を表現するために利用される。
2. 例として8桁で重みが3となるビット列を考える。重みが3であるので1が3つ存在する必要があるが、この数は組み合わせの概念を利用して計算を行うことができる。なぜなら、8から3を選ぶ計算と全くことをビット列の総数を求める計算では必要とするからだ。
例の場合では
8C3 = 56
となり、56パターンのビット列が考えられる。
3. 例として725という3桁の数値を考える。この3つの数から生成される3桁の数値は3!=6種類存在するが、条件のような転置数はそのうち何種類存在するかを考える。転置数とは、どの要素も元の位置に存在しない場合を表す。この総数は全ての整数の総数から包括と排除の原理から求めることができる。それぞれの要素について計算を行う。
(i)全ての3桁の数の総数
これは前文で示した通り、3!=6となる
(ii)少なくとも一つの数値が元に位置に存在する
例えば7が元の位置に存在する組み合わせは2種類になる。よって2*3で6となる
(iii)少なくとも2つの数値が元に位置に存在する
1桁目と2桁目が元の位置に存在する場合、残りの1桁を考えるため、1種類になる。よって1*3=3となる。
(iv)全ての要素が元の位置に存在する
全ての要素が元の位置に存在する場合は「725」の1種類のみである。

(i)-(iV)の要素を包括と排除の原理より計算を行う
6-6+3-1=2
よって725の転置数は2種類存在する。

4.1. 繰り返しが存在しないため、10個の数値から4つを選ぶ数として考えることができる。また、パスワードの要件では順番が重要な要素となるため、利用する概念は順列になる。よって
10P4 = 5,040 通りのパスワードが考えられる。
4.2. 重複が認められるため、4桁の数値全ての要素で10個の選択肢が与えられる。よって
10^4 = 10,000 通りの￥パスワードが考えられる。

## Learning Journal
