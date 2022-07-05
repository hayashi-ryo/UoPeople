# Course Title

CS 1101 Programming Fundamentals

## Goal

- basic of computer programming
- foundation for further learning in CS

the end of this course I will be able to:

- Implement code using fundamental programming concepts, language constructs and procedural programming approaches.
- Develop programs using the Python programming language to solve programming problems.
- Independently research programming languages and apply new programming language features.

### Requirement

- Python v3
  - docker environmentを利用

### unit1

### unit2

- tasks
  - [ ] Read textbook
    - [ ] chapter2
    - [ ] chapter3
  - [x] DF
  - [ ] PA
  - [ ] LJ

- Reading Assignment
  - Variables:変数
    - ある値を参照するための名前
  - Function:関数

- DF
Example 1: Define a function that takes an argument. Call the function. Identify what code is the argument and what code is the parameter.

Ans1:
Prepare a function that performs "**5" operations on its arguments.
def f(n): # parameter
  return print(n** 5) # operation
f(10) # arguments

Example 2: Call your function from Example 1 three times with different kinds of arguments: a value, a variable, and an expression. Identify which kind of argument is which.
The results of each call are as follows:
f(10)　# value
100000
n = 5 # variable
f(5)
3125
f(1+3) # expression
1024

Example 3: Create a function with a local variable. Show what happens when you try to use that variable outside the function. Explain the results.
Prepare a function to determine velocity. This function uses the local variable "velocity".
def cal_velocity(d,t): # d is distance, t is time
  velocity = d / t
  return print(velocity)
The following error occurs when trying to call the local variable "velocity".
print(velocity)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'velosity' is not defined
This is caused by the fact that variables defined inside functions are local variables and can therefore only be called inside functions.

Example 4: Create a function that takes an argument. Give the function parameter a unique name. Show what happens when you try to use that parameter name outside the function. Explain the results.
Prepare a function that takes a uniquely named argument.
def f(example4):
  print(example4)

Here, accessing the arguments will result in the following error:
print(example4)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'example4' is not defined
This indicates that the uniqueness of the argument only affects the function internals and cannot be called from an undefined area.

Example 5: Show what happens when a variable defined outside a function has the same name as a local variable inside a function. Explain what happens to the value of each variable as the program runs.
Define a function and execute it.
sample = "test"
def f(sample):
  print(sample)

f("debug")
debug
print(sample)
test
At this time, the previously prepared definition of "sample="test"" is not used, and you can see that the arguments you gave when calling the function took precedence. In other words, within the function, the parameter is used in preference to the variable of the same name.

### Learning Journal

Part1
Given an argument r, define a function that returns a volume as follows:

```python
import math

def print_volume(r):
    volume = 4 / 3 *math.pi* r ** 3
    print(volume)

```

The result of the call with different arguments is as follows:
>>> print_volume(1)
4.1887902047863905
>>> print_volume(5)
523.5987755982989
>>> print_volume(3.0)
113.09733552923254

Part2
I created a function that, given three arguments, returns the average of the three arguments.

```python
def calculate_average(a, b, c):
  average = (a+b+c)/3
  print(average)
```

この関数は呼び出し時に、3つの引数を与えることで、その平均値をプリントします。いくつか実行例を以下に記載します。
The function prints the average of the three arguments given at the time of the call. Some examples of execution are given below:
>>> calculate_average(3,6,9)
6.0
>>> calculate_average(-100,500,200)
200.0
Here, giving this function fewer (or more) arguments will result in an error.
>>> calculate_average(3,6)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: calculate_average() missing 1 required positional argument: 'c'

Applying the variable-length string concept to arguments to solve this problem allows us to create functions that are not bound by the number of pieces.

def calculate_average(*args):
    print(sum(args)/len(args))

>>> calculate_average(3,6,1,35,6,7,1)
8.428571428571429

### unit3

- floor division:商
- modulus:余り

- DF
  - Describe the difference between a chained conditional and a nested conditional. Give your own example of each. Do not copy examples from the textbook.
    - 数義を
    - chained conditionalは値に対して独立した複数の可能性が考えられる際に利用します。例えば"xは偶数か奇数か”のような条件です。以下に例を記載します。
    The chained conditional is used when multiple independent possibilities are possible for a value. For example, "x can be even or odd". An example is shown below:

    ``` python
    if (x % 2 == 0): # divisible by 2
      print("x is an even number")
    else:
      print("x is an odd number")
    ```

    - nested conditionalの単純な定義としては、条件式の中に条件式を入れ子に記載することを指します。chained conditionalの例をベースに"3で割り切れるか"といつ条件をnested conditionalで与えると以下のようになります。
    A simple definition of nested conditional is a conditional expression nested within a conditional expression. Based on the chained conditional example, the nested conditional condition "is divisible by 3" can be given as follows.

    ```python
    if(x%2 == 0): # divisible by 2
      if(x%3 == 0): # divisible by 3
        print("x is an even number divisible by 3")
      else:
        print("x is an even number")
    else:
      print("x is an odd number")
    ```

    このように特定の条件を満たした値に対して、追加で条件を与えたい場合にnested conditionalが利用できます。
    ただし、nest conditionalで記載された条件式は1つのステートメントに対して複数の条件が複数行にまたがって記載される可読性の低いものになるため出来るだけ避けるべき事項となります。そこで、論理演算子などを利用して、nest conditionalを避けることができます。私が作成した例を論理演算子を用いて修正すると以下のようになります。
    In this way, nested conditional can be used to provide an additional condition for a value that satisfies a specific condition.
    However, nested conditional expressions should be avoided as much as possible, as they are less readable, with multiple conditions spanning multiple lines of a single statement. Therefore, logical operators can be used to avoid nest conditional. My example, modified using logical operators, looks like this:

    ```python
    if( (x%2==0) and (x%3==0) ):  
      print("x is an even number divisible by 3")
    elif(x%2==0):
      print("x is an even number")
    else:
      print("x is an odd number")
    ```

    上記の例は、一つの条件式と一つのステートメントが1対1の対応となっており非常に可読性が高いものです。
    The above example is highly readable, with a one-to-one correspondence between one conditional expression and one statement.

The chained conditional is used when multiple independent possibilities are possible for a value. For example, "x can be even or odd". An example is shown below:

``` python
if (x % 2 == 0): # divisible by 2
  print("x is an even number")
else:
  print("x is an odd number")
```

A simple definition of nested conditional is a conditional expression nested within a conditional expression. Based on the chained conditional example, the nested conditional condition "is divisible by 3" can be given as follows.

```python
if(x%2 == 0): # divisible by 2
  if(x%3 == 0): # divisible by 3
    print("x is an even number divisible by 3")
  else:
    print("x is an even number")
else:
  print("x is an odd number")
```

In this way, nested conditional can be used to provide an additional condition for a value that satisfies a specific condition.
    However, nested conditional expressions should be avoided as much as possible, as they are less readable, with multiple conditions spanning multiple lines of a single statement. Therefore, logical operators can be used to avoid nest conditional. My example, modified using logical operators, looks like this:

```python
if( (x%2==0) and (x%3==0) ):  
  print("x is an even number divisible by 3")
elif(x%2==0):
  print("x is an even number")
else:
  print("x is an odd number")
```

The above example is highly readable, with a one-to-one correspondence between one conditional expression and one statement.
