//Ruochen Shi C00304527
// HGV.java
public class HGV extends RoadVehicle implements ImportDuty {
    private double cargoCapacity;  // in tons
    
    public HGV(String manufacturer, double value, double cargoCapacity) {
        super(manufacturer, value);
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public double calculateDuty() {
        // Calculate duty using HGVTAXRATE from interface
        return getValue() * HGVTAXRATE;
    }
    
    @Override
    public String toString() {
        return "HGV [Manufacturer: " + getManufacturer() + 
               ", Value: $" + getValue() + 
               ", Cargo Capacity: " + cargoCapacity + " tons" + 
               ", Duty: $" + calculateDuty() + "]";
    }
}