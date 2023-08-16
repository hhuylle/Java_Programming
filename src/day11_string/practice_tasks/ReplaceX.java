package day11_string.practice_tasks;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        input.close();

        word = word.replace('x','a').replace('X','a');

        System.out.println(word);

        /*
        String str = "xcodeX";

        str = str.replace('x', 'a').replace('X', 'a');

        System.out.println(str);

    }
         */



    }

}
