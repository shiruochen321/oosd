public class HotelRoomtest {
    public static void main(String[] args) {
       
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        
      
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        
        
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        
        
        roomA.setOccupied(1); 
        roomA.setRate(100.0);
        
        roomB.setOccupied(0); 
        roomB.setRate(80.0);
        
       
        System.out.println("=== Initial Room Details ===");
        printRoomDetails(roomA);
        printRoomDetails(roomB);
        
        
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);
        System.out.println("=== Room C Created ===");
        printRoomDetails(roomC);
        
       
        System.out.println("=== Double Booking Prevention ===");
        
       
        System.out.println("Attempting to book roomB:");
        if (roomB.setOccupiedSafely(1)) {
            System.out.println("RoomB successfully booked!");
        } else {
            System.out.println("RoomB booking failed.");
        }
        
        System.out.println("Attempting to book roomB again:");
        if (roomB.setOccupiedSafely(1)) {
            System.out.println("RoomB successfully booked!");
        } else {
            System.out.println("RoomB booking failed.");
        }
      
        System.out.println("\n=== Final Room Status ===");
        printRoomDetails(roomA);
        printRoomDetails(roomB);
        printRoomDetails(roomC);
    }
    
    private static void printRoomDetails(HotelRoom room) {
        String status = room.isOccupied()?"Occupied" : "Vacant" ;
        System.out.println("Room " + room.getRoomNumber() + " (" + room.getRoomType() + ") - Status: " + status + ", Rate: $" + room.getRate());
    }

}
