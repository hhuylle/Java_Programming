package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        double n1 = 12.5876545544;

        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println( df.format(n1) );




    }
}
