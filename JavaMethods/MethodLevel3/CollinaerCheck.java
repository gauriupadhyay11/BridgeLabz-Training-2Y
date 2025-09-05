package JavaMethods3;
import java.util.Scanner;

public class CollinaerCheck {
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        try {
            double slopeAB = (double)(y2 - y1) / (x2 - x1);
            double slopeBC = (double)(y3 - y2) / (x3 - x2);
            double slopeAC = (double)(y3 - y1) / (x3 - x1);

            return Math.abs(slopeAB - slopeBC) < 1e-9 && Math.abs(slopeAB - slopeAC) < 1e-9;
        } catch (ArithmeticException e) {
            return (x1 == x2 && x2 == x3);
        }
    }
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of 3 points:");
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Slope Method: The points are collinear.");
        } else {
            System.out.println("Using Slope Method: The points are NOT collinear.");
        }
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Area Method: The points are collinear.");
        } else {
            System.out.println("Using Area Method: The points are NOT collinear.");
        }

        scanner.close();
    }
}
