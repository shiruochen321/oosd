//Ruochen Shi C00304527
// RoadVehicle.java
public class RoadVehicle {
    private String manufacturer;
    private double value;  // Vehicle value in dollars
    
    public RoadVehicle(String manufacturer, double value) {
        this.manufacturer = manufacturer;
        this.value = value;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getValue() {
        return value;
    }
}
