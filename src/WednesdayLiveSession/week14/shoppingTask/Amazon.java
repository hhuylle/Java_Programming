package WednesdayLiveSession.week14.shoppingTask;

public final class Amazon extends OnlineShopping implements Shipping{


    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping from Amazon warehouse");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Amazon app or website");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon");
    }
}
/*

    Create a concrete class Amazon
        - Make the class final
        - Inherit OnlineShopping and implement all abstract methods

 */
