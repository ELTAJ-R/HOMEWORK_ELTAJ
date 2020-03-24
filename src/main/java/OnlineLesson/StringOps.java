package OnlineLesson;

/**
 * http://www.asciitable.com/index/asciifull.gif
 * https://cdn.cs50.net/2016/x/psets/0/pset0/bulbs.html
 * http://sticksandstones.kstrom.com/appen.html
 */
public class StringOps {
  // a-zA-Z ONLY
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  String invertCaseV1(String origin) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (c >= 'a') sb.append((char)(c-32));
      else sb.append((char)(c+32));
    }
    return sb.toString();
  }

  String invertCaseV2(String origin) {
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      char c = origin.charAt(i);
      if (c >= 'a') chars[i] = (char)(c - 32);
               else chars[i] = (char)(c + 32);
    }
    return new String(chars);
  }

  String invertCaseV3(String origin) {
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      char c = origin.charAt(i);
      chars[i] = (c >= 'a') ? (char)(c - 32) : (char)(c + 32);
    }
    return new String(chars);
  }

  String invertCaseV4(String origin) {
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (char) (chars[i] ^ 32); // bit XOR operation
    }
    return new String(chars);
  }

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC
  String toUpperCase(String origin) { // a -> A A -> A
    StringBuilder sb = new StringBuilder();
    for (int i=0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (c >= 'a') sb.append((char)(c-32));
      else sb.append(c);
    }
    return sb.toString();
  }

  String toUpperCaseV2(String origin) { // a -> A A -> A
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (char) (chars[i]&(-33)); // bit XOR operation
    }
    return new String(chars);
  }

  // abc -> abc
  // aBc -> abc
  // Abc -> abc
  String toLowerCase(String origin) { // A -> a a -> a
    StringBuilder sb = new StringBuilder();
    for (int i=0; i < origin.length(); i++) {
      char c = origin.charAt(i);
      if (c >= 'a') sb.append(c);
      else sb.append((char)(c+32));
    }
    return sb.toString();
  }

  String toLowerCaseV2(String origin) { // A -> a a -> a
    char[] chars = origin.toCharArray();
    for (int i=0; i < chars.length; i++) {
      chars[i] = (char) (chars[i] | 32);
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    System.out.println(new StringOps().toUpperCaseV2("HeLlO"));
    int k = 33;
    int j = k ^ 10 ^ 10; // 33
  }

}
