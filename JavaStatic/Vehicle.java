package JavaStatic;
public class Vehicle {
    private static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name         : " + this.ownerName);
            System.out.println("Vehicle Type       : " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee   : ₹" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul Mehra", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Priya Singh", "Scooter", "MH14XY5678");

        System.out.println("=== Vehicle 1 ===");
        v1.displayRegistrationDetails();

        System.out.println("\n=== Vehicle 2 ===");
        v2.displayRegistrationDetails();

        System.out.println("\nUpdating registration fee to ₹6000...\n");
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("=== Vehicle 1 (After Fee Update) ===");
        v1.displayRegistrationDetails();
    }
}
