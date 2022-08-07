import os

# example1
import os
print("example1")
try:
  print(os.path.exists("example1.txt"))
  fin1 = open("example1.txt","r") # Error because file does not exist
  print(fin1.split())
  fin1.close()
except:
  print("File does not exist.")
  
# example2 
print("example2")
try:
  fout2 = open("example2.txt", "r") # Error due to incorrect way to open file
  fout2.write("test2")
  fout2.close()
except:
  print("File cannot be opened.")
  
# example3
print("example3")
test1 = "start"
test2 = 1200
try:
  fout3 = open("example3.txt", "w")
  fout3.write(test1)
  fout3.write(test2) # Error because int cannot be written directly
  fout3.close()
except TypeError as E:
  print("No numeric values can be written to the file. Please format it.")