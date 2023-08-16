package day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        Iphone iPhone = new Iphone("iPhone 12","Black",1000);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printIphoneInfo();

        System.out.println("------------------------");
        /*
        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();
        */
        System.out.println("------------------------");

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();


    }
}
