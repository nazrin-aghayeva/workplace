package ibaHW4;

import java.util.Arrays;

public class Pet {


    String species;
    String nickname;
    int age;
    int trickLevel= (int)(Math.random()*(100+1));
    String[] habitats;
    public Pet() {

    }

    public void eat(){
        System.out.println("I am eating");
    }

    public  void respond(){
        System.out.println("Hello owner. I am " +nickname + ".I miss you!");
    }

    public void foul(){
        System.out.println("I need cover it up");
    }

    Pet(String species, String nickname, int age, int trickLevel, String[] habitats){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habitats=habitats;
    }
    Pet(String species, String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public String toString(){
//        String display;
        return species+"{" + "nickname=" + nickname+ ", " + "age=" + age + ", " +"trickLevel=" + trickLevel +", " + "habitats=" + Arrays.toString(habitats) + "}";
//        System.out.println(display.toString());
//        return display;
    }
}

