package day38_exceptionsContinue_throws_throw_keyword;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age<0 || age>150){
            if (age<0){
                throw new InputMismatchException("Age of the person shouldn't be negative");
            }else {
                throw new InputMismatchException("Age of the person shouldn't be greater than 150");
            }
        }

        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

        System.out.println("----------------------------------------------------------------------");

       // throw new RuntimeException("Runtime exception");
       // System.out.println("Hello Word");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

       // throw exception;
       // throw new RuntimeException();

       // throw new Person("Jimmy",45,'M');


    }
}
