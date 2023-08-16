package day04_practiceTask;

public class SalaryCaculator {

    public static void main(String[] args) {

        double hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6.3,
                federalTaxRate = 26.3;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52,
                stateTax = salaryBeforeTax * stateTaxRate / 100,
                federalTax = salaryBeforeTax * federalTaxRate / 100,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                 "\n\tFederal tax is: $" + federalTax +
                 "\n\tState tax is: $" + stateTax +
                 "\n\tTotal tax is: $" + totalTax +
                 "\n\tNet income is: $" + salaryAfterTax);



    }
}
