package ibaHW8;

import homework7.Human;

final public class Man extends Human {
    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }
    @Override
    public void greetPet(){
        System.out.println("Hello, my pet,"+"my name is:"+this.getName());
    }
    public void repairCar(){
        System.out.println("Repairing car is not my deal");
    }
}
