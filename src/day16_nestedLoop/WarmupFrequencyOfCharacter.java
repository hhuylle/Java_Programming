package day16_nestedLoop;

public class WarmupFrequencyOfCharacter {
    /*
    write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
     */

    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char ch = 'c';

        int count = 0;
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if (str.charAt(i) == ch){ // if the character of the string is equal to the given character, it means the given character has appeared
                count++;
            }
        }
        System.out.println(count);
    }


}
