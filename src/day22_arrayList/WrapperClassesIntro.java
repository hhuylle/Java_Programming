package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int a1 = 10;
        Integer a2 = 10; // Autoboxing

        System.out.println("---------------------------------");

        int b1 = 100;
        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1;// Autoboxing

        // Double b3 = b1;
        // Long b4 = b1;

        char ch = 'A';

        Character ch1 = ch; // Autoboxing

        double d1 = 5.5;

        Double d2 = d1; // Autoboxing

        System.out.println("---------------------------------------");

        Integer n1 = 20;

        int n2 = n1; // Unboxing
        //double n3 = n1;
        //long n4 = n1;

        Character ch2 = 'Z';

        char ch3 = ch2; // Unboxing

        //int ch4 = ch2;
        //long ch5 = ch2;




    }
}
