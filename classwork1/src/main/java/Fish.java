public class Fish extends Animal{
    Fish(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Hello. I am fish,my name is:"+ this.name;
    }
}
