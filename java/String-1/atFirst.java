public String atFirst(String str) {
  return str.length() == 0 ? "@@" : str.length() == 1 ? str+"@" : str.substring(0,2);
}
