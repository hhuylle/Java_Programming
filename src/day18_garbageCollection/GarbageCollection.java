package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    private static GarbageCollection garbageCollection;

    public static void main(String[] args) {

        // new GarbageCollection().finalize();

        String s1 = "Java";
        s1 = null; // "Java" --> will be eligible for garbage collection
        System.out.println(s1);
        // System.out.println(s1.toUpperCase()); print statement --> NullPointException error

        // System.out.println(s1.replace("null","Java"));

        String a = ""; // this is a object
        String b = null; // this is not object

        System.out.println("----------------------------------------");

        String str1 = "Python";
        str1 = "Cydeo";

        System.out.println(str1);

        System.out.println("----------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki","German Sepherd",'M',9,"Large","Gray");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck","Bulldog",'F',4,"Small","Brown");

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);

        //new Dog().finalize();


    }
}
