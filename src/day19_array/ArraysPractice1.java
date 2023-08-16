package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Andriy";
        myGroup[myGroup.length-1] = "Nataliie";
        myGroup[2] = "Mehmed";
        myGroup[1] = "Sara";
        myGroup[3] = "Alex";

        System.out.println( Arrays.toString(myGroup));

        myGroup[1] = "Laila";
        //myGroup[5] = "Bryan";

        System.out.println( Arrays.toString(myGroup));

        System.out.println("----------------------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.print(myGroup[i]+" ");
        }

        System.out.println("----------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) { // shortcut : myGroup.forr to reverse

        }

        for (int i = 0; i < myGroup.length; i++) { // shortcut : myGroup.fori

        }

    }
}
