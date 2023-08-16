package day14_forLoop.practiceTasks;

import java.util.Scanner;

public class DigitsNumbersSpecialChars {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";


        String digits = "";
        String letters = "";
        String specialCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch<='Z'){
                letters += ch;
            } else if (ch>='a' && ch<='z') {
                letters += ch;
            } else if (ch>='0' && ch<='9') {
                digits += ch;
            }else {
                if (ch != ' ') {
                    specialCharacters += ch;
                }
            }

        }
        System.out.println("Letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Special Characters: "+specialCharacters);


    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */