package day09_scanner.practice_tasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total shares you already have: ");
        int shares = input.nextInt();

        System.out.println("Enter your total value in the stock market:");
        double value = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your name of the company that you have the most shares in:");
        String company = input.nextLine();

        input.close();

        if (shares >= 0){
            System.out.println("Your total stock market holding is $"+ (int)value +" which is made up of "+ shares +". "+ company +" is your company holdings");
        }

    }
}
