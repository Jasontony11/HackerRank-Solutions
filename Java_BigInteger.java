import java.io.*;
import java.util.*;
import java.math.*;

public class Java_BigInteger {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.nextLine());
        BigInteger b=new BigInteger(s.nextLine());
        
        BigInteger sum= a.add(b);
        BigInteger mul=a.multiply(b);
        
        System.out.println(sum);
        System.out.println(mul);
    }
}
