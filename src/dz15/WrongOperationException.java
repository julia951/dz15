package dz15;

public class WrongOperationException extends Exception {
    public WrongOperationException() {
        super("Акаунт не має достатньо коштів");
    }

    public WrongOperationException(String message) {
        super(message);
    }
}