package day24_dayAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllLetters {
    /*
    Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
     */
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        System.out.println(list);

        list.removeIf(l-> Character.isLetter(l));
        System.out.println(list);

    }
}
