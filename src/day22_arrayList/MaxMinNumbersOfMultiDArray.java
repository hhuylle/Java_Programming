package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {
    /*
    Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
     */
    public static void main(String[] args) {

        int[][] array = { {100, 20, -300}, {10, 1000, 50}, {-200, 4000, 0} };
        // indexes of array: 0 ~ 2

        int max = array[0][0];
        int min = array[0][0];
        for (int[] each1D : array) {
            for (int eachElement : each1D) {
                if (eachElement > max) {
                    max = eachElement;
                }
                if (eachElement < min) {
                    min = eachElement;
                }
            }
        }

        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);




    }

}
