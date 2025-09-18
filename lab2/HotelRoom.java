public class HotelRoom {
   private int roomNumber;
    private String roomType;
    private int occupied;
    private double rate;

    public HotelRoom() {
       this.roomNumber = 200;
       this.roomType = Single;
       
    }


  
    public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
    }

    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

   
    public boolean isOccupied() {
        return occupied == 1;
    }

    
    public boolean setOccupiedSafely(int newStatus) {
        if (newStatus == 1 && isOccupied()) {
            System.out.println("Room " + roomNumber + " is already occupied! Cannot double book.");
            return false;
        }
        this.occupied = newStatus;
        return true;
    }

    
}
