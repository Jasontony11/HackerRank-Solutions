import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Java_String_Reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
            
        }
        if(s.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
