public class InsufficientBalance extends Exception {
    String message = "There is insufficient balance in your Account";

    public InsufficientBalance(String message) {
        super(message);
    }
}
