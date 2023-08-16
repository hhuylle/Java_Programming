package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 46_000;
        int creditScore = 600;

        boolean isEligible = true;

        String result = "";

        if (salary >= 45_000 && creditScore >= 700){
            result = "You are eligible for loan";
        }else{
            result = "You are not eligible";
        }

        System.out.println(result);
    }
}
