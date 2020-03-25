package homework12.Service;


import homework12.DAO.CollectionFamilyDao;
import homework12.DAO.FamilyDao;
import homework12.Entity.Family;
import homework12.Entity.Human;
import homework12.Entity.Pet;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService extends CollectionFamilyDao {

    FamilyDao<Family> familyDao;
CollectionFamilyDao collectionFamilyDao;
Family family;
Human human;

    public void getAllFamilies(){
        familyDao.getAll();
    }

    public void displayAllFamilies(){
        getFamilies().forEach(f-> System.out.println(f.prettyFormat()));
    }

    public List<Family> getFamiliesBiggerThan(int specified){
        return getFamilies().stream().filter(f-> family.getChildren().size()+2>specified).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int specified){
       return getFamilies().stream().filter(f-> family.getChildren().size()+2<specified).collect(Collectors.toList()) ;
    }

    public long countFamiliesWithMemberNumber(long given) {
        return getFamilies().stream().filter(f-> family.getChildren().size()+2==given).count();
    }

    public void createNewFamily(Human mother, Human father){
       getFamilies().add(new Family(mother,father));
    }

    public void deleteFamilyByIndex(int i){
        getFamilies().remove(i);
    }

    public  Family bornChild(Family family, String male, String female){
        int id= getFamilies().indexOf(family);
        String name= (int) (Math.random()*2)==1 ? male :female;
        String gender= name.equals(male) ? "boy" : "girl";
        String surname= family.getFather().getSurname();
        int year= LocalDate.now().getYear();
        Human child= new Human(name,surname,year,20);
        getFamilies().get(id).getChildren().add(child);
        return family;
    }
    public Family adoptChild(int id, Human human){
        getFamilies().get(id).getChildren().add(human);
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


