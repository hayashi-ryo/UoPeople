def is_divisible(a, b):
    if a % b == 0:
        return True
    else:
        return False


def is_power(a, b):
    if a == b:
        return True
    elif b == 1:
        return False
    else:
        print(is_divisible(a, b) and is_power(a/b, b))
        return is_divisible(a, b) and is_power(a/b, b)


print("is_power(10,2) returns:", is_power(10, 2))
print("is_power(27,3) returns:", is_power(27, 3))
print("is_power(1,1) returns:", is_power(1, 1))
print("is_power(10,1) returns:", is_power(10, 1))
print("is_power(3,3) returns:", is_power(3, 3))
