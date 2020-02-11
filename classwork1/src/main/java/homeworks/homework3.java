package homeworks;

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
                String day = in.nextLine();
                switch (day) {
                    case "Sunday":
                    case "SUNDAY":
                    case "Sunday ":
                    case "SUNDAY ":
                        System.out.println(scedule[0][1]);
                        break;
                    case "Monday":
                    case "MONDAY":
                    case "Monday ":
                    case "MONDAY ":
                        System.out.println(scedule[1][1]);
                        break;
                    case "Tuesday":
                    case "TUESDAY":
                    case "Tuesday ":
                    case "TUESDAY ":
                        System.out.println(scedule[2][1]);
                        break;
                    case "Wednesday":
                    case "WEDNESDAY":
                    case "Wednesday ":
                    case "WEDNESDAY ":
                        System.out.println(scedule[3][1]);
                        break;
                    case "Thursday":
                    case "THURSDAY":
                    case "Thursday ":
                    case "THURSDAY ":
                        System.out.println(scedule[4][1]);
                        break;
                    case "Friday":
                    case "FRIDAY":
                    case "Friday ":
                    case "FRIDAY ":
                        System.out.println(scedule[5][1]);
                        break;
                    case "Saturday":
                    case "SATURDAY":
                    case "SATURDAY ":
                    case "Saturday ":
                        System.out.println(scedule[6][1]);
                        break;
                    case "change Monday":
                        System.out.println(" Please input new tasks for Monday: ");
                        Scanner inn= new Scanner(System.in);
                        String task = inn.nextLine();
                        scedule[1][1]= task;
                        break;
                    case "exit":
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }
        }
    }
}
