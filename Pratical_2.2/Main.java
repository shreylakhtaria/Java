import java.util.Scanner;

public class Main 
{
    public static void main(String[] Args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scan.nextInt();
        int count = 0;
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] == 9) 
            {
                count++;
            }
        }
        System.out.println("The number of 9s in the array is: " + count);
        scan.close();
    }
    
}
