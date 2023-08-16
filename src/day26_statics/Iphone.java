package day26_statics;

public class Iphone {
    /*
    Attributes: brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
     */

    public static String brand = "Apple"; // static: "Apple" is the brand of all the iPhone objects
    public String model, color; // instance: different models & colors for iPhone objects
    public double price;
    public static String OS = "iOS"; // static: operating system is the same for all the iphone objects
    public static String madeIn = "USA";
    public static  boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
        public static void printIphoneInfo(){ // static only accepts static
            System.out.println("Model: " + model);
        }
        */

    public void printIphoneInfo(){ // instance method accepts both static and non-static
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("price: $"+price);
    }

    public static void printOperatingSystem(){ // static only accepts static 
        System.out.println("Operating System: " + OS);
        //System.out.println("Model "+model);

    }

}
