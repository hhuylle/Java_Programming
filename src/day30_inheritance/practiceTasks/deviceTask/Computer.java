package day30_inheritance.practiceTasks.deviceTask;

public class Computer extends Device{
    /*
    Computer
				Add any extra variables/methods if needed:
				    wordFromHome()
     */
    private boolean hasMouse, isMovable, isHasMouse, hasBigScreen;



    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, boolean hasMouse, boolean isMovable, boolean hasBigScreen) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        setHasMouse(hasMouse);
        setMovable(isMovable);
        setHasBigScreen(hasBigScreen);
    }

    public boolean isHasMouse() {
        return hasMouse;
    }

    public void setHasMouse(boolean hasMouse) {
        this.hasMouse = hasMouse;
    }

    public boolean isHasBigScreen() {
        return hasBigScreen;
    }

    public void setHasBigScreen(boolean hasBigScreen) {
        this.hasBigScreen = hasBigScreen;
    }

    public boolean isMovable() {
        return isMovable;
    }

    public void setMovable(boolean movable) {
        isMovable = movable;
    }

    public void workFromHome(){
        System.out.println(getBrand() + " can be used to work from home");
    }


}
