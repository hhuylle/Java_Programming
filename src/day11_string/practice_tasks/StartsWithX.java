package day11_string.practice_tasks;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        String result = "";

        if (result.charAt(0) == 'x'){
            result = word.replaceFirst("x", "a");
        }
        System.out.println(result);

        /*
        String str = "xcodex";

        if(str.charAt(0)=='x'){
            str=str.replaceFirst("x", "a");
        }

        System.out.println(str);

    }
         */



    }
}
