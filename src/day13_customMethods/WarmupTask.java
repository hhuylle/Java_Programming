package day13_customMethods;

public class WarmupTask {

    public static void main(String[] args) {

        calculate(50,20,'+');

        calculate(15,2,'*');

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator:");
        double n1 = scan.nextDouble(),
                n2 = scan.nextDouble();
        char operator = scan.next().charAt(0);

        calculate(n1,n2,operator);
        */


        System.out.println("------------------------------------");

        ageGroup(32);

        System.out.println("------------------------------------");

        eligibleToVote(32,true);

        eligibleToVote(16,true);

        eligibleToVote(28,false);

    }

    public static void calculate(double num1, double num2, char mathOperator){

        switch (mathOperator){
            case '+':
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1*num2));
                break;
            case '/':
                System.out.println(num1+" "+mathOperator+" "+num2+ " = "+(num1/num2));
                break;
            default:
                System.err.println("Invalid Operator");
        }

    }

    public static void ageGroup(int age){

        String result = "";
        if (age>=0 && age<21){
            result = age<21? "Teenager": age>=21 && age<55? "Adult": age<150? "Senior": "Invalid Age";
        }else {
            result = "Invalid Age";
        }
        System.out.println(result);
    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (age>=18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else {
            System.err.println("You are not eligible to vote");
        }

    }


}
