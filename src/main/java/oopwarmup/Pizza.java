package oopwarmup;

public class Pizza {
    String name;
    int size;
    int price;
    static int counter=0;

    public Pizza(int price, String name, int size) {
        this.price = price;
        this.name=name;
        this.size=size;
        counter++;
    }

}
