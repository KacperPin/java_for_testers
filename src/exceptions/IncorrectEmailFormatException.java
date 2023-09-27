package exceptions;

public class IncorrectEmailFormatException extends RuntimeException {

    public IncorrectEmailFormatException() {
    }

    public IncorrectEmailFormatException(String message) {
        super(message);
    }
}
