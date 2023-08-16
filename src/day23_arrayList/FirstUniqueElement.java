package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    /*
    Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);
        // output: [1, 1, 2, 3, 3, 4, 5, 5, 6]

        for (Integer element : list) { // 1
            int frequency = 0;
            for (Integer each : list) {
                if (each == element){
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println("element = " + element);
                break; // exits the loop
                // without break;, all frequency will be returned: 2 4 6
            }
        }





    }
}
