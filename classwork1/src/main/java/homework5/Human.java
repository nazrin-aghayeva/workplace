package homework5;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    String[][] schedule = new String[7][2];
    Random random=new Random();
    //constructor
    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq=iq;
    }
    //for private
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year= year;
    }
    public int getIq(){
        return this.iq;
    }
    public void setIq(int iq){
        this.iq= iq;
    }
    public String toString(){
        return "Human"+"{"+"name=" + "'" + name +"' ," + "surname="+ "'" + surname +"' ," + "year=" +year+" "+ ",iq=" + iq +" " + "schedule= " + Arrays.deepToString(schedule);
    }
    private void greetPet(){
        System.out.println("Hello, " + family.getPet().getNickname());
    }
    private void describePet() {
        if (family.getPet().getTrickLevel() > 50) {
            String sly = "very sly";
            System.out.println("I have" + family.getPet().getSpecies() + ",he is " + family.getPet().getAge() + "years old" + " " + ",he is " + " " + sly);
        } else {
            String sly = "not almost sly";
            System.out.println("I have" + family.getPet().getSpecies() + ",he is " + family.getPet().getAge() + "years old" + " " + ",he is " + " " + sly);
        }
    }
        public boolean feedPet(boolean isTimeToFeed){
        if (isTimeToFeed||random.nextInt()<family.getPet().getTrickLevel()){
            System.out.println("Hmm, i will feed "+family.getPet().getNickname()+" ");
            return true;
        }
        else {
            System.out.println("I think "+ family.getPet().getNickname()+" is not hungry");
            return false;
        }
    }

}
//
//
//    public String toString(){
////        String display;
//         return  "Human"+"{"+"name=" + "'" + name +"' ," + "surname="+ "'" + surname +"' ," + "year=" +year+" "+ ",iq=" + iq +" " + ",mother=" + this.mother.name+ " " + this.mother.surname + " " +",father= "+ this.father.name + " "+ this.father.surname+ " "+ "pet="+
//         pet.species+"{" + "nickname=" + pet.nickname+ ", " + "age=" + pet.age + ", " +"trickLevel=" + pet.trickLevel +", " + "habitats=" + Arrays.toString(pet.habitats) + "}";
////        System.out.println(display.toString());
//    }
    //advanced part
//
//}
//Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}`