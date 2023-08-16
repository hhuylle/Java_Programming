package day13_customMethods.practice_tasks;

public class MinNumber {

    public static void main(String[] args) {

        System.out.println(minNumber(10,99));

    }

    public static int minNumber(int n1,int n2){

        return n2>=n1? n1: n2;
    }
}
