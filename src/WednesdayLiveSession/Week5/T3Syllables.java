package WednesdayLiveSession.Week5;

public class T3Syllables {
    /*
    T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        ap-ple -> 2
        ham-bur-ger -> 3
        de-liv-er-y -> 4
        ball -> 1
     */
    public static void main(String[] args) {

        System.out.println("java "+countSyllables("java"));
        System.out.println("hambuger "+countSyllables("ham-ber-ger"));
        System.out.println("delivery "+countSyllables("de-li-ver-y"));
        System.out.println("empty "+countSyllables(""));
    }
    public static int countSyllables(String str){

        int syllables = str.isEmpty()? 0: 1; // for all words 1 will be the starting value, expect for when the string str is empty, it will be 0
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-'){
                syllables++;
            }
        }

        return syllables;
    }
}
