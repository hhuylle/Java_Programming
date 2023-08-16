package day27_accessModifiers;

import day26_statics.PracticeTasks.Circle;

public class TestCircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);
        System.out.println(circle1);
        //instance variables/methods/members can be called through all objects

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(7);
        System.out.println(circle3);

        /*
        static can be called through all objects
        It is not good a option
        Static is not depending on objects
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
        */

        System.out.println(Circle.pi);
        //System.out.println(Circle.radius); class can not access object member




    }
}
