package day36_polymorphism_referenceTypeCastings;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // output: false
       // System.out.println(circle1.equals("Java")); // output: Invalid Object
        System.out.println(circle1.equals(circle2)); // output: true
        System.out.println(circle1.equals(circle3)); // output: false

        System.out.println("---------------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12","Pro max",1099,"Black");
        IPhone iphone2 = new IPhone("Apple", "Iphone 12","Pro max",1099,"White");

        System.out.println(iphone1.equals(iphone2));



    }
}
