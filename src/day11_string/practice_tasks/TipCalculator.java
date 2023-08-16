package day11_string.practice_tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split: (yes/no)?");
        String answer = input.next();

        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double checkAmount = input.nextDouble();

        input.nextLine();

        System.out.println("How was the service quality: (Excellent/Great/Good/Fair/Poor)?");
        String serviceQuality = input.next();

        input.close();

        double totalTip = checkAmount/numberOfPeople;
        double totalPay = checkAmount+totalTip;
        double totalPerPerson = totalPay/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;


        if (serviceQuality.equals("Excellent")){
            double tip25 = 25/100;
        } else if (serviceQuality.equals("Great")) {
            double tip20 = 20/100;
        } else if (serviceQuality.equals("Good")) {
            double tip15 = 15/100;
        } else if (serviceQuality.equals("Fair")) {
            double tip10 = 10/100;
        }else {
            double tip5 = 5/100;
        }


        if (answer.equals("yes") && serviceQuality.equals(serviceQuality)){
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: $" + totalPay);
            System.out.println("Total tip: $" + totalTip);
            System.out.println("Total per person: $" + totalPerPerson);
            System.out.println("Tip per person: $" + tipPerPerson);
        } else {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: $" + totalPay);
            System.out.println("Total tip: $" + totalTip);

        }

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent")) ? 0.25 : (service.equals("great")) ? 0.2
                : (service.equals("good")) ? 0.15 : (service.equals("fair")) ? 0.1 : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);

        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + (amount / numOfPeople));
            System.out.println("Tip per person: " + (totalTip / numOfPeople));
        }

        scan.close();
         */


    }
}
