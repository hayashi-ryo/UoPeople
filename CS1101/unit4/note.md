# unit4

## Goal

- By the end of this Unit, you will be able to:
  1. Develop example code to debug a function.
  2. Utilize a recursive function to compute a result.
  3. Develop a function using the concept of incremental development.

### Tasks

- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

### Discussion Forum

Question:
  Discussion Assignment
  Section 6.9 of your textbook ("Debugging") lists three possibilities to consider if a function is not working.
  Describe each possibility in your own words.
  Define "precondition" and "postcondition" as part of your description.
  Create your own example of each possibility in Python code. List the code for each example, along with sample output from trying to run it.

  ディスカッションの課題
  教科書の6.9節（「デバッグ」）には、ある関数が動作しない場合に考慮すべき3つの可能性が挙げられています。
  それぞれの可能性を自分の言葉で説明しなさい。
  説明の一部として、「precondition」と「postcondition」を定義しなさい。
Answer
  The first possibility:関数が受け取る引数が条件を満たしていない
  The second possibility:関数自体に問題があり、想定した結果を得ることができていない状態
  The third possibility:関数は正常に動作しているが、returnを適切に使用することができていない状態

クラスメイトの皆さんこんにちは、今週のテーマについて以下に私の回答を記載します。
関数が動作しない場合に考えられるエラーは、大きく3つの可能性があります。実際のコードと合わせてそれぞれの説明を以下に記載します。
一つ目は、関数が受け取る引数が条件を満たしていない場合に発生します。例えば以下のコードで考えます。

```python
def velocity(d, t):
  v = d / t
  return v
```

この関数は、距離と時間を与えて速度を返すものです。関数を扱う場合は、引数が数値であることを想定していましたが、例えば文字列を与えた場合やtに0を与えた場合にはエラーが発生します。

```文字列を与えた場合のエラー
Traceback (most recent call last):
  File "/work/unit4/verocity.py", line 8, in <module>
    print(velocity(d, t))
  File "/work/unit4/verocity.py", line 2, in velocity
    v = d / t
TypeError: unsupported operand type(s) for /: 'int' and 'str'
```

このようなエラーに対処するために、私は関数のメインとなる処理を走行する前の変換処理を追加し、問題があれば通知する処理を追加しました。

```python
def velocity(d, t):
  try:
    d = int(d)
    t = int(t)
    if (t != 0):
      v = d / t
      return v
    else:
      print("The argument t must be a non-zero number.")
  except:
    print("The argument must be given a numerical value.")
    return
```

この例で確認した、関数に与える引数が満たすべき条件のことを"precondition"と呼びます。

2つ目の可能性は、関数自体が正常に動作せず、想定した結果を取得することができない場合に発生します。前提条件である"引数は数値であること"を満たした状態ですが、引数に対して少数を与えると想定していない結果が出力されます、このように関数自体が正常に動作しない場合も対処が必要です。今回は少数を受け取ることができるよう変換処理を以下のように修正します。
d = float(d)
t = float(t)

この例で確認した、関数が返却するものが満たすべき条件のことを"postcondition"と呼びます。

最後に、3つ目の可能性は関数が返却した値を適切で来ていない場合に発生します。今回作成した関数は距離と時間から速度の数値を求めるものです。例えば、求めた結果をプリントしたい場合は、呼び出し側で定義することが必要です。

NG
d = 13.5
t = 4.5
velocity(d, t)

OK
d = 13.5
t = 4.5
print(velocity(d, t))

Answer:English

Hello classmates, I am writing to describe my response to this week's topic.
There are three main possible errors when a function does not work. I will describe each one below along with the actual code.
The first possibility occurs when the arguments a function receives do not meet the conditions. For example, consider the following code

```python
def velocity(d, t):
  v = d / t
  return v
```

This function returns a velocity given a distance and a time. When working with functions, it was assumed that the argument is numeric, but if, for example, a string is given or 0 is given for t, an error will occur.

```Error when a string is given
Traceback (most recent call last):
  File "/work/unit4/verocity.py", line 8, in <module>
    print(velocity(d, t))
  File "/work/unit4/verocity.py", line 2, in velocity
    v = d / t
TypeError: unsupported operand type(s) for /: 'int' and 'str'
```

To address these errors, I added a conversion process before running the main part of the function and added a process to notify me if there is a problem.

```python
def velocity(d, t):
  try:
    d = int(d)
    t = int(t)
    if (t != 0):
      v = d / t
      return v
    else:
      print("The argument t must be a non-zero number.")
  except:
    print("The argument must be given a numerical value.")
    return
```

The second possibility occurs when the function itself does not work properly and the expected result cannot be obtained. The prerequisite "the argument must be a number" is satisfied, but if a small number is given as the argument, an unexpected result will be output. In this case, we will modify the conversion process as follows so that it can accept a small number of arguments.
d = float(d)
t = float(t)

The condition that the function returns must satisfy is called "postcondition," as we have seen in this example.

Finally, the third possibility occurs when the function does not come up with the proper returned value. The function we have created finds the numerical value of the speed from the distance and time. If, for example, we want to print the result obtained, we need to define it in the caller.

NG
d = 13.5
t = 4.5
velocity(d, t)
output:None

OK
d = 13.5
t = 4.5
print(velocity(d, t))
output:3.0

### Programming Assignment

今回の演習でis_powerに求める機能をリスト化します。
・二つの引数abが等しい場合
  Trueを返す
・二つの引数abが等しくない場合
  aがbで割り切れるのであれば、引数をa/bとbとしてis_powerを再起的に呼び出す
  aがbで割り切れないのであれば、Falseを返す
・引数bが1の場合
  a=b=1でなければFalseを返す

上記の機能を実装したスクリプト(power.py)とその結果(power_out.txt)です。想定された結果が得られていることが確認できます。

The following is a list of the functions we will be looking for in is_power in this exercise.
If two arguments ab are equal
  True is returned.
If the two arguments ab are not equal
  If a is divisible by b, recursively call is_power with the arguments a/b and b
  If a is not divisible by b, returns False
If the argument b is 1
  Return False if a=b=1 otherwise

Here is a script (power.py) and its result (power_out.txt) implementing the above functionality. It can be confirmed that the expected results are obtained.
