package Utilities;

import Utilities.ArraysUtility;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TestingTasks {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        double premiumCost = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine().toLowerCase();

        System.out.println("Do you have a US driver license?");
        String driverLicense = input.next().toLowerCase();

        if (driverLicense.equals("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        switch (zipCode) {
        }

        System.out.println("Is this vehicle owned, financed, or leased?");
        String vehicle = input.next().toLowerCase();

        if (vehicle.equals("owned")) {
            premiumCost += 10;
        } else if (vehicle.equals("financed")) {
            premiumCost += 15;
        } else if (vehicle.equals("leased")) {
            premiumCost += 20;
        }

        System.out.println("How is this vehicle primarily used?");
        String used = input.nextLine().toLowerCase();

        input.next();

        if (used.equals("business")) {
            premiumCost += 50;
        }
        if (used.equals("pleasure")) {
            premiumCost += 10;
        }
        if (used.equals("commuting")) {
            premiumCost += 20;

            System.out.println("How many days do you commute?");
            int commuteDates = input.nextInt();
            premiumCost += commuteDates * 5;
        }

        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age >= 16 && age < 20) {
            premiumCost *= 10;
        } else if (age >= 20 && age < 25) {
            premiumCost *= 6;
        } else {
            premiumCost *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String hadAccidents = input.next().toLowerCase();

        if (hadAccidents.equals("yes")) {
            System.out.println("How many");
            int numOfAccidents = input.nextInt();
            premiumCost += 10 * numOfAccidents;
            //premiumCost += 10 * input.nextInt();
        }

        System.out.println("What is the highest level of education you have completed?");
        String edu = input.nextLine().toLowerCase();

        if (edu.equals("bachelors") || edu.equals("masters")) {
            premiumCost *= (95 / 100); //reduce 5% = 100%-5% = 95% of premium
        } else if (edu.equals("phd")) {
            premiumCost *= (90 / 100); //reduce 10% = 100%-10% = 90% of premium
        } else if (edu.equals("high school")) {
            premiumCost *= (105 / 100); //increase 5% = 100%+5% = 105% of premium
        }

        String quote = "";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        String referenceNumber = (firstName.substring(0, 2) + age + lastName.substring(lastName.length() - 3) + zipCode + edu).toUpperCase();

        quote += firstName.substring(0, 1).toUpperCase() + " " + lastName.substring(0, 1).toUpperCase() + " , here is your quote!";
        quote += "\nThis is your start premium cost: $" + premiumCost;
        quote += "\nThis is your reference number: " + referenceNumber;


        input.close();
    }
}




