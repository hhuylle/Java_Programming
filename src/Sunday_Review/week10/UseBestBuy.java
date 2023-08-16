package Sunday_Review.week10;

public class UseBestBuy {

    public static void main(String[] args) {

        System.out.println("MAIN METHOD RUNNING"); // The main method is the way to run Java code

        //System.out.println(BestBuy.ceo);
        System.out.println(new BestBuy("132213 Cook Drive",213,40));

        BestBuy store1 = new BestBuy("2903 Jansen Ave",213,40);

        store1.reportProfits();
        System.out.println(BestBuy.revenue);
        //System.out.println(store1.revenue);

    }
}
