package dz15;

public class WrongAccountException extends Exception {
    public WrongAccountException() {
        super("Такого акаунту не існує");
    }

    public WrongAccountException(String message) {
        super(message);
    }
}