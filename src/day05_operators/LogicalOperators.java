package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // Truth Table for && Logical AND
        double salary = 60000;
        int creditScore = 700;
        int age = 30;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);

        System.out.println("-------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("-------------------------------------------");

        // Truth table for || Logical OR
        String answer = "no";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);
        System.out.println("-------------------------------------------");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);

        System.out.println("-------------------------------------------");

        // Logical NOT operator
        System.out.println( !true);

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);
        System.out.println("-------------------------------------------");

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("-------------------------------------------");

        System.out.println( true == !false && false ==!true && true != !true);
        //



    }
}
