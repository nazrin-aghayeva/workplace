package stepProject1.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Encryption {

    public static class Solution {

        // Complete the encryption function below.
        static String encryption(String s) {
            StringBuilder encrypted= new StringBuilder();
            int l= s.length();
            int max=l+1;
            int min=l-1;
            for (int i=0; i<min;i++){
                for (int j=0; j<max;j++){
                    encrypted.append(i);
                }
                System.out.println("\n");
            }
            return encrypted.toString();
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scanner.nextLine();

            String result = encryption(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

}
