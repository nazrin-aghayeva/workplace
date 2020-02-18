import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Hoody");
        Fish fish1 = new Fish("Blau");


        Animal dragon = new Animal("Wow") {
            @Override
            public String toString() {
                return "Hello. I am dragon,my name is:"  +this.name;
            }
        };
        List<Animal> animalList= new ArrayList<>();
        animalList.add(cat2);
        animalList.add(dog1);
        animalList.add(fish1);
        animalList.add(dragon);
        System.out.println(animalList + "\n");
    }

    }
