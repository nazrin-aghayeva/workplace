//package stepProject4;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class MinSwap {
//
//public static class Solution {
//
//    // Complete the minimumSwaps function below.
//    // 7, 1, 3, 2, 4, 5, 6
//    static int minimumSwaps(int[] arr) {
//        int l = 0;
//        int r = arr.length - 1;
//        for (int value : arr) {
//            while (l < r) {
//                int m = (l + r) / 2;
//                if (value > arr[m]) {
//
//                }
//                if (value < arr[m]) l = m + 1;
//                else r = m - 1;
//
//            }
//        }
//    }
//
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void main (String[]args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] arr = new int[n];
//
//            String[] arrItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arrItem = Integer.parseInt(arrItems[i]);
//                arr[i] = arrItem;
//            }
//
//            int res = minimumSwaps(arr);
//
//            bufferedWriter.write(String.valueOf(res));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();
//
//            scanner.close();
//        }
//
//}
//}
