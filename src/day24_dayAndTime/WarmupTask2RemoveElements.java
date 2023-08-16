package day24_dayAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTask2RemoveElements {
    /*
      Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);//should not be used remove() in the loop
            }
        }
        System.out.println(list);//output: [2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("=====================================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        System.out.println(list2);
        list2.removeIf(p -> p < 4);
        // using removeIf() to remove the elements with any conditions given
        System.out.println(list2);
    }
}
