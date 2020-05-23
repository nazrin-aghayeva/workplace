package stepProject2.lombok;

public class LombokApp {

  static void print(String value) {
    System.out.println(value);
  }

  private static String convert(int val) {
    return String.valueOf(val);
  }

  public static void main(String[] args) {
    Student1 s1 = new Student1(1, "Jim", 44);
    Student2 s2 = new Student2(2, "Jeremy", 41);
    Student4 s4 = new Student4(2, "Jeremy", 41);
    Student1 s3 = new Student1();
    System.out.println(s1);
    System.out.println(s2);
    s1.getId();
    s2.getId();
    s1.setId(51);
    s2.setId(52);
    s4.getId();

    // we need to write
    print(convert(5));
    // but by writing special plugin, we can write
    //print(5);

  }
}
