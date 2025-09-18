package JavaStatic;
public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University   : " + universityName);
            System.out.println("Name         : " + this.name);
            System.out.println("Roll Number  : " + this.rollNumber);
            System.out.println("Grade        : " + this.grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + rollNumber);
        } else {
            System.out.println("Invalid operation on non-student object.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Amit Sharma", 101, 'A');
        Student student2 = new Student("Neha Verma", 102, 'B');

        System.out.println("=== Student 1 ===");
        student1.displayStudentDetails();

        System.out.println("\n=== Student 2 ===");
        student2.displayStudentDetails();

        System.out.println("\nUpdating grade for Student 2...");
        student2.updateGrade('A');

        System.out.println("\n=== Student 2 (After Grade Update) ===");
        student2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();
    }
}
