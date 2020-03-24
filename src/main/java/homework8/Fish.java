package homework8;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.println("Hi my name is"+ getNickname());
    }
}
