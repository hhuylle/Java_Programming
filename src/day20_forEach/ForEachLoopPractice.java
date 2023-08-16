package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int n1 : numbers) {

            if (n1%2 != 0){
                System.out.print(n1+" ");
                // 1 3 5 7 9 11
            }
        }

        System.out.println("\n-------------------------------------------");

        int[] nums = {100,20,30,40,5,4,3,2,1,2,1000,330,500};

        int max = nums[0];
        int min = nums[0];
        for (int n2 : nums) {
            if (n2 > max){
                max = n2;
            }

            if (n2 < min){
                min = n2;
            }
        }
        System.out.println("Max = "+max);
        // 1000
        System.out.println("Min = "+min);
        // 1

        System.out.println("-------------------------------------------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110,120};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3));
        // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120]

        System.out.println("-------------------------------------------");

        String[] str = {"Harry Le","Jenny Ngo","Alex Dang","Sam Nguyen","Julia Tran"};

        for (String each : str) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1));// can use lastIndexOf()
            // H.L
            // J.N
            // A.D
            // S.N
            // J.T

        }














    }

}
