package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    /*
    Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
     */
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        int[] reverseArray = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        /* // we can use it this way
        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverseArray[j++] = array[i];
        }
        */

        System.out.println(Arrays.toString(reverseArray));
        // [16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        System.out.println("----------------------------------------------------------");

        int[] num = {100,200,300,400,500,600};

        num = ArraysUtility.reverse(num);

        System.out.println(Arrays.toString(num));
        // [600, 500, 400, 300, 200, 100]

        System.out.println("----------------------------------------------------------");

        double[] a1 = {1.5,2.5,3.5,4.5,5.5};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));
        // [5.5, 4.5, 3.5, 2.5, 1.5]

        System.out.println("----------------------------------------------------------");

        char[] ch1 = {'A','B','C','D','D','E'};

        ch1 = ArraysUtility.reverse(ch1);

        System.out.println(Arrays.toString(ch1));
        // [E, D, D, C, B, A]



    }
}
