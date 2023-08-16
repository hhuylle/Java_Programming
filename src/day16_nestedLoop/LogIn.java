package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;
        do { // if the credentials are valid/correct, then it gets executed
            System.out.println("Enter your username: ");
            u = input.next();

            System.out.println("Enter your password: ");
            p = input.next();

            attempt--;

            if (attempt == 0){ // to gets three times for entering the credentials
                break;
            }

        }while ( !(u.equals("Cydeo") && p.equals("WoodenSpoon")) ); // while the credentials are invalid/incorrect



    }
}
