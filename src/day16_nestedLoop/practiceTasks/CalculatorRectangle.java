package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class CalculatorRectangle {
    /*
    Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


     */

    public static void main(String[] args) {

            String answer = "yes";
            while (answer.equals("yes")){
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the length of the Rectangle: ");
                double length = input.nextDouble();

                while ( !(length>0) ){
                    System.err.println("Invalid entry for the length of the Rectangle");
                    length = input.nextDouble();
                }

                System.out.println("Enter the width of the Rectangle: ");
                double width = input.nextDouble();

                while ( !(width>0)){
                    System.err.println("Invalid entry for the width of the Rectangle");
                    width = input.nextDouble();
                }

                double area = length*width;
                double perimeter = 2*(length+width);
                System.out.println("The area of the Rectangle = " + area);
                System.out.println("The perimeter of the Rectangle = " + perimeter);

                System.out.println("Would you like to calculate another Rectangle? Yes/No");
                answer = input.next().toLowerCase();

                while ( !(answer.equals("yes") || answer.equals("no")) ){
                    System.out.println("Invalid answer, please re-enter a valid answer ");
                    answer = input.next();
                }

                if (answer.equals("no")){
                    System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                }
            }

        System.exit(1);












    }
}
