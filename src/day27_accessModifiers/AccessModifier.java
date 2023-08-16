package day27_accessModifiers;

public class AccessModifier {

    public static int publicData = 200;

    protected static int protectedData = 200;

    static int defaultData = 200;// default keyword is given by default

    private static int privateData = 200;


    public AccessModifier(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){ // default keyword is given by default
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicData);//public is accessible within the same class
        System.out.println(AccessModifier.protectedData);//protected is accessible within the same class
        System.out.println(defaultData);//default is accessible within the same class
        System.out.println(AccessModifier.privateData);//private is ONLY accessible within the same class

        new AccessModifier();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }


}
