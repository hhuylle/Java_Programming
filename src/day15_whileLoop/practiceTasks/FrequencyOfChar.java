package day15_whileLoop.practiceTasks;

import java.util.Scanner;
import java.util.SortedMap;

public class FrequencyOfChar {
    /*
    Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String str = input.nextLine().toLowerCase();

        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each==letter){
                frequency++;
            }
        }

        System.out.println(frequency);

        input.close();


    }

}
