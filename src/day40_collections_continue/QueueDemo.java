package day40_collections_continue;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, doesn't accept null
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
       // queue1.addAll(Arrays.asList(null,null,null));


        System.out.println(queue1);
        // [10, 10, 10, 10, 40, 200, 40, 40, 40, 90, 90, 300, 300, 200, 90, 300, 200, 300, 200, 90]

        int num1 = queue1.poll(); // ==> FIFO

        System.out.println(queue1);
        // 10, 10, 40, 40, 200, 40, 90, 40, 90, 90, 300, 300, 200, 90, 300, 200, 300, 200]

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);
        // [40, 40, 40, 90, 40, 200, 90, 200, 200, 90, 90, 300, 300, 200, 300, 300]

       // System.out.println(queue1.get(0));

        System.out.println("------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order, doesn't accept null
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));


        System.out.println(queue2);
        // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();
        System.out.println(queue2);
        // [200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);
        // []

       // System.out.println(queue2.get(1));


        System.out.println("------------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // keeps insertion order, accepts null
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null));

        System.out.println(queue3);
        // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null]

        queue3.poll(); // poll() method uses to remove the first element
        System.out.println(queue3);
        // [200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null]

        System.out.println(((LinkedList)queue3).get(1));
        // 300

        System.out.println("------------------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list.get(1));
        // 200

        ((LinkedList)list).poll(); // FIFO

        System.out.println(list);
        // [200, 300, 40, 90]

       // ((Stack)list).pop(); LIFO, only for Vector class
       // System.out.println(list);

    }
}
