package day27_accessModifiers.PracticeTasks;

public class Iphone {
    /*
    Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
     */
    public static String brand;
    public String model, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "Taiwan";
        designedIn = "USA";
    }

    public static void printOperatingSystem(){
        System.out.println("The operating system is: "+OS);
    }

    public static void call(long phoneNumber){
        System.out.println(brand+" iPhone is calling "+phoneNumber);
    }

    public static void text(long phoneNumber){
        System.out.println(brand+" iPhone is texting to "+phoneNumber);
    }

    public static void faceTime(long phoneNumber){
        System.out.println(brand+" iPhone is facetime with "+phoneNumber);
    }

    public static void faceTime(String email){
        System.out.println(brand+" iPhone is facetime by "+email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
