package ibaHW11.Entity;

import ibaHW11.Controller.FamilyController;
import ibaHW11.DAO.CollectionFamilyDao;

import java.util.Optional;

public class FamilyApp {
    private static CollectionFamilyDao collectionFamilyDao;
    public static void main(String[] args) {
         collectionFamilyDao= new CollectionFamilyDao();
        FamilyController familyController=new FamilyController();

        Human Kane= new Human("Kane","Baker", 1973, 100);
        Human Piter=  new Human("Pitter", "Baker",1970,100);
        Human Kylie=  new Human("Kylie", "Adley",1983,100);
        Human Jonatan=  new Human("Jonatan", "Adley",1980,100);

        familyController.createNewFamily(Kane,Piter);;
        System.out.println(familyController.bornChild(getFamilyById(0),"male"));
        familyController.createNewFamily(Kylie,Jonatan);;
        familyController.displayAllFamilies();
        System.out.println(familyController.count());
        familyController.addPet(0, new Pet("Barsik",5,75, new String[]{"eat","sleep"}));
        System.out.println(familyController.bornChild(getFamilyById(1), "female"));
        familyController.displayAllFamilies();
        familyController.createNewFamily(Kylie,Jonatan);
        familyController.displayAllFamilies();
        System.out.println(familyController.count());
        }
    private static Family getFamilyById (int id){
        Optional<Family> family = collectionFamilyDao.get(id);
        return family.orElseGet(
                Family::new
        );
    }
}
