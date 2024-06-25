package dz15;

public class WrongCurrencyException extends Exception {
    public WrongCurrencyException() {
        super("Акаунт має рахунок в іншій валюті");
    }

    public WrongCurrencyException(String message) {
        super(message);
    }
}