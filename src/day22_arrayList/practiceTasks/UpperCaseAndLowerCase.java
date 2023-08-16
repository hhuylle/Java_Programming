package day22_arrayList.practiceTasks;

public class UpperCaseAndLowerCase {
    /*
    Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
     */
    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCase = 0;
        int lowerCase = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            }else {
                continue;
            }
        }
        System.out.println(upperCase == lowerCase);



    }
}
