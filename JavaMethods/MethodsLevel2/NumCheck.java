package Javamethods2;import java.util.Scanner;

public class NumCheck {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (num == 0) {
                    System.out.println("Number " + num + " is zero.");
                } else if (isEven(num)) {
                    System.out.println("Number " + num + " is positive and even.");
                } else {
                    System.out.println("Number " + num + " is positive and odd.");
                }
            } else {
                System.out.println("Number " + num + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison between first and last number: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
        }

        scanner.close();
    }
}
