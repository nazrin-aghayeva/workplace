package homework8;


import java.util.ArrayList;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Set<Pet> pet;
    int count=0;
    ArrayList<Human> child = new ArrayList<>(5);

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

    public ArrayList<Human> getChildren() {
        return this.children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return this.pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public void addChild(Human Child) {

        if (children != null) {
            count++;
            child.set(count, Child);
            children = child;
        } else {
            child.set(0, Child);
            children = child;
        }
    }
    public void deleteChild(int count1) {
        if (this.children != null) {
            for (int i = 0; i < this.children.size(); i++) {
                if (this.children.get(i) == this.children.get(count1)) {
                    for (int j = i; j <count; j++) {
                        this.children.set(j, this.children.get(j + 1));
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
                "children= " + children+"\n"+
                "pet= " + pet;
    }
}