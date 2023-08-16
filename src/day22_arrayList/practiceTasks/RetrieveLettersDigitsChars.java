package day22_arrayList.practiceTasks;

public class RetrieveLettersDigitsChars {
    /*
    Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
     */

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += String.valueOf(each);
            }
            if (Character.isDigit(each)) {
                digits += String.valueOf(each);
            }
            if (!Character.isLetterOrDigit(each)){
                specialChars += each;
            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("SpecialChars = " + specialChars);



    }
}
