package warmup20;

import java.util.Random;

public class SumArray {
    static int fibo (int data) {
        if (data==1 || data==2){
            return data;
        }
      return fibo(data-1)+fibo(data-2);
    }


    public static void main(String[] args) {
        int fibonacci = fibo(5);
        System.out.println(fibonacci);
    }
}
