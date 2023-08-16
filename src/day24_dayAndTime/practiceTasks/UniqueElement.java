package day24_dayAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElement {
    /*
    Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops

     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5));

        list.removeIf(u -> !(list.indexOf(u) == list.lastIndexOf(u)));
        //list.removeIf(p -> Collections.frequency(list,p) > 1);

        System.out.println(list);
    }
}
