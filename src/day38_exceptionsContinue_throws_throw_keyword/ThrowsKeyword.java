package day38_exceptionsContinue_throws_throw_keyword;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        /*
        System.out.println("Program1 Started");

       // System.out.println(100/0); throws keyword cannot handle this exception, because this is unchecked exception
        // throws keyword handles ONLY checked exceptions

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 Ended");

        System.out.println("---------------------------------------------------");

        System.out.println("Program2 Started");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program2 Ended");

        System.out.println("---------------------------------------------------");

         */
        System.out.println("Program1 Started");

        Thread.sleep(3000);

        System.out.println("Program1 Ended");

        System.out.println("---------------------------------------------------");

        System.out.println("Program2 Started");

        Thread.sleep(3000);

        System.out.println("Program2 Ended");

        System.out.println("---------------------------------------------------");

        System.out.println("Program3 Started");

       // FileInputStream file = new FileInputStream("Harry");
        Thread.sleep(1000);

        System.out.println("Program3 Ended");

        System.out.println("---------------------------------------------------");




    }
}
