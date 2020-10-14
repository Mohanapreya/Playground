a=input()
k={"break","case","continue","default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"}
if a in k:
  print(a +" is a keyword")
else:
  print(a +" is not a keyword")