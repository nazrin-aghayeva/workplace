package oopwarmup;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza p1 =new Pizza(33, "Margarita", 9);
        Pizza p2= new Pizza (45, "Salami", 12);
        System.out.println(p1.name);
        System.out.println(Pizza.counter);
    }
}
