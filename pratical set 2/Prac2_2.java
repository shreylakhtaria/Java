import java.util.Scanner;

public class Prac2_2 { // Corrected class name

    static int array_count9(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] arr = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the array_count9 function and print the result
        int count = array_count9(arr);
        System.out.println("Number of 9s in the array: " + count);

        scanner.close();
    }
}
