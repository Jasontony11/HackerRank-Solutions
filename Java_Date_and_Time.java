import java.util.Calendar;
import java.util.Scanner;

public class Java_Date_and_Time {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Calendar months start from 0
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
                         "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        System.out.println(findDay(month, day, year));
    }
}
