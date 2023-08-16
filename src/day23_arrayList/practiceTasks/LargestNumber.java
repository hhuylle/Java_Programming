package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    /*
    write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        
        int n = 5;

        for (int i = 1; i < n; i++) {
            arrayList.removeAll(Arrays.asList(Collections.max(arrayList)));
        }

        System.out.println(Collections.max(arrayList));
        


    }

}
