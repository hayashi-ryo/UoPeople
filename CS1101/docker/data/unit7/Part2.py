alphabet = "abcdefghijklmnopqrstuvwxyz"   
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

def histogram(s):
  d = dict()
  for c in s:
    if c not in d:
      d[c] = 1
    else:
      d[c] += 1
  return d

def missing_letters(s):
  result = ""
  d = histogram(s)
  #　Checks if the characters in the global variable alphabet are included in the key
  for c in alphabet:
    # If not included, set to result
    if c not in d.keys():
      result += c
  return result

for str in test_miss:
  out = missing_letters(str)
  # If the output is "", it indicates that all characters were included.
  if (out == ""):
    print(str, "uses all the letters ")
  else:
    print(str,"is missing letters",out)
