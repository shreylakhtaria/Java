//author: Shrey lakhtaria

import java.util.Scanner;

public class Prac2_1{
    static String frontTimes(String str, int num) {
        String newstr = "";
        
        for(int i = 0; i < num; i++) {
            newstr += str.substring(0, 3);
        }
        return newstr;
    }
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the string : ");
            String str = scan.nextLine();
            System.out.print("Enter the number : ");
            int n = scan.nextInt();

            System.out.println(frontTimes(str, n)); 
            scan.close();
        }
    }
}
