package day19_array.practiceTasks;

import java.util.Arrays;

public class ReverseIntegersNumber {
    /*
    Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
     */
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1, j= 0; i >= 0; i--) {
            reverseArray[j++] += array[i];
        }
        System.out.println(Arrays.toString(reverseArray));





    }
}
