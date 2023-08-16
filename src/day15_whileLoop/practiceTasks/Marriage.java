package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class Marriage {

    public static void main(String[] args) {
        /*
        Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please re-enter your answer: ");
            answer = input.next();
        }

        if (answer.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }


    }
}
