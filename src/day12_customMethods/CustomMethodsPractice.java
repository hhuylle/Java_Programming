package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        int num1 = 10, num2 = 20;
        maxNum(num1,num2);

        maxNum(50.5, 50.4);

        maxNum(-250,-252);

        System.out.println("---------------------------------");

        initial("Huy", "Le"); // H.L

        System.out.println("---------------------------------");

        initial("Hasan", "Adam");// H.A

    }

    public static void maxNum(double num1, double num2){

        if (num1>num2){
            System.out.println(num1 + " is maximum number");
        } else if (num2>num1) {
            System.out.println(num2 + " is maximum number");
        }else {
            System.out.println("Equal");
        }
    }

    public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial = " + initial);

    }



}
