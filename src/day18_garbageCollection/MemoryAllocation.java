package day18_garbageCollection;

class Car{

    public String brand, model, color;
    public int year;

}

public class MemoryAllocation {

    public static void main(String[] args) {
        int a = 100; // stack

        Car car = new Car();
        // stack     heap

    }

    public static void method1(){
        int b = 200; // stack
    }

    public static void method2(){
        String c = "Hello World";
        //   stack      heap ( String pool )
        String d = new String("Hello Cydeo");
        //   stack         heap
    }



}


