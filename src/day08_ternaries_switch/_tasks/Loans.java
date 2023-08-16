package day08_ternaries_switch._tasks;

public class Loans {

    public static void main(String[] args) {

        int salary = 70000;
        int creditScore = 500;

        String loan = salary>60_000 && creditScore>650? "Loan Approved": "Loan Denied";

        System.out.println(loan);



    }
}
