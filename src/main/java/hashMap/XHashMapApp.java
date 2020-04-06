package hashMap;

public class XHashMapApp {
  public static void main(String[] args) {
    XHashMap map = new XHashMap(128);
    map.put(10, "Jim");
    map.put(138, "Alex");
    map.put(150, "Jeremy");
    map.put(215, "Jackson");

    String s1 = map.get(10);// "Jim"
    String s2 = map.get(150); // "Jeremy"
    String s3 = map.get(215); // "Jackson"
//    String s4 = map.get(216); // handled by k[]
    String s5 = map.get(138);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s5);
  }
}
