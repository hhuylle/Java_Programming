package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -20;

        boolean isPositiveNumber = number > 0; // if the number greater than zero, then it's a positive number
        boolean isNegativeNumber = number < 0; // if the number less than zero, then it's a negative number
        //boolean isZero = number == 0; // if the number equal to zero, then it's zero

        boolean isZero = !isPositiveNumber && !isNegativeNumber; // if the number is NOT positive and NOT negative. then it's zero


        System.out.println(number + " is positive number: " + isPositiveNumber);
        System.out.println(number + " is negative number: " + isNegativeNumber);
        System.out.println(number + " is zero: " + isZero);



    }
}
