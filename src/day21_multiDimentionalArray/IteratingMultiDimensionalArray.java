package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = { {10,20,30},{40, 50, 60, 70,80}, {90,100} };

        for (int i = 0; i < arr2D.length; i++) { // i: index numbers of 1D array in arr2D

            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++){ // j: index number of elements in each 1D array in each1D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }
        // [10, 20, 30]
        // 10
        // 20
        // 30
        // [40, 50, 60, 70, 80]
        // 40
        // 50
        // 60
        // 70
        // 80
        // [90, 100]
        // 90
        // 100
        System.out.println("-----------------------------------------------");

        for (int[] eachD : arr2D) {
            System.out.println(Arrays.toString(eachD));
            for (int eachE :eachD){
                System.out.println(eachE);
            }
        }
        // [10, 20, 30]
        // 10
        // 20
        // 30
        // [40, 50, 60, 70, 80]
        // 40
        // 50
        // 60
        // 70
        // 80
        // [90, 100]
        // 90
        // 100
        System.out.println("-----------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }
        // 100
        // 90
        // 80
        // 70
        // 60
        // 50
        // 40
        // 30
        // 20
        // 10
        System.out.println("-----------------------------------------------");

        for (int[] eachD : arr2D) {
            for (int eachE : eachD) {
                System.out.println(eachE);
            }
        }
        // 10
        // 20
        // 30
        // 40
        // 50
        // 60
        // 70
        // 80
        // 90
        // 100
        
        
    }
}
