package Sunday_Review.week11.access.a;

public class Windows extends Computer{
    /*
    Create a class Windows in package access.a
		inherit the Computer class
		make a main method and create a Windows object. Check to see which variables are accessible
     */
    public static void main(String[] args) {

        Windows obj = new Windows();
        System.out.println(obj.os);
        System.out.println(obj.memory);
        System.out.println(obj.brand);
//        System.out.println(obj.hasWifi); this variable is private, so it is not inherited from Computer class

        System.out.println();
        System.out.println(obj);

    }
}
