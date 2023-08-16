package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class DivideTwoNumbers {
    /*
    Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        int divideTwoNum = 0;
        for (int i = 0; num1>=num2; i++) {
            if (num1>=num2){
                num1 -= num2;
                divideTwoNum++;
            }
        }

        System.out.println(divideTwoNum);


    }
}
