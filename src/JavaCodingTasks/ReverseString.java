package JavaCodingTasks;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any letters: ");
        String letters = scan.nextLine();

        System.out.println(reverseString(letters));
    }


    public static String reverseString(String str){

        String frequency = "";
        for (int i = str.split("").length - 1; i >= 0; i--) {
            frequency += str.charAt(i);
        }

        return frequency;
    }
}
