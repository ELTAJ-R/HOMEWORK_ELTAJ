package OnlineLesson;

public class IntToBin {
  public static void main(String[] args) {
    int value = 19;
    StringBuilder bin = new StringBuilder();
    for (int i = 7; i >= 0; i--) {
      int shifted_part = value >> i;
      int one_bit = shifted_part & 1;
      bin.append(one_bit);
    }
    System.out.println(bin.toString());
    // "00010011"
  }
}