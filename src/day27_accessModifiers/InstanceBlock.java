package day27_accessModifiers;

public class InstanceBlock {

    //this is instance block:
    {
        System.out.println("Instance block");
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
    }
}
