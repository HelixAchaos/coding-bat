def combo_string(a, b):
  b,a=(a,b)[::-(len(a)<len(b))|1]
  return a+b+a
