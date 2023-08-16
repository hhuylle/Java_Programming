package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    /*
    add(): adds an element to the end of the ArrayList.

    add(index, element): adds an element at the specified index of the ArrayList, shifting any existing elements to the right.

    get(index): returns the element at the specified index in the ArrayList.

    set(index, element): replaces the element at the specified index in the ArrayList with the specified element.

    remove(index): removes the element at the specified index from the ArrayList, shifting any remaining elements to the left.

    size(): returns the number of elements in the ArrayList.

    clear(): removes all elements from the ArrayList.

    indexOf(element): returns the index of the first occurrence of the specified element in the ArrayList, or -1 if it is not present.

    isEmpty(): returns true if the ArrayList contains no elements, and false otherwise.

    toArray(): returns an array containing all elements in the ArrayList.

     */

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,};

        array[0] = 100;
        System.out.println(Arrays.toString(array));
        // output: [100, 2, 3, 4, 5]
        System.out.println("=============================================");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Paper Towels");
        groceryList.add("Apples");
        groceryList.add("Cooking Oil");

        System.out.println(groceryList);
        // output: [Eggs, Paper Towels, Apples, Cooking Oil]

        groceryList.set(2,"Oranges");
        System.out.println(groceryList);
        // output: [Eggs, Paper Towels, Oranges, Cooking Oil]

        groceryList.add(2, "Chicken");
        System.out.println(groceryList);
        // output: [Eggs, Paper Towels, Chicken, Oranges, Cooking Oil]

        groceryList.remove(0); // remove element at specific index number, and shift the rest elements to the left side
        System.out.println(groceryList);
        // output: [Paper Towels, Chicken, Oranges, Cooking Oil]

        groceryList.remove("Paper Towels"); // remove element at specific String object

        System.out.println(groceryList);

        System.out.println("===============================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);// 0
        numbers.add(20);// 1
        numbers.add(30);// 2
        numbers.add(40);// 3
        numbers.add(50);// 4

        numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        // output: [20, 30, 40, 50]

        boolean r1 = numbers.remove(Integer.valueOf(50));

        System.out.println(r1);// output: true

        numbers.clear();// clear method to remove/clear all elements of the numbers array

        System.out.println(numbers);// output: []
        System.out.println(numbers.size());// output: 0

        System.out.println("=============================================");

        ArrayList<String> names = new ArrayList<>();

        names.add("Henry");// 0
        names.add("Kristine");// 1
        names.add("Kelly");// 2
        names.add("Kelly");// 3
        names.add("Henry");// 4
        names.add("Kelly");// 5
        names.add("Ali");

        System.out.println(names.indexOf("Henry"));// output: 0
        System.out.println(names.lastIndexOf("Henry"));// output: 4
        System.out.println(names.lastIndexOf("Kelly"));// output: 5

        System.out.println("===========================================");

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);


    }
}
