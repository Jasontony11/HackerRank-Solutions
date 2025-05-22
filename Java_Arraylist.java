import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(scanner.nextInt()); 
            }
            data.add(row); 
        }

        int q = scanner.nextInt(); 
        for (int i = 0; i < q; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row > 0 && row <= data.size() && col > 0 && col <= data.get(row - 1).size()) {
                System.out.println(data.get(row - 1).get(col - 1)); 
            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
