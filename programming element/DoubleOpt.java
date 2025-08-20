package programmingelemennts;

import java.util.Scanner;
public class DoubleOpt {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter value for a (double): ");
	        double a = input.nextDouble();
	        System.out.print("Enter value for b (double): ");
	        double b = input.nextDouble();
	        System.out.print("Enter value for c (double): ");
	        double c = input.nextDouble();
	        double result1 = a + b * c;     
	        double result2 = a * b + c;     
	        double result3 = c + a / b;   
	        double result4 = a % b + c;    
	        System.out.println("\n--- Double Operation Results ---");
	        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
	                          result1, result2, result3, result4);

	        input.close();
	    }
}
