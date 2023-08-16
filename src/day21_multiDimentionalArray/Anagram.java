package day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    /*
    Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false
     */

    public static void main(String[] args) {

         String str1 = "heart"; // aehtr
         String str2 = "earth"; // aehtr

        //String[] w1 = str1.split("");
        //\String[] w2 = str2.split("");

        char[] w1 = str1.toCharArray();
        char[] w2 = str2.toCharArray();

        Arrays.sort(w2);
        Arrays.sort(w1);

        boolean isAnagram = Arrays.equals(w1,w2);

        System.out.println("isAnagram = " + isAnagram);





         
         





    }
}
