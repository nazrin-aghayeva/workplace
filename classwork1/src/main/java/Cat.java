public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Hello. I am cat,my name is:"+this.name;
    }
}
