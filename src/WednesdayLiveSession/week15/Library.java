package WednesdayLiveSession.week15;

public class Library {

    public static void getLibraryCard(String city){
        if (city.equals("Fairfax") || city.equals("McLean")){
            System.out.println("Library card created");
        }else {
            throw new NonResidentException("Library card for "+ city+" is not available");
        }
    }

    public static void borrow(boolean checkedOut) throws FailToCheckOutException{// if we use throws Exception, we have to call throws Exception again
        if (checkedOut){
            System.out.println("Enjoy reading");
        }else {
            throw new FailToCheckOutException("Sorry book is not available");

        }
    }


}
/*
Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

 */
