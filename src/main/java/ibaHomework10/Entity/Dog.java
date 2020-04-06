package ibaHomework10.Entity;

public class Dog extends Pet implements Foul {

    public Dog(String nickname, int age, int trickLevel, String[] habitats) {
        super(nickname, age, trickLevel, habitats);
    }

    public void respond() {
        System.out.println("Hi my name");
    }

    @Override
    public void foul() {
        System.out.println("I need cover it up");
    }
}
