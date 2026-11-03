package lab.pkg4;

import java.util.Scanner;

/**
 * @author Ng Zhi Yang
 */
public class L4Q4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Get the input from users Input
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int dayUntilAug = dayUntilMay + 31 + 30 + 31;
            int dayUntilNov = dayUntilAug + 31+ 30 + 31;
            int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
            int firstDayOfAug = (firstDayOfYear + dayUntilAug) % 7;
            int firstDayOfNov = (firstDayOfYear + dayUntilNov) % 7;
            
            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n"; // string formatting - different types of string formatting

            System.out.println();
            
            // Print calendar for November
            System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
            for (int i = 0; i < firstDayOfNov; i++) {
                System.out.printf(columnFormat, "");
            }
            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);
                if ((i + firstDayOfNov) % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }
}