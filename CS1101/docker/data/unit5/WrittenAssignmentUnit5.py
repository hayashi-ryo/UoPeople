import math


def my_sqrt(a):
    x = 1
    while True:
        y = (x + a/x)/2.0
        if y == x:
            break
        x = y
    return x


def test_sqrt():
    a = 1
    while (a < 26):
        mysqrt = my_sqrt(a)
        mathsqrt = math.sqrt(a)
        print("a =", a, "| my_sqrt(a) =", mysqrt, "| math.sqrt(a) =",
              mathsqrt, "| diff =", abs(mysqrt-mathsqrt))
        a += 1
    return 0


test_sqrt()
