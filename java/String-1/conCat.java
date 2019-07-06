public String conCat(String a, String b) {
  return a.length() == 0 ? b : b.length() == 0 ? a : a.charAt(a.length() -1) == b.charAt(0) ? a+b.substring(1) : a+b;
}
