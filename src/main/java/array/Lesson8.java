package array;

import java.util.*;

public class Lesson8 {


    public static void main(String[] args) {
//        Random random= new Random();
        ArrayList<Integer> numbers= new ArrayList<Integer>();

       for (int i=0; i<10; i++){
           numbers.add((int)(Math.random()*20-10));
       }
        System.out.println(numbers);
        Set<Integer> unique= new HashSet<>(numbers);
        System.out.println(unique);
        TreeSet<Integer> sorted= new TreeSet<>(unique);
        System.out.println(sorted);

        ArrayList<String> names= new ArrayList<>();
        names.add("Nazrin");
        names.add("Cavid");
        names.add("Ulkar");
        names.add("Isi");
        names.add("Zeyno");

        }
}
