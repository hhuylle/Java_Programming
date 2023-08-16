package day20_forEach.practiceTasks;

public class Palindromes {
    /*
    write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
     */
    public static void main(String[] args) {

        String[] array = {"anna", "level", "Java"};

        int count = 0;
        for (String each : array) {
            String reserve = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reserve += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reserve)) {
                count++;
            }
        }
        System.out.println(count);





    }
}
