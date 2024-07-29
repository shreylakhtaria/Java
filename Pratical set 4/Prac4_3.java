class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}

public class Prac4_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);

        rectangle.printArea();
        rectangle.printPerimeter();

        square.printArea();
        square.printPerimeter();
    }
}
