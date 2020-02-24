package Arrays;

public class Array {
    public static void main(String[] args) {

        for(int i=0; i<30; i++){
           if (i%2==0){
               System.out.println("Fizz");
           } else if (i % 3 == 0) {
               System.out.println("Buzz");
           }
           if(i%2==0 && i%3==0){
               System.out.println("Fizz-Buzz");
           }
        }

    }
}
