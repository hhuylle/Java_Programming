package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); //  to create Car object

        Car.carEngine obj2 = obj1.new carEngine(); // to create CarEngine object


        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();// to create object from Inner class with static without creating the object first like Instance object
    }
}
