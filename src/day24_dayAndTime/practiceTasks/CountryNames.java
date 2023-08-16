package day24_dayAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {
    /*
    Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
     */
    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Canada","United State of America","Japan","Indonesia","Singapore","Taiwan","Malaysia","Afghanistan","Colombia","New Zealand","Vietnam"));

        countryNames.removeIf(c-> c.length()>=10);
        System.out.println(countryNames);

    }
}
