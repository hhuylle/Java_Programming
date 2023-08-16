package day24_dayAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstAndLastTheSame {
    /*
    Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		[Canada, Lan, Ebrahim, Farida]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        System.out.println(list);

        list.removeIf(fl-> fl.toLowerCase().charAt(0) == fl.charAt(fl.length()-1));
        // list.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(list);

    }
}
