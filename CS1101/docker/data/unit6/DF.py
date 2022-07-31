a = [1,2,3]
b = [1,2,3]

print("a == b:", a == b)
print("a is b:",a is b)

print("#####")

c = [100, 200, 300]
d = c
print("d:",d)
print("c[1] = 300")
c[1] = 300
print("d:",d)

def FIFO(lst, a):
    lst.append(a)
    lst.pop(0)

e = ["basketball", "baseball", "soccer"]
print(e)
FIFO(e, "tennis")
print(e)