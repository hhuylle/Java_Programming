package Sunday_Review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondBiggestNumber {

    /*
    [IQ] Second Biggest Number [ArrayList, loop, conditional]

	Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
	Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
	       5
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50,12,3,6,2,8,40,7,10));

        int max = 0; // default for max(use Integer.MIN_VALUE) or can use -54564645
        int secondMax = list.get(0);
        for (int each : list) {
            if (each > max){
                secondMax = max;
                max = each;
            }
            if (each > secondMax && each < max){
                secondMax = each;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,3,1,4,5,2,4,8,4,8,8,8));
        System.out.println(list);

        int max = Collections.max(list);

        list.removeAll(Arrays.asList(max));

        System.out.println(Collections.max(list));
         */

    }
}
