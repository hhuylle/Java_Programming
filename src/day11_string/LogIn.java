package day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String correctName = "Cydeo", // literal
                correctPassword = "WoodenSpoon"; //literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the username:");
        String userName = input.nextLine(); // new

        System.out.println("Enter the password:");
        String passWord = input.nextLine();

        input.close();

        if (userName.equals(correctName) && passWord.equals(correctPassword)){
            System.out.println("You are now log in");
        } else {
            System.out.println("Incorrect username and password. Please try again");
        }


    }
}
