package day38_exceptionsContinue_throws_throw_keyword;

import Utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1();
        pauseFor5Seconds();
        Library.sleep(3.5); // sleep() method is from Library class of Utilities package

       // method2();

    }

    public static void  pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(3000);

    }

    public static void method1() throws InterruptedException {

        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");

    }

    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);


        System.out.println("First program ended");

        new FileInputStream("");

        Thread.sleep(5000);
    }
}
