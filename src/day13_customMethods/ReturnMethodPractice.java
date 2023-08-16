package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(5));

        System.out.println(isEven(16));

        System.out.println("------------------------------------");

        System.out.println(max(10,5));

        System.out.println(min(15,9));
    }

    public static boolean isOdd(int num){
        //return (num%2 !=0)? true: false; //opt1

        if (num%2 != 0){ //opt2
            return true;
        }else {
            return false;
        }
        /*
        if (num%2 != 0){ //opt3
            return true;
        }
            return false;
         */
    }

    public static boolean isEven(int num){
        return !isOdd(num); // return (num%2 ==0)? true: false
    }

    public static int max(int n1, int n2){
        return n1>n2? n1: n2;

    }

    public static int min(int n1,int n2){
        //return n1 > n2 ? n1: n2;

        if((n1 < n2)){
            return n1;
        }
        return n2;

        /*if (n2 > n1){
            return n2;
        }else {
            return n1;
        }
        */
    }


}
