package Javamethods2;
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        return (divisibleBy4 && !divisibleBy100) || divisibleBy400;
    }
}

