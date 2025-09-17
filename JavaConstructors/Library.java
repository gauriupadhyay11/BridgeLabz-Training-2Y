package JavaConstructors;
public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Library() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    public Library(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' has been borrowed.");
            return true;
        } else {
            System.out.println("Book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void returnBook() {
        available = true;
        System.out.println("Book '" + title + "' has been returned.");
    }

    @Override
    public String toString() {
        return "Book{" +
               "Title='" + title + '\'' +
               ", Author='" + author + '\'' +
               ", Price=" + price +
               ", Available=" + available +
               '}';
    }
}
