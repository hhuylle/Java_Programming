package WednesdayLiveSession.week14.shoppingTask;

public interface Shipping {

    // variables will be public static final

    void shipItem();

    default void notification(){
        System.out.println("Sending email: Package Shipped");
    }
}
/*

    Create an interface Shipping
        - Declare an abstract methods:
            shipItem()

 */
