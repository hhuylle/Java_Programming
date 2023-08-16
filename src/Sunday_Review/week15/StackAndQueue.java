package Sunday_Review.week15;

import java.util.*;

public class StackAndQueue {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("selenium");

        System.out.println(stack); // [hello, world, java, selenium]

        System.out.println("peek "+stack.peek()); // selenium

        System.out.println("pop "+stack.pop()); // selenium

        System.out.println(stack); // [hello, world, java]

        System.out.println("peek after the first pop "+stack.peek());
        // java

        stack.add("zebra");

        System.out.println(stack.peek()); // zebra

        System.out.println("-----------------------------------------");

        Queue<String> queue1 = new PriorityQueue(); // FIFO
        queue1.offer("james");
        queue1.offer("anna");
        queue1.offer("asia");

        System.out.println(queue1); // [anna, james, asia]
        System.out.println(queue1.peek()); // anna

        System.out.println();

        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("james"); // to add element
        queue2.offer("anna");
        queue2.offer("asia");

        System.out.println(queue2); // [james, anna, asia]
        System.out.println(queue2.peek()); // james // to check the top of Queue
        System.out.println(queue2.poll()); // james // to remove top of Queue
        System.out.println(queue2.peek()); // anna

        System.out.println();

        Deque<String> queue3 = new LinkedList<>(); // can also be Queue reference
        queue3.offer("hello");
       // queue3.get(1); // Queue reference cannot access
       // queue3.offerFirst() // the Deque gives access in the beginning and end with methods

    }
}
