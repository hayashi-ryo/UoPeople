def is_divisible(x, y):
    if x % y == 0:
        return True
    else:
        return False


def is_power(a, b):
    # Stores the result of calling is_divisible in a variable
    div = is_divisible(a, b)

    # If b is 1, the condition of power is satisfied if and only if 1 Failure to grant this condition will result in a permanent loop.
    if (b == 1 and a != 1):
        return False

    # If a and b are equal, the condition of power is satisfied
    elif (a == b):
        return True

    # The result of calling is_divisible is True, so recursively call is_power
    elif (div == True):
        return is_power(a/b, b)

    # The result of calling is_divisible is False, so False is returned
    else:
        return False


#　output area
print("is_power(10, 2) returns: ", is_power(10, 2))
print("is_power(27, 3) returns: ", is_power(27, 3))
print("is_power(1, 1) returns: ", is_power(1, 1))
print("is_power(10, 1) returns: ", is_power(10, 1))
print("is_power(3, 3) returns: ", is_power(3, 3))
