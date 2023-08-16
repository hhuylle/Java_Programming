package day14_forLoop;

public class WarmupTask2 {

    public static void main(String[] args) {

        System.out.println(sumOf2IntegerNumbers(10,20));

        System.out.println(sumOf3IntegerNumbers(10,20,30));

        System.out.println(sumOf4Integernumbers(10,20,30,40));

    }

    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1 + n2;
    }

    public static int sumOf3IntegerNumbers(int n1, int n2, int n3){
        //return n1 + n2 + n3;
        return sumOf2IntegerNumbers(n1,n2) + n3;
    }

    public static int sumOf4Integernumbers(int n1, int n2, int n3, int n4){
        //return n1 + n2 + n3 + n4;
        //return sumOf3IntegerNumbers(n1,n2,n3) + n4;
        //return sumOf2IntegerNumbers(n1,n2) + sumOf2IntegerNumbers(n3,n4);
        //return sumOf2IntegerNumbers( sumOf3IntegerNumbers(n1,n2,n3) , n4 );
        return sumOf3IntegerNumbers(sumOf2IntegerNumbers(n1,n2),n3,n4);
    }

}
