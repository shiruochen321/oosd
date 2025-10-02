import java.util.Scanner;

public class MyHR {
    private Office[] offices;
    private Employee[] employees;
    private int officeCount;
    private int employeeCount;
    
    public MyHR() {
        offices = new Office[10]; // Room for expansion
        employees = new Employee[5]; // Maximum 5 employees
        officeCount = 0;
        employeeCount = 0;
        
        // Initialize 3 offices automatically
        initializeOffices();
    }
    
    // Getter and Setter methods
    public Office[] getOffices() {
        return offices;
    }
    
    public void setOffices(Office[] offices) {
        this.offices = offices;
    }
    
    public Employee[] getEmployees() {
        return employees;
    }
    
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    
    public int getOfficeCount() {
        return officeCount;
    }
    
    public void setOfficeCount(int officeCount) {
        this.officeCount = officeCount;
    }
    
    public int getEmployeeCount() {
        return employeeCount;
    }
    
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    
    private void initializeOffices() {
        for (int i = 0; i < 3; i++) {
            offices[officeCount++] = new Office();
        }
    }
    
    public void listAllOffices() {
        System.out.println("\n=== ALL OFFICES ===");
        for (int i = 0; i < officeCount; i++) {
            System.out.println(offices[i]);
            
            // List employees in this office
            Employee[] officeEmployees = offices[i].getEmployees();
            boolean hasEmployees = false;
            
            for (int j = 0; j < offices[i].getEmployeeCount(); j++) {
                if (officeEmployees[j] != null) {
                    if (!hasEmployees) {
                        System.out.println("  Employees in this office:");
                        hasEmployees = true;
                    }
                    System.out.println("  - Employee #" + officeEmployees[j].getEmployeeNumber());
                }
            }
            
            if (!hasEmployees) {
                System.out.println("  No employees assigned");
            }
            System.out.println();
        }
    }
    
    public void createNewEmployee() {
        if (employeeCount >= 5) {
            System.out.println("Maximum employee limit reached (5 employees)!");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // Get employee type
        System.out.print("Enter employee type (Staff/Manager): ");
        String employeeType = scanner.nextLine();
        
        // Validate employee type
        if (!employeeType.equalsIgnoreCase("Staff") && !employeeType.equalsIgnoreCase("Manager")) {
            System.out.println("Invalid employee type! Must be 'Staff' or 'Manager'");
            return;
        }
        
        // Get car details if manager
        String carDetails = null;
        if (employeeType.equalsIgnoreCase("Manager")) {
            System.out.print("Enter company car details: ");
            carDetails = scanner.nextLine();
        }
        
        // Get address details
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city/town: ");
        String city = scanner.nextLine();
        System.out.print("Enter county: ");
        String county = scanner.nextLine();
        
        Address address = new Address(street, city, county);
        
        // List available offices
        System.out.println("\nAvailable Offices:");
        for (int i = 0; i < officeCount; i++) {
            if (offices[i].getEmployeeCount() < 2) {
                System.out.println(offices[i]);
            }
        }
        
        // Select office
        System.out.print("Enter office room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Office selectedOffice = null;
        for (int i = 0; i < officeCount; i++) {
            if (offices[i].getRoomNumber() == roomNumber) {
                selectedOffice = offices[i];
                break;
            }
        }
        
        if (selectedOffice == null) {
            System.out.println("Invalid office room number!");
            return;
        }
        
        if (selectedOffice.getEmployeeCount() >= 2) {
            System.out.println("Office is already full (2 employees maximum)!");
            return;
        }
        
        // Create employee
        Employee employee = new Employee(employeeType, carDetails, address, selectedOffice);
        selectedOffice.addEmployee(employee);
        employees[employeeCount++] = employee;
        
        System.out.println("Employee created successfully!");
        System.out.println("Employee Number: " + employee.getEmployeeNumber());
    }
    
    public void listAllEmployees() {
        System.out.println("\n=== ALL EMPLOYEES ===");
        if (employeeCount == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i]);
            System.out.println("----------------------");
        }
        
        System.out.println("Total employee records: " + Employee.getEmployeeRecordCount());
    }
    
    public void displayMenu() {
        System.out.println("\n=== MyHR System ===");
        System.out.println("1. List all offices");
        System.out.println("2. Create a new employee record");
        System.out.println("3. List all employees");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
    
    public static void main(String[] args) {
        MyHR hrSystem = new MyHR();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            hrSystem.displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    hrSystem.listAllOffices();
                    break;
                case 2:
                    hrSystem.createNewEmployee();
                    break;
                case 3:
                    hrSystem.listAllEmployees();
                    break;
                case 4:
                    System.out.println("Thank you for using MyHR System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose 1-4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
    

