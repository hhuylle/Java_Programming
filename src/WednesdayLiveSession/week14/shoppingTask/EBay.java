package WednesdayLiveSession.week14.shoppingTask;

public final class EBay extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void uploadProduct() {
        System.out.println("Upload product to Ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing cart on Ebay");
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping from Ebay to Customer");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Ebay app or website");
    }

    @Override
    public void returnItem() {
        System.out.println("Returing item to Ebay");
    }
}
/*
 Create a concrete class EBay
        - Make the class final
        - Inherit OnlineShopping and implements interface AllowUsersToSell interface
        - Implement all abstract methods
 */
