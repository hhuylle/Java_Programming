package day04_concatenation;

public class Concatenation_Vs_Addition {

    public static void main(String[] args) {

        System.out.println("7" + 1); // 71

        System.out.println(7 + "1"); // 71

        System.out.println("7" + "1"); // 71
        System.out.println("-------------------------");

        System.out.println(8.5 + 1.5); // 10
        System.out.println("------------------------");

        System.out.println("The value is " + true);
    }
}
