package day25_constructor.practiceTasks;

public class SalaryCalculator {
    /*
    Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
     */
    public int hourlyRate, weeklyHours;
    public double stateTaxRate, federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
    }

    public double salary(){
        double totalSalary = hourlyRate*weeklyHours*52;
        return totalSalary;
    }

    public double stateTax(){
        double totalStateTax = salary()*stateTaxRate;
        return totalStateTax;
    }

    public double federalTax(){
        double totalFederalTax = salary()*federalTaxRate;
        return totalFederalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary()-(stateTax()+federalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Salary = $" + salary() +
                ", Total salary of state tax = $" + stateTax() +
                ", Total salary of federal tax = $" + federalTax() +
                ", Total salary after tax = $" + salaryAfterTax() +
                '}';
    }
}
