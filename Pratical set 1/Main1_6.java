// Author: Shrey lakhtaria
// Date: 1 july 2024
import java.util.Scanner;

public class Main1_6 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int reversedNumber = 0;
        scan.close();

        while (number != 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit; // java handle integer variable delcartion as 32 bit signed integer
            number /= 10;

        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}