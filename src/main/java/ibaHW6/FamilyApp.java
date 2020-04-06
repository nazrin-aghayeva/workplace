package ibaHW6;

import ibaHW5.Family;
import ibaHW5.Human;
import ibaHW5.Pet;

import java.util.Arrays;

public class FamilyApp {
    public static void main(String[] args) {
        Family family = new Family();

        String[][] schedule = {{DayOfWeek.SUNDAY.name(), "Read book"}, {DayOfWeek.MONDAY.name(), "Go to the cinema"},
                {DayOfWeek.TUESDAY.name(), "Ride bicycle"}, {DayOfWeek.WEDNESDAY.name(), "Go to the swimming"},
                {DayOfWeek.THURSDAY.name(), "Sleep"}, {DayOfWeek.FRIDAY.name(), "Sleep"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
        };
        Schedule planner = new Schedule(schedule);

        Human Jack = new Human("John", "Baker", 1969, 98);
        Human Joody = new Human("Joody", "Baker", 1972, 98);
        Human Kane = new Human("Kane", "Baker", 2002, 76);
        Human Bryce = new Human("Bryce", "Baker", 2000, 78);
        Human Kate = new Human("Kate", "Baker", 2000, 78);
        Pet Jim = new Pet("dog", "Jim", 4, 56, new String[]{"play", "swim"});

        family.setMother(Joody);
        Arrays.deepToString(schedule);
        family.setFather(Jack);
        family.addChild(Kane);
        family.addChild(Bryce);
        family.addChild(Kate);
        family.setPet(Jim);
        System.out.println(family.toString());
        family.deleteChild(2);
        System.out.println("This family have " + family.countFamily() + " members");
        System.out.println("Data of family after deleting");
        System.out.println(family.toString());

        for (int i = 0; i < 100000;i++){
            new Human();
            Runtime.getRuntime().runFinalization();
        }
    }
}
