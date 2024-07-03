// Author: Shrey lakhtaria
// Date: 1 july 2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of items: ");
        int numItems = scan.nextInt();

        int[] productCodes = new int[numItems];
        double[] prices = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter product code for item " + (i + 1) + ": ");
            productCodes[i] = scan.nextInt();
            
            System.out.println("Enter price for item " + (i + 1) + ": ");
            prices[i] = scan.nextDouble();
        }

        double totalBill = 0;

        for (int i = 0; i < numItems; i++) {
            switch (productCodes[i]) {
                case 1 ->
                    totalBill += prices[i] + (prices[i] * 0.08);
                    // break;
                case 2 ->
                    totalBill += prices[i] + (prices[i] * 0.12);
                    // break;
                case 3 ->
                    totalBill += prices[i] + (prices[i] * 0.05);
                    // break;
                case 4 ->
                    totalBill += prices[i] + (prices[i] * 0.075);
                    // break;
                    default ->
                    totalBill += prices[i] + (prices[i] * 0.03);
                    // break;
            }
        }

        System.out.println("Total bill: $" + totalBill);

        scan.close();
    }
}