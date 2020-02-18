public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Hello. I am dog,my name is:"+this.name;
    }
}
