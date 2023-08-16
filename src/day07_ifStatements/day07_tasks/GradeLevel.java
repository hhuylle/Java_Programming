package day07_ifStatements.day07_tasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte grade = 12;

        String result = "";

        if (grade >= 1 && grade < 6 || grade >= 6 && grade <9 || grade >= 9 && grade < 13 || grade >= 13 && grade < 17 || grade >= 17 && grade <19){

            if (grade >=1 && grade < 6){
                result = "Elementary School";
            } else if (grade >= 6 && grade < 9) {
                result = "Middle School";
            } else if (grade >= 9 && grade < 13) {
                result = "High School";
            } else if (grade >=13 && grade < 17) {
                result = "College";
            }else {
                result = "Grad School";
            }

        }else{
            result = "Invalid grade level given";
        }

        System.out.println(result);
    }
}
