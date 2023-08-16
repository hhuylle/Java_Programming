package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    /*
    addAll(int index, Collection<? extends E> c): adds all elements from a collection at the specified index in the ArrayList, shifting any existing elements to the right

    removeAll(Collection<?> c): removes all elements in the ArrayList that are contained in the specified collection

     retainAll(Collection<?> c): removes all elements in the ArrayList that are not contained in the specified collection
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);

        System.out.println(list1);
        // output: [1, 10, 20, 30, 40, 2, 3]

        System.out.println("======================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,70,80));// use asList method to pass any elements we want

        System.out.println(scores);
        // output: [75, 85, 95, 70, 80]

        System.out.println("======================================");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Jenny","Johny","Kelly","Megan"));

        System.out.println(students);
        // output: [Jenny, Johny, Kelly, Megan]

        students.addAll(2,Arrays.asList("Tom", "Jerry", "Kevin"));

        System.out.println(students);
        // output: [Jenny, Johny, Tom, Jerry, Kevin, Kelly, Megan]

        System.out.println("======================================");

        Integer[] nums = {1,2,3,4,5,6,7,8};// can not use primitive int. Must be used Wrapper class

        ArrayList<Integer> list = new ArrayList<>( Arrays.asList(nums) );

        //list.addAll(Arrays.asList(nums)); option2

        System.out.println(list); // output: [1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("======================================");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Adam", "Eva", "Benny","Carson"));

        System.out.println(employeesList);//output: [Adam, Eva, Benny, Carson]

        boolean hasAdam = employeesList.contains("Adam");
        boolean hasAdamBenny = employeesList.containsAll(Arrays.asList("Adam","Benny"));
        boolean hasEvaCarsonGina = employeesList.containsAll(Arrays.asList("Eva","Carson","Gina"));

        System.out.println("hasAdam = " + hasAdam);//output: true
        System.out.println("hasAdamBenny = " + hasAdamBenny);//output: true
        System.out.println("hasEvaCarsonGina = " + hasEvaCarsonGina);//output: false

        System.out.println("======================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));

        list2.removeAll(Arrays.asList(10,20));

        System.out.println(list2);
        // output: [30, 40, 50, 60, 70]

        System.out.println("======================================");

        // retainAll(Collection<?> c): removes all elements in the ArrayList that are not contained in the specified collection

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Adam", "Eva", "Benny","Carson","Eva","Kenny","Eva","Eva","Adam"));

        developers.retainAll(Arrays.asList("Adam","Carson","Eva"));

        System.out.println(developers);
        //output: [Adam, Eva, Carson, Eva, Eva, Eva, Adam]

        System.out.println("------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Oranges","Strawberry","Blueberry","Paper Towels"));

        groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk","Rice"));
        //groceriesList.removeAll(Arrays.asList("Rice","Oranges","Strawberry","Blueberry","Paper Towels"));

        System.out.println(groceriesList);
        //output: [Eggs, Potato, Milk, Rice]










    }
}
