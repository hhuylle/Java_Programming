package WednesdayLiveSession.Week5;

public class ExtraSwapChars {
    /*
    Swap two characters in a String

    hello -> hlleo
    hamburger -> hamgurber

     */

    public static void main(String[] args) {

        System.out.println(swapChars("hamburger", 3, 6));
        System.out.println(swapChars("hamburger", 3, 8));
        System.out.println(swapChars("hamburger", 3, 1110));
        System.out.println(swapChars("java", 0, 3));
        System.out.println(swapChars("java", 3, 0));
    }

    public static String swapChars( String str, int first, int second){
        if (first>second || first==second || second >= str.length()){
            return str;
        }
        String result = "";

        char firstCh = str.charAt(first);
        char secondCh = str.charAt(second);

        result += str.substring(0, first) + secondCh + str.substring(first+1, second) + firstCh + str.substring(second + 1);
        return result;
    }
}
