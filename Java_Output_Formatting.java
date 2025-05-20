import java.io.*;
import java.util.*;

public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String k=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",k,x);
        }
        System.out.println("================================");
    }
}
