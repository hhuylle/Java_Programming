package day24_dayAndTime.practiceTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDate {
    /*
    create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
     */
    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();

        list.addAll(Arrays.asList(LocalDate.of(2020,8,15)));


        list.removeIf(t -> t.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(list);


    }
}
