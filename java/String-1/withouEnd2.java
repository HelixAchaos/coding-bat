public String withouEnd2(String str) {
  return str.length() < 3 ? "" : str.substring(1, str.length() -1);
}
