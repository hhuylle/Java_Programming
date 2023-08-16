package day21_multiDimentionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        // 1, 2, 3, 4, 5, 6
        int[] newArray = Arrays.copyOf(array, array.length+1);

        System.out.println(Arrays.toString(newArray));
        // [1, 2, 3, 4, 5, 0]

        newArray[newArray.length-1] = element;

        System.out.println(Arrays.toString(newArray));
        // [1, 2, 3, 4, 5, 6]

        System.out.println("---------------------------------------------");

        int[] numbers = {100,90,80,70,60};

        numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers));
        // [100, 90, 80, 70, 60, 50]

        System.out.println("------------------------------------------");

        double[] nums = {5.5,6.5,7.5,8.5};

        nums = ArraysUtility.addElement(nums,9.5);

        System.out.println(Arrays.toString(nums));
        // [5.5, 6.5, 7.5, 8.5, 9.5]
        nums = ArraysUtility.addElement(nums,10.5);

        System.out.println(Arrays.toString(nums));
        // [5.5, 6.5, 7.5, 8.5, 9.5, 10.5]

        System.out.println("-------------------------------------------");

        String[] names = {"Adam", "Eva", "Lucia"};

        names = ArraysUtility.addElement(names,"Kristine");

        System.out.println(Arrays.toString(names));
        // [Adam, Eva, Lucia, Kristine]





    }
}
