package day12_customMethods;

public class customMethodIntro {

    public static void greetings(){ // this is custom method. It should be inside the class method, can not be inside the main method.

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");
    }

    public static void displayMessage(){

        System.out.println("Hello World");

        System.out.println("I love Java");
    }

    public static void main(String[] args){

        System.out.println("Dog started");

        greetings();

        System.out.println("Dog completed");

        System.out.println("----------------------------");

        displayMessage();

    }




}
