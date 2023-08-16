package day30_inheritance.phoneTask;

public class IPhone extends Phone{ // Iphone is a Phone
    /*
    Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
     */
    private static String OS = "iOS";

    public static boolean hasApplePay = true;

    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is facetime with number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is facetime with email "+email);
    }
}
