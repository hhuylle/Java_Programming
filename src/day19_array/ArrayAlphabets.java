package day19_array;

import java.util.Arrays;

public class ArrayAlphabets {

    public static void main(String[] args) {

        // Create a char array and store all the alphabet letters in ascending order
        char[] ascending = new char[26]; // index: 0 ~ 25

        for (int i =0, j = 'A'; i < ascending.length; i++, j++) {
            ascending[i] = (char)j;
        }
        System.out.println(Arrays.toString(ascending));

        System.out.println("-----------------------------------------------------------------------------");

        // Create a char array and store all the alphabet letters in descending order
        char[] descending = new char[26];

        for (int i = 0, j = 'Z'; i < descending.length; i++, j--) {
            descending[i] = (char) j;
        }
        System.out.println(Arrays.toString(descending));

        System.out.println("-----------------------------------------------------------------------------");

        char[] ascending2 = new char[26];
        char[] descending2 = new char[26];

        for (int i = 0, j = 'A', k = 'Z'; i < ascending2.length; i++, j++, k--) {
            ascending2[i] = (char) j;
            descending2[i] = (char) k;
        }
        System.out.println(Arrays.toString(ascending2));
        System.out.println(Arrays.toString(descending2));

        System.out.println("-----------------------------------------------------------------------------");
        // Create a char array and store all the characters
        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));




        



    }
}
