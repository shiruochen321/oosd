public class Circle extends Point{
      private double radius;
    
    // Constructor
    public Circle(double x, double y, double radius) {
        super(x, y); // Call parent constructor
        this.radius = radius;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

}
