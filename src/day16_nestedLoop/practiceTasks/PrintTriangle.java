package day16_nestedLoop.practiceTasks;

public class PrintTriangle {
    /*
     Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
     */

    public static void main(String[] args) {

        char stars = '*';

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(stars+" ");
            }
            System.out.println();
        }



    }
}
