interface Shape 
{
    void draw();
    String getColor();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}

// Rectangle class implementing Shape interface
class Recta implements Shape {
    private double length;
    private double width;
    private String color;

    public Recta(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + " and color " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}

// Sign class
class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign background color: " + shape.getColor());
        System.out.println("Sign text: " + text);
    }
}

// Main class
public class Prac4_7 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red");
        Shape rectangle = new Recta(10.0, 8.0, "Blue");

        circle.draw();
        rectangle.draw();

        Sign sign = new Sign(circle, "Welcome to the campus center!");
        sign.display();
    }
}