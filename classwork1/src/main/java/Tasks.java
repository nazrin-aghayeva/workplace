import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Hello what is name?");
        Scanner in = new Scanner(System.in);
        String name= in.next();
        System.out.println("Hello, "+ name);
        System.out.println("Nice to meet you,"+ name);
        System.out.println("Bye");
        System.out.println("How old are you?");
        Scanner inp = new Scanner(System.in);
        int age=inp.nextInt();
        if(age<18){
            System.out.println("Go to the cinema");
        }
        else{
            System.out.println("Go to the bar");
        }

    }
}
