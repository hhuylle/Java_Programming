package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name:");
        String companyName = input.nextLine();

        System.out.println("Enteryour job title:");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        System.out.println("Employee's name: "+fullName);
        System.out.println("Employee's age: "+age);
        System.out.println("Employee's gender: "+gender);
        System.out.println("Company name: "+companyName);
        System.out.println("Employee's job title: "+jobTitle);
        System.out.println("Employee's salary: $"+salary);

        input.close();
    }
}
