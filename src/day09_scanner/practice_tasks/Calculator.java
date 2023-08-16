package day09_scanner.practice_tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char ch = input.next().charAt(0);

        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();

        input.close();

        double character = 0;

        switch (ch){
            case '+':
                System.out.println("The calculator result is: " + (num1+num2));
                break;
            case '-':
                System.out.println("The calculator result is: " + (num1-num2));
                break;
            case '*':
                System.out.println("The calculator result is: " + (num1*num2));
                break;
            case '/':
                System.out.println("The calculator result is: " + (num1/num2));
                break;
            default:
                System.out.println("Invalid Entry");

        }





    }
}
