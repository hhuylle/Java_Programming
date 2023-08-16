package WednesdayLiveSession.week14.shoppingTask;

public class Warehouse {

    public static void main(String[] args) {


        Shopping[] allShops = {
            new Target(),
                new Target(),
                new Amazon(),
                new Amazon(),
                new EBay(),
        };

        for (Shopping each : allShops) {
            each.buyItem();
        }

        System.out.println();

        for (Shopping each : allShops) {
            if (each instanceof OnlineShopping){
                ((OnlineShopping) each).viewCart();
            }
        }




    }
}
/*
Create a class Warehouse
    create a main method and create Target, Amazon, & EBay object to test the methods
    also use different polymorphic references to check what is accessible
 */
