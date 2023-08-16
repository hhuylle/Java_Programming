package day07_ifStatements.day07_tasks;

import java.sql.SQLOutput;

public class FINRA {

    public static void main(String[] args) {

        int num = 15;

        String result = "";

        if (num % 3 == 0 && num % 5 == 0) {
                result = "FINRA";
            } else if (num % 3 == 0) {
                result = "FIN";
            } else if (num % 5 == 0 ) {
                result = "RA";
            } else {
                result = "num";
            }

        System.out.println(result);

    }
}
