package WednesdayLiveSession.Week5;

public class T5CharacterOverLoaded {
    /*
    T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
     */
    public static void main(String[] args) {

        System.out.println(getCharacterSet('5', 'z'));
        System.out.println(getCharacterSet(55, 100));
        System.out.println(getCharacterSet('X', '}'));
    }

    public static String getCharacterSet(int start, int end){
        String result = "";
        for (; start <= end ; start++) { // no needed to initialize a new variable, istead of choosing to iterate through the start parameter
            result += (char)start;
        }
        return result;
    }


}
