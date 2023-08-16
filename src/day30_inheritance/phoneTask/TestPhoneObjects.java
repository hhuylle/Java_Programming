package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("Iphone 12","Plus",1099,"Black");

        Samsung samsung = new Samsung("Galaxy S22","Ultra",999,"White");

        Nokia nokia = new Nokia("Lumia","Small",500,"Gold");

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("----------------------------------");

        iphone.faceTime(123456789);
        //samsung.faceTime(123456789);
        samsung.freeze();
        //nokia.freeze();
        nokia.selfDefense();
        //nokia.faceTime(123456789);

        System.out.println("----------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}
