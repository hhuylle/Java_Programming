package day03_variables;

public class EmployeeInfo {

    public static void main(String[] args) {


        String employeeName = "Jenny";
        System.out.println(employeeName);

        int age = 27;
        System.out.println(age);

        char gender = 'F';
        System.out.println(gender);

        String companyName = "Google Inc",
                employeeId = "BP2510",
                jobTitle = "Java Developer";

        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);

        int salary = 150000;
        System.out.println(salary);

        boolean isFullTime = false;
        System.out.println(isFullTime);

        System.out.println("-----------------------------------------------");

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);

    }
}
