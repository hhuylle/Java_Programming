package day19_array.practiceTasks;

import java.util.Arrays;

public class Zeros {
    /*
    write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
     */
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] allZero = new int[array.length];

        int i1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] !=0 ){
                allZero[i1++] += array[i];
            }
        }
        System.out.println(Arrays.toString(allZero));

    }
}
