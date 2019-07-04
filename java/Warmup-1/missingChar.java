public String missingChar(String str, int n) {
  return n == 0 ? str.substring(1) : n == str.length() -1 ? str.substring(0, str.length() -1) : str.substring(0, n) + str.substring(n +1);
}
