package wyjatki;

public class LoginValidationException extends RuntimeException {

    String info;

    public LoginValidationException(String info) {
        this.info = info;
    }
}
