# unitx

## Goal

## Task

- [x] Reading assignment
  - [x] Think Python Chapter10
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz
- [x] Peer assess unit5

### Reading Assignment

- Think Python chapter10 "LIST"
  - list has some items(elements)
  - elemets don't have to be same types.
    - example:["spam", 10, 5]
  - list has list in nested
  - lists are mutable
    - mutable is changeable
  - add element
    - append(x)
  - add list
    - extent(list)
  - sort list
    - list.sort()
  - delete elemet
    - list.pop(x)

### Discussion Forum

- Question
  - Describe the difference between objects and values using the terms “equivalent” and “identical”. Illustrate the difference using your own examples with Python lists and the “is” operator.
  - Describe the relationship between objects, references, and aliasing. Again, create your own examples with Python lists.
  - Finally, create your own example of a function that modifies a list passed in as an argument. Describe what your function does in terms of arguments, parameters, objects, and references.
  - Create your own unique examples for this assignment. Do not copy them from the textbook or any other source.
- In Japanese
  - オブジェクトと値の違いを「等価」「同一」という言葉を使って説明しなさい。Pythonのリストと "is "演算子を使った例で、その違いを説明しなさい。
  - オブジェクト、参照、エイリアシングの関係について説明しなさい。ここでも、Pythonのリストを使って独自の例を作成します。
  - 最後に、引数として渡されたリストを変更する関数の例を自分で作ってください。引数、パラメータ、オブジェクト、参照の観点から、あなたの関数が何を行うかを説明しなさい。
  - この課題では、あなた自身のユニークな例を作成してください。教科書や他の出典からコピーしないようにしてください。

- Answer
  - 以下の二つのリストを使って考える。
    - a = [100,200,300]
    - b = [100,200,300]
  - この二つのリストに対してis演算と==演算の結果を出力すると。
    - a == b: True
    - a is b: False
    - これは、それぞれのリストが持つ値自体は等価であるが、同一でないことを示している。要素が同じなので一見同一のaとbは同一のもののように見えるが、実態としては異なるものなのだ
  - 今回も新しいリストと変数を作成する
    - c = [100, 200, 300]
    - d = c
  - この例のように、リストなどのオブジェクトと変数を関連づけることを参照と呼ぶ。また、オブジェクト自体は変数cと変数dの複数の名前を持つ。このようなものをエイリアスと呼ぶ。
    - エイリアス自体を変更すると、それを参照している変数全てが変化する
d: [100, 200, 300]
c[1] = 300
d: [100, 300, 300]
- 関数の最後に文字列を追加し、インデックス0の文字列を削除する関数を作成した

    ```python
      def FIFO(lst, a):
        lst.append(a)
        lst.pop(0)
    ```

    この関数は、引数として与えたリストオブジェクトと文字列を利用し、オブジェクトエイリアス自体の修正を行うものである。実行したを以下に記載する。

### Learning Journal

- Part1
  - Write a Python program that does the following.
    - Create a string that is a long series of words separated by spaces. The string is your own creative choice. It can be names, favorite foods, animals, anything. Just make it up yourself. Do not copy the string from another source.
    - Turn the string into a list of words using split.
    - Delete three words from the list, but delete each one using a different kind of Python operation.
    - Sort the list.
    - Add new words to the list (three or more) using three different kinds of Python operation.
    - Turn the list of words back into a single string using join.
    - Print the string.
- Part2
  - Provide your own examples of the following using Python lists. Create your own examples. Do not copy them from another source.
    - Nested lists
    - The “*” operator
    - List slices
    - The “+=” operator
    - A list filter
    - A list operation that is legal but does the "wrong" thing, not what the programmer expects
- Part3
  - Describe your experience so far with peer assessment of Programming Assignments.
    - How do you feel about the aspect assessments and feedback you have received from your peers?
    - How do you think your peers feel about the aspect assessments and feedback you provided them?
- In Japanese
  - Part1
    - 以下の処理を行うPythonプログラムを作成しなさい。
      - 空白で区切られた長い単語の羅列である文字列を作成する。文字列は自分で創作してください。名前でも、好きな食べ物でも、動物でも、なんでもいい。ただ、自分で作ってください。他のソースから文字列をコピーしないでください。
      - 文字列を分割して、単語のリストにします。
      - リストから3つの単語を削除します。ただし、それぞれ別の種類のPython操作で削除します。
      - リストをソートします。
      - 3種類のPython操作を使って、リストに新しい単語を追加します（3つ以上）。
      - 単語のリストをjoinを使用して1つの文字列に戻す。
      - 文字列を表示する。
  - パート2
    - Pythonのリストを使って、次のような例を自分で作ってください。自分で例題を作成しなさい。他のソースからコピーしないでください。
      - ネストされたリスト
      - 演算子 "*"
      - リストのスライス
      - 演算子「+=」(プラスマイナス)
      - リストフィルター
      - リスト操作は合法だが、プログラマが期待するものとは異なる「間違った」ことを行う
  - パート3
    - プログラミング課題の相互評価について、これまでの経験を記述してください。
      - ピアから受けたアスペクト評価やフィードバックについてどう感じますか？
      - あなたが提供したアスペクト評価とフィードバックについて、仲間はどのように感じていると思いますか？

### Programming Assignment
