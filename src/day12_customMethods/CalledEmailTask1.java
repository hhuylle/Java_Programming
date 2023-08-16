package day12_customMethods;

public class CalledEmailTask1 {

    public static void main(String[] args) {

        String email = "cydeo_school@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@"));

        System.out.println(firstName);

        System.out.println(lastName);

        System.out.println(domain);

        email = lastName + "_" + firstName + domain;

        System.out.println(email);



    }
}
