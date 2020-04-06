package warmupCollections;

public class Collections {

//1
    public static void main(String[] args) {
        String greeting= "Hello worldd";

        long count = greeting.chars().filter(ch -> ch == 'H').count();
        long count1 = greeting.chars().filter(ch -> ch == 'e').count();
        long count2 = greeting.chars().filter(ch -> ch == 'l').count();
        long count3 = greeting.chars().filter(ch -> ch == 'o').count();
        long count4 = greeting.chars().filter(ch -> ch == 'w').count();
        long count5 = greeting.chars().filter(ch -> ch == 'r').count();
        long count6 = greeting.chars().filter(ch -> ch == 'd').count();

//        char c= greeting.chars().filter(ch -> ch=='H').forEach(greeting.indexOf());

        System.out.println(greeting.indexOf('d')+1);

        System.out.println("H :"+count);
        System.out.println("e :"+count1);
        System.out.println("l :"+count2);
        System.out.println("o :"+count3);
        System.out.println("w :"+count4);
        System.out.println("r :"+count5);
        System.out.println("d :"+count6);


    }
}
