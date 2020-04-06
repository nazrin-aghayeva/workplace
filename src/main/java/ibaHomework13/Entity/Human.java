package ibaHomework13.Entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Random;

public class Human extends Family {
    private String name;
    private String surname;
    private long birthDate ;
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
        this.birthDate=birthDate;
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
        Year year= Year.of(LocalDate.now().getYear());
        long value
                = year.getLong(ChronoField.YEAR_OF_ERA);
        return value-this.birthDate;
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
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + dateFormat.format(this.birthDate) +
                ", iq=" + iq +
                '}';
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}