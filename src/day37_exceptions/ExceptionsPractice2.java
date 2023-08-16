package day37_exceptions;

public class ExceptionsPractice2 {

    public static void main(String[] args) {

        System.out.println("Program Started");

        String str = null;

        try{
           // System.out.println(str.charAt(-20));
           // System.out.println(20/0);
            System.out.println(str.charAt(100));

        }catch (ArithmeticException e) {

            System.out.println("Arithmetic exception has occurred");
        }catch (IndexOutOfBoundsException e){

            System.out.println("Index out of bound exception has occurred");
        }catch (RuntimeException e){

           // e.printStackTrace();
            System.out.println("An unchecked exception has occurred");
        }



        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Interrupted exception has occurred");
        }



        System.out.println("Program Completed");
    }
}
