package BasicStuff;

import java.util.Scanner;

public class warmup2 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.print("Please enter width: ");
        final int width= in.nextInt();
        Scanner inp= new Scanner(System.in);
        System.out.println("Please enter height: ");
        final int height= inp.nextInt();
        double tan=((double) width)/height;
        StringBuilder envelope= new StringBuilder();

        for (int j = 1; j <= height; j++) {
          for(int i=1; i<=width;i++){
              if(j==1 || j==height || i==1|| i==width|| i==(int)(j*tan) || width-i==(int)(j*tan)){
                  envelope.append("*");
              }
              else {
                  envelope.append(" ");
              }
          }
            envelope.append("\n");
        }
        System.out.println(envelope);

    }

}


