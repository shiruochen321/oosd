public class TestPerson {
    public static void main(String[] args) {
        // Create a polymorphic array of type Person
        Person[] people = new Person[2];
        
        // Create one Employee and one Student
        people[0] = new Employee("John Smith", 50000.0);
        people[1] = new Student("Alice Johnson", "Computer Science");
        
        // Print the name and description of each person in the array
        for (int i = 0; i < people.length; i++) {
            System.out.println("Name: " + people[i].getName());
            System.out.println("Description: " + people[i].getDescription());
            System.out.println(); // Empty line for separation
        }
        
        // Alternative enhanced for loop version:
        /*
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Description: " + person.getDescription());
            System.out.println();
        }
        */
    }

}
