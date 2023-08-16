package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt(); // valid age 1 ~ 120

        while (!(age >=1 && age<=120)){ // while the age is not valid
            System.err.println("Invalid entry, Please re-enter your age: ");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String isUsCitizen = input.next().toLowerCase();

        while ( !( isUsCitizen.equals("yes") || isUsCitizen.equals("no") ) ){ // while the answer is nerther yes or no
            System.err.println("Invalid entry, Please re-enter: ");
            System.out.println("Are you a US citizen? Yes/No");
            isUsCitizen = input.next().toLowerCase();
        }

        if (age>=18 && isUsCitizen.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

        input.close();




    }
}
