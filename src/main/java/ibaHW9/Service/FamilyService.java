package ibaHW9.Service;


import ibaHW9.Entity.Pet;
import ibaHW9.Entity.Family;
import ibaHW9.DAO.CollectionFamilyDao;
import ibaHW9.DAO.FamilyDao;
import ibaHW9.Entity.Human;

import java.util.List;

public class FamilyService extends CollectionFamilyDao{

FamilyDao<Family> familyDao;
CollectionFamilyDao collectionFamilyDao;
Family family;

    public void getAllFamilies(){
        familyDao.getAll();
    }

    public void displayAllFamilies(){
        System.out.println(getFamilies());
    }

    public void getFamiliesBiggerThan(int specified){
        for (int i=0; i<familyDao.getAll().size();i++){
            if (Family.countFamily(familyDao.getAll().get(i))> specified)
                System.out.println(familyDao.getAll().get(i));
        }
    }

    public void getFamiliesLessThan(int specified){
        for (int i=0; i<familyDao.getAll().size();i++){
            if (Family.countFamily(familyDao.getAll().get(i))< specified)
                System.out.println(familyDao.getAll().get(i));
        }
    }

    public int countFamiliesWithMemberNumber(int given) {
        int counter = 0;
        for (int i = 0; i < familyDao.getAll().size(); i++) {
            if (Family.countFamily(familyDao.getAll().get(i)) == given) {
                counter++;
            }
        }
        return counter;
    }

    public void createNewFamily(Human mother, Human father){
       getFamilies().add(new Family(mother,father));
    }

    public void deleteFamilyByIndex(int i){
        getFamilies().remove(i);
    }

    public Family bornChild(Family family, String gender){
        if (gender.equals("male")){
            family.addChild(new Human("Bryce", "Baker",2020, 56));
        }
        else if (gender.equals("female")){
            family.addChild(new Human("Kate", "Baker",2020, 56));
        }
        return family;
    }
    public Family adoptChild(Family family, Human human){
        family.addChild(human);
        return family;
    }

    public void deleteAllChildrenOlderThen(int required){
        for (int i=0; i< collectionFamilyDao.getYearOfChildren().size();i++){
            if(collectionFamilyDao.getYearOfChildren().get(i)<required) {
                family.deleteChild(i);
            }
        }
    }

    public int count(){
        return getFamilies().size();
    }

    public List<Pet> getPets(int id){
        return collectionFamilyDao.getByFamilyId(id).getPet();
    }

    public void addPet(int id, Pet pet){
       getFamilies().get(id).getPet().add(pet);
    }

}


