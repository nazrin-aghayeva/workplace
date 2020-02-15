package homework5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;


    public Human getMother(){
        return this.mother;
    }
    public void setMother(Human mother){
        this.mother=mother;
    }
    public Human getFather(){
        return this.father;
    }
    public void setFather(Human father){
        this.father= father;
    }
    public Human[] getChildren(){
        return this.children;
    }
    public void setChildren(Human[] children){
        this.children=children;
    }
    public Pet getPet(){
        return this.pet;
    }
    public void setPet(Pet pet){
        this.pet= pet;
    }
    public  Family(Human mother,Human father){
        this.mother= mother;
        this.father=father;
    }
    public  Family(Human mother,Human father, Human[] children,Pet pet){
        this.mother= mother;
        this.father=father;
        this.children= children;
        this.pet= pet;
    }
    public String toString(){
        return "mother= "+ mother.getName()+" " + mother.getSurname()+" "+ mother.getYear()+" "+ mother.getIq()+" "+
                "father= " + father.getName()+" " + father.getSurname()+" " + father.getYear()+" "+ father.getIq()+" "+
                "pet= " +pet.getSpecies()+" "+pet.getNickname()+" "+pet.getAge()+" "+ Arrays.toString(pet.getHabitats()) +" "+pet.getTrickLevel();// should add children's data
    }
}
