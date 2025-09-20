//import java.util.*;
import java.lang.Math;
public class cubeOfFirstAndLast {
    public static void main(String[] args) {
        int num=782973;
        String cnum = String.valueOf(num);
        int len = cnum.length()-1;
        int fact = (int)Math.pow(10,len);
        System.out.println("First Num");
        System.out.println((int)Math.pow(num/fact,3));
        System.out.println("Last num");
        System.out.println((int)Math.pow(num%10,3));

    }
     
}