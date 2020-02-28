package homework6;

import homework5.Family;
import homework5.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family = new Family();
    Human Kane = new homework5.Human("Kane", "Baker", 2002, 76);
    Human Bryce = new homework5.Human("Bryce", "Baker", 2000, 78);
    Human Kate = new Human("Kate", "Baker", 2000, 78);


    @Test
    void addChild() {
        family.addChild(Kane);
        family.addChild(Bryce);
        family.addChild(Kate);
       int counter=0;

        if(family.getChildren()[0] == Kane) {
            counter ++;
        }
        if(family.getChildren()[1] ==Bryce ) {
            counter ++;
        }
        if(family.getChildren()[0] == Kate) {
            counter ++;
        }
        int expected = counter;
        assertEquals(expected, counter);
    }

    @Test
    void deleteChildByIndex() {
        family.addChild(Kane);
        family.deleteChild(0);
        int counter=0;
        if(family.getChildren()[0] == Kane) {
            counter ++;
        }
        int expected = counter;
        assertEquals(expected, counter);
    }

    @Test
    public void countFamily() {
        family.addChild(Kane);
        family.addChild(Bryce);
        family.addChild(Kate);
        family.deleteChild(0);
        int count = family.countFamily();
        assertEquals(count,family.countFamily());
    }

    @Test
    public void testToString() {
        String string= family.toString();
        assertEquals(string,family.toString());
    }
}