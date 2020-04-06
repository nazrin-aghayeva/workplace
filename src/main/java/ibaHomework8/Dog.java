package ibaHomework8;

public class Dog extends Pet implements Foul {

    public void respond() {
        System.out.println("Hi my name"+ this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need cover it up");
    }
}
