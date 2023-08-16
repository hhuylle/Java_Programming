package day14_forLoop;

public class OverLoadedMainMethod {

    public static void main(String[] args) {
        System.out.println("A");
        main(25); // B
        main(2.5); // C
        main(true);  // D
    }

    public static void main(int args){
        System.out.println("B");
    }

    public static void main(double args){
        System.out.println("C");
    }

    public static void main(boolean args){
        System.out.println("D");
    }

    // The main method can be overloaded, but main method isn't supported overloaded, Because even-though the overloaded main methods can not run the java file.


}
