package programmingelemennts;

import java.util.Scanner;
public class BasicCalc {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        double addition = num1 + num2;
	        double subtraction = num1 - num2;
	        double multiplication = num1 * num2;
	        double division = num1 / num2;

	        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is:\n", num1, num2);
	        System.out.printf("Addition: %.2f\n", addition);
	        System.out.printf("Subtraction: %.2f\n", subtraction);
	        System.out.printf("Multiplication: %.2f\n", multiplication);
	        System.out.printf("Division: %.2f\n", division);
	        scanner.close();
	    }

}
