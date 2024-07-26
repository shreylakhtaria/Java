
//author: Shrey lakhtaria
    import java.util.*;

public class Prac2_4 
{
    static String double_char(String str) {
        String newStr = "";

        for(int i = 0; i < str.length(); i++) {
            newStr += String.format("%c%c", str.charAt(i), str.charAt(i));
        }
        
        return newStr;
    }
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string : ");
            String str = scan.nextLine();
            
            System.out.println("Output : " + double_char(str));

            scan.close();
        }
    }
}
