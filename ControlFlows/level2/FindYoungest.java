package ControlFlows2;

import java.util.Scanner;

public class FindYoungest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Amar's age: ");
	        int amarAge = scanner.nextInt();
	        System.out.print("Enter Akbar's age: ");
	        int akbarAge = scanner.nextInt();
	        System.out.print("Enter Anthony's age: ");
	        int anthonyAge = scanner.nextInt();
	        System.out.print("Enter Amar's height (in cm): ");
	        double amarHeight = scanner.nextDouble();
	        System.out.print("Enter Akbar's height (in cm): ");
	        double akbarHeight = scanner.nextDouble();
	        System.out.print("Enter Anthony's height (in cm): ");
	        double anthonyHeight = scanner.nextDouble();
	        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
	        String youngestFriend;
	        if (minAge == amarAge) {
	            youngestFriend = "Amar";
	        } else if (minAge == akbarAge) {
	            youngestFriend = "Akbar";
	        } else {
	            youngestFriend = "Anthony";
	        }

	        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
	        String tallestFriend;
	        if (maxHeight == amarHeight) {
	            tallestFriend = "Amar";
	        } else if (maxHeight == akbarHeight) {
	            tallestFriend = "Akbar";
	        } else {
	            tallestFriend = "Anthony";
	        }

	        System.out.println("The youngest friend is: " + youngestFriend);
	        System.out.println("The tallest friend is: " + tallestFriend);

	        scanner.close();
	    }
}
