
//author: Shrey lakhtaria
import java.util.Scanner;

public class Prac2_2 {
    static int array_count9(int arr[]) {
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 9) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the size : ");
            int size = scan.nextInt();
            
            int arr[] = new int[size];
            
            System.out.print("Enter the array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println("\'9\' count : " + array_count9(arr));
            
            scan.close();
        }
    }
}
