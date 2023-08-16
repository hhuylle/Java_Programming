package day39_collections.multiThreading;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);

        System.out.println("--------------------------------------------");

        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set1);
        // [null, 200, 40, 10, 90, 300]

        System.out.println("--------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(); // keeps insertion order, accepts null
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set2);
        // [10, 200, 300, 40, 90, null]

        System.out.println("--------------------------------------------");

        Set<Integer> set3 = new TreeSet<>(); // keep sorted order, does not accept duplicates
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
       // set3.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(set3);
        // [10, 40, 90, 200, 300]

        System.out.println("--------------------------------------------");

        String[] words = {"Java", "Java","Java","Python", "Python", "C#","C++","Ruby","C#","C#"};

        Set<String> result = new LinkedHashSet<>(); // keeps insertion order, accepts null
        result.addAll(Arrays.asList(words));

        System.out.println(result);
        // [Java, Python, C#, C++, Ruby]

        /*
        for (String each : result) {
            System.out.println(each);
        }

         */

        System.out.println(new ArrayList<>(result).get(1));
        // Python

        words = result.toArray(new String[0]); // converting Set to Array
        System.out.println("Words Array "+Arrays.toString(words));

        System.out.println("--------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,20,30,30,30,40,40,40,50,50,50,5,5,1,1,1,2,2));

        Set<Integer> n = new TreeSet<>(numbers); // List to Set

        System.out.println(n);
        // [1, 2, 5, 10, 20, 30, 40, 50]

        numbers = new ArrayList<>(n); // Set to Array

        System.out.println(numbers);
        // [1, 2, 5, 10, 20, 30, 40, 50]






    }
}
