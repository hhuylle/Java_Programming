package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        /*
        Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
         */

        Scanner input = new Scanner(System.in);

        int isPositive = 0,
            isNegative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your five numbers: ");
            int num = input.nextInt();

            if (num>0){
                isPositive++;
            } else if (num<0) {
                isNegative++;
            }else {
                continue;
            }
        }

        System.out.println(isPositive+" positive and "+isNegative+" negative.");









    }
}
