package ibaHW8;

import ibaHW5.Family;

import java.time.Instant;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private long birthDate = Instant.now().getEpochSecond();
    private int iq;
    private Family family;
    Random random=new Random();

    public Human(String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq=iq;
    }
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
    public long getYear(){
        return this.birthDate;
    }
    public void setYear(int year){
        this.birthDate= year;
    }
    public int getIq(){
        return this.iq;
    }
    public void setIq(int iq){
        this.iq= iq;
    }
    public String toString(){
        return "Human"+"{"+"name=" + "'" + name +"' ," + "surname="+ "'" + surname +"' ," + "birth date=" +birthDate+" "+ ",iq=" + iq;
    }
    public void greetPet(){
        System.out.println("Hello, " + family.getPet().getNickname());
    }
    public void describePet() {
        if (family.getPet().getTrickLevel() > 50) {
            String sly = "very sly";
            System.out.println("I have" + family.getPet().getSpecies() + ",he is " + family.getPet().getAge() + "years old" + " " + ",he is " + " " + sly);
        } else {
            String sly = "not almost sly";
            System.out.println("I have" + family.getPet().getSpecies() + ",he is " + family.getPet().getAge() + "years old" + " " + ",he is " + " " + sly);
        }
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
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