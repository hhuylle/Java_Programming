package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        // min() and max() methods:
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);//output: max = 9
        System.out.println("min = " + min);//output: min = 1

        System.out.println("===================================================");

        ArrayList<String> items = new ArrayList<>(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Oranges","Strawberry","Blueberry","Paper Towels"));

        Collections.sort(items);

        System.out.println(items);
        //output: [Blueberry, Eggs, Milk, Oranges, Paper Towels, Potato, Rice, Strawberry, Tomato]

        System.out.println("===================================================");
        // reverse() methods:
        Collections.reverse(items);

        System.out.println(items);
        //output: [Tomato, Strawberry, Rice, Potato, Paper Towels, Oranges, Milk, Eggs, Blueberry]

        System.out.println("===================================================");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Jenny","Donald","Kelly","Megan"));

        System.out.println(students);
        //output: [Jenny, Donald, Kelly, Megan]

        Collections.swap(students,1,0);

        System.out.println(students);
        //output: [Donald, Jenny, Kelly, Megan]

        Collections.swap(students,0,students.size()-1);

        System.out.println(students);
        //output: [Megan, Jenny, Kelly, Donald]





    }
}
