package day20_forEach.practiceTasks;

import java.util.Arrays;

public class EvenAndOdd {
    /*
    Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
     */

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,14};

        int countEven = 0;
        int countOdd = 0;

        for (int eachEven : numbers) {
            if (eachEven % 2 == 0) {
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);




    }
}
