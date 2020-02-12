package homeworks;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

while(true){
    int [] arr= new int [100];
    int[] numbers = new int[30];
    int counter=0;
    boolean flag=false;
    int random=(int)(Math.random()*(100+1));
    System.out.println("Please enter your name:");
    Scanner in = new Scanner(System.in);
    String name= in.nextLine();
    System.out.println("Let the game begin!");
    int j=0;
        for(int i=0; i< arr.length; i++) {
            arr[i] = random;
            for (j = 0; j < numbers.length; j++) {
                System.out.println("Please enter number: ");
                Scanner num = new Scanner(System.in);
                if (num.hasNextInt()) {
                    int number1 = num.nextInt();
                    counter++;
                    numbers[j] = number1;
                    if (number1 < arr[i]) {
                        System.out.println("Your number is too small. Please, try again.");
                    } else if (number1 > arr[i]) {
                        System.out.println("Your number is too big. Please, try again.");
                    } else {
                        System.out.println("Congratulations " + name + "\n");
                        flag = true;
                    }
                    if (flag) {
                        for (j = 0; j < counter; j++) {
                            System.out.print(numbers[j] + " ");
                        }
                        return;
                    }
                }
                else {
                    System.out.println("Your input isn't a number: ");
                }
                }
            }
        }
    }
}
