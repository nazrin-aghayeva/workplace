import javafx.geometry.Pos;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftArray {
    public static void main(String[] args) {
        //////////
//        System.out.println("Please enter size: ");
//        Scanner in= new Scanner(System.in);
//        int SIZE= in.nextInt();
        int [] PosNegArray={-3,1,2,-11,10,12,7};

        int temp=0;
        ////////
//        for (int i=0;i<SIZE;i++){
//            PosNegArray[i]=(int)(Math.random()*200-100);
//        }
        for (int i=0; i<PosNegArray.length-1;++i) {
            for (int j=0;j<PosNegArray.length-i-1;++j){
                if(PosNegArray[j]>0){
                    if(PosNegArray[j+1]>0){
                        temp=PosNegArray[j];
                        PosNegArray[j]= PosNegArray[j+1];
                        PosNegArray[j+1]=temp;
                    }
                    else{

                    }
                }
            }
        }
        ////
        System.out.printf("You array: %s\n", Arrays.toString(PosNegArray));
//        for (int i=0; i<SIZE; i++){
//            PosNegArray[i]=(int)(Math.random()*200-100);
//            if(PosNegArray[i]>0){
//                if (PosNegArray[i+1]>0) {
//                    PosNegArray[i + 1] = temp;
//                    PosNegArray[i] = PosNegArray[i + 1];
//                    PosNegArray[i] = temp;
//                }
//                    else{
//                        PosNegArray[i+1]=PosNegArray[i+1+1];
//                    }
//                }
//            }
//        }

    }
}
