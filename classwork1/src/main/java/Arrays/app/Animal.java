package Arrays.app;

public class Animal {
    String name;

    Animal(String name){
        this.name= "\""+name.toUpperCase()+'\"';
    }

    @Override
    public String toString() {
        return "Hello. I am animal,my name is:"+ name;
    }
}
