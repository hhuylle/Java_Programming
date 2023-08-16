package day04_practiceTask;

import java.io.PrintStream;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;

        double area = radius*radius*3.14;
        double perimeter = radius*2*3.14;

        System.out.println("Area of the circle is "+area);
        System.out.println("Perimeter of the circle is "+(float)perimeter);

    }
}
