public class Animal {
      private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Dog class (subclass of Animal)
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}

// Cat class (subclass of Animal)
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }

}
