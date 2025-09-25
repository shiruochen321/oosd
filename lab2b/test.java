public class test {
    public static void main(String[] args) {
        System.out.println("========== rectangle ==========\n");
        
        System.out.println("=== Q1 ===");
        testBasicFunctionality();
        
        System.out.println("\n=== Q2 ===");
        testAreaAndPerimeter();
        
       
        System.out.println("\n=== Q3 ===");
        testPrintRectangle();
        
       
        System.out.println("\n===all fuctions ===");
        testAllFeatures();
    }
    
  
    public static void testBasicFunctionality() {
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Default constructor :" + rect1.toString());
        
        Rectangle rect2 = new Rectangle(5.0, 10.0);
        System.out.println("Constructor with parameter: " + rect2.toString());
        
       
        Rectangle rect3 = new Rectangle();
        rect3.setLength(15.5);
        rect3.setWidth(25.3);
        System.out.println("After setting: " + rect3.toString());
        System.out.println("Get length  " + rect3.getLength() + "width, : " + rect3.getWidth());
        
       
        System.out.println("test invalid value:");
        rect3.setLength(-5.0);
        rect3.setWidth(50.0);
        System.out.println("After invalid processing: " + rect3.toString());
        
      
        rect3.setLength(40.0);
        rect3.setWidth(0.1);
        System.out.println("Boundary value: " + rect3.toString());
    }
    
    public static void testAreaAndPerimeter() {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        System.out.println("rectangle: " + rect1.toString());
        System.out.println("area: " + rect1.getArea());
        System.out.println("perimeter: " + rect1.getPerimeter());
        
        Rectangle rect2 = new Rectangle(7.5, 3.2);
        System.out.println("rectangle: " + rect2.toString());
        System.out.println("area: " + rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());
        
        Rectangle rect3 = new Rectangle(40.0, 40.0);
        System.out.println("rectangle: " + rect3.toString());
        System.out.println("area: " + rect3.getArea());
        System.out.println("perimeter: " + rect3.getPerimeter());
    }
    
   
    public static void testPrintRectangle() {
        System.out.println("1. width=5, length=7:");
        Rectangle rect1 = new Rectangle(7, 5);
        System.out.println(rect1.toString());
        rect1.printRectangle();
        
        System.out.println("\n2. width=10, length=4:");
        Rectangle rect2 = new Rectangle(4, 10);
        System.out.println(rect2.toString());
        rect2.printRectangle();
        
        System.out.println("\n3. width=3, length=3:");
        Rectangle rect3 = new Rectangle(3, 3);
        System.out.println(rect3.toString());
        rect3.printRectangle();
        
        System.out.println("\n4. width=1, length=1):");
        Rectangle rect4 = new Rectangle(1, 1);
        System.out.println(rect4.toString());
        rect4.printRectangle();
        
        System.out.println("\n5.  width=2, length=6):");
        Rectangle rect5 = new Rectangle(6, 2);
        System.out.println(rect5.toString());
        rect5.printRectangle();
    }
    
   
    public static void testAllFeatures() {
        System.out.println("Create a rectangle and test all functions:");
        Rectangle rect = new Rectangle(8.0, 12.0);
        
      
        System.out.println("basic information: " + rect.toString());
        
   
        System.out.println("area: " + rect.getArea());
        System.out.println("perimeter: " + rect.getPerimeter());
        
   
        System.out.println("graphical representation:");
        rect.printRectangle();
        
    
        System.out.println("after modifying the size:");
        rect.setLength(4.0);
        rect.setWidth(6.0);
        System.out.println("new size: " + rect.toString());
        System.out.println("new area: " + rect.getArea());
        System.out.println("new perimeter: " + rect.getPerimeter());
        System.out.println("new graphic:");
        rect.printRectangle();
    }
        
}
