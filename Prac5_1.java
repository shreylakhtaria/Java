import java.util.Scanner;

public class Prac5_1 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking inputs
            System.out.print("Enter the first integer (x): ");
            int x = Integer.parseInt(scanner.nextLine()); // integer.parseInt() is used to convert string to integer

            System.out.print("Enter the second integer (y): ");
            int y = Integer.parseInt(scanner.nextLine());

            // Performing division
            int result = x / y;

            // Displaying result
            System.out.println("The result of " + x + " / " + y + " is: " + result);
        } catch (NumberFormatException e) {
            // Handling the case where the inputs are not integers
            System.out.println("Error: Missmatched Formate .");
        } catch (ArithmeticException e) {
            // Handling the case of division by zero
            System.out.println("Error: Demoninator cannot be zero");
        } catch (Exception e) {
            // Handling any other exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Closing the scanner to prevent resource leak
        }
    }
}
