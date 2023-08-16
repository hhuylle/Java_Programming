package day06_ifStatements.day06_tasks;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 85;

        String result = "";

        boolean above90 = number > 90 && number <= 100;
        boolean above80 = number > 80 && number < 90;
        boolean above70 = number > 70 && number < 80;
        boolean above60 = number > 60 && number < 70;
        boolean above50 = number > 50 && number < 60;

        if (above90){
            result = "Your tank is full";
        }
        if (above80){
            result = "Still okay";
        }
        if (above70){
            result = "Don't go too far";
        }
        if (above60){
            result = "Start to head back";
        }
        if (above50){
            result = "Be careful now you are at 50%";
        }
        System.out.println(result);
    }
}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */