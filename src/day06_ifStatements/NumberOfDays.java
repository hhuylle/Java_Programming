package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 1;

        boolean _28Days = month == 2,
                _30Days = month == 4 || month == 6 || month == 9 || month == 11,
                _31Days = !_28Days && !_30Days;

        if (_28Days){
            System.out.println("28 days");
        }

        if (_30Days){
            System.out.println("30 days");
        }

        if (_31Days){
            System.out.println("31 days");
        }





    }
}
