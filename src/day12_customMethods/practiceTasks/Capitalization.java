package day12_customMethods.practiceTasks;

public class Capitalization {

    public static void main(String[] args) {

        capitalization("cyDEo","sCHooL");

    }

    public static void capitalization(String firstName, String lastName){

        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = first + " " + last;

        System.out.println("Full name is : " + fullName);
    }
}
