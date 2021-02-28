public String fizzString(String str) {
  return str.charAt(0) == 'f' ? str.charAt(str.length() -1) == 'b' ? "FizzBuzz" : "Fizz" : str.charAt(str.length() -1) == 'b' ? "Buzz" : str;
}
