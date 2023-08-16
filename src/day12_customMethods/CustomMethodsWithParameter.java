package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(15);

        oddOrEven(10000);



        System.out.println("-------------------------------");

        isEligible(19);

        int age1 = 25;
        isEligible(age1);

        System.out.println("-------------------------------");

        oddOrEvenOrZero(0);

        System.out.println("-------------------------------");

        gradeOfStudents(50);

    }

    // the method takes an argument number, and verified if the  number is odd number or even number

    public static void oddOrEven(int number){

        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    // create a method that can check if a person is eligible to buy alcohol (age)
    public static void isEligible(int age){

        if (age>=21){
            System.out.println(age + " is eligible to buy alcohol");
        }else{
            System.out.println(age + " is not eligible to buy alcohol");
        }
    }

    // create a method that can check if a number is odd, or even, or zero (number)
    public static void oddOrEvenOrZero(int number2){

        if (number2 % 2 ==0){
            System.out.println(number2 + " is even number");
        } else if (number2 % 2 !=0) {
            System.out.println(number2 + " is odd number");
        }else {
            System.out.println(number2 + " is zero number");
        }
    }

    // create a method that can calculate the grade of the students (score)
    public static void gradeOfStudents(int score){

        if (score>=90){
            System.out.println(score + " is the grade A");
        } else if (score>=80) {
            System.out.println(score + " is the grade B");
        } else if (score>=70) {
            System.out.println(score + " is the grade C");
        } else if (score>=60) {
            System.out.println(score + " is the grade D");
        }else {
            System.out.println(score + "is the grade F");
        }


    }
}
