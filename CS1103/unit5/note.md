# unit5

- This unit will address the following topics:
  - Lists and Sets
  - Maps
  - Programming with the Java Collection Framework

## Goal

- Look at specific list and set Java collection classes and how to use them.
- Learn about maps.
- Study some programming examples that use classes from the Java Collection Framework.

## Task

- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [ ] Programming assignmet
  - [x] PeerAssess
  - [x] Lab
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Section 10.2: Lists and Sets
  - set:集合オブジェクト
- Section 10.3: Maps
  - 連想配列という言葉で表現されることもある。
  - 重要なことは、添字（インデックス）が数値ではなくオブジェクトを許容していること。
  - `Map<K,V>`で表現される。
- ここまでの二つの章では、TreeとHashの二つの概念を学んだ
  - Tree:ソートされた状態で表現される。そのためcompare()による比較が可能である必要がある。
  - Hash:必ずしもソートされていなくても大丈夫。しかしequals()とHashcode()のインターフェースは持っておく必要がある。
- Section 10.4: Programming with the Java Collection Framework

## Discussion Forum

When writing a data structure, what should be our guidelines for choosing the right Java Collection?

クラスメイトの皆さんこんにちは、今回のテーマに関する私の見解を説明します。
現実世界の物事をプログラムのデータ構造として表現する方法は多数存在し、Javaでは一般的なデータ構造としてList・Set・Mapが提供されています。データ構造により処理が得意な領域や不得意な領域が存在するため、それぞれのデータ構造で提供される機能について知ることがJavaコレクション選択のために必要な要素です。テキストから、それぞれのデータ構造の特徴をまとめて説明します。

- List
  - テキストではリストは"A list consists of a sequence of items arranged in a linear order. A list has a definite order, but is not necessarily sorted." (Eck, D. J. 2019) と説明されます。listは要素を並べる役割があり、順序性（インデックス）を付与したデータを管理する場合に活用されます。
- Set
  - テキストによれば、"A set is a collection that has no duplicate entries. The elements of a set might or might not be arranged into some definite order." (Eck, D. J. 2019) と説明されます。Setは、要素に含まれるか否かを判定する役割があります。
- Map
  - テキストによれば、Mapは"In a map, an object that serves as an "index" is called a key. The object that is associated with a key is called a value." (Eck, D. J. 2019) と説明されます。最大の特徴は、配列における添え字をオブジェクトとして管理することができる点です。また、Collectionsクラスを継承しているわけではないことも一つの特徴です。

これらの特徴から、コレクションクラス選択の指針は以下のようになると私は考えます。
本のページなど、要素をインデックスで管理しアクセスしたい場合：list
ユーザIDの重複確認反転など、要素の順番の考慮が不要で存在確認だけ行いたい場合：Set
授業名など、オブジェクトとして管理するキー項目とバリューの紐付けを行いたい場合：Map

## Written Assignment

For this week’s assignment, you are required to provide a solution for Lab 9: “Sets in the Java Collection Framework.”

## Learning Journal

今週のユニットでは、List、Set、Mapの3つのデータ構造について学びました。それぞれのデータ構造やデータ構造の選択に関するに関する私の理解を説明します。
前提として、データ構造はどのような問題解決に利用したいのかによって選択することが重要です。今回のユニットで学習したデータ構造はそれぞれ得意な領域や不得意な領域が存在し、適切なデータ構造を選択することによってプログラムの実装を行うことが非常に重要な点となります。そのためには、解決しようとしている問題を、抽象的な概念ではなく、より具体的な問題として捉えることにより、扱うデータの特徴をつかむ能力が必要なものとなります。今週のLab課題ではデータ構造の選択をすることはありませんでしたが、来週以降のユニットやエクササイズ課題を実施する際は、課題の特徴をより捉えることができるよう学習を進めていいきます。それでは、以下でそれぞれのデータ構造について説明します。
一つ目はListです。Listはインデックスで要素を管理することができることが特徴です。Collectionsクラスを継承しているため、要素をソートして順序性を持ったデータを管理する場合に有効に活用できます。身の回りのほとんどんの辞書を管理することができるデータ構造ですが、名簿や商品の金額リストなど一つの要素を管理したい場合に有効に活用することが可能です。
二つ名はSetです。Setを利用する場合に一番重要な要素は、booleanを判定するデータ構造であるということです。言い換えると、要素の存在性を確認することを目的としたデータ構造であるということです。この特徴は、重複判定チェックや予約判定など、存在確認を行う事象を管理するデータ構造として利用すると、有効に働きます。
三つ目はMapです。Mapは、キーと呼ばれるオブジェクトで、バリューと呼ばれるオブジェクトを管理することができるデータ構造です。Listをインデックスではなくキーで管理したものとイメージすると理解が深まると考えています。このデータ構造は、キーバリュー型のデータ構造の管理、例えばものの名前と値段を管理したい場合などに利用することができるデータ構造です。
また、データ構造では、TreeとHashと呼ばれる管理方法を選択することができます。Treeはソートされた状態で要素が管理されるため、より順序性が重要な管理を行いたい場合に有効に活用できます。Hashは、必ずしもソートされた表現とならないことが特徴です。しかし、Treeよりも高速なアクセスを実現します。順序性はあまり重要でなく全ての要素にアクセスしたい場合などに活用することができます。
これらのデータ構造は、プログラムを実装していく上では欠かすことのできない要素であり、今後もデータ構造の選択というテーマはかんが続けていきたいと思います。
最後に、このユニットではLab課題の実施が一番困難なものでした。具体的な要件に対して複数の処理を実装していく必要があるものでしたが、はじめに要件を呼んだだけでは具体的な実装方式をイメージすることができず、時間をかけて要件の理解を行いました。結果的にはあまり複雑な要件ではないことがわかったため実装を進めることができたのですが、開始した時点でその判断を下すことができなかったため、来週以降のユニットでは、要件の分解、理解に要する時間をより短くしていくための豊作を試していきたいと思います。
