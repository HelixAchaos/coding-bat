public String withoutX2(String str) {
  if (str.length() < 1) return "";
  else if (str.length() < 2)
  {
    if (str.charAt(0) == 'x') return "";
    else return str;
  }
  else
  {
    if (str.charAt(1) == 'x') str = str.substring(0, 1) + str.substring(2);
    if (str.charAt(0) == 'x') str = str.substring(1);
    return str;
  }
}
