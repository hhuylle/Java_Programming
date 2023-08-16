package WednesdayLiveSession.Week5;

public class OverloadingExample {

    public static int add(int n1, int n2){
        return n1+n2;
    }

    public static int add(int n1, int n2, int n3){
        return add(n1, n2) + n3;
    }

    public static double add(double n1, double n2, double n3){
        return add(n1, n2, n3);
    }
}
