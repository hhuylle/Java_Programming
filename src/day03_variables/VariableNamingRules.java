package day03_variables;

public class VariableNamingRules {

    /*
        variable naming rules:
        1. readable, understandable, and meaningful
        2. must be UNIQUE
        3. Camel Case
        4. Can not have special characters other than _ and $
        5. Can not star with digits
     */

    public static void main(String[] args) {

        // age of student is 28
        // salary is $10000

        int age = 28;
        int salary = 10000;

        // int age = 32; variable name must be unique

        int phoneNumber = 123456789; // Camel Case

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 80000.5;

        System.out.println("------------------------------------------------------");

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        // double abstract = 5.5; // variable named can not be java reserve word
        // double final = 85.5;

        System.out.println("-------------------------------------------------------");

        // gender is male
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);




    }



}
