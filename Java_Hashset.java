import java.io.*;
import java.util.*;

public class Java_Hashset {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        HashSet<String> s = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] arr = sc.nextLine().split(" ");
            Arrays.sort(arr);
            
            String res = arr[0] + " " + arr[1];
            s.add(res);
            System.out.println(s.size());
            
        }
        
        
    }
}
