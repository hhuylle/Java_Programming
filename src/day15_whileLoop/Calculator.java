package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator: ");
        char mathOperator = input.next().charAt(0);

        while (!(mathOperator=='+' || mathOperator=='-' || mathOperator=='*' || mathOperator=='/')){
            System.out.println("Invalid entry, Please re-enter a math operator: ");
            mathOperator = input.next().charAt(0);
        }

        if (mathOperator=='+'){
            System.out.println(num1+num2);
        } else if (mathOperator=='-') {
            System.out.println(num1-num2);
        } else if (mathOperator=='*') {
            System.out.println(num1*num2);
        }else {
            System.out.println(num1/num2);
        }

        // comparison
    }
}
