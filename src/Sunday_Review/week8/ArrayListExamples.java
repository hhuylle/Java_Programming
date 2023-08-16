package Sunday_Review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(5);
        list2.add(10);

        ArrayList<Integer> list3 = new ArrayList<>(list2); // this creates a new ArrayList with the same elements as list2
        list3.add(0,100);

        ArrayList<Integer> list4 = list3; // this is a new reference that points to the same object as list3

        System.out.println("===============");
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println("===============");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list5);


    }
}
