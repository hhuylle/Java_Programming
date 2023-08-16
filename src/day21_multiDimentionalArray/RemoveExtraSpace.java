package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    /*
    Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
     */
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");

        str = ""; // str is GC so the reference str can assign to the empty string

        for (String each : words) {
            if (!each.isEmpty()) {
                str += each+" ";
            }
        }
        str = str.trim(); // to remove the last space
        System.out.println(str);
        // Hello world I love Java




    }
}
