package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // Pre increment/decrement

        int x = 10;

        System.out.println(++x); // x = 11
        System.out.println(x); // x = 11

        int q = 100;

        System.out.println(--q); // y = 99
        System.out.println(q); //99

        System.out.println("----------------------------------");

        // Post increment/decrement
        int a = 50;

        System.out.println(a++);// a = 50
        System.out.println(a);// a = 51


        int b = 25;

        System.out.println(b--);// b = 25
        System.out.println(b);// b = 24

        System.out.println("----------------------------------");

        int n = 30;

        int m = n++; // m = 30, n = 31

        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int z = 60;

        int y = z--;// y = 60, z = 59

        System.out.println("z = " + z);
        System.out.println("y = " + y);
    }
}
