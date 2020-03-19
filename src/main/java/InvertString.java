public class InvertString {
  // contains only [a-zA-Z]
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  // 1.

  // 2. NO if. NO tern op.
  String invert(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] ^ 0b100000);
    }
    return new String(chars);
  }
  String toUpper(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] | 0b000000);
    }
    return new String(chars);
  }
  String toLower(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] |  0b100000);
    }
    return new String(chars);
  }
}
