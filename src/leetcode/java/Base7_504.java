package leetcode.java;

public class Base7_504 {
  public String convertToBase7(int num) {
    return num >= 0 ? Integer.toUnsignedString(num, 7) : "-" + Integer.toUnsignedString(-num, 7);
  }
}
