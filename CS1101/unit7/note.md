# unit7

- A dictionary is a mapping
- Looping and dictionaries
- Reverse lookup
- Dictionaries and lists
- Global variables
- Tuples are immutable
- Tuple assignment
- Tuples as return values
- Lists and tuples
- Dictionaries as tuples

## Goal

By the end of this Unit, you will be able to:

1. Create code to manipulate the content of a dictionary.
2. Modify global variables in functions.
3. Apply tuples in loops over lists and dictionaries.
4. Use the zip function, the enumerate function and the items dictionary method.

## Task

- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

### Reading Assignment

- Chapter 11: Dictionaries
  - ディクショナリーはkey-value型
- Chapter 12: Tuple
  - タプルは不変
    - リストは変更できるが、タプルは変更できない
  - タプルは変換に便利

    ```python
    a, b = b, a
    ```

    - これでaとbの交換ができる
  - zipは二つ以上のシーケンスからタプルを返却する
  - enumerateはインデックスと要素を取得できる
    - 通常のforloopではインデックスの取得ができない
  - 辞書とタプル
    - 辞書のitemメソッドはタプルのこと

### Discussion Forum

- Question
  - Describe how tuples can be useful with loops over lists and dictionaries, and give Python code examples. Create your own code examples. Do not copy them from the textbook or any other source.
  - Your descriptions and examples should include the following: the zip function, the enumerate function, and the items method.
- In Japanese
  - タプルがリストや辞書のループでどのように役立つかを説明し、Pythonのコード例を示す。自分でコード例を作成すること。教科書や他のソースからコピーしないでください。
  - zip関数、enumerate関数、itemsメソッドについて説明し、例を示すこと。

- Answer
  - タプルとリストはよく似た構造をしていますが、一番大きな違いはタプルはイミュータブルであるという点です。このことを考慮した上で使い所について考えます。
  - タプルは以下の例に示したように、2次元配列で有効に活用することができます。

  ```python
      sport_tuple = (('b', 1), ('a', 2), ('s', 3), ('k', 4), ('e', 5), ('t', 6), ('b', 7), ('a', 8), ('l', 9), ('l', 10))
      for s, index in sport_tuple:
        print(index, s)s
  ```

  上記をlistで実装した場合、要素が完全に把握できていたとすると以下のような形になります。

  ```python
      sport_list = (('b', 1), ('a', 2), ('s', 3), ('k', 4), ('e', 5), ('t', 6), ('b', 7), ('a', 8), ('l', 9), ('l', 10))
      for i in sport_list:
        s = i[0]
        index = i[1]
        print(index, s)
  ```

  この例は特定の要素へのアクセス処理を手動で記載しており、バグが含まれやすい形となってしまっています。
  この例に示したようなtupleは、zip関数を利用して生成することができます。zip関数は二つ以上のシーケンスからタプルを返却するために利用されます。
  sport = "basketball"
  t = [1,2,3,4,5,6,7,8,9,10]
  zip(sport,t)
  このように作成されたzipオブジェクトには、for loopでアクセスすると有効に活用できます。
  for pair in zip(sport,t):
    print(pair)
  シーケンスの要素とそのインデックスをたどる必要がある場合はenumerate関数が活用できます。enumerate関数は与えられたシーケンスにインデックスを付与して返却します。
  for index, s in enumerate(sport):
    print(index+1,s)

  辞書ではキー項目へのアクセスがハッシュ形式であるため、項目は不変性が求められます。タプルであれば不変であるので辞書の項目として活用することが可能です。例で作成したタプルから辞書を生成する例を示します。
  sport_tuple = (('b', 1), ('a', 2), ('s', 3), ('k', 4), ('e', 5), ('t', 6), ('b', 7), ('a', 8), ('l', 9), ('l', 10))
  d = dict(sport_tuple)

  ここで、辞書の全要素をイテレータとして表示するitemsメソッドを利用すると辞書の要素へのアクセスを便利に行うことが可能です。

### Programming Assignment

### Learning Journal
