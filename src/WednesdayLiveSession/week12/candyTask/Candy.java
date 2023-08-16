package WednesdayLiveSession.week12.candyTask;

public class Candy {
    /*
    Create a class Candy

        declare these instance variables:
            - brand (String), quantity (int), contains peanuts (boolean)
                make brand and contains peanuts

        declare a static variables:
            - number of total candy in the world: 500,000
            - country with largest candy consumption: United States

        create a constructor to set all instance variables

        override toString
     */
    String brand;
    int quantity;
    boolean hasPeanuts;

    static int totalCandyInWorld = 500_000;
    static String largestConsumer = "United States";

    public Candy(int quantity, boolean hasPeanuts) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        return "I have "+quantity+" "+brand+" which "+(hasPeanuts? "has": "doesn't have")+" peanuts";
    }
}
