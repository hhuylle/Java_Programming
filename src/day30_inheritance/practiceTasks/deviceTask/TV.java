package day30_inheritance.practiceTasks.deviceTask;

public class TV extends Device{
    /*
    TV
				Extra methods:
					channelUp()
					channelDown()
     */
    private boolean hasController;

    public TV(String brand, String model, String color, String size, double price, boolean hasPowerButton) {
        super(brand, model, color, size, price, false, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" has channel up");
    }

    public void channelDown(){
        System.out.println(getBrand()+" "+getModel()+" has channel down");
    }


}
