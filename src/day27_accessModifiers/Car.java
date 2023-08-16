package day27_accessModifiers;

public class Car { // this class is outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class carEngine{ // this class becomes Inner class/Instance class can accept both Instance members and Static members

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass{ // static class only accept static members
        public void method(){
            System.out.println(wheels);
        }
    }
}
