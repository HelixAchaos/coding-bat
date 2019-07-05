public int max1020(int a, int b) {
  return a > 9 && a < 21 ? b > 9 && b < 21 ? Math.max(a,b) : a : b > 9 && b < 21 ? b : 0;
}
