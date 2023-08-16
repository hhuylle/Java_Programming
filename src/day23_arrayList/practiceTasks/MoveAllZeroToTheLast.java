package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeroToTheLast {
    /*
    Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int countZero = Collections.frequency(list,0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZero; i++) {
            list.add(0);
        }
        System.out.println(list);






    }
}
