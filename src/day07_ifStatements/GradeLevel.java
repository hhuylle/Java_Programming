package day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 5;

        String result = "";

        if (gradeLevel < 6){
            result = "Elementary";
        } else if (gradeLevel >= 6) {
            result = "Middle School";
        } else if (gradeLevel >= 9) {
            result = "High School";
        } else if (gradeLevel >= 13) {
            result = "College";
        } else if (gradeLevel >= 17){
            result = "Grad School";
        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}
