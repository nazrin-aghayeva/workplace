package ibaHW12.DAO;

import ibaHW12.Entity.Family;
import ibaHW12.Entity.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao<Family> {


    private List<Family> families= new ArrayList<>();
    Family family;

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }


    @Override
    public List<Family> getAll() {
        return families;
    }
//
//    public int getFamilyById(int id){
//        for (int i=0; i<families.size();i++){
//            if (families.indexOf(families.get(i))==id){
//                return id;
//            }
//        }
//    }

    @Override
    public Optional<Family> get(int id) {
        return getFamilies()
                .stream()
                .filter(family -> families.indexOf(families.get(id))==id)
                .findAny();
    }

    @Override
    public boolean deleteById(int id) {
        families.remove(id);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        families.remove(family);
        return true;

    }

    @Override
    public void save(Family family) {
        families.add(family);
    }
    public List<Long> getYearOfChildren(){
        return family.getChildren().stream().map(Human::getYear).collect(Collectors.toList());
    }

    public Family getByFamilyId(int id){
        return getFamilies().get(id);
    }
}
