# unit4

## Goal

- By the end of this Unit, you will be able to:
  1. Develop example code to debug a function.
  2. Utilize a recursive function to compute a result.
  3. Develop a function using the concept of incremental development.

### Tasks

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

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

### Learning Journal

Part1

1. 関数を定義する
今回作成する関数は2つの入力から1つの出力を得るものです、その大枠を定義します。

```python
def hypotenuse(x,y):
  return 0
```

この関数を実行すると0を取得できました。結果は正しいものではないですが、関数が正常に動作することは確認できています。
2. 演算部分を定義する
今回の関数で求めたい斜辺の長さは二つの辺の二乗の和の平方根で定義されます。まずは、引数の二乗を計算する部分を追加します。

```python
def hypotenuse(x, y):
    x = x * x
    y = y * y
    print("x*x:", x)
    print("y*y:", y)
    return 0

hypotenuse(3, 4)
hypotenuse(5, 12)
```

上記を実行した結果は以下のようになり動作に問題がないことがわかります。
x*x: 9
y*y: 16
x*x: 25
y*y: 144
次に二つの和の平方根を求める演算を追加します。

```python
import math

def hypotenuse(x, y):
  x = x * x
  y = y * y
  z = math.sqrt(x+y)
  print("z:", z)
  return 0

hypotenuse(3, 4)
print("#####")
hypotenuse(5, 12)
```

このプログラムを実行すると以下の結果が得られます。
z: 5.0

#####

z: 13.0
斜辺の値として求めたい演算ができていることが確認できました。
3. 返り値を定義する
最後に返り値を定義して、余計な文言を削除します。

```python
import math

def hypotenuse(x, y):
  x = x * x
  y = y * y
  z = math.sqrt(x+y)
  return 0

print("hypotenuse(3, 4):",hypotenuse(3, 4))
print("hypotenuse(5, 12):",hypotenuse(5, 12))
print("hypotenuse(10, 10):",hypotenuse(10, 10))
```

このプログラムを3つパターンで試し、以下の適切な出力を得ることができました。

Part2
為替レートを考慮した投資収支を算出する関数を作成します。仕様としては以下のイメージです
仕様：投資損益を算出するため、購入時および現在の為替レートと評価額を入力し、評価損益を円で出力する。
インプット
購入時為替レート
現在為替レート
購入評価額（$）
現在評価額（$）
アウトプット
評価損益（円）

まずは関数の雛形を作成します。
def calBalance(exBef, exNow, valBef, valNow):
  return 0
この関数を実行すると、0を取得できました。関数の定義が問題ないことが確認できたので処理を設計します。まずは、円換算した評価額を購入時と現在で求める処理を追加します。
def calBalance(exBef, exNow, valBefDoL, valNowDoL):
  valBefYen = exBef *valBefDoL
  valNowYen = exNow* valNowDoL
  print("valBefYen:", valBefYen)
  print("valNowYen:", valNowYen)
  return 0

calBalance(100, 120, 300, 400)
print("#####")
calBalance(120, 140, 300, 250)
実行した結果以下の結果が得られました。
valBefYen: 30000
valNowYen: 48000

#####

valBefYen: 36000
valNowYen: 35000
この結果は想定した通りのものなのでここまで問題ないことが確認できました。次に円換算の評価損益を計算する処理を追加します。

def calBalance(exBef, exNow, valBefDoL, valNowDoL):
  valBefYen = exBef *valBefDoL
  valNowYen = exNow* valNowDoL
  PaL = valNowYen - valBefYen
  print("PaL:", PaL)
  return 0

calBalance(100, 120, 300, 400)
print("#####")
calBalance(120, 140, 300, 250)

この出力は以下の通りです。
PaL: 18000

#####

PaL: -1000
この結果も想定通りとなっているため問題ありません。
最後に返り値を定義して、余計な文言を削除します。作成したプログラムを3パターンで実施したところ以下の出力が確認できました。それぞれ適切な出力となるためプログラムが正常に動作していることがわかりました。
その結果calBalance_out.txtを提出します。3つのパターンを試しそれぞれ問題ないことが確認できました。

Part3
私はディカッションについて、できれば多くのフィードバックをもらえればと考えているため、できるだけ早く提出することを心がけています。その上で、クラスメイトからもらったフィードバックを以下のように役立つものが多いと感じています
・ここの記載がわかりやすくよいと思う
・このような説明の仕方は私も参考にする
また、私自身が与えるフィードバックについてもできるだけ実践的な内容となるよう心がけています。たとえば、よくわからないエラーが出たと言っているクラスメイトにはその原因を伝え、このような対処が考えられると伝えたり、定義を様々な文献をもとに説明できている場合は私にはできなかったことで素晴らしいと思う、などのコメントを残すことです。
評価については正直難しいと考えています。このクラスの評価はまず要件を満たした提出物があり、その上で建設的な議論ができていれば10点となるイメージで採点しているため、ほとんどのクラスメイトに9点か10点をつけているのが実情です。
