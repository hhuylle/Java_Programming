package day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

        String str = combine("one", "eight");

        System.out.println(str);


        String s1 = "" + true; //"true" to convert boolean/char to string, add an empty string
        String s2 = 'e' + ""; //"e"

        System.out.println("-------------------------------------");
    }


    public static String combine(String str1, String str2){

        String result = "";

        /* opt2
        if ( str1.endsWith( "" + str2.charAt(0)) ){ // if the first string ends with the first character of the second string
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }
        */
        if (str1.charAt(str1.length()-1) == str2.charAt(0)) { // If the last character in the first string is equal to the first character in the second string
            result = str1 + str2.substring(1); // First character of the second string should be excluded in the concatenation
        }else {
            result = str1 + str2;
        }


       return result;
    }


}
