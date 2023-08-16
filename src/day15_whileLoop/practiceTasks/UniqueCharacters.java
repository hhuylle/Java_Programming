package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class UniqueCharacters {
    /*
     Create a class called UniqueCharacters, Write a program that can return the unique characters from a String
	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = input.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char eachChars = str.charAt(i);
            if (str.indexOf(eachChars) == str.lastIndexOf(eachChars)){
                result += eachChars;
            }

        }
        System.out.println(result);



    }
}
