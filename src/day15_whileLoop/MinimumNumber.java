package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    /*
    Write a program that can ask the user to enter a number for 5 times and returns the minimum number
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 999999999;//any integer number that user enters will ALWAYS be less than 999999999
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt(); // 50, 60, 20, 30, 40
            if (num<min){ // if the user enters entry is greater than the current maximum number that we have
                min = num; // then user enters number should be the maximum number
            }
        }
        System.out.println("Min = " + min);

        input.close();
    }
}
