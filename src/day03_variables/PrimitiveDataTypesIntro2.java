package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType  VariableName = Data;
        /* Primitive:
    int : for integer numbers
    double : for decimal numbers
    char : for single character
    boolean : for True or False expressions
 */
        char a = '@';
        char b = '!';
        //char ab = 'ab';

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-----------------------------------");

        char ch3 = 50000;

        System.out.println(ch3);

        int sum = 'A' + 'B';
        //         65 +  66 = 131

        System.out.println(sum);


        System.out.println("--------------------------------------");

        //char ch4 = -100;

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; //false


        System.out.println(r6);
        System.out.println(r7);






    }
}
