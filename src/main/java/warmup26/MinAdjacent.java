package warmup26;

import java.util.Arrays;
import java.util.Random;

public class MinAdjacent {
    public static void main(String[] args) {
        int sum;
        int min=0;
        int[] data = new Random().ints(10, 50).limit(30).toArray();
        for(int i=0; i<data.length-2;i++){
            sum=data[i]+data[i+1];
            if (data[i+1]+data[i+2]>sum)
                 min=sum;
        }
        System.out.println(Arrays.toString(data));
        System.out.println(min);
    }
}
// 3,11,5,1,7,10