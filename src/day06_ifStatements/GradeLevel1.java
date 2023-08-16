package day06_ifStatements;

public class GradeLevel1 {

    public static void main(String[] args) {

        int gradeLevel = 11;

        String result = "";

        if (gradeLevel >= 1 && gradeLevel <=5){
            result = "Elementary School";
        }

        if (gradeLevel >=6 && gradeLevel <= 8){
            result = "Middle School";
        }

        if (gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }

        if (gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }

        if (gradeLevel >=17 && gradeLevel <= 18) {
            result = "Grad School";
        }

        System.out.println(result);
    }
}
