import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        int q = scanner.nextInt(); 

        for (int i = 0; i < q; i++) {
            String operation = scanner.next();

            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list = insertElement(list, index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                list = deleteElement(list, index);
            }
        }

        scanner.close();

        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }
}
