package homework11.Entity;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, String[] habitats) {
        super(nickname, age, trickLevel, habitats);
    }

    @Override
    public void respond() {
        System.out.println("Hi my name is"+ getNickname());
    }
    // there is no need for foul method

}
