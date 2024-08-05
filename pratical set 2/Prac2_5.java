//author: Shrey lakhtaria
import java.util.Scanner;

public class Prac2_5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string : ");
            String str = scan.nextLine();
            String newStr = "";
            System.out.print("Output : ");

            for (int i = 0; i < str.length(); i++) 
            {
                newStr = str.charAt(i) + newStr;

                if (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == '.') 
                {
                    System.out.print(newStr);
                    newStr = "";                    
                }
            }
            
            scan.close();
        }
    }
}