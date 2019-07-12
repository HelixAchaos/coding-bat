public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday) speed -= 5;
  return speed <= 60 ? 0 : speed <= 80 ? 1 : 2;
}
