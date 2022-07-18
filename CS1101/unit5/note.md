# unitx

## Goal

- By the end of this Unit, you will be able to:
  - Interpret functions with for loops, conditionals, and string methods.
  - Write functions with while loops.
  - Operate on strings using for loops.
  - Utilize string slices in code.

## Task

- [ ] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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

### Programming Assignment
