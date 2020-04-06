package ibaHW13.DAO;

import ibaHW13.Database.Database;
import ibaHW13.Entity.Family;

import java.util.List;
import java.util.Optional;

public class CollectionFamilyDao implements FamilyDao<Family> {

   Database database= new Database();
   Family family;




    @Override
    public List<Family> getAll() {
        return database.getAllFamilies();
    }


    @Override
    public Optional<Family> get(int id) {
        return database.getAllFamilies()
                .stream()
                .filter(family -> database.getAllFamilies().indexOf(database.getAllFamilies().get(id))==id)
                .findAny();
    }

    @Override
    public boolean deleteById(int id) {
        database.getAllFamilies().remove(id);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        database.getFamilyList().remove(family);
        return true;

    }

    @Override
    public void save(Family family) {
        database.getFamilyList().add(family);
    }

    @Override
    public boolean create(Family family) {
        database.getFamilyList().add(family);
        return database.writeToFileFamilies();
    }
    

    public Family getByFamilyId(int id){
        return database.getAllFamilies().get(id);
    }



}
