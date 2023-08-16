package day11_string.practice_tasks;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        input.close();

        word = word.substring(word.length()-2);

        if (word.equals("ly")){
            System.out.println("Really???");
        }else {
            System.out.println("Never mind");
        }

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String lastTwoChars = word.substring( word.length()-2 );

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        scan.close();
         */


    }
}
