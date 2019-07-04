public String startOz(String str) {
  return str.length() == 0 ? str : str.length() == 1 ? str.equals("o") ? str : "" : str.charAt(0) == 'o' ? str.charAt(1) == 'z' ? "oz": "o" : str.charAt(1) == 'z' ? "z" : "";
}
