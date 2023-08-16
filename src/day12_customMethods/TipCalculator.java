package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split? (Yes or No)");
        String yesNo = input.next().toLowerCase(); // "YES" to "yes"

        System.out.println("Enter the number if people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = input.next().toLowerCase();

        input.close();

        double totalTip = (service.equals("excellent"))? amount*0.25: (service.equals("great"))? amount*0.20: (service.equals("good"))? amount*0.15: (service.equals("fair"))? amount*0.10: amount*0.05;

        double totalToPay = amount+totalTip;

        System.out.println("Number of people: "+numberOfPeople);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);

        if (yesNo.equals("yes")){
            System.out.println("Total per person: "+ (totalToPay/numberOfPeople));
            System.out.println("Tip per person: "+ (totalTip/numberOfPeople));
        }






    }
}
