package JavaMethods3;
import java.util.Scanner;

public class LineAndDistance {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new IllegalArgumentException("Vertical line - slope is undefined.");
        }

        double m = (y2 - y1) / (x2 - x1);  
        double b = y1 - m * x1;           

        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.4f\n", distance);

        try {
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double m = lineEquation[0];
            double b = lineEquation[1];
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", m, b);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot compute equation of the line: " + e.getMessage());
        }

        scanner.close();
    }
}
