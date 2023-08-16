package day30_inheritance.practiceTasks.deviceTask;

public class Phone extends Device{
    /*
    Phone
				Extra methods:
					call(), text()
     */

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling to number "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting to number "+phoneNumber);
    }
}
