package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class UntilNegative {
    /*
    Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num<0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);




    }
}