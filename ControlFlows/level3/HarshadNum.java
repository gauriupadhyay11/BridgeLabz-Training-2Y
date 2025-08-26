package ControlFlows3;

import java.util.Scanner;

public class HarshadNum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        int sum = 0;
	        int originalNumber = Math.abs(number); // Handle negative numbers

	        int temp = originalNumber;
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += digit;
	            temp = temp / 10;
	        }

	        if (sum != 0 && originalNumber % sum == 0) {
	            System.out.println(number + " is a Harshad Number.");
	        } else {
	            System.out.println(number + " is not a Harshad Number.");
	        }

	        scanner.close();
	    }
}
