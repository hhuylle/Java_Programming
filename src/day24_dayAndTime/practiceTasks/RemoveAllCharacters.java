package day24_dayAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllCharacters {
    /*
    Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops

     */
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(ch -> !Character.isLetterOrDigit(ch));
        System.out.println(list);

    }
}
