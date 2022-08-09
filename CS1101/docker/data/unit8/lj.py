# read input file
from distutils.spawn import spawn


def read_dicFile(file):
  dic = {}
  try:
    delimiter = ['"', "[", "]",",",":"] # Unnecessary words set in the input file
    fin = open(file,"r")
    next(fin) # Skip input file line 1
    for line in fin:
      l = line
      # Delete unnecessary words
      for d in delimiter:
        l = l.replace(d,"")
      l = l.split()
      key = l[0]
      value = l[1:]
      if value != []:
        dic[key] = value
  except:
    print("File does not exist.")
  finally:
    fin.close()
    return dic

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

def write_dicFile(dic,dicName,file):
  try:
    fout = open(file,"w")
    fout.write(f"{dicName} = ")
    fout.write("{\n")
    for k,v in dic.items():
      fout.write(f"{k} : {v},\n")
    fout.write("}")
  except:
    print("No numeric values can be written to the file. Please format it.")
  finally:
    fout.close()

dic = read_dicFile("lj_input.txt")
inv_dic = invert_dict(dic)
write_dicFile(inv_dic,"Invert dictionary","lj_output.txt")