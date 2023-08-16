package day30_inheritance.practiceTasks.deviceTask;

public class Desktop extends Computer{

    public Desktop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, boolean hasMouse, boolean isMovable, boolean hasBigScreen) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, hasMouse, isMovable, hasBigScreen);
    }
}
