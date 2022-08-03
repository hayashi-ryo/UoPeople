"""
sport_tuple = (('b', 1), ('a', 2), ('s', 3), ('k', 4), ('e', 5), ('t', 6), ('b', 7), ('a', 8), ('l', 9), ('l', 10))
for s, index in sport_tuple:
  print(index, s)


sport_list = [['b', 1], ['a', 2], ['s', 3], ['k', 4], ['e', 5], ['t', 6], ['b', 7], ['a', 8], ['l', 9], ['l', 10]]
for i in sport_list:
  s = i[0]
  index = i[1]
  print(index, s)

sport = "basketball"
t = [1,2,3,4,5,6,7,8,9,10]
zip(sport,t)

for pair in zip(sport,t):
  print(pair)

sport = "basketball"
for index, s in enumerate(sport):
  print(index,s)
"""
sport_tuple = (('b', 1), ('a', 2), ('s', 3), ('k', 4), ('e', 5), ('t', 6), ('b', 7), ('a', 8), ('l', 9), ('l', 10))
d = dict(sport_tuple)
t = d.items()
for key, value in d.items():
  print(key, value)
