package day32_finalKeyword.carTasks;

public class Audi extends Car{
    /*
    Audi
                	start(): "Press the start button"
     */

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }
}
