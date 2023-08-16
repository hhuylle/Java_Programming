package day14_forLoop.practiceTasks;

import java.util.Scanner;

public class FactoryNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();

        int multiple = 1;

        for (int i = num; i > 0 ; i--) {
            multiple *= i;
        }
        System.out.println(multiple);

    }
}
/*
Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */