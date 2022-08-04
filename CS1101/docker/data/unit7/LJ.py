line =  {
  "Tokyo" : ["Yamanote-line", "Yokosuka-line", "Tokaido-line", "KehinTohoku-line", "Chuo-line"], 
  "Shinjuku" : ["Yamanote-line", "Chuo-line"],
  "Shinagawa" : ["Yamanote-line", "Yokosuka-line", "Tokaido-line"],
  "Ikebukuro" : ["Yamanote-line", "Saikyo-line", "KehinTohoku-line"]
  }

def invert_dict(d):
  inverse = dict()
  # Get element as a tuple
  for key, value in d.items():
    # Explore Value-list
    for v in value:
      if v not in inverse:
        inverse[v] = [key]
      else:
        inverse[v].append(key)
  return inverse

print("Original dictionary")
print(line)
print("Invert dictionary")
print(invert_dict(line))
