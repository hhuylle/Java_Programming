package Sunday_Review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {
    /*
    SumDigits [Wrapper class, ArrayList, loop]

	Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

		Ex:
			Input:
			["123, "52", "513"]
			Output:
			[6, 7, 9]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("123","52","513"));

        ArrayList<Integer> digits = new ArrayList<>();

        for (String each : list) {
            //System.out.println(each);

            String[] eachArr = each.split("");
            //System.out.println(Arrays.toString(eachArr));

            int sum = 0;
            for (String eachDigit : eachArr) {
                //System.out.println(Integer.parseInt(eachDigit));
                sum += Integer.parseInt(eachDigit); // can use valueOf() instead of parseInt()
            }
            digits.add(sum); // this is autoboxing from the int to Integer
        }
        System.out.println(list);
        System.out.println(digits);
    }
}
