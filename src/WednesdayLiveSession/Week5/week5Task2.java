package WednesdayLiveSession.Week5;

import java.util.Scanner;

public class week5Task2 {

    public static void main(String[] args) {

         /*
    T6LongestWithA [Scanner, String, conditional, logical]
	Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others
	ex:
		java
		mouse
		computer
	Output: java
	Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result
     */
        Scanner input = new Scanner(System.in);
        int words = 1;
        System.out.print("Enter a word: " + words++ + " ");
        String word1 = input.next();
        System.out.print("Enter a word: " + words++ + " ");
        String word2 = input.next();
        System.out.print("Enter a word: " + words++ + " ");
        String word3 = input.next();

        System.out.println("Please enter the letter you want to search for: ");
        String search = input.next();

        String longest = "";

        if (word1.contains(search) && word1.length() > longest.length()){
            longest = word1;
        }
        if (word2.contains(search) && word2.length() > longest.length()){
            longest = word2;
        }
        if (word3.contains(search) && word3.length() > longest.length()){
            longest = word3;
        }
        if (longest.isEmpty()){
            System.out.println("Not Contained a " + search);
        }else {
            System.out.println("Longest is "+ longest);
        }
        /*
        Scanner input = new Scanner(System.in);
        int words = 1;
        System.out.print("Enter a word: " + words++ + " ");
        String word1 = input.next();
        System.out.print("Enter a word: " + words++ + " ");
        String word2 = input.next();
        System.out.print("Enter a word: " + words++ + " ");
        String word3 = input.next();
        
        String longest = "";
        
        if (word1.contains("a") && word1.length() > longest.length()){
            longest = word1;
        }
        if (word2.contains("a") && word2.length() > longest.length()){
            longest = word2;
        }
        if (word3.contains("a") && word3.length() > longest.length()){
            longest = word3;
        }
        if (longest.isEmpty()){
            System.out.println("Not Contained a");
        }else {
            System.out.println("Longest is "+ longest);
        }
         */



    }
}
