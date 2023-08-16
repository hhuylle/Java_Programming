package JavaCodingTasks;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter anything: ");
        String word = scan.nextLine();

        System.out.println(sumOfAllDigits(word));

    }

    public static int sumOfAllDigits(String str){

        int sum = 0;

        String nums = "";

        for (String each : str.split(" ")) {
            if (Character.isDigit(each.length())){
                nums += each;
            }
        }

        return sum;
    }
}
