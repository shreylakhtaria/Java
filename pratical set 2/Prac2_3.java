
//author: Shrey lakhtaria
import java.util.Scanner;

public class Prac2_3 {
    static boolean array_front9(int arr[]) {
        
        for(int i = 0 ; i < arr.length ; i++){
            if( i<4 && arr[i] == 9) 
            {
                return true;
            }
        }
        
        return false;
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

            System.out.println("\'9\' in first 4 elements : " + array_front9(arr));
            
            scan.close();
        }
    }
}
