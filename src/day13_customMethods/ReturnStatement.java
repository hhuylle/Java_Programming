package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(30);
        System.out.println("--------------------------------");

        System.out.println("Dog Started");

        boolean exit = true;
        if (exit){
            return; // main method gets terminated
        }

        System.out.println(multiplication(5,5));

    }

    // this is return statement in the main method
    public static void eligible(int age){
        if (age<0 || age>150){
            System.err.println("Invalid age: " +age );
            return; // exits the method
            // if the age is invalid, then this gets terminated
        }

        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1,int n2){
        int result = n1 * n2;
        return result; // return the value when exiting the method
    }

}
