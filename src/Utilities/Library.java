package Utilities;

public class Library {

    public static void sleep(double seconds) {

        try {
            Thread.sleep( (long)(seconds*1000L) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
