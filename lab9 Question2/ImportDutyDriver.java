//Ruochen Shi C00304527
// ImportDutyDriver.java
public class ImportDutyDriver {
    public static void main(String[] args) {
        // Create Car and HGV objects
        Car car = new Car("Toyota", 25000.0, 5);
        HGV hgv = new HGV("Volvo", 85000.0, 20.0);
        
        System.out.println("Import Duty Calculation:");
        System.out.println("========================");
        
        // Display car details and duty
        System.out.println(car);
        System.out.println("Car Tax Rate: " + (ImportDuty.CARTAXRATE * 100) + "%");
        
        System.out.println();  // Blank line for separation
        
        // Display HGV details and duty
        System.out.println(hgv);
        System.out.println("HGV Tax Rate: " + (ImportDuty.HGVTAXRATE * 100) + "%");
        
        System.out.println();  // Blank line for separation
        
        // Display total duty calculation
        System.out.println("Summary:");
        System.out.println("--------");
        System.out.printf("Total Duty for Car: $%.2f\n", car.calculateDuty());
        System.out.printf("Total Duty for HGV: $%.2f\n", hgv.calculateDuty());
        System.out.printf("Combined Total Duty: $%.2f\n", 
                         car.calculateDuty() + hgv.calculateDuty());
    }
}
