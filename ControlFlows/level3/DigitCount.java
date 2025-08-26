package ControlFlows3;

import java.util.Scanner;

public class DigitCount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        if (number == 0) {
	            System.out.println("The number of digits is: 1");
	        } else {
	            int count = 0;
	            int originalNumber = Math.abs(number); 
	            while (originalNumber != 0) {
	                originalNumber = originalNumber / 10;  
	                count++;                               
	            }
	            System.out.println("The number of digits is: " + count);
	        }

	        scanner.close();
	    }
}
