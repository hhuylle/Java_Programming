package day17_customClass;

public class UniqueCharacters2 {
    /*
    Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
     */

    public static void main(String[] args) {

        String str = "aabcccdddefffghhh";

        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // ch = str
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in string str
                if (str.charAt(i)==ch){ // if the ch has apeared in the string
                    frequency++; // increase the frequency by 1
                }
            }

            if (frequency == 1){ // if the frequency is one, the is's unique
                unique += ch;
            }
        }
        System.out.println(unique);






    }
}
