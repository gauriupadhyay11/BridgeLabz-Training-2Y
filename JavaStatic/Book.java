package JavaStatic;
public class Book {
    private static String libraryName = "Central City Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title : " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN  : " + this.isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        displayLibraryName();

        System.out.println("\n=== Book 1 ===");
        book1.displayBookDetails();

        System.out.println("\n=== Book 2 ===");
        book2.displayBookDetails();

        System.out.println("\nBook 1 ISBN: " + book1.getIsbn());
    }
}
