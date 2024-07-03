// Author: Shrey lakhtaria
// Date: 1 july 2024
import java.util.*;

public class Main3
{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        double var = scan.nextDouble();

        int x = (int)var;

        short y = (short)((var-x)*1000);

        System.out.println("\nthe value is : "+x+"."+y);

        scan.close();

    }
}