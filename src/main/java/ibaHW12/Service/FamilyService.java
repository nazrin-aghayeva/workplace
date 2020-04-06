package ibaHW12.Service;


import ibaHW12.DAO.CollectionFamilyDao;
import ibaHW12.DAO.FamilyDao;
import ibaHW12.Entity.Family;
import ibaHW12.Entity.Human;
import ibaHW12.Entity.Pet;

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
        return getFamilies().stream().filter(f-> f.getChildren().size()+2>specified).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int specified){
       return getFamilies().stream().filter(f-> (f.getChildren().size()+2<specified)).collect(Collectors.toList()) ;
    }

    public long countFamiliesWithMemberNumber(long given) {
        return getFamilies().stream().filter(f-> f.getChildren().size()+2==given).count();
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
    public Family adoptChild(Family family, Human human){
        int i= getFamilies().indexOf(family);
        getFamilies().get(i).getChildren().add(human);
        return family;
    }

    public void deleteAllChildrenOlderThen(int required){
        try {
            for (int j = 0; j < getAll().size(); j++) {
                if (getAll().get(j).getChildren().get(j).getYear() > required) {
                    getAll().get(j).getChildren().remove(j);
                }
            }
        }
        catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
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


