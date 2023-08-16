package day17_customClass.practiceTasks;

public class SalaryCalculator {
    /*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;


    public void setInfoSalaryCalculator(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){;
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                ", Total salary = $" + salary() +
                ", Total state tax = $" + stateTax() +
                ", Total federal tax = $" + federalTax() +
                ", Total salary after tax = $" + salaryAfterTax() +
                '}';
    }
}
