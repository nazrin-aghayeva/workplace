package homework7;

import com.sun.org.apache.bcel.internal.classfile.Unknown;

import java.util.Arrays;
import java.util.Objects;

abstract class Pet {
    public enum Species{
        DOG,
        DOMESTICCAT,
        ROBOCAT,
        FISH,
        UNKNOWN
    }
    public void EnumTest(Species species) {
        this.species = species;
    }

    public void tellItLikeItIs() {

        switch (species) {
            case DOG:
               Dog dog= new Dog();
                break;

            case ROBOCAT:
                RoboCat roboCat= new RoboCat();
                break;

            case FISH:
                Fish fish= new Fish();
                break;
            case DOMESTICCAT:
                DomesticCat domesticCat= new DomesticCat();
                break;

            default:
            case UNKNOWN:
                break;
        }
    }
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel= (int)(Math.random()*(100+1));
    private String[] habitats;

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

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habitats){
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

    public String[] getHabitats() {
        return habitats;
    }
    public void setHabitats(String[] habitats) {
        this.habitats = habitats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() &&
                getTrickLevel() == pet.getTrickLevel() &&
                Objects.equals(getSpecies(), pet.getSpecies()) &&
                Objects.equals(getNickname(), pet.getNickname()) &&
                Arrays.equals(getHabitats(), pet.getHabitats());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabitats());
        return result;
    }

    public String toString(){
//        String display;
        return species+"{" + "nickname=" + nickname+ ", " + "age=" + age + ", " +"trickLevel=" + trickLevel +", " + "habitats=" + Arrays.toString(habitats) + "}";
//        System.out.println(display.toString());
//        return display;
    }
}

