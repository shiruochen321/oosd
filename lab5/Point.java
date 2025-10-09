public class Point {
    protected double x;
    protected double y;
    
    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter for x
    public double getX() {
        return x;
    }
    
    // Setter for x
    public void setX(double x) {
        this.x = x;
    }
    
    // Getter for y
    public double getY() {
        return y;
    }
    
    // Setter for y
    public void setY(double y) {
        this.y = y;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    
}
