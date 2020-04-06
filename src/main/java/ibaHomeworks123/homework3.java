package ibaHomeworks123;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
//        String arr[][]= new String [7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "Go to the cinema";
        scedule[1][0] = "Monday";
        scedule[1][1] = "Watch new film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "Go to the swimming pool";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "Do yoga";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "Try to prepare new, tasty meal";
        scedule[5][0] = "Friday";
        scedule[5][1] = "Read book";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "Plan your next week";
        for (int i=0; i<7; i++){
                System.out.println("Please, input the day of a week: ");
                Scanner in = new Scanner(System.in);
                String input = in.nextLine().trim().toLowerCase();
                switch (input) {
                    case "sunday":
                        System.out.println(scedule[0][1]);
                        break;
                    case "monday":
                        System.out.println(scedule[1][1]);
                        break;
                    case "tuesday":
                        System.out.println(scedule[2][1]);
                        break;
                    case "wednesday":
                        System.out.println(scedule[3][1]);
                        break;
                    case "thursday":
                        System.out.println(scedule[4][1]);
                        break;
                    case "friday":
                        System.out.println(scedule[5][1]);
                        break;
                    case "saturday":
                        System.out.println(scedule[6][1]);
                        break;

                    case "change Sunday":
                        System.out.println(" Please input new tasks for Sunday: ");
                        Scanner inn= new Scanner(System.in);
                        String task = inn.nextLine();
                        scedule[0][1]= task;
                        break;
                    case "change monday":
                        System.out.println(" Please input new tasks for Monday: ");
                        Scanner inn1= new Scanner(System.in);
                        String task1 = inn1.nextLine();
                        scedule[1][1]= task1;
                        break;
                    case "change tuesday":
                        System.out.println(" Please input new tasks for Tuesday: ");
                        Scanner inn2= new Scanner(System.in);
                        String task2 = inn2.nextLine();
                        scedule[2][1]= task2;
                        break;
                    case "change wednesday":
                        System.out.println(" Please input new tasks for Wednesday: ");
                        Scanner inn3= new Scanner(System.in);
                        String task3 = inn3.nextLine();
                        scedule[3][1]= task3;
                        break;
                    case "change thursday":
                        System.out.println(" Please input new tasks for Thursday: ");
                        Scanner inn4= new Scanner(System.in);
                        String task4 = inn4.nextLine();
                        scedule[4][1]= task4;
                        break;
                    case "change friday":
                        System.out.println(" Please input new tasks for Friday: ");
                        Scanner inn5= new Scanner(System.in);
                        String task5 = inn5.nextLine();
                        scedule[5][1]= task5;
                        break;
                    case "change saturday":
                        System.out.println(" Please input new tasks for Saturday: ");
                        Scanner inn6= new Scanner(System.in);
                        String task6 = inn6.nextLine();
                        scedule[6][1]= task6;
                        break;
                    case "exit":
                       return;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");

                }
        }
    }
}
