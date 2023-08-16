package Sunday_Review.week15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTypes {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add(null);
        list1.add("d");
        list1.add("e");
        System.out.println(list1);
        // [a, b, c, null, d, e]

        System.out.println();

        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add(null);
        list2.add("d");
        list2.add("e");
        System.out.println(list2);
        // [a, b, c, null, d, e]

        System.out.println();

        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add(null);
        list3.add("d");
        list3.add("e");
        System.out.println(list3);
        // [a, b, c, null, d, e]



    }
}
