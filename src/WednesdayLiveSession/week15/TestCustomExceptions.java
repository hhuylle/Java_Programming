package WednesdayLiveSession.week15;

public class TestCustomExceptions {

    public static void main(String[] args) {

        Library.getLibraryCard("Fairfax");
       // Library.getLibraryCard("Philly");
        try {
            Library.borrow(false);
        } catch (FailToCheckOutException e) {
            e.printStackTrace();// it helps debug the code without stop program, then leave the exception at the end
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("ENDED CODE");

    }
}
/*
Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
 */