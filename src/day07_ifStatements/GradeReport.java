package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 75;

        String result = "";

        if (score >= 90){
            result = "Your grade is: A";
        } else if (score >= 80) {
            result = "Your grade is: B";
        } else if (score >= 70) {
            result = "Your grade is: C";
        } else if (score >= 60) {
            result = "Your grade is: D";
        } else if (score < 60) {
            result = "Your grade is: F";
        } else {
            result = "Invalid";
        }

        System.out.println(result);
    }
}
