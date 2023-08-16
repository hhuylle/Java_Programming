package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a ;
    public static double b ;
    public static String c ;

    //public static excelSheet sheet;
    static {// when static variables need to initialize, we have to use static block
        a = 100;
        b = 10.5;
        c = "Java";
    }




}
