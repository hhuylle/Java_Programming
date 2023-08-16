package day07_ifStatements;

public class Grade2 {

    public static void main(String[] args) {

        char grade2 = 'D';

        String result = "";

        if (grade2 == 'A') result = "Excellent";
        else if(grade2 == 'B') result = "Great Job";
        else if (grade2 == 'C') result = "Good";
        else if (grade2 == 'D') result = "Passed";
        else result = "Failed";

        System.out.println(result);
    }
}
