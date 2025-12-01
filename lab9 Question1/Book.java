
// Q1c: Book.java
public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;
    
    public Book(String ID, String author, String title, int numPages) {
        super("Book", ID);  // Call parent constructor
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }
    
    @Override
    public double calculatePrice() {
        // Price based on number of pages (50 cents per page)
        return numPages * 0.50;
    }
}