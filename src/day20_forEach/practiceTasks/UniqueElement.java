package day20_forEach.practiceTasks;

public class UniqueElement {
    /*
    Write a program that can display the unique elements of an array

			MUST use for each loops
     */

    public static void main(String[] args) {

        int[] arr ={10,10,15,14,16,18,19,19,20,20};

        for (int each1 : arr) {
            int count = 0;
            for (int each2 : arr) {
                if (each2 == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Unique numbers = " + each1);
            }
        }

    }
}
