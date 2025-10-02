
    // Office.java
public class Office {
    private static int nextRoomNumber = 100;
    private int roomNumber;
    private Employee[] employees;
    private int employeeCount;
    
    public Office() {
        this.roomNumber = nextRoomNumber++;
        this.employees = new Employee[2]; // Maximum 2 people per office
        this.employeeCount = 0;
    }
    
    // Getter and Setter methods
    public static int getNextRoomNumber() {
        return nextRoomNumber;
    }
    
    public static void setNextRoomNumber(int nextRoomNumber) {
        Office.nextRoomNumber = nextRoomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public Employee[] getEmployees() {
        return employees;
    }
    
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    
    public int getEmployeeCount() {
        return employeeCount;
    }
    
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    
    public boolean addEmployee(Employee employee) {
        if (employeeCount < 2) {
            employees[employeeCount++] = employee;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Office Room: " + roomNumber + " (Employees: " + employeeCount + "/2)";
    }
}
    

