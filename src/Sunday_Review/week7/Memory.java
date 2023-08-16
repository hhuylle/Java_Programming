package Sunday_Review.week7;

import java.util.Scanner;

public class Memory {

    public static void main(String[] args) {

        Scanner front = new Scanner(System.in);
        // reference: Scanner input
        // Object: new Scanner(System.in)
        Scanner back; // just a reference, no object
        back = front; // the back reference also has access to the same object from the line 9

        front = null; // the front reference no longer has access to the object from the line 9
        // Q: is the object one line 9 eligible for GC?
        // No, back reference still access

        back = null; // I removed the other reference of the object, so now it is eligible foe GC

        int[] a = {1,2,3};
        a = new int[]{1,2,3,4,5}; // creates a new array




    }
}
