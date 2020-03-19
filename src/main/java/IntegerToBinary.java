import java.util.Scanner;

public class IntegerToBinary {
  public static void main(String[] args) {
    int value = new Scanner(System.in).nextInt(); // 12
    // your code should be written here
    StringBuilder binary = new StringBuilder();
    while (value>0){
      int remain= value%2;
      binary.append(remain);
      value /=2;
    }
    System.out.println(binary.reverse()); // 00001100
  }
}
