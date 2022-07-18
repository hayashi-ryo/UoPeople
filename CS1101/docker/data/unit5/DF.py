# 1

def any_lowercase1(s):
    for c in s:
        if c.islower():
            return True
        else:
            return False


# 2

def any_lowercase2(s):
    for c in s:
        if 'c'.islower():
            return 'True'
        else:
            return 'False'


# 3

def any_lowercase3(s):
    for c in s:
        flag = c.islower()
    return flag


# 4

def any_lowercase4(s):
    flag = False
    for c in s:
        flag = flag or c.islower()
    return flag


# 5

def any_lowercase5(s):
    for c in s:
        if not c.islower():
            return False
    return True


#print("any_lowercase1(StarT):", any_lowercase1("StarT"))
#print("any_lowercase1(sTART):", any_lowercase1("sTART"))
#print("any_lowercase2(StarT):", any_lowercase2("StarT"))
#print("any_lowercase2(sTART):", any_lowercase2("START"))
#print("any_lowercase3(sTART):", any_lowercase3("StarT"))
#print("any_lowercase3(Start):", any_lowercase3("Start"))
print("any_lowercase4(sTART):", any_lowercase4("sTART"))
print("any_lowercase4(start):", any_lowercase4("sTARt"))
print("any_lowercase4(START):", any_lowercase4("START"))
#print("any_lowercase5(start):", any_lowercase5("start"))
#print("any_lowercase5(Start):", any_lowercase5("Start"))
#print("any_lowercase5(sTART):", any_lowercase5("sTART"))
