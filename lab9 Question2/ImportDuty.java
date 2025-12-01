//Ruochen Shi C00304527
// Q1g: ImportDuty.java
public interface ImportDuty {
    // Constant tax rates
    double CARTAXRATE = 0.10;  // 10% tax rate for cars
    double HGVTAXRATE = 0.15;  // 15% tax rate for HGVs
    
    // Method to calculate import duty
    double calculateDuty();
}
