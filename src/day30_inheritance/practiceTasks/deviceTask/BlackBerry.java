package day30_inheritance.practiceTasks.deviceTask;

public class BlackBerry extends Phone{

    public BlackBerry(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBerry", model, color, size, price, hasBattery, hasPowerButton);
    }
}
