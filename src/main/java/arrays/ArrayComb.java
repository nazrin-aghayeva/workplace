package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayComb {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner in= new Scanner(System.in);
        int SIZE=in.nextInt();
        int [] odd= new int [SIZE];
        int [] even= new int [SIZE];
        int []common= new int[2*SIZE];
       ///////////
        for (int i=0; i<SIZE; i++){
            even[i]=(int)(Math.random()*100)*2;
            odd[i]=(int)(Math.random()*100)*2+1;
        }
        ///////////
        for (int i = 0; i < SIZE; i++ ) {
            common[i*2] = even[i];
            common[i*2+1] = odd[i];
        }
        System.out.printf("Evens: %s\n", Arrays.toString(even));
        System.out.printf("Odds: %s\n", Arrays.toString(odd));
        System.out.printf("Combined: %s\n", Arrays.toString(common));
    }
}
