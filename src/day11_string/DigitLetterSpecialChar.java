package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();
        //Scanner input = new Scanner(System.in);
        //String str = input.nextLine();

        if (str.length() >= 1){ // if the string has at least one character

            char f = str.charAt(0); // the first character of string
            if (f >= 48 && f <= 57){
                System.out.println("first character is digit");
            } else if (f >= 65 && f <= 90) {
                System.out.println("first character is uppercase letter");
            } else if (f >= 97 && f <= 122) {
                System.out.println("first character is lowercase letter");
            }else {
                System.out.println("first character is special character");
            }


        }else { // if string is empty
            System.out.println("String is empty");
        }






    }
}
