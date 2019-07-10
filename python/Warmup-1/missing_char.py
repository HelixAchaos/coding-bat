def missing_char(str, n):
  if n == 0:
    return str[1:len(str)]
  elif n == len(str) -1:
    return str[0:n]
  else:
    return str[0:n] + str[n+1:len(str)]
