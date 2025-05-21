import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        
        int sum=a.length()+b.length();
        System.out.println(sum);
        System.out.println(a.compareToIgnoreCase(b)>0? "Yes":"No");
        
        String capA=a.substring(0,1).toUpperCase()+a.substring(1);
        String capB=b.substring(0,1).toUpperCase()+b.substring(1);
        
        System.out.println(capA+" "+capB);
    }
}
