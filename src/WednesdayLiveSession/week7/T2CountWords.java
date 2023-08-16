package WednesdayLiveSession.week7;

public class T2CountWords {
    /*  [String, loop]
    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space

    Ex:
        input: "today is monday"
        output: 3
     */

    public static int countWords1(String str){
        int words1 = 0; // int words = 1;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                words1++;
            }
        }
        return words1+1; // return spaces;
    }

    public static int countWords2(String str){
        int words2 = 1;
        str= str.trim();
        while (str.contains(" ")){
            words2++;
            str = str.replaceFirst(" ",""); // delete the first space
        }
        return words2;
    }

    public static void main(String[] args) {
        System.out.println(countWords1("today is monday"));
        System.out.println(countWords1("i just came back to us"));

        System.out.println();

        System.out.println(countWords2("today is monday"));
        System.out.println(countWords2("i just came back to us"));
    }
}
