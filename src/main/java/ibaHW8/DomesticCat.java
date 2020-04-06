package ibaHW8;

public class DomesticCat extends Pet implements Foul {


    public void respond() {
        System.out.println("Hi i am"+ this.getNickname());
    }
    public void foul(){
        System.out.println("I need cover it up");
    }
}
