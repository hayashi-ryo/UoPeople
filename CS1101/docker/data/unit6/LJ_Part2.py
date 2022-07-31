# Nested list
a = [100 , 200 , 300]
b = [400 , 500 , 600]
lst = [a, b, 500]
print("Nested list:",lst)

# The “*” operator 
a = [100 , 200 , 300]
lst = a * 2
print("The “*” operator:",lst)

# List slices 
a = [100 , 200 , 300, 400, 500, 600]
lst = a[2:4]
print("List slices:",lst)

# The “+=” operator 
a = [100 , 200 , 300]
a += [400]
print("The “+=” operator:",a)

# A list filter 
# Prepare and execute a function to determine that the number is even as a filter.
def even(t):
  res = []
  for i in t:
    if i%2 == 0:
      res.append(t[i-1])
  return res
a = [1, 2, 3, 4, 5, 6]
print("A list filter:", even(a))

# A list operation that is legal but does the "wrong" thing, not what the programmer expects 
# The following are two examples of incorrect processing patterns for the operation of adding an element to the end of a list.
a = [1, 2, 3]
a.append([4])
print("wrong example1:",a)
# In this example, the listing in [4] has been added, and a nested list has been generated.

a = [1, 2, 3]
a = a.append(4)
print("wrong example2:",a)
# Because append() returns a None object, the reference to a is None, which is not what is expected.
