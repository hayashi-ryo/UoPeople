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
  - [ ] Lab
- [ ] Learning Journal
- [ ] Take Self-Quiz

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
