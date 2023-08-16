package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class CalculatorSquare {
    /*
    Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
     */
    public static void main(String[] args) {

        String answer = "yes";

        while (answer.equals("yes")){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the side of the square: ");
            double side = input.nextDouble();

            while ( !(side>0)){
                System.err.println("Invalid entry for the side of the square ");
                side = input.nextDouble();
            }

            double area = side*side;
            double perimeter = 4*side;
            System.out.println("Area of the square = " + area);
            System.out.println("Perimeter of the square = " + perimeter);


            System.out.println("Would you like to calculate another Square? Yes/No");
            answer = input.next().toLowerCase();

            while ( !(answer.equals("no") || answer.equals("yes"))){
                System.out.println("Invalid answer, please re-enter a valid answer: ");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
        }

        System.exit(1);

    }
}
