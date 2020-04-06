package warmupOOP9;

public class Formatter3 extends Formatter0 {
    String hello;

    public Formatter3() {

    }

    @Override
    public void print(String hello) {
        super.print(hello);
        System.out.println( "***********\n"+"* "+hello+"*\n"+"***********");
    }
    Formatter3(String hello){
        this.hello=hello;
    }
}
