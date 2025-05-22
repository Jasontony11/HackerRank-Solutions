import java.util.*;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        String[] tokens = input.trim().split("[^A-Za-z]+");

        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (int i=0;i<tokens.length;i++) {
                System.out.println(tokens[i]);
            }
        }
    }
}
