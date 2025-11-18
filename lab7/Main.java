public class Main {
     public static void main(String[] args) {
        // Create a Vet object
        Vet vet = new Vet("Dr. Smith");
        
        // Create Dog and Cat objects
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Gray");
        
        // Call vaccinate method for both animals
        System.out.println("=== Vaccinating Dog ===");
        vet.vaccinate(dog);
        
        System.out.println("\n=== Vaccinating Cat ===");
        vet.vaccinate(cat);
    }

}
