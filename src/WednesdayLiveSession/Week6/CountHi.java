package WednesdayLiveSession.Week6;

public class CountHi {
    /*

     */

    public static int countHi(String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='h' && ch+1=='i'){ // str.charAt(i+1) add 1: to checks the next character
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countHi("dasdhidasdhidasdashi"));
    }
}

