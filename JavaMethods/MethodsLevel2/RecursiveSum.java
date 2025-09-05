package Javamethods2;
import java.util.Scanner;
public class RecursiveSum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a natural number: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Please enter a positive natural number.");
	        } else {
	            int recursiveSum = sumRecursive(n);
	            int formulaSum = sumFormula(n);

	            System.out.println("Sum using recursion: " + recursiveSum);
	            System.out.println("Sum using formula: " + formulaSum);

	            if (recursiveSum == formulaSum) {
	                System.out.println("Both methods give the same result. Computation is correct!");
	            } else {
	                System.out.println("Results do not match. There might be an error.");
	            }
	        }

	        scanner.close();
	    }

	    // Recursive method to calculate sum of n natural numbers
	    public static int sumRecursive(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        return n + sumRecursive(n - 1);
	    }

	    // Method to calculate sum using formula
	    public static int sumFormula(int n) {
	        return n * (n + 1) / 2;
	    }

}
