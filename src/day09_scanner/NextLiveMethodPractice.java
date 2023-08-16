package day09_scanner;

import java.util.Scanner;

public class NextLiveMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // clear out the scanner
        //we have to give extra nextLine() method after the other method of scanner

        System.out.println("Enter your street name:");
        String street = input.nextLine();

        input.close();

    }
}
