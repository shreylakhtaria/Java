import java.util.*;

class TriangleArea {
    private double base;
    private double height;

    public TriangleArea() {
        // Default constructor
    }

    public TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }
}

public class prac3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        TriangleArea triangle = new TriangleArea(base, height);
        System.out.println("Area of the triangle: " + (0.5 * triangle.getBase() * triangle.getHeight()));
        sc.close();
    }
}
