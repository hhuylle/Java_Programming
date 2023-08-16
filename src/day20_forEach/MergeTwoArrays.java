package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    /*
    write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
     */
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain all of elements of arr1 & arr2

        int k = 0; // for arr3's index numbers
        for (int i = 0; i < arr1.length; i++, k++) { // i: for arr1's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for arr2's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------------------");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90,100};

        int[] a3 = ArraysUtility.merge(a1,a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("----------------------------------------------------------");

        double[] b1 = {10.5,5.5,3.5,6.5,8.5};
        double[] b2 = {20.5,15.5,13.5};

        double[] b3 = ArraysUtility.merge(b1,b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("----------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'c','D','e'};
        char[] ch2 = {'X','Y','Z'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("----------------------------------------------------------");

        String[] str1 = {"Apple", "pineapple", "Pearl", "Mango"};
        String[] str2 = {"Cantaloupe", "Watermelon"};

        String[] str3 = ArraysUtility.merge(str1,str2);

        System.out.println(Arrays.toString(str3));

        System.out.println("----------------------------------------------------------");








    }
}
