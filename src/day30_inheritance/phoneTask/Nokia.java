package day30_inheritance.phoneTask;

public class Nokia extends Phone{
    /*
    Nokia:
					Extra methods:
						selfDefense()
     */

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel() + " can be used for self defense");
    }
}
