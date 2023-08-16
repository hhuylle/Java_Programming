package day17_customClass;

public class UniqueCharacters1 {
    /*
    Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
     */

    public static void main(String[] args) {

        String str = "aabcccdeef";
        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of string str
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch;
            }
        }
        System.out.println(unique);


    }
}
