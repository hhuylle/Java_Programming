package day09_scanner.practice_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle:");

        double num = input.nextDouble();

        System.out.println("The area of the circle is: "+ num*num*3.14);
        System.out.println("The perimeter of the circle is: "+ num*2*3.14);

        input.close();

    }


}
