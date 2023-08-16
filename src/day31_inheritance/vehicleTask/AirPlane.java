package day31_inheritance.vehicleTask;

public class AirPlane extends Vehicle{
    public AirPlane(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void fly(){
        System.out.println(getBrand()+" "+getModel()+" is flying");
    }
}
