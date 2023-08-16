package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){ // depend on the objects
        System.out.println("Constructor");
    }

    { // depend on the objects
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();
    }




}
