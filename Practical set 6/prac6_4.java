

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prac6_4 {
    public static void main(String[] args) {
        try (FileWriter copyFile = new FileWriter("D:\\COLLEGE_TECH\\SEM-3\\JAVA\\Java\\Practical set 6\\samplecopy.txt")) {
            File file = new File("D:\\COLLEGE_TECH\\SEM-3\\JAVA\\Java\\Practical set 6\\sample.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                copyFile.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}