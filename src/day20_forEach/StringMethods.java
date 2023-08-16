package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        // toCharArray() Method:
        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));
        // [C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("-----------------------------------------------------------------");
        // split() Method:
        String str1 = "Today is a great day to learn Java";

        String[] words = str1.split(" ");

        System.out.println(Arrays.toString(words));
        // [Today, is, a, great, day, to, learn, Java]

        System.out.println("-----------------------------------------------------------------");

        String str2 = "Today is a great day!";

        String[] arr = ArraysUtility.reverse(str2.split(" "));

        System.out.println(Arrays.toString(arr));
        // [day!, great, a, is, Today]

        String reversestr2 = ""; //"Java Love I"

        for (int i = 0; i < arr.length; i++) {
            reversestr2 += arr[i] +" ";
        }

        System.out.println(reversestr2);
        // day! great a is Today





    }
}
