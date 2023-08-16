package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 65;
        int score4 = 55;
        int score5 = 45;

        System.out.println("-----------------------");

        int[] scores = new int[5]; // 0 ~ 4 (minimum index number:0)
        scores[2] = 78; // one element
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 90;


        //scores[5] = 100; get error ArrayIndexOutOfBoundsException because index num 5 is not in range 0~4
        //scores[-1] = 35;
        //scores = new int[10]; // index: 0 ~ 9
        //scores = new int[50]; // index:8 ~ 49

        System.out.println( Arrays.toString(scores) );

        System.out.println( scores[2]);

        System.out.println("----------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("----------------------------------------");

        System.out.println(scores[scores.length-1]);



    }
}
