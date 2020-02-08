import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Hello what is name?");
        Scanner in = new Scanner(System.in);
        String name= in.next();
        System.out.println("Hello, "+ name);
        System.out.println("Nice to meet you,"+ name);
        System.out.println("Bye");
    }
}
