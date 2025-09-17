package JavaConstructors;
public class Employee {
    public int employeeID;         
    protected String department;   
    private double salary;         

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
