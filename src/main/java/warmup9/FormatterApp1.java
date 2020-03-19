package warmup9;//package warmup9;


import java.util.Formatter;

import static jdk.nashorn.internal.objects.Global.print;

public class FormatterApp1 {
  public static void main(String[] args) {
    Formatter0 fmt1 = new Formatter1();
    Formatter0 fmt2 = new Formatter2();
    Formatter0 fmt3 = new Formatter3();

    // task1
    print("Hello", fmt1); // hello
    print("Hello", fmt2); // HELLO
    print("Hello", fmt3); // ***********
                              // *  Hello  *
                              // ***********
  }
//  public static void print(String hello, Formatter0 fnt){
//      String formatted= fnt.format( message)
//  }
}
