package day09_scanner.practice_tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter his/her hourly rate:");
        int num1 = input.nextInt();

        System.out.println("Enter hours that he/she works in a week:");
        int num2 = input.nextInt();

        System.out.println("Enter the state tax:");
        double rate1 = input.nextDouble();

        System.out.println("Enter the federal tax:");
        double rate2 = input.nextDouble();

        input.close();

        double salary = num1*num2*52,
                stateTax = salary*rate1,
                federalTax = salary*rate2,
                totalTax = stateTax+federalTax,
                netIncome = salary-totalTax;

        System.out.println("The salary is: $" + salary);
        System.out.println("The state tax is: $" + stateTax);
        System.out.println("The federal tax is: $" + federalTax);
        System.out.println("The total tax is: $" + totalTax);
        System.out.println("The net income is: $" + netIncome);





    }
}
