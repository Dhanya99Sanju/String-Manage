import java.io.*;
public class StringManipulation {
    public static void main(String[] args) {
        System.out.println("Hello");
        String nstr ="";
        String text ="johny mone";
        char chr;
        int num =text.length()-1;
        for (int i = num; i >=0; i--){
             chr = text.charAt(i);
             System.out.println(chr);
             nstr =  nstr +chr;
        }
        System.out.println("reversed string" + nstr);
    }
    
}
