package day09_scanner.practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your cents: ");
        int cents = input.nextInt();

        input.close();

        int dollars = (cents/100);
        int cent = cents - (dollars*100);

        System.out.println(cents+" cents equal to: "+dollars+" dollars and "+cent+" cents");

    }

}
