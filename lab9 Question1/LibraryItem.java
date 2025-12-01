// Q1b: LibraryItem.java
public abstract class LibraryItem {
    protected String type;  // Type of library item (e.g., Book, CD)
    protected String ID;    // Unique identifier
    
    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }
}
