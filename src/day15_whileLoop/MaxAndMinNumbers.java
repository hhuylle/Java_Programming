package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -999999999;//any integer number that user enters will ALWAYS be greater than -999999999
        int min = 999999999;//any integer number that user enters will ALWAYS be less than 999999999

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println("Max number = "+max);
        System.out.println("Min number = "+min);


    }
}
