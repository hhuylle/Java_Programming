package day22_arrayList;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,90};

        boolean has25 = ArraysUtility.contains(numbers,25);

        System.out.println("Has 25 = "+ has25);

        System.out.println("-----------------------------------------------");

        String[] students = {"Sunny", "Kelly", "Donald"};

        System.out.println(ArraysUtility.contains(students,"Sunny"));


    }
}
