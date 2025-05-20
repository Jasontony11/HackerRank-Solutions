import java.io.*;
import java.util.*;

public class Java_Stdin_and_Stdout_II {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        double n1=sc.nextDouble();
        
        sc.nextLine();
        String sen=sc.nextLine();
        
        System.out.println("String: "+sen);
        System.out.println("Double: "+n1);
        System.out.println("Int: "+num);
        
    }
}
