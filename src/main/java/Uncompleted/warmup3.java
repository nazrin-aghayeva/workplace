package Uncompleted;

import javax.crypto.MacSpi;

public class warmup3 {
    public static String alphabetSmall(){
        StringBuilder small= new StringBuilder();
        for (char i='a'; i<'z'; i++){
            int r=(int)(Math.random()*30);
            i=(char)r;
            small.append(i);
        }
        return small.toString();
    }
    public static String alphabetUpper() {
       return alphabetSmall().toUpperCase();
    }


    public static void main(String[] args) {
        System.out.println(alphabetSmall());


    }
}