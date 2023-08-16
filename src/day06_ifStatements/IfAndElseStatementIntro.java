package day06_ifStatements;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {

        int age = 31;

        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age < 21) {
            System.out.println("not eligible");
        }
        System.out.println("------------------------------");

        if (age >= 21) {
            System.out.println("Eligible");
        } else { // otherwise
            System.out.println("Not eligible");
        }

        System.out.println("---------------------------------");

        String result = "";

        if (age >= 21){
            result = "Eligible";
        }
        if (age < 21){
            result = "Not eligible";
        }

        System.out.println(result);
    }
}