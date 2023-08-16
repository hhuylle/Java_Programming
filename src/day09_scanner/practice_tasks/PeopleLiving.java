package day09_scanner.practice_tasks;

import java.util.Scanner;

public class PeopleLiving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people they live with:");

        int number = input.nextInt();

        input.close();


        String result = "";

        if (number<3 || number<6 || number>6){
            result = number>0 && number<3 ? "Live with less than 3 people": number>=3 && number<6 ? "Live with 3 - 6 people": "Live with more than 6 people";
        }

        System.out.println(result);





    }
}
