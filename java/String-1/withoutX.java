public String withoutX(String str) {
  return str.length() == 0 ? "" : str.charAt(0) == 'x' ? str.charAt(str.length() -1) == 'x' ? str.equals("x") ? "" : str.substring(1, str.length() -1) : str.substring (1) : str.charAt(str.length() -1) == 'x' ? str.substring(0, str.length() -1) : str;
}
