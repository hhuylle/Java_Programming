package WednesdayLiveSession.week12.candyTask;

public class TestCandy {

    public static void main(String[] args) {



        Take5 take5 = new Take5(10);
        System.out.println(take5);

        Twix twix = new Twix(5,false);
        System.out.println(twix);

        HersheyBar hersheyBar = new HersheyBar(8);
        System.out.println(hersheyBar);
        System.out.println(HersheyBar.hq);

        HersheyKiss hersheyKiss = new HersheyKiss(15);
        System.out.println(hersheyKiss);
        System.out.println(HersheyKiss.hq);

        Candy candy = new Candy(100,false);
        System.out.println(Candy.largestConsumer);
        System.out.println(Twix.largestConsumer);
        System.out.println(HersheyBar.largestConsumer);

        System.out.println();

        Twix.largestConsumer = "Canada";
        System.out.println(Twix.largestConsumer);

        System.out.println();

        System.out.println(HersheyBar.hq);
        System.out.println(HersheyKiss.hq);



    }
}
