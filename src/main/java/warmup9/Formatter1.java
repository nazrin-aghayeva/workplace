package warmup9;

public class Formatter1 extends Formatter0 {
    String hello;

    public Formatter1() {

    }

    @Override
    public void print(String hello) {
        super.print(hello);
        System.out.println(hello.toLowerCase());
    }

    Formatter1(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return  hello.toLowerCase() ;

    }
}