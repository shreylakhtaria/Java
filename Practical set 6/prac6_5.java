import java.io.*;

public class prac6_5 {
    public static void main(String[] args) {
        // Using BufferedReader to read console input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter some text: ");
            String input = reader.readLine();

            // Writing the input to a file using BufferedWriter
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                writer.write(input);
                System.out.println("Text written to output.txt using character stream.");
            }

            // Reading the file content using FileInputStream (byte stream)
            try (FileInputStream fis = new FileInputStream("output.txt")) {
                int content;
                System.out.print("Content read from output.txt using byte stream: ");
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content);
                }
            }
        } catch (IOException e) {
            System.out.println (e.getMessage());
        }
        
    }
}