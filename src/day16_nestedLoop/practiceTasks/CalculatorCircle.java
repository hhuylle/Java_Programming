package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class CalculatorCircle {
    /*
    Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
     */

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius of the circle");
        double radius = scan.nextDouble();

        while ( !(radius>0)){
            System.err.println("Invalid entry for the radius of the circle ");
            radius = scan.nextDouble();
        }

        double diameter = 2*radius;
        double area = radius*radius*3.14;
        double perimeter = diameter*3.14;

        System.out.println("Diameter of circle = "+diameter);
        System.out.println("Area of circle = "+area);
        System.out.println("Perimeter of circle = "+perimeter);

        scan.nextLine();

        System.out.println("Would you like to calculate another circle? Yes/No");
        String answer = scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid entry, plaese re-enter a valid entry");
            answer = scan.next().toLowerCase();
        }

        if (answer.equals("yes")){
            System.out.println("Diameter of circle = "+diameter);
            System.out.println("Area of circle = "+area);
            System.out.println("Perimeter of circle = "+perimeter);


        }else {
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
        }


        scan.close();
        */

        String answer = "yes";
        while (answer.equals("yes")){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the radius of the Circle: ");
            double radius = input.nextInt();

            while ( !(radius>0)){
                System.err.println("Invalid Entry for the radius of the circle, please re-enter a valid entry: ");
                radius = input.nextInt();
            }

            double diameter = 2*radius;
            double area = radius*radius*3.14;
            double perimeter = diameter*3.14;
            System.out.println("Diameter of circle = "+diameter);
            System.out.println("Area of circle = "+area);
            System.out.println("Perimeter of circle = "+perimeter);

            System.out.println("Would you like to calculate another circle? Yes/No");
            answer = input.next().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer. please re-enter a valid answer");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }



        }

        System.exit(1);



    }
}
