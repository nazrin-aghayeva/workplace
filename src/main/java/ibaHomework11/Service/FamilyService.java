package ibaHomework11.Service;


import ibaHomework11.DAO.CollectionFamilyDao;
import ibaHomework11.DAO.FamilyDao;
import ibaHomework11.Entity.Family;
import ibaHomework11.Entity.Human;
import ibaHomework11.Entity.Pet;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyService extends CollectionFamilyDao {

FamilyDao<Family> familyDao;
CollectionFamilyDao collectionFamilyDao;
Family family;

    public void getAllFamilies(){
        familyDao.getAll();
    }

    public void displayAllFamilies(){
        getFamilies().forEach(System.out::println);
    }

    public void getFamiliesBiggerThan(int specified){
        List<Family> filtered= getFamilies().stream().filter(f->Family.getChildren().size()>specified).collect(Collectors.toList());
    }

    public void getFamiliesLessThan(int specified){
        List<Family> filtered= getFamilies().stream().filter(f->Family.getChildren().size()<specified).collect(Collectors.toList());

    }

    public long countFamiliesWithMemberNumber(long given) {
        return getFamilies().stream().filter(f->Family.getChildren().size()==given).count();
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


