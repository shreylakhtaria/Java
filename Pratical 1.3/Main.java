import java.util.*;

public class Main
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