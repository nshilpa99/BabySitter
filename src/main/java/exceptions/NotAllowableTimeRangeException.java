package exceptions;


public class NotAllowableTimeRangeException extends RuntimeException {
    public NotAllowableTimeRangeException(String message) {
        super(message);
    }
}