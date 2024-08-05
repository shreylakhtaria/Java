// Base class Rectangle
class Rectangle {
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


public class Main {
    public static void main(String[] args) {
        // Create an array of Rectangle and Square objects
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(10, 5); // Rectangle object
        shapes[1] = new Square(6); // Square object

       
        for (Rectangle shape : shapes) {
        
            shape.printArea();
            shape.printPerimeter();
            System.out.println();
        }
    }
}
