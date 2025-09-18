package JavaStatic;
public class Product {
    private static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID   : " + this.productID);
            System.out.println("Name         : " + this.productName);
            System.out.println("Price        : $" + this.price);
            System.out.println("Quantity     : " + this.quantity);
            System.out.println("Discount     : " + discount + "%");
            double total = price * quantity * (1 - discount / 100);
            System.out.println("Total Price  : $" + total);
        } else {
            System.out.println("Invalid product object.");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 800.0, 1, "PROD001");
        Product prod2 = new Product("Headphones", 150.0, 2, "PROD002");

        System.out.println("=== Product 1 ===");
        prod1.displayProductDetails();

        System.out.println("\n=== Product 2 ===");
        prod2.displayProductDetails();

        System.out.println("\nUpdating discount to 15%...\n");
        Product.updateDiscount(15.0);

        System.out.println("=== Product 1 (After Discount Update) ===");
        prod1.displayProductDetails();
    }
}
