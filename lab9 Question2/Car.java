//Ruochen Shi C00304527
// Car.java
public class Car extends RoadVehicle implements ImportDuty {
    private int numberOfSeats;
    
    public Car(String manufacturer, double value, int numberOfSeats) {
        super(manufacturer, value);
        this.numberOfSeats = numberOfSeats;
    }
    
    @Override
    public double calculateDuty() {
        // Calculate duty using CARTAXRATE from interface
        return getValue() * CARTAXRATE;
    }
    
    @Override
    public String toString() {
        return "Car [Manufacturer: " + getManufacturer() + 
               ", Value: $" + getValue() + 
               ", Seats: " + numberOfSeats + 
               ", Duty: $" + calculateDuty() + "]";
    }
}