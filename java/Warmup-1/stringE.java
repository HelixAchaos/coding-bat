public boolean stringE(String str) {
  int count = 0;
  while (str.contains("e"))
  {
    str = str.substring(str.indexOf("e") +1);
    count +=1;
  }
  return count > 0 && < 4;
}
