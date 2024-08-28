import java.util.*;

public class Prac5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        
        try {
            int result = divide(x, y);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
    
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}