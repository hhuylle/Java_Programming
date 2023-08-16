package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 31;

        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        System.out.println("----------------------------------");

        if (age >= 21) System.out.println("Eligible");
        else System.out.println("Not eligible");

        System.out.println("-----------------------------------");
        /*
        int itemNumber = 1;

        if (itemNumber == 1)
            System.out.println("Eggs");
            System.out.println("Oranges");
        else if (itemNumber == 2)
            System.out.println("Milk");
            System.out.println("Onion");
        else
            System.out.println("Apple");
            System.out.println("Cherry");*/

        int day = 7;

        String result = "";

        if (day == 1) result = "Monday";
         else if (day == 2) result = "Tuesday";
         else if (day == 3) result = "Wednesday";
         else if (day == 4) result = "Thursday";
         else if (day == 5) result = "Friday";
         else if (day == 6) result = "Sartuday";
         else if (day == 7) result = "Sunday";
         else result = "Invalid";
         System.out.println(result);

         //IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACRICE

        System.out.println("-----------------------------------");



    }
}
