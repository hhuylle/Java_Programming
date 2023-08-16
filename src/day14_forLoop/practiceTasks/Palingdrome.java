package day14_forLoop.practiceTasks;

import java.util.Scanner;

public class Palingdrome {

    public static void main(String[] args) {

        System.out.println("Enter a palindrome:");
        String str = new Scanner(System.in).next();

        String result = "";

        for (int i = str.length()-1; i >= 0 ;i--) {
            result += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);


    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */