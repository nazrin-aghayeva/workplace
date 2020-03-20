package homework8;

import homework8.Dog;
import homework8.DomesticCat;

public class PetApp {
    public static void main(String[] args) {
        DomesticCat cat = new DomesticCat( "Barsik", 2, 65, new String[]{"running,sleeping"});
        cat.setSpecies(Pet.Species.DOMESTICCAT);
        Dog dog= new Dog("Hyde", 3,72,new String[]{"run","play","eat"});
        dog.setSpecies(Pet.Species.DOG);
    }
}
