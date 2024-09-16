import java.io.*;
import java.util.Scanner;


public class prac6_3 {

public static void main(String[] args) {
    try {

        File file = new File("D:\\COLLEGE_TECH\\SEM-3\\JAVA\\Java\\Practical set 6\\sample.txt");
        Scanner FileReader = new Scanner(file);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the word you want to seach:  ");
        String word = sc.next();
        boolean found = false;

        Integer line =0;

        while (FileReader.hasNextLine())
        {
            line++;
            String lineContent = FileReader.nextLine();
            if (lineContent.contains(word))
            {
                found = true;
                System.out.println("Word found at line: " + line + " and the line is: " + lineContent);
            }  
          

        }

        if (!found)
        {
            System.out.println("Word not found");
        }



    }
    catch  (FileNotFoundException e)
    {
        System.out.println("File not found");
    }
   

}
}

