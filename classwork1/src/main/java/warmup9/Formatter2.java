package warmup9;

public class Formatter2 extends Formatter0 {
String hello;

    public Formatter2() {

    }
    @Override
    public void print(String hello) {
        super.print(hello);

        System.out.println(hello.toUpperCase());
    }
    Formatter2(String hello){
        this.hello=hello;
    }
    @Override
    public String toString() {
        return  hello.toUpperCase();

    }
}
