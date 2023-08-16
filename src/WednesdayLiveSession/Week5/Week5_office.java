package WednesdayLiveSession.Week5;

import java.util.Scanner;

public class Week5_office {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.next();

        //String str = "aabbbcccc";

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!result.contains(""+letter)){
                result += letter;
            }
        }
        System.out.println(result);
    }



}
