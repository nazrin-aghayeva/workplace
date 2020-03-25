package homework12.Entity;


import java.util.ArrayList;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private List<Pet> pet= new ArrayList<>();
    int count=0;
    private  List<Human> children = new ArrayList<>();

    public Family() {

    }
    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public  void setChildren(List<Human> children) {
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
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
        this.children.add(Child);
    }
    public void deleteChild(int id) {

      children.remove(id);
    }


    public String prettyFormat() {
        return "mother: " + mother.prettyFormat() + "\n"+
                "father: " + father.prettyFormat() + "\n"+
                "children: " + "\n"+
                        children.toString()+"\n"+
                "pet: " + pet.toString() + "\n"
                + "\n";
    }
public int countFamily (Family family) {
    int count=0;
    if(family.father != null) {
        count++;
    }
    if(family.mother != null) {
        count++;
    }
    if(children != null) {
        count += children.size();
    }
    return count;
}
}