package day06_ifStatements;

public class MininumNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        if (num1 < num2){
            System.out.println(num1 + " is the mininum number");
        }

        if(num2 < num1){
            System.out.println(num2 + " is the mininum number");
        }

        if (num1 == num2){
            System.out.println("Equal");
        }
    }
}
