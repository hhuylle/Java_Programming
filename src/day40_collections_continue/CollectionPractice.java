package day40_collections_continue;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));

        System.out.println(collection);
        // [100, 100, 200, 100, 200, 300, 400, 500, 600, 700]

        System.out.println(((ArrayList)collection).get(2));

       // System.out.println(((Stack)collection).pop());

        System.out.println("-------------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));

        System.out.println(collection2);
        // [400, 100, 500, 200, 600, 300, 700]

        // System.out.println( ((ArrayList)collection2).get(4) );

        System.out.println( new ArrayList<>(collection2).get(4) );
        // 600

        List<Integer> list = new ArrayList<>(collection2);
    }
}
