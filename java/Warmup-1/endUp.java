public String endUp(String str) {
  return str.length() < 4 ? str.toUpperCase() : str.substring(0, str.length() -3) + str.substring(str.length() -3).toUpperCase();
}
