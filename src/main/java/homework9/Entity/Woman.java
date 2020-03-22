package homework9.Entity;

import homework7.Human;

public class Woman extends Human {

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }
    @Override
    public void greetPet(){
        System.out.println("Hello, my pet,"+"my name is:"+this.getName());
    }
    public void makeUp(){
        System.out.println("I don't use makeup");
    }
}
