// Q1d: CD.java
public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;
    
    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID);  // Call parent constructor
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }
    
    @Override
    public double calculatePrice() {
        // Price based on number of tracks ($1 per track)
        return numTracks * 1.0;
    }
}
