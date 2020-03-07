package pl.sda.wyjatki.exceptions;

public class EmailException extends Exception {
        // alt + insert i dodanie wyjatkow
    public EmailException() {
    }

    public EmailException(String message) {
        super(message);
    }

}
