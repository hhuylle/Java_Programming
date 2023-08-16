package day09_scanner.practice_tasks;

import java.util.Scanner;

public class PlaceAnOder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String product = input.next();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int num = input.nextInt();

        System.out.println("Enter your first name:");
        String firstName = input.next();

        input.close();

        double total = num*price;

        System.out.println(firstName+ ", your order for "+ num + " " + product + " has been places. Your total is: "+ total+"." );




    }
}
