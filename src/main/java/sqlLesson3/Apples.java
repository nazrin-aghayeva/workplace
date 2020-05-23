package sqlLesson3;

import java.util.*;


class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        long positive= Arrays.stream(arr).filter(i -> i > 0).count();
        long negative= Arrays.stream(arr).filter(i -> i <0).count();
        long zero= Arrays.stream(arr).filter(i -> i ==0).count();
        double pr= (double) positive/arr.length;
        double nr= (double) negative/arr.length;
        double zr= (double) zero/arr.length;

        System.out.println(String.format("%.6f", pr));
        System.out.println(String.format("%.6f", nr));
        System.out.println(String.format("%.6f", zr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4, 3 ,-9 ,0 ,4 ,1};
        plusMinus(arr);
    }
}
