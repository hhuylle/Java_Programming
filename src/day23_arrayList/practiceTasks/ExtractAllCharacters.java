package day23_arrayList.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExtractAllCharacters {
    /*
    Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
     */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<String> list1 = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> list3 = new ArrayList<>();

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)){
                list1.add(each+"");
            } else if (Character.isLetter(each)) {
                list2.add(each+"");
            }else {
                list3.add(each+"");
            }
        }

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);



    }
}
