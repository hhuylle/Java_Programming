package day06_ifStatements.day06_tasks;

public class Calculator {

    public static void main(String[] args) {

        char mathOperator = '+';

        double n1 = 10,
                n2 = 20;

        String result = "";



        if (mathOperator == '+'){
            result = "When operator is + : " + (n1+n2);
        }

        if (mathOperator == '-') {
            result = "When operator is - : " + (n1-n2);
        }

        if (mathOperator == '*'){
            result = "When operator is * : " + (n1*n2);
        }

        if (mathOperator == '/') {
            result = "when operator is / : " + (n1/n2);
        }

        if (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/'){
            result = "invalid operator";
        }

        System.out.println(result);
    }
}
/*  Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

 */