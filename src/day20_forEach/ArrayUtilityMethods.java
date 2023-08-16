package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        // toString() Method:
        int[] scores = {70,100,80,90,65};

        System.out.println(Arrays.toString(scores));
        // [70, 100, 80, 90, 65]

        String result = Arrays.toString(scores); // to convert Array Object to the String

        System.out.println(result);
        // [70, 100, 80, 90, 65]

        System.out.println("--------------------------------------------------------");

        // equals() Method: to compare both arrays are equal or not.
        // To return true, both arrays must be Exactly the same
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean a3 = Arrays.equals(a1,a2);

        System.out.println(a3); // true

        System.out.println("-------------------");

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'A','C','B'};

        boolean ch3 = Arrays.equals(ch1,ch2);

        System.out.println(ch3); // false

        System.out.println("-------------------");

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","c","B"};

        System.out.println(Arrays.equals(s1,s2)); // false

        System.out.println("--------------------------------------------------------");

        // sort() Method: to return array elements
        int[] nums = {100,88,98,75,80,99,0,5,9,500};

        System.out.println(Arrays.toString(nums));
        // [100, 88, 98, 75, 80, 99, 0, 5, 9, 500]

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        // [0, 5, 9, 75, 80, 88, 98, 99, 100, 500]

        // we can find the minimum or maximum number
        System.out.println("Minimum number: " + nums[0]);
        // 0
        System.out.println("Maximum number: " + nums[nums.length-1]);
        // 500

        System.out.println("---------------------------");

        // to make both arrays to exactly the same
        String[] b1 = {"C","A","B"};
        String[] b2 = {"B","C","A"};

        System.out.println(Arrays.equals(b1,b2));
        // false

        Arrays.sort(b1); // b1 = { A, B, C}
        Arrays.sort(b2); // b2 = { A, B, C}

        System.out.println(Arrays.equals(b1,b2));
        // true

        System.out.println("----------------------------");

        String[] students = {"Harry","Jenny","Sam","Alex","Philip"};

        System.out.println(Arrays.toString(students));
        // [Harry, Jenny, Sam, Alex, Philip]

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
        // [Alex, Harry, Jenny, Philip, Sam]

        System.out.println("--------------------------------------------------------");

        // copy() Method: returns new array
        int[] array = {10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array,10);

        System.out.println(Arrays.toString(array2));
        // [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

        System.out.println("-----------------------------");

        int[] c1 = {1,2,3,4,5,};
        int[] c2 = {6,7,8,9,10,11,12};

        int[] c3 = Arrays.copyOf(c1,c1.length + c2.length);

        System.out.println(Arrays.toString(c3));
        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0, j = c1.length; i < c2.length; i++, j++) {
            c3[j] = c2[i]; // to merge both arrays c1 and c2
        }
        System.out.println(Arrays.toString(c3));
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        System.out.println("--------------------------------------------------------");
        // copyOfRange() Method:
        char[] ch = {'A','B','C','D','E','F','G'};
        // index      0   1   2   3   4   5   6
        char[] result1 = Arrays.copyOf(ch, 10);

        System.out.println(Arrays.toString(result1));
        // [A, B, C, D, E, F, G,  ,  ,  ]

        char[] result2 = Arrays.copyOfRange(ch,2,5); // excludes ending index

        System.out.println(Arrays.toString(result2));
        // [C, D, E]

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length);

        System.out.println(Arrays.toString(result3));
        // [C, D, E, F, G]














    }
}
