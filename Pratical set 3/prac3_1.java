//author : Shrey lakhtaria
import java.util.*;

public class prac3_1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in pounds: ");
        int pound = sc.nextInt();
        int rupee;
        rupee = pound * 100;
        System.out.println("Equivalent Rupees: " + rupee);
        sc.close();

    }
}

