package JavaStatic;
public class Patient {
    private static String hospitalName = "CityCare Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient Name  : " + this.name);
            System.out.println("Age           : " + this.age);
            System.out.println("Ailment       : " + this.ailment);
            System.out.println("Patient ID    : " + this.patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Anjali Deshmukh", 32, "Fever", "PAT001");
        Patient p2 = new Patient("Ravi Kumar", 45, "Fracture", "PAT002");

        System.out.println("=== Patient 1 ===");
        p1.displayPatientDetails();

        System.out.println("\n=== Patient 2 ===");
        p2.displayPatientDetails();

        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}
