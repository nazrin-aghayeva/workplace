package warmup22;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList xl = new XLinkedList();
    xl.prepend(1); // 1
    xl.prepend(2); // 2, 1
    xl.prepend(3); // 3, 2, 1
    xl.append(10); // 3, 2, 1, 10
    xl.append(20); // 3, 2, 1, 10, 20
    xl.size();
    xl.reverse(2);
    xl.reverse(3);
    xl.reverse(4);
    xl.reverse(6);
    System.out.println(xl.represent());
    System.out.println(xl.represent());
    System.out.println(xl.represent2());
  }
}
