public class Employee {
    // Employee.java

    private static int nextEmployeeNumber = 1000;
    private static int employeeRecordCount = 0;
    
    private int employeeNumber;
    private String employeeType;
    private String carDetails;
    private Address address;
    private Office office;
    
    public Employee(String employeeType, String carDetails, Address address, Office office) {
        this.employeeNumber = nextEmployeeNumber++;
        this.employeeType = employeeType;
        this.carDetails = carDetails;
        this.address = address;
        this.office = office;
        employeeRecordCount++;
    }
    
    // Static getter and setter methods
    public static int getNextEmployeeNumber() {
        return nextEmployeeNumber;
    }
    
    public static void setNextEmployeeNumber(int nextEmployeeNumber) {
        Employee.nextEmployeeNumber = nextEmployeeNumber;
    }
    
    public static int getEmployeeRecordCount() {
        return employeeRecordCount;
    }
    
    public static void setEmployeeRecordCount(int employeeRecordCount) {
        Employee.employeeRecordCount = employeeRecordCount;
    }
    
    // Instance getter and setter methods
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    public String getEmployeeType() {
        return employeeType;
    }
    
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    
    public String getCarDetails() {
        return carDetails;
    }
    
    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Office getOffice() {
        return office;
    }
    
    public void setOffice(Office office) {
        this.office = office;
    }
    
    @Override
    public String toString() {
        String info = "Employee #: " + employeeNumber + 
                     "\nType: " + employeeType +
                     "\nAddress: " + address.toString() +
                     "\nOffice: " + office.getRoomNumber();
        
        if (employeeType.equalsIgnoreCase("Manager") && carDetails != null) {
            info += "\nCompany Car: " + carDetails;
        }
        
        return info;
    }
}
    

