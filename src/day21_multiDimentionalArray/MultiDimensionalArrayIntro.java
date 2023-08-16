package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90,100};
        int[] arr4 = {200,300};

        System.out.println("---------------------------------------");
        // square brackets means dimensional arrays

        // index of elements:  0  1  2    0   1   2   3  4     0   1
            int[][] arr2D = { {10,20,30},{40, 50, 60, 70,80}, {90,100}, arr4 };
        // index of arrays:        0               1              2       3

        System.out.println(arr2D.length);
        // 4: has 4 dimensional arrays

        System.out.println(Arrays.toString(arr2D[1]));
        // [40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(arr2D[2]));
        // [90, 100]
        System.out.println(Arrays.toString(arr4));
        // [200, 300]
        System.out.println(arr2D[2][0]);
        // 90
        System.out.println(arr2D[1][2]);



    }
}
