package programmingelemennts;

import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter base of the triangle (in inches): ");
                double base = input.nextDouble();

                System.out.print("Enter height of the triangle (in inches): ");
                double height = input.nextDouble();

                double areaInInches = 0.5 * base * height;
                double areaInCm = areaInInches * 6.4516;
                double heightInCm = height * 2.54;
                double heightInFeet = height / 12.0;
                System.out.println("\n--- Results ---");
                System.out.printf("Area in square inches: %.2f in²%n", areaInInches);
                System.out.printf("Area in square centimeters: %.2f cm²%n", areaInCm);
                System.out.printf("Your Height in cm is %.2f cm, in feet is %.2f ft, and in inches is %.2f in%n",
                                  heightInCm, heightInFeet, height);

                input.close();
            }
}
