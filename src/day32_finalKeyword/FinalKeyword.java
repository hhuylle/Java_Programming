package day32_finalKeyword;

import java.time.LocalDate;


class Student{ // final CANNOT be extended

    public final void language(){
        System.out.println("Java Programming");
    }

}

public final class FinalKeyword extends Student{

    /* // final methods can NEVER be overridden
    public void language() {
        System.out.println("Python Programming");
    }
     */

    public FinalKeyword(){ // CANNOT use final keyword w/ constructor

    }

    public static void main(String[] args) { // final keyword in main method is pointless

        final char gender = 'M';
        System.out.println(gender); // M

        //gender = 'F';
        System.out.println(gender);
        System.out.println("-------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth); // 2023=04-24

        //dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("-------------------------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("-------------------------------------------");

        final String name = "James";
        // name = null;
        // name = "Daniel";

        System.out.println(name);

        int a =10;


    }
}
