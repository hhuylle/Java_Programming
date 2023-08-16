package day30_inheritance.practiceTasks.deviceTask;

public class Iphone extends Phone{

    private String OS;
    private boolean hasApplePay;

    public Iphone(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String OS, boolean hasApplePay) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
        setOS(OS);
        setHasApplePay(hasApplePay);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isHasApplePay() {
        return hasApplePay;
    }

    public void setHasApplePay(boolean hasApplePay) {
        this.hasApplePay = hasApplePay;
    }
}
