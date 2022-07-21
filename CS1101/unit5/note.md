# unitx

## Goal

- By the end of this Unit, you will be able to:
  - Interpret functions with for loops, conditionals, and string methods.
  - Write functions with while loops.
  - Operate on strings using for loops.
  - Utilize string slices in code.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

### Discussion Forum

全ての関数はforループを利用して文字列に含まれる単語が小文字かどうか判定しています。関数ごとの動作について以下に記載します。

any_lowercase1: forループの中にreturnの記載があるため、何文字の値を渡しても最初の一文字目の結果しか反映されていません。そのため、1文字目以外に小文字を含む文字列で関数を実行した場合に想定と異なる結果が返却されます。
Output:
any_lowercase1(StarT): False (Unexpected)
any_lowercase1(sTART): True  (Expected)

any_lowercase2: 'c'という固定の文字列を評価しているため、どのような文字列を与えても結果はTrueとなります。
Output:
any_lowercase2(StarT): True (Unexpected)
any_lowercase2(sTART): True (Unexpected)

any_lowercase3: 1文字ごとの評価結果を保持していないため、最後の1文字の結果しか反映されていません。そのため、最後の文字以外に小文字を含む文字列で関数を実行した場合に想定と異なる結果が返却されます。
Output:
any_lowercase3(sTART): False (Unexpected)
any_lowercase3(Start): True (Expected)

any_lowercase4: 文字ごとの判定結果をフラグとして保持し、1文字でも小文字がふくまれていればTrueを返す想定通りの動きをしています。
Output:
any_lowercase4(sTART): True (Expected)
any_lowercase4(start): True (Expected)
any_lowercase4(START): False (Expected)

any_lowercase5: 文字列に大文字が含まれていた時点でFalseを返す動きとなっているため、全て小文字の文字列を与えた場合以外は正常に動作しません。
Output:
any_lowercase5(start): True (Expected)
any_lowercase5(Start): False (Unexpected)
any_lowercase5(sTART): False (Unexpected)

### Learning Journal

A piece of string is called a slice. Three characteristics of string slices are described below.

feature1
The number of characters to be extracted can be specified by index.
script
  sport = "basketball"
  print("sport[3:6]:",sport[3:6])
output
  sport[3:6]: ket

feature2
The start and end characters may be omitted.
script
  sport = "basketball"
  print("sport[:4]:",sport[:4])
  print("sport[3:]:",sport[3:])
Output
  sport[:4]: bask
  sport[3:]: ketball
If omitted, the first and last characters are specified. Therefore, if you omit both specifications, the entire string will be output.
script
  sport = "basketball"
  print("sport[:]:",sport[:])
Output
  sport[:]: basketball

feature3
Minus can be used to define the number of characters from the end.
sport = "basketball"
  print("sport[:-1]",sport[:-1])
  print("sport[-3:10]",sport[-3:10])
  print("sport[7:10]",sport[7:10])
output
  sport[:-1] basketbal
  sport[-3:10] all
If the total number of characters is known, it can be sliced without using a minus sign. However, this is useful for functions that handle multiple strings, for example, when you want to explicitly specify the number of characters from the end of the string.

### Programming Assignment
