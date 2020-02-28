package homework8;

import java.util.HashSet;

public class Pet {
    public enum Species{
        DOG,
        CAT,
        BIRD,
        HAMSTER
    }
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel= (int)(Math.random()*(100+1));
    HashSet<String> habitats= new HashSet<>();

    public Pet() {

    }

    public void eat(){
        System.out.println("I am eating");
    }

    public    void respond(){
        System.out.println("Hello owner. I am " +nickname + ".I miss you!");
    }

    public void foul(){
        System.out.println("I need cover it up");
    }

    public Pet(Species species, String nickname, int age, int trickLevel, HashSet<String> habitats){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habitats=habitats;
    }

    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public int getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HashSet<String> getHabitats() {
        return habitats;
    }
    public void setHabitats( HashSet<String> habitats) {
        this.habitats = habitats;
    }


    public String toString(){
//      String display;
        return species+"{" + "nickname=" + nickname+ ", " + "age=" + age + ", " +"trickLevel=" + trickLevel +", " + "habitats=" + habitats + "}";
//        System.out.println(display.toString());
//        return display;
    }
}

