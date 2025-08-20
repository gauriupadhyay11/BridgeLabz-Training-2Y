package programmingelemennts;

import java.util.Scanner;
public class DiscountCalc {
	    public static void main(String[] args) {
	        double fee, discountPercent;

	        Scanner input = new Scanner(System.in); 
	        System.out.print("Enter the student fee (INR): ");
	        fee = input.nextDouble();
	        System.out.print("Enter the university discount percentage: ");
	        discountPercent = input.nextDouble();
	        double discount = (discountPercent / 100) * fee;
	        double finalFee = fee - discount;

	        System.out.println("The discount amount is INR " + discount + 
	                           " and final discounted fee is INR " + finalFee);
	    }
}
