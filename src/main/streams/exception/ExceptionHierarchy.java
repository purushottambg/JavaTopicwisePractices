package exception;

/// Custom Exception Class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class ExceptionHierarchy {
    // Method that throws custom exception
    static void checkNumber(int num) throws MyCustomException {
        if (num < 0) {
            throw new MyCustomException("Number cannot be negative!");
        }
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5); // This will throw our custom exception
        } catch (MyCustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
