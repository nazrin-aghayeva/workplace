package interviewTask1;

public class ShipmentsApp {

  static int fix(int[] w) {
    throw new IllegalArgumentException("Implement it");
  }

  public static void main(String[] args) {
    int[] a1 = {1,1,1,1,6};
    int[] a2 = {1,1,1,1,16};
    int[] a3 = {1,1,1,1,15};
    int[] a4 = {10,20,2,3,15};
    System.out.println(fix(a1)); // 4
    System.out.println(fix(a2)); // 12
    System.out.println(fix(a3)); // -1
    System.out.println(fix(a4)); // 15
  }
}
