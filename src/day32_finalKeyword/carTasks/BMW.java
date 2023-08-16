package day32_finalKeyword.carTasks;

public class BMW extends Car{
    /*
    BMW
                	start(): "Call the mechanic or jump start "
     */

    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start to start "+getMake()+" "+getModel());
    }
}
