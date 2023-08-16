package day13_customMethods.practice_tasks;

public class MaxNumber {

    public static void main(String[] args) {

        System.out.println(maxNumber(10,12));

    }

    public static int maxNumber(int n1,int n2){
        if(n1>=n2){
            return n1;
        }else {
            return n2;
        }

    }
}
