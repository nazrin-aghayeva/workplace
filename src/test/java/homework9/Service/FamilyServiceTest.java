package homework9.Service;

import homework9.Controller.FamilyController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    @Test
    void getAllFamilies() {
        FamilyController familyController= new FamilyController();
        assertEquals(familyController.count(), familyController.getAll().size());
    }


    @Test
    void getFamiliesBiggerThan() {
    }

    @Test
    void getFamiliesLessThan() {
    }

    @Test
    void countFamiliesWithMemberNumber() {
    }

    @Test
    void createNewFamily() {
    }

    @Test
    void deleteFamilyByIndex() {
    }

    @Test
    void bornChild() {
    }

    @Test
    void adoptChild() {
    }

    @Test
    void deleteAllChildrenOlderThen() {
    }

    @Test
    void count() {
    }

    @Test
    void getPets() {
    }

    @Test
    void addPet() {
    }
}