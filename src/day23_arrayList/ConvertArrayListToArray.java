package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

    public static void main(String[] args) {

        // How to convert Array to ArrayList:

        String[] arr = {"A","B","C","D"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list1);//output: [A, B, C, D]

        System.out.println("==============================================");

        // Difference between Array and Collection:

        // Array supports any types: primitive and non-primitive.
        // Array can be Multi Dimensional
        // The size of Array is fixed

        // Collection: any disadvantages is advantages of Collection
        // Size is dynamic.
        // It supports ONLY non-primitive

        System.out.println("==============================================");

        // How to convert ArrayList to Array:

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

        String[] languages = list2.toArray(new String[list2.size()]);
        //                                (new String[0])

        System.out.println(Arrays.toString(languages));
        //output: [Java, Python, C#]

        System.out.println("=======================");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);
        //                        (new Interger[nums.size()])

        System.out.println(Arrays.toString(n));



    }
}
