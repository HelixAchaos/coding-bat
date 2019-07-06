public String twoChar(String str, int index) {
  return index < 0 || index +2 > str.length() ? str.substring(0, 2) : str.substring(index, index +2);
}
