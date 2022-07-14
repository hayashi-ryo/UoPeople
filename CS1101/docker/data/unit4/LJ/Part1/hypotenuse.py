import math

def hypotenuse(x, y):
    x = x * x
    y = y * y
    z = math.sqrt(x+y)
    return z

print("hypotenuse(3, 4):", hypotenuse(3, 4))
print("hypotenuse(5, 12):", hypotenuse(5, 12))
print("hypotenuse(10, 10):", hypotenuse(10, 10))
