package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("Java".charAt(5));
        // StringIndexOutOfBoundsException

        String str = null;
        System.out.println(str.toLowerCase());
        // StringIndexOutOfBoundsException

       // FileInputStream file = new FileInputStream("");
        // FileNotFoundException

        System.out.println("Hello Cydeo");


    }
}
