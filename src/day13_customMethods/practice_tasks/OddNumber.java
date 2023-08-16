package day13_customMethods.practice_tasks;

public class OddNumber {

    public static void main(String[] args) {

        System.out.println(isOdd(11));



    }

    public static boolean isOdd(int num){

        boolean isOdd = num%2 !=0? true: false;
        return isOdd;

    }
}
