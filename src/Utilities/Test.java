package Utilities;

import day27_accessModifiers.AccessModifier;
import day27_accessModifiers.Data;// to use for both instance members/methods and static members/methods

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.e);
        System.out.println(Data.d);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data data1 = new Data();

        System.out.println(data1.a);
        System.out.println(data1.b);
        System.out.println(data1.c);

        data1.method1();
        data1.method2();

        System.out.println("--------------------------------------");

        System.out.println(AccessModifier.publicData);//public is accessible in the different packages
        //System.out.println(AccessModifier.protectedData); protected is not accessible in the different packages
        //System.out.println(AccessModifier.defaultData); default is NOT accessible in the different packages
        //System.out.println(AccessModifier.privateData);//private is NOT accessible within the different packages

        System.out.println("--------------------------------------");

        //new AccessModifier();

        System.out.println("--------------------------------------");

        AccessModifier.publicMethod();
        //AccessModifier.protectedMethod();
        //AccessModifier.defaultMethod();
        //AccessModifier.privateMethod();


    }
}
