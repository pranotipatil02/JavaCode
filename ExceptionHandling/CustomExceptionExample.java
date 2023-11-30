 class CustomCheckedException extends Exception {
    public CustomCheckedException() {
        super();
    }

    public CustomCheckedException(String message) {
        super(message);
    }
}

 class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }
}


public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Example: Throw a checked exception
            throw new CustomCheckedException("This is a checked custom exception.");
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }

        // Example: Throw an unchecked exception
        throw new CustomUncheckedException("This is an unchecked custom exception.");
    }
}
