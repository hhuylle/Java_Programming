package day11_string.practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String first = input.nextLine();

        System.out.println("Enter the second word:");
        String second = input.nextLine();

        input.close();

        String w1 = first.substring(1);
        String w2 = second.substring(1);
        System.out.println(w1+w2);

        /*
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word:");
        String secondWord = scan.next();

        scan.close();

        String result = firstWord.substring(1)+secondWord.substring(1);

        System.out.println(result);
         */




    }
}
