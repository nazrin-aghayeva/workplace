package ibaHW6;

import homework5.Human;
import homework5.Pet;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    int count=0;
    int count2=0;
    Human[] child = new Human[5];

    public Family() {

    }

    public Human getMother() {
        return this.mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return this.father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return this.children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public void addChild(Human Child) {

        if (children != null) {
            count++;
            child[count] = Child;
            children = child;
        } else {
            child[0] = Child;
            children = child;
        }
    }
    public void deleteChild(int count1) {
        if (this.children != null) {
            for (int i = 0; i < this.children.length; i++) {
                if (this.children[i] == this.children[count1]) {
                    for (int j = i; j <count; j++) {
                        this.children[j] = this.children[j + 1];
                    }
                }
                count=count-1;
            }
        }

    }

    public int countFamily(){
        return 2+count;
    }
    @Override
    public String toString() {
        return "mother= " + mother + "\n"+
                "father= " + father + "\n"+
                "children= " + Arrays.toString(children)+"\n"+
                "pet= " + pet;
    }
}