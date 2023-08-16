package day06_ifStatements.day06_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 40, b = 30, c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b),
                bIsMedian = (b > a && b < c) || (b > c && b < a),
                cIsMedian = !aIsMedian && !bIsMedian;

        if ( aIsMedian ){
            System.out.println(a + " is the median number");
        }

        if ( bIsMedian ){
            System.out.println(b + " is the median number");
        }

        if ( cIsMedian ){
            System.out.println(c + " is the median number");
        }
    }
}
