import java.util.*;

//author : Shrey lakhtaria

public class prac3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in pounds: ");
        double pound = sc.nextDouble();
        double rupee;
        rupee = pound * 100;
        System.out.println("Equivalent Rupees: " + rupee);
        sc.close();
    }
}
