package day19_array.practiceTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Classmates {
    /*
    create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines
     */

    public static void main(String[] args) {

        String[] names = {"Ergun Kucukyilmaz","Laila Majidi","Orhun Eser","Andriy Hlushko","Nataliia Zhalivysiv","Mehmet Han","Ibrokhim Sattorov","Adem Barlak","Nagihan Yeniay","Huy Le"};


        for (int i = 0; i < names.length; i++) {
            String initials = names[i].charAt(0)+"."+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(initials);
        }





    }
}
