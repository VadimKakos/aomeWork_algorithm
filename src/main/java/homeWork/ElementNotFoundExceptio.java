package homeWork;

public class ElementNotFoundExceptio extends RuntimeException {
    public ElementNotFoundExceptio() {
    }

    public ElementNotFoundExceptio(String message) {
        super(message);
    }

    public ElementNotFoundExceptio(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundExceptio(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundExceptio(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
