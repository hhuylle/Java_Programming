package day16_nestedLoop.practiceTasks;

import java.util.Scanner;

public class FrequencyOfChars {
    /*
    Write a program that can find the frequency of the characters from a string
                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
     */

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        //System.out.println("Enter a word: ");
        //String str = input.next();
        String str = "aabcccd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char letter1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char letter2 = str.charAt(j);
                if (letter1 == letter2) {
                    count++;
                }
            }
            if (!result.contains(""+letter1)){
                result += letter1+""+count;
            }
        }
        System.out.println(result);




    }
}
