package sqlLesson1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class MinFrequency {

    public static class Solution {

        public static void main(String[] args) throws IOException {
            List<Integer> arr = new Random()
                    .ints(10, 25)
                    .boxed().limit(50).collect(Collectors.toList());

            Map<Integer,Integer> count= new HashMap<Integer, Integer>();

            for (Integer i: arr){
                if (count.containsKey(i)){
                    count.put(i,count.get(i)+1);
                }
                else {
                    count.put(i,1);
                }
            }
            count.forEach((num,i)->{
                int min_value= Collections.min(arr);
                int max_value= Collections.max(count.keySet());
                if (num==min_value && i==max_value)
                    System.out.println(num);;
            });


        }
    }

}
