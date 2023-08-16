package Utilities;

class TestA {

    public TestA(){
        System.out.println("A");
    }
}

class TestB extends TestA{

    public TestB(){
        System.out.print("B");
    }
}

public class TestC extends TestB{
    public TestC(){
        System.out.print("C");
    }

    public static void main(String[] args) {
        TestB obj = new TestB();
    }
}

