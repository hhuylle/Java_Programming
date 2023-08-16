package day09_scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your phone number: ");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();

        System.out.println("Enter your city name: ");
        String cityName = input.next();

        System.out.println("Enter your state name: ");
        String stateName = input.next();

        System.out.println("Enter your building name: ");
        int buildingName = input.nextInt();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();
        streetName = input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.next();

        System.out.println("Your full name is: " + fullName);
        System.out.println("Your age is: " + age);
        System.out.println("Your gender is: " + gender);
        System.out.println("Your phone number is: "+ phoneNumber);
        System.out.println("Your address is:\n\t\t\t\t"+buildingName+" "+streetName+"\n\t\t\t\t"+cityName+", "+stateName+" "+zipCode);

        System.out.println("Your school name is: " + schoolName);

        input.close();
















    }
}
