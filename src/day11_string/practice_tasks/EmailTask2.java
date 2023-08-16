package day11_string.practice_tasks;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();

        input.close();

        String firstName = email.substring(0,email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+1,email.length());


        System.out.println("First name: "+ firstName+"\nLast name: "+lastName+"\nDomain: "+domain);

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.next();

        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
         */





    }
}
