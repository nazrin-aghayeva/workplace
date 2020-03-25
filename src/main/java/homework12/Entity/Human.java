package homework12.Entity;

import homework5.Family;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Human extends Family {
    private String name;
    private String surname;
    private long birthDate ;
    private LocalDate birthTime;

    private int iq;

    public Family getFamily() {
        return family;
    }

    private Family family;
    Random random=new Random();



    public Human(String name, String surname,  int iq,long birthDate) {
        this.name = name;
        this.surname = surname;
        this.iq=iq;
        this.birthDate=System.currentTimeMillis();
    }

    public Human(String name, String surname, int year, int month, int day, int iq)  {
        this.name = name;
        this.surname = surname;
        this.iq=iq;
        String sb= day +"/"+month+"/"+year;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = dateFormat.parse(sb);
            birthDate=date.getTime();
            System.out.println(date);
        }
        catch (ParseException pe){
            pe.printStackTrace();
        }

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

    public Date describeAge(){
        long millis=System.currentTimeMillis();
        long diff= millis-birthDate;
        return new java.sql.Date(diff);
    }

    public String prettyFormat(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "{"+"name=" + "'" + name +"' ," + "surname="+ "'" + surname +"' ," + "birth date=" +dateFormat.format(this.birthDate)+" "+ ",iq=" + iq;
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}