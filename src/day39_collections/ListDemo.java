package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array based class ==> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (doubly linked List) ==> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println(linkedList);

        System.out.println("-----------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println(vector);

        System.out.println("-----------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);





    }
}
