package ibaHW12.Controller;

import ibaHW12.Entity.Family;
import ibaHW12.Entity.Human;
import ibaHW12.Entity.Pet;
import ibaHW13.exceptions.FamilyOverflowException;
import ibaHW12.Service.FamilyService;

import java.util.List;

public class FamilyController extends FamilyService {
    private FamilyService familyService;


    public FamilyController() {
        this.familyService = familyService;
    }




    @Override
    public void getAllFamilies() {
        super.getAllFamilies();
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
        if (count()<7) {
            return super.bornChild(family, male, female);
        }
        else throw new FamilyOverflowException("too much");
    }

    @Override
    public Family adoptChild(Family family, Human human) {
        if (family.countFamily(family)<6) {
            return super.adoptChild(family, human);
        }
        else throw new FamilyOverflowException("too much");
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
