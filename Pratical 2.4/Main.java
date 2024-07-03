import java.util.Scanner;

public class Main 
{
    public static void doublechar (String arr)
    {
        String temp = "";
        for  (int i =0 ; i < arr.length(); i++)
        {
            temp += String.format("%c%c", arr.charAt(i), arr.charAt(i)); // %c is used to format the character and charat

        }
        System.out.println(temp);
    }

    public static void main (String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        doublechar(str);
        scan.close();


    }
}
