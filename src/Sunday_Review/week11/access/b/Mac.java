package Sunday_Review.week11.access.b;

import Sunday_Review.week11.access.a.Computer;

public class Mac extends Computer {
    /*
	Create a class Mac in package access.b
		inherit the Computer class
		make a main method and create a Mac object. Check to see which variables are accessible
     */
    public static void main(String[] args) {

        Mac obj = new Mac();
        System.out.println(obj.os);
        System.out.println(obj.memory);
//        System.out.println(obj.brand); this is default, in a different package
//        System.out.println(obj.hasWifi); this is private, only within class

    }
}
