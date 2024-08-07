// Base class Rectangle
class Rectangle 
{
    protected double length;
    protected double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print area of the rectangle
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and print perimeter of the rectangle
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Derived class Square inherits Rectangle
class Square extends Rectangle {

    // Constructor to initialize side of the square
    public Square(double side) {
        super(side, side);
    }
}

public class Prac4_3 {
    public static void main(String[] args) 
    {
     
        Rectangle[] shapes = new Rectangle[2]; // ARRAY OF OBJECT.
        
        System.out.println("Area and Perimeter of Rectangle");
        shapes[0] = new Rectangle(4, 8); 
        shapes[0].printArea();
        shapes[0].printPerimeter();
        
        System.out.println("Area and Perimeter of Square");
        shapes[1] = new Square(6); // Square object
        shapes[1].printArea();
        shapes[1].printPerimeter();
        
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printArea();
            shapes[i].printPerimeter();
        }
    }
}
