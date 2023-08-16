package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class CalculatorGrade {
    /*
    Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

                         Hint: you can use  System.exit(1) to terminate the entire program
     */

    public static void main(String[] args) {

            String answer = "yes";

            while (answer.equals("yes")){
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter your score: ");
                int score = scan.nextInt();

                while ( !(score>=0 && score<=100) ){ // while the given score is invalid
                    System.err.println("Invalid Entry, please re-enter a valid score: ");
                    score = scan.nextInt();
                }

                String result = score>=90? "A": score>=80? "B": score>=70? "C": score>=60? "D": "F";
                System.out.println(score + " --> " + result);

                System.out.println("Would you like to continue? Yes/No");
                answer = scan.next().toLowerCase();

                while ( !(answer.equals("yes") || answer.equals("no")) ){ // while the given answer is invalid
                    System.err.println("Invalid Entry, please re-enter a valid answer: ");
                    answer = scan.next().toLowerCase();
                }

                if (answer.equals("no")) {
                    System.out.println("Thank you for using Cydeo Grade Calculator APP");
                }


            }
        System.exit(1);



    }
}
