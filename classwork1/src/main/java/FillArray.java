import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        System.out.println("Please enter width: ");
        Scanner in= new Scanner(System.in);
        int WIDTH= in.nextInt();
        System.out.println("Please enter height: ");
        Scanner in1= new Scanner(System.in);
        int HEIGHT= in1.nextInt();
        String [][] arr= new String[WIDTH][HEIGHT];
        for (int row=0; row<WIDTH; row++){
            for (int col=0;col<HEIGHT;col++){
                if (row==0 || row==WIDTH-1 || col==0 || col==HEIGHT-1){
                   arr[col][row]="1";
                }
                else {
                    arr[col][row]="2";
                }
            }

        }
        for (int row=0; row<WIDTH; row++){
            for (int col=0;col<HEIGHT;col++){
                System.out.print(arr[col][row]);
            }
            System.out.println();
        }

    }
}
