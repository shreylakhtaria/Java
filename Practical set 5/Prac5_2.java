public class Prac5_2 {
    public static void main(String[] args) {
        try {
            // Example of division by zero
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        }

        try {
            // Example of parsing a string to a numeric variable
            String number = "abc";
            int num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }

        try {
            // Example of accessing an invalid index in a string
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }

        try {
            // Example of accessing an invalid index in an array
            int[] arr = {1, 2, 3};
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            // Throwing a custom exception
            throw new MyException(5);
        } catch (MyException e) {
            System.out.println("MyException[" + e.getparameter() + "]");
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}

// Custom exception class
class MyException extends Exception {
    private int parameter;

    public MyException(int parameter) {
        this.parameter = parameter;
    } 

    public int getparameter() {
        return parameter;
    }
}
