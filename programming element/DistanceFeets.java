package programmingelemennts;

import java.util.Scanner;
public class DistanceFeets {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter distance in feet: ");
	        double distanceInFeet = input.nextDouble();
	        double distanceInYards = distanceInFeet / 3.0;
	        double distanceInMiles = distanceInYards / 1760.0;
	        double distanceInInches = distanceInFeet * 12;
	        double distanceInCm = distanceInInches * 2.54;
	        
	        System.out.println("\n--- Conversion Results ---");
	        System.out.printf("Distance in yards: %.2f yards%n", distanceInYards);
	        System.out.printf("Distance in miles: %.4f miles%n", distanceInMiles);
	        System.out.printf("Your Height in cm is %.2f cm, in feet is %.2f ft, and in inches is %.2f in%n",
	                          distanceInCm, distanceInFeet, distanceInInches);

	        input.close();
	    }
}
