import java.util.*;

public class linearsearch {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("enter a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to search:");
        int n = sc.nextInt();
        for (int j = 0; j < 10; j++) {
            if (arr[j] == n) {
                System.out.println("Number found at position:" + j);
                break;
           }
        }
        sc.close();
    }
}
