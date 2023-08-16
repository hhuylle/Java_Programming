package day29_inheritance.practiceTasks.carTask;

public class Car {
    /*
    Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to brand's car and rest of the fields will be set based on the given arguments
					toString(): prints Toyota object info when the object is passed in the print statement
     */
    private String make, model;
    private int year;
    private String color;
    private double price;

    public Car(String make, String model, int year, String color, double price) {
        setMake(make);
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=0){
            System.err.println("Invalid year: "+year);
            System.exit(1);
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
