public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  return noDoubles ? die1==die2 ? die1%6+1 + die2 : die1+die2 : die1+die2;
}
