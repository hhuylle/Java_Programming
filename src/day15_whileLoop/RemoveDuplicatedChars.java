package day15_whileLoop;

public class RemoveDuplicatedChars {
    /*
    Write a program that can remove the duplicated characters from a string
     */
    public static void main(String[] args) {

        String str = "jjjjaaaaaavvvvvvvvvvvv";

        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i); // each character of the String str
            if (!result.contains(""+ each)){ // If the String result doesn't contain the character of String str yet
                result += each; // then we will add the character to String result
            }
            // if the character isn't contained yet in the new String, then it will add it to the new String
        }
        System.out.println(result);


    }
}
