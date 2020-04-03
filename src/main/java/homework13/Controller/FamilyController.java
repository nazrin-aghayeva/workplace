package homework13.Controller;

import homework13.Entity.Family;
import homework13.Entity.Human;
import homework13.Entity.Pet;
import homework13.exceptions.FamilyOverflowException;
import homework13.Service.FamilyService;

import java.util.List;

public class FamilyController extends FamilyService {
    private FamilyService familyService;


    public FamilyController() {
        this.familyService = familyService;
    }




    @Override
    public void getAllFamilies1() {
        super.getAllFamilies1();
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int specified) {
        return super.getFamiliesBiggerThan(specified);
    }

    @Override
    public List<Family> getFamiliesLessThan(int specified) {
       return super.getFamiliesLessThan(specified);
    }

    @Override
    public long countFamiliesWithMemberNumber(long given) {
        return super.countFamiliesWithMemberNumber(given);
    }

    @Override
    public void createNewFamily(Human mother, Human father) {
         super.createNewFamily(mother, father);
    }

    @Override
    public void deleteFamilyByIndex(int i) {
        super.deleteFamilyByIndex(i);
    }

    @Override
    public Family bornChild(Family family, String male, String female) {
        if (family.countFamily(family)<6) {
            return super.bornChild(family, male, female);
        }
        else throw new FamilyOverflowException("too much");
    }

    @Override
    public Family adoptChild(Family family, Human human) {
        if (family.countFamily(family)<6) {
            return super.adoptChild(family, human);
        }
        else throw new FamilyOverflowException("too much") ;
    }

    @Override
    public void deleteAllChildrenOlderThen(int required) {
        super.deleteAllChildrenOlderThen(required);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public List<Pet> getPets(int id) {
        return super.getPets(id);
    }

    @Override
    public void addPet(int id, Pet pet) {
        super.addPet(id, pet);
    }
}
