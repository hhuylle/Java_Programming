package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 85;

        boolean isEven = number % 2 == 0; // when we divide a number by 2, if the remainder is 0, means the number is even
        //boolean isOdd = number % 2 != 0; // when we divide a number by 2, if the remainder is NOT 0, means the number is odd
        boolean isOdd = !isEven; // if the number is not even, then is's odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);
    }
}
