import java.io.*;
import java.util.*;

public class Java_Map {

    public static void main(String[] args) {
        HashMap<String,Integer> phdir =new HashMap<>() ;
        Scanner s = new Scanner(System.in);
        
        int n = Integer.parseInt(s.nextLine());
        
        for(int i=0;i<n;i++){
            String key=s.nextLine().toLowerCase();
            int value = Integer.parseInt(s.nextLine()); 
            phdir.put(key, value);
        }
        while(s.hasNextLine()){
            String q=s.nextLine();
            if(phdir.containsKey(q)){
                System.out.println(q+"="+phdir.get(q));
            }
            else{
                System.out.println("Not found");
            }
        }
        
        
    }
}
