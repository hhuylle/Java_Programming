package WednesdayLiveSession.Week5;

public class T2SwapFirstChar {
    /*
    T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> a
     */

    public static void main(String[] args) {

        System.out.println(swapFirstChar("aavj"));
        System.out.println(swapFirstChar("eodc"));
        System.out.println(swapFirstChar("abcd"));
        System.out.println(swapFirstChar2("Hello World"));
    }

    public static String swapFirstChar(String str){
        int lastIndex = str.length()-1;
        char first = str.charAt(0);
        char last = str.charAt(lastIndex);
        return last + str.substring(1, lastIndex) + first;

    }

    public static String swapFirstChar2(String str1){
        return str1.charAt(str1.length()-1) + str1.substring(1, str1.length()-1) + str1.charAt(0);
    }
}
