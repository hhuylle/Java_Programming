package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();

        input.nextLine(); // to clear the Scanner

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();


        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        System.out.println("Your shipping address is:\n\t\t"+fullName+"\n\t\t"+buildingNumber+" "+streetName+"\n\t\t"+cityName+", "+state+" "+zipCode);

        input.close();

    }
}
