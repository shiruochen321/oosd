
   public class Rectangle {

    private double length;
    private double width;
    
    
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
   
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    

    public void setLength(double length) {
        if (length > 0.0 && length <= 40.0) {
            this.length = length;
        } else {
            this.length = 1.0;
            System.out.println("Invalid length, which must be greater than 0.0 and less than or equal to 40.0. the defualt value is 1.0");
        }
    }
    
    
    public void setWidth(double width) {
        if (width > 0.0 && width <= 40.0) {
            this.width = width;
        } else {
            this.width = 1.0;
            System.out.println("Invalid length, which must be greater than 0.0 and less than or equal to 40.0. the defualt value is 1.0");
        }
    }
    
    
    public double getLength() {
        return length;
    }
    
    
    public double getWidth() {
        return width;
    }
    
  
    public double getArea() {
        return length * width;
    }
    
   
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
   
    public void printRectangle() {
        int intLength = (int) Math.round(length);
        int intWidth = (int) Math.round(width);
        
      
        if (intLength <= 0) intLength = 1;
        if (intWidth <= 0) intWidth = 1;
        
        for (int i = 0; i < intWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 0; i < intLength - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < intWidth - 2; j++) {
                System.out.print(" ");
            }
            if (intWidth > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        
       
        if (intLength > 1) {
            for (int i = 0; i < intWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString() {
        return "Length = " + length + ", Width = " + width;
    }
}

    

