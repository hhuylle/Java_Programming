package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program1 Started");


        try{
            System.out.println(9/0); // Arithmetic exception
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }

        System.out.println("Program1 Ended");

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Program2 Started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        }catch (RuntimeException e){ // can be used by Exception or Thrown
            System.out.println("Catch Block");
        }
        // RuntimeException(Best option): can be handled like any unchecked exceptions

        System.out.println("Program2 Ended");

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Program3 Started");

        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program3 Ended");

    }
}
