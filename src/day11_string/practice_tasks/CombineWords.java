package day11_string.practice_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String firstWord = input.next();

        System.out.println("Enter the second word:");
        String secondWord = input.next();

        input.close();

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
            System.out.println(firstWord+secondWord.substring(1));
        }else {
            System.out.println(firstWord+secondWord);
        }

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word");
        String secondWord = scan.next();

        scan.close();

        String result = "";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){
            result = firstWord+ secondWord.substring(1);
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);
         */








    }
}
