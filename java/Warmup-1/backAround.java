public String backAround(String str) {
  return str.length() == 0 ? str : str.charAt(str.length() -1) + str + str.charAt(str.length() -1);
}
