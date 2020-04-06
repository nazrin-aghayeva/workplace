package ibaHomework7;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.println("Hi my name is"+ this.getNickname());
    }
    }
