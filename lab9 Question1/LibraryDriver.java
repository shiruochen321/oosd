// Q1f: LibraryDriver.java
public class LibraryDriver {
    public static void main(String[] args) {
        // Create array of LibraryItems
        LibraryItem[] items = new LibraryItem[2];
        
        // Create a Book object
        items[0] = new Book("B001", "George Orwell", "1984", 328);
        
        // Create a CD object
        items[1] = new CD("C001", "The Beatles", "Abbey Road", 17);
        
        // Demonstrate calculatePrice() for each item
        for (LibraryItem item : items) {
            if (item instanceof LoanItem) {
                LoanItem loanItem = (LoanItem) item;
                System.out.println(item.type + " ID: " + item.ID + 
                                 " - Loan Price: $" + loanItem.calculatePrice());
            }
        }
    }
}
