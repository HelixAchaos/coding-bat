public String deFront(String str) {    
  return str.length() == 0 ? str : str.charAt(0) == 'a' ? str.charAt(1) == 'b' ? str : str.substring(0,1) + str.substring(2) : str.charAt(1) == 'b' ? str.substring(1) : str.substring(2);
}
