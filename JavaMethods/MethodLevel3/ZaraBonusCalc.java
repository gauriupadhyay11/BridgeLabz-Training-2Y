package JavaMethods3;
import java.util.Random;

public class ZaraBonusCalc {

    static final int EMPLOYEE_COUNT = 10;

    public static int[][] generateEmployeeData() {
        int[][] data = new int[EMPLOYEE_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = 10000 + random.nextInt(90000); // 5-digit salary
            int years = 1 + random.nextInt(10); // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[EMPLOYEE_COUNT][2];

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-12s %-15s %-15s %-15s %-10s\n", 
                "ID", "Old Salary", "Years of Service", "Bonus Amount", "New Salary", "Bonus %");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double bonusPercent = (years > 5) ? 5 : 2;

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-12d %-15d %-15.2f %-15.2f %-10.0f%%\n", 
                    i + 1, oldSalary, years, bonus, newSalary, bonusPercent);
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-15s %-15.2f %-15.2f\n", 
                "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
}
