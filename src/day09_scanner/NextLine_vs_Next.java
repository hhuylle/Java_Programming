package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt(); // 31

        input.nextLine(); // Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);


    }
}
