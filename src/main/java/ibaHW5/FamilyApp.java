package ibaHW5;

public class FamilyApp {
    public static void main(String[] args) {
        Human Jack= new Human("John","Baker",1969,98);
        Human Joody= new Human("Joody", "Baker", 1972,98);
        Human Kane= new Human("Kane","Baker",2002,76);
        Human Bryce= new Human("Bryce","Baker",2000,78);
        Human Kate= new Human("Kate","Baker",2000,78);
        Pet Jim= new Pet("dog","Jim",4,56,new String[]{"play", "swim"});

        Family family= new Family();
        family.setMother(Joody);
        family.setFather(Jack);
        family.addChild(Kane);
        family.addChild(Bryce);
        family.addChild(Kate);
        family.setPet(Jim);
        System.out.println(family.toString());
        family.deleteChild(2);
        System.out.println("This family have "+ family.countFamily()+" members");
        System.out.println("Data of family after deleting");
        System.out.println(family.toString());
    }
}
