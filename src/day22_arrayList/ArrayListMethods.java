package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add() method:
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3
        //list.add(5.5);

        System.out.println(list);
        // [10, 20, 30, 10]

        list.add(1,15); // 1

        System.out.println(list);
        // [10, 15, 20, 30, 10]

        list.add(2,25);

        System.out.println(list);
        // [10, 15, 25, 20, 30, 10]

        System.out.println("-----------------------------");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Kelly");
        studentList.add("Kevin");
        studentList.add("Sophia");
        studentList.add("Tara");

        // size() method ONLY use in Arraylist, the same function as length method
        System.out.println(studentList.size());
        // 4
        System.out.println(studentList);
        // [Kelly, Kevin, Sophia, Tara]

        String firstStudent = studentList.get(0);

        System.out.println(firstStudent);
        // Kelly

        String lastStudent = studentList.get(studentList.size()-1);

        System.out.println(lastStudent);
        // Tara



    }
}
