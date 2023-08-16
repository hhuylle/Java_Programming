package day19_array;

public class    ArraysMaximumNumber {


    public static void main(String[] args) {

        int[] numbers = {100,30,500,-5,50,70};
        int max = numbers[0];// assume that first element is the maximum number

        for (int i = 1; i < numbers.length-1; i++) { //i: 1,2,3,4,5
            if(numbers[i] > max){ // compares the element of the array with current maximum number
                max = numbers[i]; // replaces the current maximum number
            }
        }
        System.out.println("max = " + max);

    }


}
