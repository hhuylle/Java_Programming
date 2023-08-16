package Sunday_Review.week14.bankTask;

public class CanNotBeNegativeException extends Exception{

    public CanNotBeNegativeException() {
        super("The input cannot be negative");
    }
}
