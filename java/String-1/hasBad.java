public boolean hasBad(String str) {
  return str.length() < 3 ? false : str.substring(0,3).equals("bad") ? true : str.length() < 4 ? false : str.substring(1,4).equals("bad");
}
