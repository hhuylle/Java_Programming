package day07_ifStatements.day07_tasks;

public class Grade {

    public static void main(String[] args) {

        char grade = 'D';

        String result = "";

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){

            if (grade == 'A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            }else {
                result = "Failed";
            }


        }else {
            result = "Other wise: Invalid";
        }

        System.out.println(result);
    }
}
