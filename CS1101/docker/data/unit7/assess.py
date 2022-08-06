alphabet = "abcdefghijklmnopqrstuvwxyz"
test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"]
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"]

#histogram function
def histogram(s):
  d = dict()
  for c in s:
    if c not in d:
      d[c] = 1
    else:
      d[c] += 1
  return d

#Second part



def missing_letters(q): 
  hst = histogram(q)
  w = []
  for e in alphabet:
    if e not in hst:
      w.append(e)
  return ''.join(w)

for q in test_miss:
  miss_let = missing_letters(q)
  if len(miss_let):
    print(q,'letters missing:', miss_let)
  else:
    print(q,'No letters missing')