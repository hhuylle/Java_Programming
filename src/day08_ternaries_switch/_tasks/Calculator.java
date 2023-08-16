package day08_ternaries_switch._tasks;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 12,
                n2 = 6;

        char mathOperator = '*';

        switch (mathOperator){
            case '+':
                System.out.println("Operator is +: " + (n1+n2));
                break;

            case '-':
                System.out.println("Operator is -: " + (n1-n2));
                break;

            case '*':
                System.out.println("Operator is *: " + (n1*n2));
                break;

            case '/':
                System.out.println("Operator is /: " + (n1/n2));
                break;

            default:
                System.out.println("Invalid operator");
        }


    }
}
