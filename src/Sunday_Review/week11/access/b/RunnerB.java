package Sunday_Review.week11.access.b;

public class RunnerB {

    public static void main(String[] args) {

        Mac obj = new Mac();
        System.out.println(obj.os);
//        System.out.println(obj.memory); protected is inherited in child classes, but not accessed directly. See Mac class for inheritance part
//        System.out.println(obj.brand); this is default, in a different package
//        System.out.println(obj.hasWifi); this is private, only within class

    }
}
