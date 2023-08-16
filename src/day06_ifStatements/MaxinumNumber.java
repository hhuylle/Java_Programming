package day06_ifStatements;

public class MaxinumNumber {

    public static void main(String[] args) {

        int num1 = 2000;
        int num2 = 2000;

        if (num1 > num2){
            System.out.println(num1 + " is the maxinum number");
        }

        if (num2 > num1){
            System.out.println(num2 + " is the maxinum number");
        }

        if (num1 == num2){
            System.out.println("Both are equal");
        }
    }
}
