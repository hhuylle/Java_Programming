package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("--------------------------------------------");

        System.out.println(AccessModifier.publicData);//public is always accessible within the same package
        System.out.println(AccessModifier.protectedData); // protected is always accessible within the same package
        System.out.println(AccessModifier.defaultData);//default is accessible within the same package
        //System.out.println(AccessModifier.privateData);//private is NOT accessible within the same package

        System.out.println("--------------------------------------------");

        new AccessModifier();

        System.out.println("--------------------------------------");

        AccessModifier.publicMethod();
        AccessModifier.protectedMethod();
        AccessModifier.defaultMethod();
        //AccessModifier.privateMethod();

    }
}
