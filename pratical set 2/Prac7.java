//author: Shrey lakhtaria

public class Prac7 {
    public static void main(String[] args) {
        String str = "CHARUSAT University";

        System.out.println("The length of the string : " + str.length());
        System.out.println("Replace \'H\' for \'N\' : " + str.replace('H', 'N'));
        System.out.println("Convert to upper case : " + str.toUpperCase());
        System.out.println("Extract CHARUSAT : " + str.substring(0, 8));
    }
}
