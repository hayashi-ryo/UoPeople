test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 

def histogram(s):
  d = dict()
  for c in s:
    if c not in d:
      d[c] = 1
    else:
      d[c] += 1
  return d

def has_duplicates(s):
  d = histogram(s)
  # Duplicates exist if the number of elements in the dictionary is less than the length of the string
  if (len(d)==len(s)):
    return False
  elif(len(d)<len(s)):
    return True

for str in test_dups:
  out = has_duplicates(str)
  if (out is True):
    print(str, "has duplicates")  
  else:
    print(str,"has no duplicates")
