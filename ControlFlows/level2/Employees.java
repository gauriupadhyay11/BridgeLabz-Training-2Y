package ControlFlows2;

import java.util.Scanner;

public class Employees {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the salary: ");
	        double salary = scanner.nextDouble();

	        System.out.print("Enter years of service: ");
	        int yearsOfService = scanner.nextInt();

	        double bonus = 0.0;
	        if (yearsOfService > 5) {
	            bonus = salary * 0.05;
	        }

	        System.out.println("Bonus amount: " + bonus);

	        scanner.close();
	    }
}
