package day09_scanner.practice_tasks;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the miles: ");
        double miles = input.nextDouble();

        System.out.println(miles+" miles equal to " + (miles*1.609) +" kilometers");

        input.close();

    }
}
