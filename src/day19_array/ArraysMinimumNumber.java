package day19_array;

import java.util.Arrays;

public class ArraysMinimumNumber {

    public static void main(String[] args) {

        int[] numbers = {20,100,-5,50,0,80};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);

    }
}
