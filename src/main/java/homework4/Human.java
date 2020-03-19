package homework4;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;
    String [][] schedule= new String[7][2];
    Pet pet;
    Random random=new Random();

    public void greetPet(){
        System.out.println("Hello, " + this.pet.nickname);
    }
    public void describePet(){
        if (this.pet.trickLevel>50){
            String sly="very sly";
            System.out.println("I have" +pet.species + ",he is "+ pet.age + "years old"+ " "+ ",he is "+" "+ sly);
        }
        else {
            String sly = "not almost sly";
            System.out.println("I have" + " "+pet.species + " "+ ",he is "+ pet.age + " "+"years old "+ ",he is " + sly);
        }

    }
    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.mother= mother;
        this.father=father;
        this.pet=pet;
    }
    public Human(String name, String surname, int year, Human mother, Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother= mother;
        this.father=father;
    }
    public Human(){}

    public Human(String name, String surname, int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public String toString(){
//        String display;
         return  "Human"+"{"+"name=" + "'" + name +"' ," + "surname="+ "'" + surname +"' ," + "year=" +year+" "+ ",iq=" + iq +" " + ",mother=" + this.mother.name+ " " + this.mother.surname + " " +",father= "+ this.father.name + " "+ this.father.surname+ " "+ "pet="+
         pet.species+"{" + "nickname=" + pet.nickname+ ", " + "age=" + pet.age + ", " +"trickLevel=" + pet.trickLevel +", " + "habitats=" + Arrays.toString(pet.habitats) + "}";
//        System.out.println(display.toString());
    }
    //advanced part
    public boolean feedPet(boolean isTimeToFeed){
        if (isTimeToFeed||random.nextInt()<this.pet.trickLevel){
            System.out.println("Hmm, i will feed "+this.pet.nickname+" ");
            return true;
        }
        else {
            System.out.println("I think "+ this.pet.nickname+" is not hungry");
            return false;
        }
    }
}
//Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}`