package day13_customMethods.practice_tasks;

public class EvenNumber {

    public static void main(String[] args) {

        System.out.println(isEven(12));

    }

    public static boolean isEven(int num){

        if(num%2 ==0){
            return true;
        }else {
            return false;
        }

    }
}
