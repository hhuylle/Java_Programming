package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {
        // Implicit Castings
        byte a = 15;

        short b = a;
        //short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000l;

        float e = d; // implicit casting


        // Explicit Casting

        int x = 100;
        byte y = (byte)x;

         float z = 28.8F;

         short q = (short)z; // z = 28.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5

        System.out.println(n2);

        System.out.println("--------------------------------------------------------");

        int num = 500;
        byte result = (byte)num; // explicit casting

        System.out.println(result);

        int r = 50000;
        short t = (short) r;

        System.out.println(t);

        System.out.println("-------------------------------------------------");

        double u = 3000.5;
        int p = (int) u; // explicit casting

        System.out.println(p);

        int o = 100;
        double d1 = o; // implicit casting

        System.out.println(d1);

    }
}
