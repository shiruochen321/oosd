public class Driver {
    public static void main(String args[]) {
        ThreeDShape threeDShape;
        Shape shape;
        Circle circle = new Circle("Circle One", "Red", 10.0);
        Rectangle rectangle = new Rectangle("Rectangle One", "Yellow", 15.0, 20.0);
        Cylinder cylinder = new Cylinder("Cylinder One", "Green", 6, 8);
        Sphere sphere = new Sphere("Sphere One", "Blue", 77);
        Triangle triangle = new Triangle("Triangle One", "Orange", 10.0, 5.0);

        // print them using references of the objects type
        System.out.println("\n---Using circle reference" + circle.toString());
        System.out.println("\n---Using rectangle reference" + rectangle.toString());
        System.out.println("\n---Using cylinder reference" + cylinder.toString());
        System.out.println("\n---Using sphere reference" + sphere.toString());
        System.out.println("\n---Using triangle reference" + triangle.toString());

        // This will not work as a circle or a rectangle are not ThreeDShape objects
        // threeDShape = circle;

        // Use a reference for the superclass to refer to an object of the subclass
        // print subclass object using references to abstract super class reference
        shape = circle;
        System.out.println("\n---Using Shape reference for circle: " + shape.toString());
        
        shape = triangle;
        System.out.println("\n---Using Shape reference for triangle: " + shape.toString());
    }

}
