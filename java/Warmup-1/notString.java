public String notString(String str) {
  return str.length() < 3 ? "not "+str : str.substring(0,3).equals("not") ? str : "not " + str;
}
