public class CalculatorExceptions extends Exception {

    public CalculatorExceptions() {}
    public CalculatorExceptions(String message) {
        super(message);
    }

    public CalculatorExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculatorExceptions(Throwable cause) {
        super(cause);
    }

    public CalculatorExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}