package homeworks;
import java.util.Random;
import java.util.Scanner;


public class homework1 {
            public static void main(String[] args) {
                int tempor=0;
                int random = (int) (Math.random() * (100 + 1));
                System.out.println("Please enter your name:");
                Scanner in = new Scanner(System.in);
                String name = in.nextLine();
                System.out.println("Let the game begin!");
                while (true) {
                    int[] arr = new int[100];
                    int[] numbers = new int[100];
                    int counter = 0;
                    boolean flag = false;
                    int j = 0;
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = random;
                        //to fill array with numbers which user has entered(advanced 2)
                        for (j = 0; j < numbers.length; j++) {
                            System.out.println("Please enter number: ");
                            Scanner num = new Scanner(System.in);
                            //check whether input is numeric
                            if (num.hasNextInt()) {
                                int number1 = num.nextInt();
                                counter++;
                                numbers[j] = number1;
                                //main conditions
                                if (number1 < arr[i]) {
                                    System.out.println("Your number is too small. Please, try again.");
                                } else if (number1 > arr[i]) {
                                    System.out.println("Your umber is too big. Please, try again.");
                                } else {
                                    System.out.println("Congratulations " + name + "\n");
                                    flag = true;
                                }
                                //advanced 1
                                    if(flag) {
                                        //for sorting from highest to lowest number
                                        for (i=0;i<counter-1;++i) {
                                            for (j = 0; j < counter - i - 1; ++j) {
                                                if (numbers[j] < numbers[j + 1]) {
                                                    tempor = numbers[j];
                                                    numbers[j] = numbers[j + 1];
                                                    numbers[j + 1] = tempor;
                                                }
                                            }
                                        }
                                        //for output
                                        for (j = 0; j < counter; j++) {
                                            System.out.print(numbers[j] + " ");
                                        }
                                        return;
                                    }
                            } else {
                                System.out.println("Your input isn't a number: ");
                            }
                        }
                    }
                }

            }
        }

