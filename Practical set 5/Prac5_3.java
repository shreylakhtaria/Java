// User-defined checked exception
class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

// User-defined unchecked exception
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

public class Prac5_3 {
    // Method that throws a checked exception
    public static void methodWithCheckedException() throws MyCheckedException {
        throw new MyCheckedException("This is a checked exception");
    }

    // Method that throws an unchecked exception
    public static void methodWithUncheckedException() {
        throw new MyUncheckedException("This is an unchecked exception");
    }

    public static void main(String[] args) {
        try {
            methodWithCheckedException();
        } catch (MyCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            methodWithUncheckedException();
        } catch (MyUncheckedException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}