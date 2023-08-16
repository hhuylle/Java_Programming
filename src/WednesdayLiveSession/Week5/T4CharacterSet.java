package WednesdayLiveSession.Week5;

public class T4CharacterSet {
    /*
    T4CharacterSet [methods, loops]
    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all of the characters in the range:
    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
     */
    public static void main(String[] args) {

        System.out.println(characterSet("uppercase"));
        System.out.println(characterSet("lowercase"));
        System.out.println(characterSet("numbers"));
        System.out.println(characterSet("special"));
        System.out.println(characterSet("cydeo"));
    }

    public static String characterSet(String group){

        String allCharacters = "";
        char ch;
        char ch2;

        switch (group.toLowerCase()){
            case "uppercase":
                ch = 'A';
                ch2 = 'Z';
                break;
            case "lowercase":
                ch = 'a';
                ch2 = 'z';
                break;
            case "numbers":
                ch = '0';
                ch2 = '9';
                break;
            case "special":
                ch = '!';
                ch2 = '.';
                break;
            default:
                return "Invalid group";

        }

        for (char letter = ch; letter <= ch2; letter++) {
            //System.out.print((int)letter+" ");
            allCharacters += letter;
        }
        return allCharacters;

    }
}
