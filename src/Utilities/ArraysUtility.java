package Utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {


    public static int[]merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain all of elements of arr1 & arr2

        int k = 0; // for arr3's index numbers
        for (int i = 0; i < arr1.length; i++, k++) { // i: for arr1's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for arr2's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[]merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain all of elements of arr1 & arr2

        int k = 0; // for arr3's index numbers
        for (int i = 0; i < arr1.length; i++, k++) { // i: for arr1's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for arr2's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static char[]merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain all of elements of arr1 & arr2

        int k = 0; // for arr3's index numbers
        for (int i = 0; i < arr1.length; i++, k++) { // i: for arr1's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for arr2's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[]merge(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain all of elements of arr1 & arr2

        int k = 0; // for arr3's index numbers
        for (int i = 0; i < arr1.length; i++, k++) { // i: for arr1's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for arr2's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static int[] reverse(int[] array){
        int[] reverseArray = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static double[] reverse(double[] array){
        double[] reverseArray = new double[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static char[] reverse(char[] array){
        char[] reverseArray = new char[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static String[] reverse(String[] array){
        String[] reverseArray = new String[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }

    public static int[] addElement(int[] array, int element){
        int[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element){
        String[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element){
        double[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element){
        char[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static boolean contains(int[] array, int element){
        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element){
        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element){
        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){
        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static String[] reverseEach(String[] words){
        String[] reversed = new String[words.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = StringUtility.reverse(words[i]);
        }
        return reversed;
    }

    public static int countCharInList(ArrayList<String> list, char letter){
        int count = 0;
        for (String eachElement : list) {
            for(char eachLetter: eachElement.toCharArray()){
                if (eachLetter == letter){
                    count++;
                }
            }
        }
        return count;
    }

    public static String multiplicationTable(int number, int limit){
        String result= "";
        for (int i = 0; i < limit; i++) {
            result += "\n"+number+" x "+i+" = "+(number*i);
        }
        return result;
    }

    // print 2D array
    public static String print2D(int[][] arr ){
        String print = "*";
        for (int[] inner : arr) {
            print += "\n\t";
            for (int each : inner) {
                print += "("+each+")";
            }
        }
        return print;
    }

    //convert primitive int Array to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
    }

    //covert ArrayList to Array
    public static int[] convertArrayListToArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static String capitalize(String str){
        String[] eachWord = str.toLowerCase().trim().split(" ");
        String result = "";

        for (String each : eachWord) {
            result += each.substring(0,1).toUpperCase()+each.substring(1)+" ";
        }
        return result.trim();
    }





/*
    array = {10,20,30,40}; ===> {10,20,40}
    public static int[] remove(int[] array, int index){

    }

    public static int[] removeDup(int[] array){

    }
*/
}
