package day09_scanner.practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the his/her score: ");
        int score = input.nextInt();

        String result = "Invalid Score";

        if (score>0 && score<100){
            result = score<50 ? "F": score<65 ? "D": score<75 ? "C": score<90 ? "B": "A";
        }

        System.out.println("The grade of the student: " +result);

        input.close();
    }
}
