package day30_inheritance.phoneTask;

public class Samsung extends Phone{
    /*
    samsung:
					Extra methods:
						freeze()
     */
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " can be freeze a lot");
    }



}
