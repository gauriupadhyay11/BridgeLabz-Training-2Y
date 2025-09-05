package JavaMethods;
import java.util.Scanner;
public class AthleteRuns {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter length of side 1 (in meters): ");
	        double side1 = scanner.nextDouble();

	        System.out.print("Enter length of side 2 (in meters): ");
	        double side2 = scanner.nextDouble();

	        System.out.print("Enter length of side 3 (in meters): ");
	        double side3 = scanner.nextDouble();

	        double rounds = calculateRounds(side1, side2, side3, 5000);

	        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

	        scanner.close();
	    }

	    public static double calculateRounds(double a, double b, double c, double distance) {
	        double perimeter = a + b + c;
	        return distance / perimeter;
	    }
}
