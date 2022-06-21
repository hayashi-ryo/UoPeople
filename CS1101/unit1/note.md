# Discussion Forum

- question
  - Type the statements below into your Python interpreter. For each statement, copy the output into your Discussion Assignment and explain the output. Compare it with any similar examples in the textbook, and describe what it means about your version of Python.

1,print 'Hello, World!'
2.1/2
3.type(1/2)
4.print(01)
5.1/(2/3)

- Answer

1. print 'Hello, World!'
output:
  File "<stdin>", line 1
    print 'Hello, World!'
          ^
SyntaxError: Missing parentheses in call to 'print'. Did you mean print('Hello, World!')?
describe:
    "print 'Hello, World!'" is the grammar of python v2. This error occurred because my python version is V3.9.13.

2. 1/2
output:
    0.5
describe:
    This formula shows 1 divided by 2. So the output is 0.5.
3. type(1/2)
output:
    <class 'float'>
describe:
    In python, the values that show a figure include integer and float, and more. "1/2" is 0.5, so a float class indicating a small number is given.
4. print(01)
output:
  File "<stdin>", line 1
    print(01)
           ^
SyntaxError: leading zeros in decimal integer literals are not permitted; use an 0o prefix for octal integers
describe:
    "01" is not a simple number, but is treated as a string class. Therefore, it must be enclosed in quotation marks to explicitly indicate the string type.
5. 1/(2/3)
output:
    1.5
describe:
    Python is a formal language. So, this question calculates the entirety after calculating the contents of the parentheses.

# Learning Journal

Part1
Q1:If you are trying to print a string, what happens if you leave out one of the quotation marks or both and why?
Answer:
The results of the experiment are as follows
>>> print('test)
  File "<stdin>", line 1
    print('test)
                ^
SyntaxError: EOL while scanning string literal

>>> print(test)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'test' is not defined

If you omit the quotation marks, an error occurs. It occurs because the print function cannot determine the beginning and end of the text to be displayed.

Q2:You can use a minus sign to make a negative number like -2. What happens for each of the following and why?
The results of the calculations and decomposition of the calculations are shown below.
>>> 2++2
4
(2+(+2))
>>> 2--2
4
(2-(-2))
>>> 2+-2
0
(2+(-2))
>>> 2-+2]
0
(2-(+2))

Q3:In math notation, leading zeros are OK, as in 02. What happens if you try this in Python and why?
The results of the experiment are as follows
>>> print(02)
  File "<stdin>", line 1
    print(02)
           ^
SyntaxError: leading zeros in decimal integer literals are not permitted; use an 0o prefix for octal integers

Since python is a formal language, it is not allowed to express decimal numbers as "02". If you want to use it, you need to explicitly state whether "02" is an n-decimal number or a string. If you want to use it as a normal number, you should omit the leading 0.

Q4:What happens if you have two values with no operator and a space in between them and why?
The results of the experiment are as follows
>>> 1 1
  File "<stdin>", line 1
    1 1
      ^
SyntaxError: invalid syntax
I tried it and got an "invalid syntax" error. This error occurs when python is given a program with incorrect syntax. In this case, it is occurring because it does not know how to process a value with a space in between. I need to give the program exactly what you want it to do.

Part2
Q:Next, describe at least three additional Python experiments that you tried while learning Chapter 1. Show the Python inputs and their outputs, and explain what you learned from the results of each example.

First experiments
I experimented to see if quotation marks are required when printing numerical values.
>>> print(100)
100
If it is determined to be a number, it was confirmed that there is no error without quotation marks.

Second experiments
I tried to see if I could combine strings and print them.
>>> print('Hello' + 'World!')
HelloWorld!
In python, I have confirmed that string concatenation can be done with the + operator.

Third experiments
I added strings and numbers together with the + operator.
>>> print(1 + 'test')
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: unsupported operand type(s) for +: 'int' and 'str'
It appears that binding between different classes is not supported. I believe this is because the + operator has different meanings for numbers and strings.
For numerical values: add
For strings: concatenate
  