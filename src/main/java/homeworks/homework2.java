package homeworks;
import java.util.*;
public class homework2 {
    public static void main(String[] args) {
        System.out.println(" All set. Get ready to rumble!");
        String[][] square = new String[5][5];
        int i;
        int j;
        for ( i = 0; i < 5; i++) {
            for ( j = 0; j < 5; j++) {
                square[i][j] = "- | ";
            }
        }
        while(true) {
            System.out.println();
            for (i = 0; i < 5; i++) {
                for ( j = 0; j < 5; j++) {
                    System.out.print(square[i][j] + " ");
                }
                System.out.println(" ");
            }
           int row= (int)(Math.random()*(4+1));
            int col= (int)(Math.random()*(4+1));
            System.out.println("Please, enter a line for fire: ");
            Scanner in = new Scanner(System.in);
            int line = in.nextInt();
            System.out.println("Please, enter a shooting bar: ");
            Scanner in1 = new Scanner(System.in);
            int bar = in1.nextInt();
            if(line>0 && line<5 && bar>0 && bar<5){
                if(line!=row && bar!=col){
                    square[line][bar]="* | ";
                }
                else{
                    square[line][bar]="x|";
                    for (i = 0; i < 5; i++) {
                        for ( j = 0; j < 5; j++) {
                            System.out.print(square[i][j] + " ");
                        }
                        System.out.println(" ");

                    }
                    System.out.println(" You have won!");

                    break;  }
            }
            else{
                System.out.println("Please enter the number in [0 5) interval");
            }
        }

    }

}
