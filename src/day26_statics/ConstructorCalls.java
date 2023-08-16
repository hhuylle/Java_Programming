package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(9); constructor CAN not call or contain by itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        //ConstructorCalls(); can not call the constructor by its names
        this();
        System.out.println("Constructor with int argument");
        //this(); constructor call has to be at the first step
    }

    public ConstructorCalls(double b){
        this();
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String str){
        this(2.5);
        //this(); one constructor can not call more than one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();
        //output : Method 1

        System.out.println("-------------------------------");

        method2();
        //output : Method 1
        //         Method 2

    }

    public static void method1(){
        //this(); can not use this() in regular method
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
        method1(); // regular method can call itself
        method2();
    }

}
