package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // contains(Object o): returns true if the ArrayList contains the specified element, and false otherwise

        ArrayList<String> names = new ArrayList<>();

        names.add("Henry");// 0
        names.add("Kristine");// 1
        names.add("Kelly");// 2
        names.add("Kelly");// 3
        names.add("Henry");// 4
        names.add("Henry");// 5

        System.out.println(names);
        // output: [Henry, Kristine, Kelly, Kelly, Henry, Henry]

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {
            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

        //names = nonDup;

        System.out.println(nonDup);
        // output: [Henry, Kristine, Kelly]

        System.out.println("===================================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);// output: 10
        System.out.println(list2);// output: 10

        System.out.println(list1 == list2);// output: true
        System.out.println(list1.equals(list2));// output: true

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        list3.add(10);
        list4.add(10);

        System.out.println(list3);// output: 10
        System.out.println(list4);// output: 10

        System.out.println(list3 == list4);// output: false

        System.out.println(list3.equals(list4));// output: true

        System.out.println("===============================================");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));// output: false

        // isEmpty(): returns true if the ArrayList contains no elements, and false otherwise

        System.out.println(n1.isEmpty());// output: false
        System.out.println(n2.isEmpty());// output: false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());// output: true
        System.out.println(n2.isEmpty());// output: true




    }
}
