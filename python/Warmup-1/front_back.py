def front_back(str):
  return str[-1:]*(len(str)>1)+str[1:-1]+str[:1]*(len(str)>0)
