import java.util.*;

public class binarySearch {
    public static void main (String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search:");
         int low = 0;
         int high = arr.length;
        int mid;

        int n = sc.nextInt();
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == n) 
            {
                System.out.println("Number found at position:" + mid);
                break;
            }
            else if (arr[mid] < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    sc.close();
    }
    
}
