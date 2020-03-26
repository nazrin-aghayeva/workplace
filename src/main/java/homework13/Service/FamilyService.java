package homework13.Service;


import homework13.DAO.CollectionFamilyDao;
import homework13.DAO.FamilyDao;
import homework13.Database.Database;
import homework13.Entity.Family;
import homework13.Entity.Human;
import homework13.Entity.Pet;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FamilyService extends CollectionFamilyDao {

    FamilyDao<Family> familyDao;
    Database database= new Database();
    Family family;
    Human human;

    public void getAllFamilies1(){
        familyDao.getAll();
    }

    public void displayAllFamilies(){
        database.getAllFamilies().forEach(f-> System.out.println(f.prettyFormat()));
    }

    public List<Family> getFamiliesBiggerThan(int specified){
        return database.getFamilyList().stream().filter(f-> f.getChildren().size()+2>specified).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int specified){
       return database.getFamilyList().stream().filter(f-> f.getChildren().size()+2<specified).collect(Collectors.toList()) ;
    }

    public long countFamiliesWithMemberNumber(long given) {
        return database.getAllFamilies().stream().filter(f-> f.getChildren().size()+2==given).count();
    }

    public void createNewFamily(Human mother, Human father){
        create(new Family(mother,father));
    }

    public void deleteFamilyByIndex(int i){
        database.getAllFamilies().remove(i);
        database.writeToFileFamilies();
    }

    public Family bornChild(Family family, String male, String female){
        try {
            int id = database.getAllFamilies().indexOf(family);
            if (id<0){
                id++;
            }
            String name = (int) (Math.random() * 2) == 1 ? male : female;
            String gender = name.equals(male) ? "boy" : "girl";
            String surname = family.getFather().getSurname();
            int year = LocalDate.now().getYear();
            Human child = new Human(name, surname, year, 20);
            database.getAllFamilies().get(id).getChildren().add(child);
            database.writeToFileFamilies();
            return family;
        }
        catch (ArrayIndexOutOfBoundsException e){
             e.printStackTrace();
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public Family adoptChild(int id, Human human){
        database.getAllFamilies().get(id).getChildren().add(human);
        database.writeToFileFamilies();
        return family;
    }

    public void deleteAllChildrenOlderThen(int required){
        for (int j=0; j<getAll().size();j++) {
            if (database.getFamilyList().get(j).getChildren().get(j).getYear() > required) {
                database.getAllFamilies().get(j).getChildren().remove(j);
                database.writeToFileFamilies();
            }
        }
    }

    public int count(){
        return database.getAllFamilies().size();
    }

    public List<Pet> getPets(int id){
        return getByFamilyId(id).getPet();
    }

    public void addPet(int id, Pet pet){
       database.getAllFamilies().get(id).getPet().add(pet);
    }



}


