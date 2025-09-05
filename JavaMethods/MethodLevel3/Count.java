package JavaMethods3;
import java.util.Scanner;

public class Count {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] extractDigits(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }

        return new int[]{max, secondMax};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }

        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);

        System.out.println("\nTotal Digits: " + digitCount);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits);

        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));
        System.out.println("Armstrong Number: " + (isArmstrong ? "Yes" : "No"));

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println("Second Largest Digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "Not found" : largestTwo[1]));

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println("Second Smallest Digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "Not found" : smallestTwo[1]));

        scanner.close();
    }
}
