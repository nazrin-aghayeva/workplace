package stepProject3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class KaprekarNumbers {

    public static class Solution {

        // Complete the kaprekarNumbers function below.
        static void kaprekarNumbers(int p, int q) {
            List<Integer> result= new ArrayList<>();

            for (int i=0; i<p;i++){
                int square= p*p;
                int len= (int) (Math.floor(Math.log10(Math.abs(square)))+1);
                int r= (int) (square/Math.pow(10,len/2));
                int l= (int) (square-r*Math.pow(10,len/2));
                if (r+l==p){
                    result.add(p);
                }
            }
            System.out.println(result);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int p = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            kaprekarNumbers(p, q);

            scanner.close();
        }
    }

}
