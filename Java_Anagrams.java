import java.io.*;
import java.util.*;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] arra = a.toCharArray();
        char[] arrb = b.toCharArray();
        Arrays.sort(arra);
        Arrays.sort(arrb);

        return Arrays.equals(arra, arrb);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}
