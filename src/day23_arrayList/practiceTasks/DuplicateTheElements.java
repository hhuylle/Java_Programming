package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateTheElements {
    /*
    Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.addAll(list.size(),list);

        System.out.println(list);
        //output: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]



    }
}
