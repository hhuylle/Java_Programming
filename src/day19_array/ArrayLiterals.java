package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // we use it when we do not know what the elements are

        int[] nums = {10, 20, 30, 40, 50}; // Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("-----------------------------------------------");

        //element           1          2           3            4          5          6          7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index             0          1           2            3          4          5          6

        int d = 1;

        System.out.println( days[d-1]);

        for (int i = days.length - 1; i >= 0; i--) {
            System.out.print(days[i]+" ");
        }

        System.out.println("-----------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        /*
        months = new String[12];
        months[0] = "January";
        ...
         */

        System.out.println("months = " + Arrays.toString(months));

        int m = 1;

        System.out.println(months[m+10]+" ");

        System.out.println("-----------------------------------------------");

        //int[] numbers2 = {1,2,3,4,5,6,7};

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.print(months[i]+" ");
        }




    }
}
