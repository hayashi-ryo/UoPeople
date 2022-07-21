prefixes = "JKLMNOPQ"
suffix = 'ack'

for letter in prefixes:
  #　When prefix is O or Q, branch processing is performed to ensure correct spelling.
  if(letter in "OQ" ):
    print(letter + "u" + suffix)
  else:
    print(letter + suffix)