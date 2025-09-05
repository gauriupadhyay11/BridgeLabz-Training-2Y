package JavaMethods3;
import java.util.Scanner;

public class CountDigits {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return number % digitSum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = extractDigits(number);

        System.out.println("\nTotal Digits: " + countDigits(number));
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Harshad Number: " + (isHarshad ? "Yes" : "No"));

        int[][] freqArray = digitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int[] row : freqArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        scanner.close();
    }
}
