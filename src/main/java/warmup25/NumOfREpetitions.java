package warmup25;

import java.util.*;

public class NumOfREpetitions {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        for (int i=0; i<50;i++){
            int rand= (int)(Math.random()*25);
            nums.add(rand);
        }
        Map<Integer,Integer> count= new HashMap<>();

        for (Integer i: nums){
            if (count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }
            else {
                count.put(i,1);
            }
        }
        count.forEach((num,i)->{
            if(i>1){
                System.out.println("repetitions:"+ i);
            }
        });
    }
}
